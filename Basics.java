import java.util.ArrayList;

public class Basics {
    public Basics() {
    }

    public void print1To255() {
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    public void printOdds1To255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void printSum0To255() {
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("Number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public void findMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println("The max value in the array is " + max);
    }

    public void findAverage(ArrayList<Integer> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        double average = sum / arr.size();
        System.out.println(average);
    }

    public ArrayList<Integer> arrayOfOdds1To255() {
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                oddArray.add(i);
            }
        }
        return oddArray;
    }
    public void greaterThanY(ArrayList<Integer> arr, int y) {
        int numsGreater = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > y) {
                numsGreater += 1;
            }
        }
        System.out.println(numsGreater + " values greater than " + y + " in the array");
    }
    public ArrayList<Integer> squareValues(ArrayList<Integer> arr) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            y.add(arr.get(i) * arr.get(i));
        }
        arr = y;
        return arr;
    }
    public ArrayList<Integer> eliminateNegatives(ArrayList<Integer> arr) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                y.add(0);
            }
            else {
                y.add(arr.get(i));
            }
        }
        arr = y;
        return arr;
    }
    public ArrayList<Object> maxMinAverage(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        double sum = 0;
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
            sum += arr.get(i);
        }
        y.add("Max: " + max);
        y.add("Min: " + min);
        y.add("Average: " + sum/arr.size());
        return y;
    }
    public ArrayList<Integer> shiftValues(ArrayList<Integer> arr) {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < arr.size(); i++) {
            y.add(arr.get(i));
        }
        y.add(0);
        return y;
    }
}
