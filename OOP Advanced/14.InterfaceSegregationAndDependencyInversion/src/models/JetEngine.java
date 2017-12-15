package models;

import utility.Constants;
import utility.Validator;
import contracts.Modelable;

public class JetEngine implements Modelable
{
    private static final int Multiplier = 5;

    public int cachedOutput;

    private String model;

    private int horsepower;

    private int displacement;

    public JetEngine(String model, int horsepower, int displacement)
    {
        this.setModel(model);
        this.setHorsepower(horsepower);
        this.setDisplacement(displacement);
    }

    @Override
    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MinBoatEngineModelLength);
        this.model = model;
    }

    public int getOutput() {
        if (this.cachedOutput != 0)
        {
            return this.cachedOutput;
        }

        this.cachedOutput = (this.horsepower * Multiplier) + this.displacement;
        return this.cachedOutput;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    private void setHorsepower(int horsepower) {
        Validator.ValidatePropertyValue(horsepower, "Horsepower");
        this.horsepower = horsepower;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        Validator.ValidatePropertyValue(displacement, "Displacement");
        this.displacement = displacement;
    }
}
