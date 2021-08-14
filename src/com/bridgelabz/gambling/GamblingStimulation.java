package com.bridgelabz.gambling;

public class GamblingStimulation {
    public static int STARTINGSTAKE = 100;
    public static final int BETSTAKE = 1;
    public static final int DAY=20;
    public static String winOrLose() {
        double random=(int) Math.floor(Math.random() * 10) % 2;
        if(random==1)
            return "Winning";
        else
            return "Lossing";
    }
    public static void ResignDay(int i) {
        int initialStackOfDay=STARTINGSTAKE;
        double FIFTY_PERCENT_LOSS=STARTINGSTAKE*0.5;;
        double FIFTY_PERCENT_GAIN=STARTINGSTAKE*1.5;
        while (STARTINGSTAKE > (FIFTY_PERCENT_LOSS) && STARTINGSTAKE < (FIFTY_PERCENT_GAIN)) {
            if (winOrLose() == "Winning")
                STARTINGSTAKE += BETSTAKE;
            else
                STARTINGSTAKE -= BETSTAKE;
        }
        if(initialStackOfDay<STARTINGSTAKE)
        {
            int win=STARTINGSTAKE-initialStackOfDay;
            System.out.println("Day "+i+" win = "+win);
        }
        else
        {
            int loss=initialStackOfDay-STARTINGSTAKE;
            System.out.println("Day "+i+" loss = "+loss);
        }

    }
    public static void twentyDay(){

        for(int i=1;i<=DAY;i++){
            ResignDay(i);
        }
    }
    public static void main(String[] args) {
        System.out.println("welcome to gambling stimulation problem");
        twentyDay();
        if(STARTINGSTAKE>100)
            System.out.println("Gambler win and total amount = " +STARTINGSTAKE);
        else
            System.out.println("Gambler loss and total amount = " +STARTINGSTAKE);
    }

}