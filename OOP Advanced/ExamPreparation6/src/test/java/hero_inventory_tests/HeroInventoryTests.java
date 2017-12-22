package hero_inventory_tests;

import hell.entities.miscellaneous.HeroInventory;
import hell.interfaces.Inventory;
import hell.interfaces.Item;
import hell.interfaces.Recipe;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HeroInventoryTests {


    private Inventory inventory;
    private Item item1;
    private Item item2;
    private Item item3;
    private Recipe recipe1;

    @Before
    public void beforeTest() throws NoSuchFieldException, IllegalAccessException {
        this.inventory = new HeroInventory();

        this.item1 = mock(Item.class);
        this.item2 = mock(Item.class);
        this.item3 = mock(Item.class);
        this.recipe1 = mock(Recipe.class);


        Field commonItemsField = this.inventory.getClass().getDeclaredField("commonItems");
        commonItemsField.setAccessible(true);

        HashMap<String, Item> commonItems = (HashMap<String, Item>) commonItemsField.get(this.inventory);


        Mockito.when(item1.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(item1.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(item1.getIntelligenceBonus()).thenReturn(2_000_000_000);
        Mockito.when(item1.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(item1.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(item1.getName()).thenReturn("item1");

        Mockito.when(item2.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(item2.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(item2.getIntelligenceBonus()).thenReturn(2_000_000_000);
        Mockito.when(item2.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(item2.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(item2.getName()).thenReturn("item2");

        Mockito.when(item3.getStrengthBonus()).thenReturn(2_000_000_000);
        Mockito.when(item3.getAgilityBonus()).thenReturn(2_000_000_000);
        Mockito.when(item3.getIntelligenceBonus()).thenReturn(2_000_000_000);
        Mockito.when(item3.getHitPointsBonus()).thenReturn(2_000_000_000);
        Mockito.when(item3.getDamageBonus()).thenReturn(2_000_000_000);
        Mockito.when(item3.getName()).thenReturn("item3");
        commonItems.put("item1",item1);
        commonItems.put("item2",item2);
        commonItems.put("item3",item3);

    }
    //Test getStats methods
    @Test
    public void testGetTotalStrenght(){
        Assert.assertEquals(this.inventory.getTotalStrengthBonus(),6_000_000_000L);
    }
    @Test
    public void testGetTotalStrenghtWithWrongResult(){
        Assert.assertNotEquals(this.inventory.getTotalStrengthBonus(),5_000_000_000L);
    }

    @Test
    public void testGetTotalAgility(){
        Assert.assertEquals(this.inventory.getTotalAgilityBonus(),6_000_000_000L);
    }
    @Test
    public void testGetTotalAgilitytWithWrongResult(){
        Assert.assertNotEquals(this.inventory.getTotalAgilityBonus(),5_000_000_000L);
    }


    @Test
    public void testGetTotalIntelligence(){
        Assert.assertEquals(this.inventory.getTotalIntelligenceBonus(),6_000_000_000L);
    }
    @Test
    public void testGetTotalIntelligenceWithWrongResult(){
        Assert.assertNotEquals(this.inventory.getTotalIntelligenceBonus(),5_000_000_000L);
    }


    @Test
    public void testGetTotalHitPoints(){
        Assert.assertEquals(this.inventory.getTotalHitPointsBonus(),6_000_000_000L);
    }
    @Test
    public void testGetTotalHitPointstWithWrongResult(){
        Assert.assertNotEquals(this.inventory.getTotalHitPointsBonus(),5_000_000_000L);
    }


    @Test
    public void testGetTotalDamage(){
        Assert.assertEquals(this.inventory.getTotalDamageBonus(),6_000_000_000L);
    }
    @Test
    public void testGetTotalDamageWithWrongResult(){
        Assert.assertNotEquals(this.inventory.getTotalDamageBonus(),5_000_000_000L);
    }

    //Test add common item
    @Test
    public void addCommonItem(){
        Item item4 = mock(Item.class);
        Mockito.when(item4.getStrengthBonus()).thenReturn(3);
        Mockito.when(item4.getAgilityBonus()).thenReturn(10);


        inventory.addCommonItem(item4);

        Assert.assertEquals(this.inventory.getTotalStrengthBonus(),6_000_000_003L);
        Assert.assertEquals(this.inventory.getTotalAgilityBonus(),6_000_000_010L);
    }
    @Test
    public void addCommonItem2() throws NoSuchFieldException, IllegalAccessException {
        this.addRecipe();

        Item mock = mock(Item.class);
        when(mock.getName()).thenReturn("item4");
        long expectedSize = 2;


        this.inventory.addCommonItem(mock);
        Field commonItemsField = this.inventory.getClass().getDeclaredField("commonItems");
        commonItemsField.setAccessible(true);
        HashMap<String, Item> commonItems = (HashMap<String, Item>) commonItemsField.get(this.inventory);

        Assert.assertEquals("Common items length wrong",expectedSize,commonItems.size());

    }
    @Test
    public void addRecipeTest() throws NoSuchFieldException, IllegalAccessException {
        //Arrange
        this.addRecipe();
        Recipe mock = mock(Recipe.class);
        long expectedRecipeItems = 2;

        //Act
        this.inventory.addRecipeItem(mock);
        Field recipesField = this.inventory.getClass().getDeclaredField("recipeItems");
        recipesField.setAccessible(true);
        HashMap<String, Recipe> recipes = (HashMap<String, Recipe>) recipesField.get(this.inventory);


        //Assert
        Assert.assertEquals("Recipe map size is wrong",expectedRecipeItems,recipes.size());
    }

    public void addRecipe() throws NoSuchFieldException, IllegalAccessException {
        Field recipeField = this.inventory.getClass().getDeclaredField("recipeItems");
        recipeField.setAccessible(true);

        HashMap<String, Recipe> recipes = (HashMap<String, Recipe>) recipeField.get(this.inventory);
        when(recipe1.getStrengthBonus()).thenReturn(2);
        when(recipe1.getAgilityBonus()).thenReturn(2);
        when(recipe1.getIntelligenceBonus()).thenReturn(2);
        when(recipe1.getHitPointsBonus()).thenReturn(2);
        when(recipe1.getDamageBonus()).thenReturn(2);

        String[] requiredItems = {"item1","item2","item3"};
        when(recipe1.getRequiredItems()).thenReturn(Arrays.asList(requiredItems));
        recipes.put("recipe1",recipe1);
    }

}
