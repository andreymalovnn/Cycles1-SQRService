package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/sqrtestdata.csv"})
    void shouldCalculateSquaresInRange(String testName, int lowerLimit, int upperLimit, int expected) {
        SQRService number = new SQRService();
        int actual = number.squares(lowerLimit, upperLimit);
        assertEquals(actual, expected);
    }
}