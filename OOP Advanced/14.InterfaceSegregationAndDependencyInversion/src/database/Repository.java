package database;

import utility.Constants;
import contracts.Modelable;
import exeptions.DuplicateModelException;
import exeptions.NonExistantModelException;

import java.util.HashMap;

public class Repository<T extends Modelable> implements contracts.Repository {
    private HashMap<String, T> itemsByModel;

    public Repository()
    {
        this.setItemsByModel(new HashMap<String, T>());
    }

    protected HashMap<String, T> getItemsByModel() {
        return this.itemsByModel;
    }

    protected void setItemsByModel(HashMap<String, T> itemsByModel) {
        this.itemsByModel = itemsByModel;
    }

    @Override
    public void add(Modelable item) throws DuplicateModelException {
        if (this.itemsByModel.containsKey(item.getModel()))
        {
            throw new DuplicateModelException(Constants.DuplicateModelMessage);
        }

    }

    @Override
    public T getItem(String model) throws NonExistantModelException {
        if (!this.itemsByModel.containsKey(model))
        {
            throw new NonExistantModelException(Constants.NonExistantModelMessage);
        }

        return this.itemsByModel.get(model);
    }

}
