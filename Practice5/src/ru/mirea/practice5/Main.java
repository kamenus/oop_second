package ru.mirea.practice5;

public class Main {
//  Task #9
    public static int RecursiveSolution(int a, int b) {
        if(a == 0) {
            return 1;
        }else if (a > 1 && b == 0) {
            return 0;
        }else if (a == 1) {
            return b + 1;
        }
        return RecursiveSolution(a - 1, b - 1) + RecursiveSolution(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(RecursiveSolution(1, 2));
    }
}
