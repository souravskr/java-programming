package com.coffeebean;

public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb){

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

    public String lastPart(String stringa, String stringb){

        int startIndex = stringb.indexOf(stringa);
        if (startIndex == -1){
            return stringb;
        }
        return stringb.substring(startIndex, startIndex + 3);
    }


//    public void



    public void testTwoOccurrences(){
        String [] stringA = {"an", "by", "atg", "zoo"};
        String [] stringB = {"banana", "A story by Abby Long", "ctgtatgta", "forest"};

        for (int i = 0; i < stringA.length; i++) {
            System.out.println(twoOccurrences(stringA[i], stringB[i]));
            System.out.println(lastPart(stringA[i], stringB[i]));
        }
    }
}
