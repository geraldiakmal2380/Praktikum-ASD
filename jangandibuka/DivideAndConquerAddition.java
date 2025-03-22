public class DivideAndConquerAddition {
    
    public static int sum(int[] numbers, int left, int right) {
        
        // Base case: if there's only one element
        if (left == right) {
            return numbers[left];
        }

        // Find the middle index
        int mid = (left + right) / 2;
        System.out.println(mid);

        // Recursively calculate the sum of the left and right halves
        int leftSum = sum(numbers, left, mid);
        
        int rightSum = sum(numbers, mid + 1, right);
        System.out.println("leftsum "+leftSum);
        System.out.println("rightsum "+rightSum);

        // Combine the results
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array
        int result = sum(numbers, 0, numbers.length - 1);
        System.out.println("Sum using Divide and Conquer: " + result); // Output: 15
    }
}