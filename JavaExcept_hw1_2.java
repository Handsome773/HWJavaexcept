public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[2];

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Catching IndexOutOfBoundsException: " + e);
        }
        catch (ArithmeticException e) {
            System.out.println("Catching ArithmeticException: " + e);
        }
    }
}