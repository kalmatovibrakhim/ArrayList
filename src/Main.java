import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer>sandar = new ArrayList<>();
        ArrayList<Integer>jupsandar = new ArrayList<>();
        ArrayList<Integer>taksandar = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            sandar.add(rd.nextInt(100));
        }
        System.out.println(sandar);

        Iterator<Integer>iterator = sandar.iterator();
        while (iterator.hasNext()){
            int x =iterator.next();
            if(x % 2 == 0){
                jupsandar.add(x);
            }
            else{
                taksandar.add(x);
            }
        }

        System.out.println(jupsandar);
        System.out.println(taksandar);
    }
}