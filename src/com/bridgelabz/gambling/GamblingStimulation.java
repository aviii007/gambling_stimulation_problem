package com.bridgelabz.gambling;

public class GamblingStimulation {
    public static int STARTINGSTAKE = 100;
    public static final int BETSTAKE = 1;
    public static final int WIN = 1,LOSE=0;
    public static final double FIFTY_PERCENT_LOSS=STARTINGSTAKE*0.5;
    public static final double FIFTY_PERCENT_GAIN=STARTINGSTAKE*1.5;
    public static String winOrLose()
    {
        double random=(int) Math.floor(Math.random() * 10) % 2;
        if(random==1)
            return "Winning";
        else
            return "Lossing";
    }
    public static void ResignDay()
    {
        while(STARTINGSTAKE>(FIFTY_PERCENT_LOSS)&&STARTINGSTAKE<(FIFTY_PERCENT_GAIN))
        {
            if(winOrLose()=="Winning")
                STARTINGSTAKE+=BETSTAKE;
            else
                STARTINGSTAKE-=BETSTAKE;

        }
        if(BETSTAKE>(STARTINGSTAKE*0.5))
            System.out.println("Gambler loss 50% so resigning day"+STARTINGSTAKE);
        else
            System.out.println("Gambler gain 50% so resigning day"+STARTINGSTAKE);
    }
    public static void main(String[] args) {
        System.out.println("welcome to gambling stimulation problem");
        ResignDay();
    }
}
