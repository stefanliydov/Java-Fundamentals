package collection_hierarchy;

import java.util.LinkedList;
import java.util.List;

public class BaseList {

    private List<String> collection;
    protected BaseList(){
        this.collection = new LinkedList<>();
    }

    protected int addToList(String str, int index){
        if(index ==1){
            index = this.collection.size();
        }
            this.collection.add(index,str);
            return index;
    }
    protected String removeFromList(int index){
        if(index ==1){
            index = this.collection.size()-1;
        }
            return this.collection.remove(index);
    }
    protected int used(){
        return collection.size();
    }

}
