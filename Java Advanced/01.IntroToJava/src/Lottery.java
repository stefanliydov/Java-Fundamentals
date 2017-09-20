public class Lottery {

    public static void main(String[] args) {

        for(int i =1;i<=8;i++) {

            for (int r = i+1; r <= 10; r++){
                if(r == i)
                    continue;
                for (int s = r+1; s <= 10; s++){
                    if(s ==r || s ==i)
                        continue;
                    System.out.println(i+" "+r+" "+s);
                }
            }
        }
    }
}
