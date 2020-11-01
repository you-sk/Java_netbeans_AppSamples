/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage2;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String line;
        ArrayList<Answer> answers = new ArrayList<>();
        int count = 0;

        for (; cin.hasNext();) {

            line = cin.nextLine();
            String[] input = line.split(",", 0);
            answers.add(new Answer(input.length - 1, input[0]));
            count++;
//            System.out.println(count);
            if (count > 4) {
                break;
            }
        }

        answers.sort((b, a) -> a.count - b.count);
        answers.forEach((all) -> {
            System.out.println(all.toString());
        });
    }
}

class Answer {

    int count;
    String name;

    public Answer(int a, String n) {
        count = a;
        name = n;
    }

    @Override
    public String toString() {
        return name + "," + Integer.toString(count);
    }
}
