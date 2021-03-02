package com.coffeebean;

public class Part1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int diff;
        int currIndex;

        if (dna.length() > 0){
            currIndex = dna.indexOf(stopCodon, startIndex);

            while (true){

                diff = (currIndex + 3) - startIndex;

                if ( diff % 3 == 0){
                    return  currIndex;
                }else {
                    break;
                }
            }
        }

//        System.out.println(currIndex);

        return dna.length();
    }



}
