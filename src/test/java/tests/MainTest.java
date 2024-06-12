package tests;

import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void test1(){
        int num1 = 2;
        char sign1 = '+';
        int num2 = 6;

        int result1 = Main.calculate(num1, sign1, num2);
        Assertions.assertEquals(8, result1);
    }
}
