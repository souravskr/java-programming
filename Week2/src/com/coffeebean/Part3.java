package com.coffeebean;

public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb){

        int count = 0;
        int startIndex = stringb.indexOf(stringa);
        int lastIndex = stringb.length();
        if (startIndex == -1){
            return false;
        }
        String sbuString = stringb.substring(startIndex + 3, lastIndex);
        int newStartIndex = sbuString.indexOf(stringa);
        if (newStartIndex == -1){
            return false;
        }
        return true;
    }

    public void testTwoOccurrences(){
        String [] stringA = {"a", "by", "atg"};
        String [] stringB = {"banana", "A story by Abby Long", "ctgtatgta"};

        for (int i = 0; i < stringA.length; i++) {
            System.out.println(twoOccurrences(stringA[i], stringB[i]));
        }
    }
}
