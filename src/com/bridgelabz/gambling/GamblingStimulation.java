package com.bridgelabz.gambling;

public class GamblingStimulation {
    public static final int STARTINGSTAKE = 100;
    public static final int BETSTAKE = 1;
    public static final int WIN = 1;
    public static void winOrLose(){
        int betChoice = (int) Math.floor(Math.random() * 10) % 2;
            if(betChoice == WIN)
                System.out.println("gambler wins");
            else
                System.out.println("gambler lose");
    }
    public static void main(String[] args) {
        System.out.println("welcome to gambling stimulation problem");
        winOrLose();
    }
}
