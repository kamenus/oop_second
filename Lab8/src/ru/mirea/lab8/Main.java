package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите текст для записи: ");
        String text = null;

        Scanner in = new Scanner(System.in);
        text = in.nextLine();

        try {
            FileWriter writer = new FileWriter("text.txt", false);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
