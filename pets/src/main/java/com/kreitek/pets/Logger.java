package com.kreitek.pets;

public class Logger {
    private static volatile Logger instance = null;
    private int count = 0;

    private Logger() {
        if (instance != null) {
            throw new RuntimeException("Usage getInstance() method to create");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized(Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void debug(String data){
        System.out.println("[debug][" + getCount() + "] - " + data);
    }

    public int getCount(){
        count ++;
        return count;
    }
}
