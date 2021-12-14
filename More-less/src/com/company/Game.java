package com.company;


public class Game {
    private int number;

    Game(int min, int max) {
        int tepm = rand(min, max);
        if (tepm >= 0)
            number = tepm;
        System.out.println(number);
    }

    Game() {
        number = rand();
        System.out.println(number);
    }

    void play() {

    }

    private int rand(int min, int max) {
        if (min >= 0 && min <= 100) {
            if (max >= 0 && max <= 100) {
                if (max >= min) {
                    return min + (int) (Math.random() * (max - min));
                } else {
                    System.out.println("min must be less then max");
                    return -1;
                }
            } else {
                System.out.println("max must be in range 0 - 100");
                return -1;
            }
        } else {
            System.out.println("min must be in range 0 - 100");
            return -1;
        }
    }

    private int rand() {
        return (int) (Math.random() * 100);
    }
}
