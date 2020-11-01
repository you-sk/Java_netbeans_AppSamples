/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage3;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line;
        boolean firstLine = true;
        Integer line1 = 0;
        String[] input = null;

        for (; cin.hasNext();) {
            line = cin.nextLine();
            if (firstLine) {
                line1 = Integer.parseInt(line);
                firstLine = false;
            } else {
                input = line.split(" ", 0);
                break;
            }
        }

        boolean find = false;
        for (int i = 0; i < line1; i++) {
            Integer a = Integer.parseInt(input[i]);
            for (int j = 0; j < line1; j++) {
                Integer b = Integer.parseInt(input[j]);
                if (i != j) {
                    if (a + b == 256) {
                        find = true;
                    }
                }
            }

            if (find) {
                break;
            }
        }

        if (find) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }

    }
}
