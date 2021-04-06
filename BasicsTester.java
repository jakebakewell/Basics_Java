import java.util.ArrayList;
public class BasicsTester {
    public static void main(String[] args) {
        Basics test = new Basics();
        test.print1To255();
        test.printOdds1To255();
        test.printSum0To255();
        ArrayList<Integer> x = new ArrayList<Integer>();
        x.add(3);
        x.add(-1);
        x.add(5);
        x.add(16);
        x.add(9);
        x.add(13);
        test.iterateArray(x);
        test.findMax(x);
        test.findAverage(x);
        System.out.println(test.arrayOfOdds1To255());
        test.greaterThanY(x, 6);
        System.out.println(test.squareValues(x));
        System.out.println(test.eliminateNegatives(x));
        System.out.println(test.maxMinAverage(x));
        System.out.println(test.shiftValues(x));
    }
}
