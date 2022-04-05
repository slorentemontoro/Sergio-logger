package com.kreitek.pets;

public class logger {

    private static int counter = 0;

    public static void debug(String data) {

        counter += 1;
        System.out.println("[Debug][" + counter + "]" + data);
    }
}
