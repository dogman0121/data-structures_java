package lab20.Task4;

public class MinMaxTester {
    public static void main(String[] args) {
        Integer[] intArray = {5, 3, 8, 1, 4};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);

        System.out.println("Array: ");
        intMinMax.displayArray();
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        String[] strArray = {"apple", "orange", "banana", "pear"};
        MinMax<String> strMinMax = new MinMax<>(strArray);

        System.out.println("\nArray: ");
        strMinMax.displayArray();
        System.out.println("Min: " + strMinMax.findMin());
        System.out.println("Max: " + strMinMax.findMax());
    }
}
