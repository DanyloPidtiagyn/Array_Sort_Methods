import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Danylo Pidtiagyn on 11.09.2016.
 */
public class Main {
    public static void main (String[] args){
        int [] array = {60,38,101,8,1,0,-44,55};
        SortingMethods Sort = new SortingMethods();

        System.out.println("Array before sort = " + Arrays.toString(array));
        System.out.println("Bubble Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.BubbleSort(array)));
        System.out.println("Selection Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.SelectionSort(array)));
        System.out.println("Insertion Sort");
        System.out.println("Array after sort = " + Arrays.toString(Sort.InsertionSort(array)));



    }
}
