
/**
 * Write a description of class whileloops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class whileloops
{

    public static void main(String[] args) {
        int i = 1;
        int k = 6;
        int a = 5;
        int b = 4;
        while (i < 15) {
            System.out.println("i is" + i + "but is less than 15");
            i += 1;
        }
        while (k > 5) {
            System.out.println("k is" + k + "and is more than 5");
            k += 2;
        }
        while (a < 10 && b <= 20) {
            System.out.println("a < 10");
            a += 1;
            b += 1;
        }
    }
}