package ru.netology.sqr;

public class SQRService {
    public int sqrRangeFrom10To99(int firstParam, int secondParam) {

        int numberOfSquares = 0;
        int i;

        for (i = 10; i <= 99; i++) {
            System.out.println(i);
            int sqr = i * i;
            System.out.println(sqr);
            System.out.println();
            boolean ifInFirstRange = sqr >= firstParam;
            boolean ifInSecondRange = secondParam >= sqr;
            if (ifInFirstRange == ifInSecondRange) {
                numberOfSquares++;
            }
        }
        return numberOfSquares;
    }

}
