package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int count=cathetusLength;
            for (int j = 1; j <= cathetusLength*2-1; j++) {
                if (count<=i) {
                    System.out.print(count);
                }else if(j>cathetusLength){
                    System.out.print("");
                }else {
                    System.out.print(" ");
                }if(j<cathetusLength)
                    count--;
                else
                    count++;
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
