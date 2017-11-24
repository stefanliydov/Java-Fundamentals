package collection_hierarchy;

public class MyList extends BaseList implements IMyList {

    @Override
    public int add(String el) {
        return super.addToList(el,0);
    }

    @Override
    public String remove() {
        return super.removeFromList(0);
    }

    @Override
    public int used() {
        return super.used();
    }
}
