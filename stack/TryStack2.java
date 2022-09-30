public class TryStack2 {

    // Change this file as much or as little as you need to.
    private Integer[] arrayToReverse;
    private LinkedStack<Integer> stack;
    TryStack2(int n) {
        this.arrayToReverse = genArray(n);
        this.stack = new LinkedStack<>();
    }
    
    private static Integer[] genArray(int n) {
        Integer[] result = new Integer[n];
        for (int i = 0; i<n; i++ ) {
            result[i] = i*2;
        }
        return result;
    }
    private void printArray() {
        System.out.println();

    for (int elems : this.arrayToReverse) {
        System.out.print(elems+"\t");
    }
    System.out.println();
    }
    private void reverseArray() {
        Integer[] reversed = new Integer[arrayToReverse.length];
        for (int elem: this.arrayToReverse) {
            stack.push(elem);
        }
        System.out.println("Inspecting stack (top-to-bottom): "+this.stack);
        for (int i  =0; i<arrayToReverse.length; i++) {
            reversed[i] = stack.pop();
        }
        System.out.println();
        arrayToReverse = reversed;
        reversed = null;
    }
    protected void simulate() {
        printArray();
        reverseArray();
        printArray();
    }
    /**
     * Main driver method that will reverse an array.
     *
     * @param args
     */
    public static void main(String[] args) {
        int n = args.length >0 ? n = Integer.parseInt(args[0]) : 50;

        TryStack2 x = new TryStack2(n);
        x.simulate();
    }
}
