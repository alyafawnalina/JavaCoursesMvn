package org.example.Hw30;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainHw30 {

    public static void main(String[] args) {
    //Создать 3 потока

        Thread thread1 = new Thread(() -> {
            //1й - считает 15 член последовательности Фибоначи и записывает его в файл out.txt
            int[] arr = new int[20];
            arr[0] = 0;
            arr[1] = 1;
            for (int i = 2; i < arr.length; ++i) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }

            write("Fibonacci: " + arr[15], "out.txt");
        });

        Thread thread2 = new Thread(() -> {
            //2й - считывает 10 чисел из файла numbers.txt и записывает их сумму в файл out.txt

            String text = "3\n26\n3\n74\n8\n4\n32\n8\n3\n8\n1\n83\n5\n22\n83\n23";
            write(text, "numbers.txt");
            write("Sum: " + getSum("numbers.txt"), "out.txt");

        });

        Thread thread3 = new Thread(() -> {
            //3й - считывает файл test.txt,
            // выбирает из него номера телефонов и записывает в файл out.txt
            String text = "s\n+380934565056\ngoogle\n+380657843736\n67\n+380995672324";
            write(text, "test.txt");
            List<String> list = new ArrayList<>();
            try {
                BufferedReader fr = new BufferedReader(new FileReader("D:\\javaProjectM\\src\\main\\java\\org\\example\\Hw30\\test.txt"));
                String line;
                while((line = fr.readLine()) != null) {
                    if (line.charAt(0) == '+' && line.substring(1).length() == 12){
                        list.add(line);
                    }
                }
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            write("Phone numbers: " + list.toString().substring(1, list.toString().length() - 1), "out.txt");
        });

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Operations are done.");

    }

    private static void write(String text, String file) {
        try {
            FileWriter fw3 = new FileWriter("D:\\javaProjectM\\src\\main\\java\\org\\example\\Hw30\\" + file, true);
            fw3.write(text + "\n");
            fw3.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int getSum(String file) {
        int Sum = 0;
        try {
            BufferedReader fr = new BufferedReader(new FileReader("D:\\javaProjectM\\src\\main\\java\\org\\example\\Hw30\\" + file));
            String line;
            for (int i = 0; i < 10; i++) {
                while((line = fr.readLine()) != null) {
                    Sum += Integer.parseInt(line);
                }
            }
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Sum;
    }

}
