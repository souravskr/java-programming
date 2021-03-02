package com.coffeebean;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
//	 write your code here
        String dna = "TAAATGTGATGTGATAGTAAATGTGAGTGATGTGA";
//        String dna = "";
        int startIndex = dna.indexOf("ATG");
//        System.out.println(startIndex);
        Part1 part1 = new Part1();
        int forTAA = part1.findStopCodon(dna, startIndex, "TAA");
        int forTGA = part1.findStopCodon(dna, startIndex, "TGA");
        int forTAG = part1.findStopCodon(dna, startIndex, "TAG");

        int [] stopCodons = {forTAA, forTAG, forTGA};

        int minAmongStopCodons = Arrays.stream(stopCodons).min().getAsInt();


        System.out.println(dna.substring(startIndex, minAmongStopCodons+3));



        // Find number of TG in dna string
        int pos = dna.indexOf("TG");
        int count = 0;

        while (pos != -1){
            count+=1;
            pos = dna.indexOf("TG", pos + 2);
        }

        System.out.println(count);
    }
}
