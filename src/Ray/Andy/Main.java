package Ray.Andy;

public class Main {

    public static void main(String[] args) {

        int x = 5%2;
        int y = 6%2;
        System.out.println(x);
        System.out.println(y);
        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));


    }
}
