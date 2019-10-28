package ru.mirea.lab7;
import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrListSec = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrList.add(i);
            arrListSec.add(i);
        }

        arrList.addAll(5, arrListSec);
        System.out.println("arrList: " + arrList);

        System.out.println("7th element: " + arrList.get(7));
        arrList.remove(5);
        arrList.set(8, 12);
        System.out.println("arrList after changes: " + arrList);

        System.out.println("First index of 2: " + arrList.indexOf(2));
        System.out.println("Last index of 2: " + arrList.lastIndexOf(2));
        System.out.println("Sublist from 4 to 8 index" + arrList.subList(4, 8));
    }
}
