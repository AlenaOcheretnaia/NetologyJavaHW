package hwjavacore.worknumbersstream;

import java.util.*;

public class Main {
    private static Object Comparator;

    public static void main (String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(intList);
        for(int counter: intList){
            if ((counter > 0) && (counter % 2 == 0)) {
                System.out.println(counter);
            }
        }
    }
}
