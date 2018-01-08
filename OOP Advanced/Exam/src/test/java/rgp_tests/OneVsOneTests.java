package rgp_tests;

import app.contracts.Action;
import app.contracts.Targetable;
import app.models.actions.OneVsOne;
import app.models.participants.Warrior;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class OneVsOneTests {

    private Action action;
    private List<Targetable> targetableList;
    private  Targetable dummy1;
    private  Targetable dummy2;
    @Before
    public void atStart(){
        this.action = new OneVsOne();
        dummy1 = new Warrior();
        dummy1.setName("Pesho");
        dummy2 = new Warrior();
        dummy2.setName("Gosho");
        dummy2.takeDamage(10);
        targetableList = new ArrayList<>();

    }

    @Test
    public void testWithEmptyList(){
        String message = this.action.executeAction(this.targetableList);
        Assert.assertEquals("There should be exactly 2 participants for OneVsOne!",message);
    }
    @Test
    public void testWithOneParticipantList(){
        this.targetableList.add(dummy1);
        String message = this.action.executeAction(this.targetableList);
        Assert.assertEquals("There should be exactly 2 participants for OneVsOne!",message);
    }
    @Test
    public void testWithMoreThanTwoList(){
        this.targetableList.add(dummy1);
        this.targetableList.add(dummy2);
        this.targetableList.add(dummy1);
        String message = this.action.executeAction(this.targetableList);
        Assert.assertEquals("There should be exactly 2 participants for OneVsOne!",message);
    }
    @Test
    public void fight() throws NoSuchFieldException, IllegalAccessException {
        this.targetableList.add(dummy1);
        this.targetableList.add(dummy2);
        this.action.executeAction(targetableList);

        Field field = dummy1.getClass().getDeclaredField("level");
        field.setAccessible(true);
        int level = (int) field.get(dummy1);
       Assert.assertEquals(2,level);
    }

}
