package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService number = new SQRService();
        int rangeNumber = number.squares(500, 1000);
        System.out.println(rangeNumber);
    }
}