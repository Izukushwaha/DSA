public class tower {

    // Recursive method to solve the Tower of Hanoi
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: If only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move top n-1 disks from source to auxiliary, using destination as a buffer
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination, using source as a buffer
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    // Main method
    public static void main(String[] args) {
        int numberOfDisks = 3; // You can change this to test with different numbers of disks

        // Solve the Tower of Hanoi
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}
