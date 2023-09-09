package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>  cars = new ArrayList<>();
        cars.add("lambo");
        cars.add("porsche");
        cars.add("ferrari");
        cars.add("wrangler");
        cars.add("mahindra xuv 700");
//        for( String car : cars){
//            System.out.println(car);
//        }
        Iterator<String> carIterator = cars.iterator();
        System.out.println("Before : \n");
        while(carIterator.hasNext()){
            System.out.println(carIterator.next());
        }
        System.out.println("After: \n");
//        Collections.sort(cars);
//        Collections.sort();
       Collections.sort(cars, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               return o1.compareTo(o2);
           }
       });
        for( String car : cars){
            System.out.println(car);
        }
    }
}
