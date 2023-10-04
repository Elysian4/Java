public class copyarray {

    public static void main(String[] args) {
        int[] originalArray = {5,3,8,2,9}; 
        int[] copiedArray = copyarray(originalArray); 

        
        System.out.print("Original Array: ");
        printArray(originalArray);
        System.out.print("Copied Array: ");
        printArray(copiedArray);
    }

    public static int[] appendtonew(int[] array, int value) {
        int[] bigger = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            bigger[i] = array[i];
        }
        bigger[bigger.length - 1] = value;
        return bigger;
    }

    public static int[] copyarray(int[] array) {
        int[] copy = new int[0];
        for (int i = 0; i < array.length; i++) {
    int value = array[i];
            copy = appendtonew(copy, value);
        }
        return copy;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
    int value = array[i];
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
