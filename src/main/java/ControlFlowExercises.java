public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");

        for (int j = 100; j >= -10; j-=5) {
            System.out.println(j);
        }

        for (long k = 2; k < 1000000; k*=k) {
            System.out.println(k);
        }
    }
}
