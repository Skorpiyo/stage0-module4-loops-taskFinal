package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int y = cathetusLength; y >= 1; y--){
            for(int x = 1; x <= cathetusLength; x++){
                if(x<y) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
                }
                System.out.println();
            }
        }


    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
