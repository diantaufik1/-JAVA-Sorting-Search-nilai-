package com.company;

public class Main {

    public static void main(String[] args) {

        String [] nama ={"Ardi", "Pian", "Robi"};

        double[][] nil = {{60, 70, 90}, {80,70,90}, {70,60,90}};

        double nilai = 0;



        System.out.println("+——-+——-+——-+——-+—————+");

        System.out.println("| Nama\\t|  UTS\\t|  UAS\\t|  TUGAS\\t|  Nilai Akhir|");

        System.out.println("+——-+——-+——-+——-+—————+");

        for (int row = 0; row<3; row++){

            System.out.print("| " + nama[row] + "\\t|  ");

            for (int column = 0; column <3; column++){

                System.out.print(nil[row][column] + "\\t|  ");

            }

            nilai = (0.35 * nil[row][0])+(0.45 * nil[row][1])+(0.2 * nil[row][2]);

            System.out.println(nilai + "\\t\\t|");

        }

        System.out.println("+——-+——-+——-+——-+—————+");
    }
}
