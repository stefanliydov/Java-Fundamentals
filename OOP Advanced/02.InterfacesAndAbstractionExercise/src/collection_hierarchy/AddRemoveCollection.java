package collection_hierarchy;

public class AddRemoveCollection extends BaseList implements IAddRemoveCollection {

    @Override
    public int add(String el) {
        return super.addToList(el, 0);
    }

    @Override
    public String remove() {

        return super.removeFromList(1);
    }
}
