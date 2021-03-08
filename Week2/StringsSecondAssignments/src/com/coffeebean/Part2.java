package com.coffeebean;

public class Part2 {

    public int howMany(String stringa, String stringb){
        // Find number of TG in dna string
        int pos = stringb.indexOf(stringa);
        int count = 0;

        while (pos != -1){
            count+=1;
            pos = stringb.indexOf(stringa, pos + 2);
        }

        return count;
    }

    public void testHowMany(){
        System.out.println(howMany("GAA", "ATGAACGAATTGAATC"));
        System.out.println(howMany("AA", "ATAAAA"));
    }
}
