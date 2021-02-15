package Arrays;

// Java program to demonstrate
// Class Objects for Arrays
public class ObjectsForArrays {

    public static void main(String[] args) {

        int intArray[] = new int[3];
        byte byteArray[] = new byte[3];
        short shortsArray[] = new short[3];

        //arrays of Strings
        String[] strArray = new String[3];

        System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass());
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());
    }

    /*Explanation :
    The string “[I” is the run-time type signature for the class object “array with component type int“.
    The only direct superclass of any array type is java.lang.Object.
    The string “[B” is the run-time type signature for the class object “array with component type byte“.
    The string “[S” is the run-time type signature for the class object “array with component type short“.
    The string “[L” is the run-time type signature for the class object “array with component type of a Class”. The Class name is then followed.
*/

    /*
     "[I" dizesi, "bileşen türü int ile dizi" sınıf nesnesinin çalışma zamanı türü imzasıdır.
     Herhangi bir dizi türünün tek doğrudan üst sınıfı java.lang.Object'tir.
     "[B" dizesi, "bileşen türü baytlı dizi" sınıf nesnesinin çalışma zamanı türü imzasıdır.
     "[S" dizesi, "kısa bileşen türüne sahip dizi" sınıf nesnesinin çalışma zamanı türü imzasıdır.
     "[L" dizesi, "bir Sınıfın bileşen türüne sahip dizi" sınıf nesnesinin çalışma zamanı türü imzasıdır. Sınıf adı daha sonra takip edilir.*/

}
