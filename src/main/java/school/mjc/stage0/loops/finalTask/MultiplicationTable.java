package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int result;
            for (int x = 1; x <= 10; x++) {
                result=numberTableToPrint*x;
                System.out.println(x + " x " +numberTableToPrint+ " = " +result);
            }
        }
    }
