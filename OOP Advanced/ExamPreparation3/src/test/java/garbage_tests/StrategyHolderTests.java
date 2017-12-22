package garbage_tests;

import app.waste_disposal.DefaultStrategyHolder;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.StrategyHolder;
import app.waste_disposal.contracts.Waste;
import garbage_tests.FakeStuff.FakeDisposable;
import garbage_tests.FakeStuff.FakeNonDisposable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Map;

public class StrategyHolderTests {

    private StrategyHolder holder;
    GarbageDisposalStrategy strategy;
    @Before
    public void initializeTest(){
         this.strategy = Mockito.mock(GarbageDisposalStrategy.class);
         this.holder = new DefaultStrategyHolder();
    }
    @Test
    public void testEmptyMapUponInitialization(){
        Assert.assertEquals("Empty map at beggining",0,this.holder.getDisposalStrategies().size());
    }
    @Test(expected = UnsupportedOperationException.class)
    public void testGetStrategiesMethodIfUnmodifiable(){
        Map<Class, GarbageDisposalStrategy> disposalStrategies = this.holder.getDisposalStrategies();
        disposalStrategies.put(FakeDisposable.class,this.strategy);
    }
    @Test()
    public void testAddStrategy(){
        this.holder.addStrategy(FakeDisposable.class, strategy);
        int holderSize = this.holder.getDisposalStrategies().size();
        Assert.assertEquals("When add size should increase",1,holderSize);
    }
    @Test
    public void addStrategyShouldReturnTrue(){
        Assert.assertTrue(this.holder.addStrategy(FakeDisposable.class,this.strategy));
    }
    @Test
    public void testRemoveItem(){
        this.holder.addStrategy(FakeDisposable.class,this.strategy);
        this.holder.removeStrategy(FakeDisposable.class);
        int size = this.holder.getDisposalStrategies().size();

        Assert.assertEquals(0,size);
    }
    @Test
    public void shouldReturnFalseWhenRemovingFromEmptyHolder() {
        boolean result = this.holder.removeStrategy(FakeDisposable.class);

        Assert.assertEquals("Operation returned incorrect result!", false, result);
    }
    @Test
    public void shouldReturnFalseIfAddedExistingItem(){
        this.holder.addStrategy(FakeDisposable.class,this.strategy);
        Assert.assertFalse(this.holder.addStrategy(FakeDisposable.class,this.strategy));
    }
}
