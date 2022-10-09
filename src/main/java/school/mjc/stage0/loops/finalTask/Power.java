package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result=1;
        for (int count = 1; count <=power; count++){
            result=numberToPrint*result;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
