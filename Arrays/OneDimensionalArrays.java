package Arrays;


// Java program to illustrate creating an array
// of integers,  puts some values in the array,
// and prints each value to standard output.
public class OneDimensionalArrays {

    public static void main(String[] args){

        // declares an Array of integers.
        int[] arr;

        // allocating memory for 5 integers.
        arr = new int[5];

        // initialize the first elements of the array
        //dizinin ilk elemanlarını başlat.
        arr[0] = 10;

        // initialize the second elements of the array
        //dizinin ikinci elemanlarını başlat
        arr[1] = 20;

        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // accessing the elements of the specified array
        for (int i =0; i < arr.length; i++){
            System.out.println("Element at index" + i + ":" + arr[i]);
        }
    }
}
