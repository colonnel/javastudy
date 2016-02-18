package com.company;

public class Main {

    public static void main(String[] args) {
        int size = 5;

        char[][] tri = new char[size][size];
        int zv = tri.length - 2;
        for (int i = 0; i < tri.length; i++) {
            for (int j = 0; j < tri[i].length; j++) {
                if (j > zv) {
                    System.out.print(tri[i][j] = '*');

                } else {
                    System.out.print(tri[i][j] = ' ');
                }
            }
            zv--;
            System.out.println();
        }

    }
}
