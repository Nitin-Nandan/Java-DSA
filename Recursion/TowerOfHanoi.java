public class TowerOfHanoi {
    public static void solveHanoi(int n, char source, char auxilliary, char destination) {
        // Base-case:
        if(n==1) {
            System.out.println("Moving disk 1 from " + source + " to " + destination);
            return;
        }

        // Step-1: Move top (n-1) disks from A -> B (use C has helper)
        solveHanoi(n-1, source, destination, auxilliary);

        // Step-2: Move nth (largest) disk from A -> C
        System.out.println("Moving disk " + n + " from " + source + " to " + destination);

        // Step-3: Move (n-1) disks from B -> C (use A as helper)
        solveHanoi(n-1, auxilliary, source, destination);
    }
    
    public static void main(String arg[]) {
        int numDisks = 2;
        solveHanoi(numDisks, 'A', 'B', 'C');
    }
}
