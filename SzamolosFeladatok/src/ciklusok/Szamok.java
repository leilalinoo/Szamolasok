package ciklusok;

import java.util.Scanner;

public class Szamok {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "latin2");
        System.out.println("Ismétléssel, vagy ismétlés nélül szeretné látni a számokat? (ism/nél");
        String kerdes = sc.next();

        int ismdb = 0;
        int nelkuldb = 0;

        for (int j = 2; j <= 4; j++) {
            for (int y = 2; y <= 4; y++) {
                for (int i = 2; i <= 4; i++) {
                    if (kerdes.equals("ism")) {
                        System.out.println(j + "" + y + "" + i);
                        ismdb++;
                    } else if (i != y && i != j && j != y) {
                        System.out.println("" + j + y + i);
                        nelkuldb++;
                    }
                }
            }
        }
        if (kerdes.equals("ism")) {
            System.out.println("Ismételt dbszám: " + ismdb);
        }
        else{
            System.out.println("Ismétlés nélküli dbszám: "+nelkuldb);
        }
    }
}
