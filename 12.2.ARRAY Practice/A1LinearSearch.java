// Linear Search in Java
public class A1LinearSearch {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Target found, return the index
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;

        int index = linearSearch(array, target);

        if (index == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("Value found at index: " + index);
        }
    }
}
