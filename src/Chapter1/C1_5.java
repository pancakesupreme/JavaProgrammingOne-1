package Chapter1;

/**
 * Program is designed to multiply, subtract, and divide variables together
 *
 * @author Emory Meursing
 */
public class C1_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double int1 = 9.5, int2 = 4.5, int3 = 2.5, int4 = 3;
        double int5 = 45.5, int6 = 3.5;
        double top = int1 * int2 - int3 * int4;
        double bottom = int5 - int6;
        double result = top / bottom;
        System.out.println(result);
    }

}
