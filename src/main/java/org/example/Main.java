package org.example;

public class Main {

    static int result;

    public static int calculate(int el1, char sign, int el2){

        switch (sign){
            case ('+'):
                result = el1 + el2;
                break;
            case ('-'):
                result = el1 - el2;
                break;
        }
        return result;
    }
}
