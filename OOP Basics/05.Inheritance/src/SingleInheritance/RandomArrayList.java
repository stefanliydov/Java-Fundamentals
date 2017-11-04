package SingleInheritance;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<Object> extends ArrayList {

    public Object getRandomElement(){
        Random random = new Random();

        int index = random.nextInt(super.size()-1);
        return (Object)super.remove(index);

    }
}
