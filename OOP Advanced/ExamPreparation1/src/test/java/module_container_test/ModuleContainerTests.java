package module_container_test;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.NoSuchElementException;

public class ModuleContainerTests {

    private AbsorbingModule absorbingModuleMocked1;
    private AbsorbingModule absorbingModuleMocked2;
    private EnergyModule energyModuleMocked1;
    private EnergyModule energyModuleMocked2;
    private Container container;

    @Before
    public void Before(){
        this.container = new ModuleContainer(3);

        this.absorbingModuleMocked1 = Mockito.mock(AbsorbingModule.class);
        this.absorbingModuleMocked2 = Mockito.mock(AbsorbingModule.class);
        this.energyModuleMocked1 = Mockito.mock(EnergyModule.class);
        this.energyModuleMocked2 = Mockito.mock(EnergyModule.class);


        Mockito.when(absorbingModuleMocked1.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(absorbingModuleMocked2.getHeatAbsorbing()).thenReturn(2_000_000_000);
        Mockito.when(energyModuleMocked1.getEnergyOutput()).thenReturn(2_000_000_000);
        Mockito.when(energyModuleMocked2.getEnergyOutput()).thenReturn(2_000_000_000);

        Mockito.when(absorbingModuleMocked1.getId()).thenReturn(1);
        Mockito.when(absorbingModuleMocked2.getId()).thenReturn(2);
        Mockito.when(energyModuleMocked1.getId()).thenReturn(3);
        Mockito.when(energyModuleMocked2.getId()).thenReturn(4);
    }
    //Add null throws exception tests
    @Test(expected = IllegalArgumentException.class)
    public void addEnergyModuleException(){
        this.container.addEnergyModule(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addAbsorbingModuleException(){
        this.container.addAbsorbingModule(null);
    }

    //Capacity overload remove module
    @Test
    public void expectToRemoveExtraModules(){
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);
        this.container.addEnergyModule(this.energyModuleMocked1);
        this.container.addEnergyModule(this.energyModuleMocked2);
        Assert.assertEquals("WEEEEEIRD",container.getTotalEnergyOutput(), 4_000_000_000L);
        Assert.assertEquals(container.getTotalHeatAbsorbing(), 2_000_000_000L);

    }
    @Test
    public void expectToRemoveExtraModules2(){
        this.container.addEnergyModule(this.energyModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);
        this.container.addEnergyModule(this.energyModuleMocked2);
        Assert.assertEquals("WEEEEEIRD",container.getTotalEnergyOutput(), 2_000_000_000L);
        Assert.assertEquals(container.getTotalHeatAbsorbing(), 4_000_000_000L);
    }
    //Capacity overload remove module
    @Test
    public void expectNotToRemoveWhenSizeEqualsCapcity(){
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
        this.container.addAbsorbingModule(this.absorbingModuleMocked2);
        this.container.addEnergyModule(this.energyModuleMocked1);

        Assert.assertEquals("WEEEEEIRD",container.getTotalEnergyOutput(), 2_000_000_000L);
        Assert.assertEquals(container.getTotalHeatAbsorbing(), 4_000_000_000L);

    }

    //Empty container
    @Test
    public void expectToReturnZeroOnAnEmptyContainer(){
        Assert.assertEquals("WEEEEEIRD",container.getTotalEnergyOutput(), 0);
        Assert.assertEquals(container.getTotalHeatAbsorbing(), 0);

    }

    @Test(expected = NoSuchElementException.class)
    public void zeroSize() {
        this.container = new ModuleContainer(0);
        this.container.addAbsorbingModule(this.absorbingModuleMocked1);
    }

}
