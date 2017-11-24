package collection_hierarchy;

public class AddCollection extends BaseList implements IAddCollection{


    @Override
    public int add(String element) {
        return super.addToList(element,1);
    }
}
