package Assignments.Basics.Extra;

public class CustomDynamicArray {
    private int[] array;
    private int size;
    private int capacity;

    // Constructor with initial capacity
    public CustomDynamicArray(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
        this.capacity = initialCapacity;
    }

    // Default constructor with capacity 10
    public CustomDynamicArray() {
        this(10);
    }

    // Add an element to the array
    public void add(int element) {
        // Check if resize is needed
        if (size == capacity) {
            resize();
        }
        array[size++] = element;
    }

    // Double the array size
    private void resize() {
        capacity *= 2;
        int[] newArray = new int[capacity];
        // Copy elements to new array
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    // Get element at specified index
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    // Remove element at specified index
    public int remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        int removedValue = array[index];

        // Shift elements to fill the gap
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return removedValue;
    }

    // Get current size
    public int size() {
        return size;
    }

    // Override toString method
    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");

        return sb.toString();
    }

    // Demo
    public static void main(String[] args) {
        CustomDynamicArray dynamicArray = new CustomDynamicArray(3);

        System.out.println("Initial array: " + dynamicArray);

        // Add elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        System.out.println("After adding three elements: " + dynamicArray);

        // Add one more element to trigger resizing
        dynamicArray.add(40);
        System.out.println("After triggering resize: " + dynamicArray);

        // Get element
        System.out.println("Element at index 2: " + dynamicArray.get(2));

        // Remove element
        int removed = dynamicArray.remove(1);
        System.out.println("Removed element: " + removed);
        System.out.println("Array after removal: " + dynamicArray);
    }
}
