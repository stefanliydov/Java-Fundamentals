package rgp_tests;

import app.contracts.Targetable;
import app.models.participants.Warrior;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class WarriorTests {

    private Targetable warrior;
    private Targetable target;
    @Before
    public void atStart(){
        warrior = new Warrior();
        target = new Warrior();
    }
    @Test
    public void testIfDamagedReducesHealth(){
        warrior.takeDamage(5);
        double expectedHp = 45.0;
        double hp = warrior.getHealth();
        Assert.assertEquals(expectedHp,hp,0);
    }
    @Test
    public void testIfKilledDoesItChangeStatus(){
        warrior.takeDamage(50);
        Assert.assertEquals(0,0,0);
        Assert.assertFalse(warrior.isAlive());
    }
    @Test
    public void testIfKilledDoesItChangeStatusLessThanZero(){
        warrior.takeDamage(60);
        Assert.assertFalse(warrior.isAlive());
    }
    @Test
    public void testIsAliveMethod(){
        Assert.assertTrue(warrior.isAlive());
    }
    @Test
    public void testLevelUp() throws NoSuchFieldException, IllegalAccessException {
        warrior.levelUp();
        Field field = warrior.getClass().getDeclaredField("level");
        field.setAccessible(true);
        int level = (int) field.get(warrior);
        Assert.assertEquals(2,level);
    }
    @Test
    public void testLevelUpStatsIncrease(){
        warrior.levelUp();
        Assert.assertEquals(100.0,warrior.getHealth(),0);
        Assert.assertEquals(28.0,warrior.getDamage(),0);
    }
    @Test
    public void testReceiveRewardMethod() throws NoSuchFieldException, IllegalAccessException {
        warrior.receiveReward(50);
        Field field = warrior.getClass().getDeclaredField("gold");
        field.setAccessible(true);
        double gold = (double) field.get(warrior);
        Assert.assertEquals(250,gold,0);
    }

}
