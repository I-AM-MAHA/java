package tasks;

public class Smallestarray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest; 
                smallest = arr[i];         
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];   
            }
        }

        // Output the result
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in the array.");
        } else {
            System.out.println("The second smallest element is: " + secondSmallest);
        }
    }
}

