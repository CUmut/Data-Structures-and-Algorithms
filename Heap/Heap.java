package Heap;

import java.util.ArrayList;

public class Heap {

    void heapify(ArrayList<Integer> ht, int i) {
        int size = ht.size();
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * 1 + 2;
        if (l < size && ht.get(l) > ht.get(largest))
            largest = l;
        if (r < size && ht.get(r) > ht.get(largest))
            largest = r;

        if (largest != i) {
            int temp = ht.get(largest);
            ht.set(largest, ht.get(i));
            ht.set(i, temp);

            heapify(ht, largest);
        }
    }

    void insert(ArrayList<Integer> hT, int newNum) {
        int size = hT.size();
        if (size == 0) {
            hT.add(newNum);
        } else {
            hT.add(newNum);
            for (int i = size / 2 - 1; i >= 0; i--) {
                heapify(hT, i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> hT, int num) {
        int size = hT.size();
        int i;
        for (i = 0; i < size; i++) {
            if (num == hT.get(i))
                break;
        }

        int temp = hT.get(i);
        hT.set(i, hT.get(size - 1));
        hT.set(size - 1, temp);

        hT.remove(size - 1);
        for (int j = size / 2 - 1; j >= 0; j--) {
            heapify(hT, j);
        }
    }


    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        Heap h = new Heap();
        h.insert(array, 3);
        h.insert(array, 4);
        h.insert(array, 9);
        h.insert(array, 5);
        h.insert(array, 2);


        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 4);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);
    }
}
