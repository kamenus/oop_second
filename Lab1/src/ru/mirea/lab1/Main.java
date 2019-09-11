package ru.mirea.lab1;

public class Main {

    public static void main(String[] args) {
	    int[] b = new int[]{ 5, 10, 123, 11, 92, 1 };
        int sum = 0;

	    for (int i = 0; i < b.length; i++) {
	        sum += b[i];
        }

        System.out.println(sum);

	    int index = 0;
	    int sum2 = 0;
	    while (index < b.length) {
	        sum2 += b[index];
	        index++;
        }

        System.out.println(sum2);

	    int index1 = 0;
	    int sum3 = 0;

	    do {
	        sum3 += b[index1];
	        index1++;
        } while (index1 < b.length);

        System.out.println(sum3);

        int[] arr = new int[];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.round((int)Math.random() * 100);
        }
    }
}
