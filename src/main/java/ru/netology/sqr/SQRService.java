package ru.netology.sqr;

public class SQRService {
    public int squares(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= lowerLimit) {
                if (x <= upperLimit) {
                    count++;
                }
            }
        }
        return count;
    }
}