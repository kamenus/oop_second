package ru.mirea.practice7;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> q1 = new LinkedList<>();
        LinkedList<Integer> q2 = new LinkedList<>();

        int tryCount = 0;
        String winner = null;
        String text = null;
        String text1 = null;

        System.out.println("Введите карты первого игрока(через пробел): ");

        Scanner in = new Scanner(System.in);
        text = in.nextLine();
        for (String el : text.split(" ")) {
            if (el.equals("0")) {
                q1.add(10);
            } else {
                q1.add(Integer.parseInt(el));
            }
        }

        System.out.println("Введите карты второго игрока(через пробел): ");
        text1 = in.nextLine();
        for (String el : text1.split(" ")) {
            if (el.equals("0")) {
                q2.add(10);
            } else {
                q2.add(Integer.parseInt(el));
            }
        }

        int firstCard;
        int secondCard;
        int diff;

        while (tryCount < 106 && !(q1.isEmpty() || q2.isEmpty())) {
            firstCard = q1.pollFirst();
            secondCard = q2.pollFirst();
            diff = firstCard - secondCard;

            if (diff > 0) {
                q1.addLast(firstCard);
                q1.addLast(secondCard);
            } else if (diff < 0) {
                q2.addLast(firstCard);
                q2.addLast(secondCard);
            }
            tryCount++;
        }
        if (q1.isEmpty()) {
            winner = "second";
            System.out.println(winner + " " + tryCount);
        } else if (q2.isEmpty()) {
            winner = "first";
            System.out.println(winner + " " + tryCount);
        } else {
            System.out.println("botva");
        }
    }
}
