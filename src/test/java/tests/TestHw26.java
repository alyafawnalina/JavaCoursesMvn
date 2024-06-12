package tests;

import org.example.MainHw26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHw26 {

    @Test
    public void test_isMultidimensionalArray(){

        int[][] arrOne = {{3, 7, 8}};
        int[][] arrTwo = {{1, 2, 3}, {4, 5, 6}, {7 ,8 ,9}};
        int[][] arrThree = {{2, 5 ,7}, {8, 9, 3}};

        Assertions.assertFalse(MainHw26.isMultidimensionalArray(arrOne));
        Assertions.assertTrue(MainHw26.isMultidimensionalArray(arrTwo));
        Assertions.assertFalse(MainHw26.isMultidimensionalArray(arrThree));

    }

    @Test
    public void testAverageNum(){

        double[] arrOne = {3.0 ,7.0, 5.0, 5.0};
        double[] arrTwo = {9.0, 7.0, 6.7};
        double[] arrThree = {7.0, 7.4, 6.0, 1.2};

        Assertions.assertEquals(5.0, MainHw26.averageNum(arrOne));
        Assertions.assertEquals(7.566666666666666, MainHw26.averageNum(arrTwo));
        Assertions.assertEquals(5.4, MainHw26.averageNum(arrThree));

    }
}
