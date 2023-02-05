package com.company;



public class result {
    static CountingGame num;

    public  static int findResult(int total){

        int lastAgeDigit=0;
        int lastAgeDigit1=0;
        int firstAgeDigit=0;
        int finalAge=0;
        int luckyNumber=0;


        if (total<135){
            int [] num={1,2,3,4,5,6,7,8,9};

            if (total>=35 && total<45){
                lastAgeDigit=num[0];
                luckyNumber=total-35;

            }
            if (total>=45 && total<55){
                lastAgeDigit=num[1];
                luckyNumber=total-45;
            }
            if (total>=55 && total<65){
                lastAgeDigit=num[2];
                luckyNumber=total-55;
            }
            if (total>=65 && total<75){
                lastAgeDigit=num[3];
                luckyNumber=total-65;
            }
            if (total>=75 && total<85){
                lastAgeDigit=num[4];
                luckyNumber=total-75;
            }
            if (total>=85 && total<95){
                lastAgeDigit=num[5];
                luckyNumber=total-85;
            }
            if (total>=95 && total<105){
                lastAgeDigit=num[6];
                luckyNumber=total-95;
            }
            if (total>=105 && total<115){
                lastAgeDigit=num[7];
                luckyNumber=total-105;
            }
            if (total>=115 && total<125){
                lastAgeDigit=num[8];
                luckyNumber=total-115;
            }
            if (total>=125 && total<135){
                lastAgeDigit=num[9];
                luckyNumber=total-125;
            }

            System.out.print(luckyNumber);

        }

        if (total>135){
            lastAgeDigit1= total%100;//if the total is greater than 125
                                          //you have to find the last digit again
            firstAgeDigit=(total-lastAgeDigit1)/100;
           lastAgeDigit =findResult(lastAgeDigit1);
           finalAge=(firstAgeDigit*10+lastAgeDigit);
            return finalAge;
        }

        return lastAgeDigit;


    }
}


