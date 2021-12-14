package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private final int number;
    private int rand_min = 0;
    private int rand_max = 100;
    ArrayList<Integer> array = new ArrayList<>();


    Game(int min, int max) {
        int tepm = rand(min, max);
        if (tepm >= 0) {
            rand_min = min;
            rand_max = max;
        }
        number = tepm;
    }

    Game() {
        number = rand();
    }

    void play() {
        if (number >= 0) {
            boolean found = false;
            Scanner scan = new Scanner(System.in);
            while (!found) {
                System.out.println("Guess the number from " + rand_min + " to " + rand_max);
                System.out.println("Your history of attempts: " + array.toString());
                System.out.print("Input your number: ");
                int userNumber;
                if (scan.hasNextInt()) {
                    userNumber = scan.nextInt();
                    if (userNumber > rand_max || userNumber < rand_min) {
                        System.out.println("This number is out of range! Choose another.");
                        continue;
                    }
                    array.add(userNumber);
                    if (userNumber == number) {
                        found = true;
                        System.out.println("You guessed! This number is " + number);
                        System.out.println("Your history of attempts: " + array.toString());
                    } else if (userNumber < number) {
                        rand_min = userNumber + 1;
                        System.out.println("The required number is more. Try again!");
                    } else {
                        rand_max = userNumber - 1;
                        System.out.println("The required number is less. Try again!");
                    }
                } else {
                    System.out.println("Your number is not int, please input integer value");
                    scan.nextLine();
                }
            }
        } else {
            System.out.println("Change the range settings!");
        }

    }

    private int rand(int min, int max) {
        if (min >= rand_min && min <= rand_max) {
            if (max >= rand_min && max <= rand_max) {
                if (max >= min) {
                    return min + (int) (Math.random() * (max - min));
                } else {
                    System.out.println("min must be less then max");
                    return -1;
                }
            } else {
                System.out.println("max must be in range "+ rand_min + " - " + rand_max );
                return -1;
            }
        } else {
            System.out.println("min must be in range "+ rand_min + " - " + rand_max);
            return -1;
        }
    }

    private int rand() {
        return (int) (Math.random() * rand_max);
    }
}
