package com.bridgelabz.gambling;

public class GamblingStimulation {
    public static int STARTINGSTAKE = 100;
    public static final int BETSTAKE = 1;
    public static final int DAY=20;
    public static int max_val=0;
    public static int min_val=0;
    public static int luckyDay=0;
    public static int unluckyDay=0;
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
            max(win,i);
        }
        else
        {
            int loss=initialStackOfDay-STARTINGSTAKE;
            System.out.println("Day "+i+" loss = "+loss);
            min(loss,i);
        }

    }
    public static void twentyDay(){

        for(int i=1;i<=DAY;i++){
            ResignDay(i);
        }
    }
    public static void min(int loss,int i){
        if(min_val<loss)
        {
            min_val=loss;
            unluckyDay=i;
        }
    }
    public static void max(int win,int i){
        if(max_val<win)
        {
            max_val=win;
            luckyDay=i;
        }

    }
    public static void main(String[] args) {
        System.out.println("welcome to gambling stimulation problem");
        twentyDay();
        System.out.println("Lucky Day is "+luckyDay+"  Amount won on that day ="+max_val);
        System.out.println("Unlucky Day is "+unluckyDay+"  Amount loss on that day ="+min_val);
        while(true) {
            if (STARTINGSTAKE > 100) {
                System.out.println("Gambler win and total amount = " + STARTINGSTAKE);
                System.out.println("gambler won so he like to continue the game");
                twentyDay();
            } else {
                System.out.println("Gambler loss and total amount = " + STARTINGSTAKE);
                System.out.println("gambler lost all the money so he cant keep playing");
                break;
            }
        }
    }

}