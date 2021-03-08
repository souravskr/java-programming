package com.coffeebean;
import java.util.Arrays;

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


    public String findGene(String dna){
        int lengthOfDna = dna.length();
        int startIndex = dna.indexOf("ATG");

        if (startIndex == -1){
            return "";
        }

        int forTAA = findStopCodon(dna, startIndex, "TAA");
        int forTGA = findStopCodon(dna, startIndex, "TGA");
        int forTAG = findStopCodon(dna, startIndex, "TAG");

        int [] stopCodons = {forTAA, forTAG, forTGA};
        int minAmongStopCodons = Arrays.stream(stopCodons).min().getAsInt();


        if(forTAA == lengthOfDna && forTAG == lengthOfDna && forTGA == lengthOfDna){
            return "";
        }

        return "Gene is: " + dna.substring(startIndex, minAmongStopCodons+3);

    }




    public void testFindStopCodon(){

        String dna = "TAAATGTGATGTGATAGTAAATGTGAGTGATGTGA";
        int startIndex = dna.indexOf("ATG");

        int forTAA = findStopCodon(dna, startIndex, "TAA");
        int forTGA = findStopCodon(dna, startIndex, "TGA");
        int forTAG = findStopCodon(dna, startIndex, "TAG");

        System.out.println(forTAA);
        System.out.println(forTGA);
        System.out.println(forTAG);
    }

    public void testFindGene(){

        String dna1 = "XXXYYYZZZTTTGGGAAA";
        String dna2 = "TAAATGTGATGTGATAGTAAATGTGAGTGATGTGA";
        String dna3 = "TGAATGAAGGTTATTGTGTGT";

        System.out.println("DNA 01: " + dna1);
        System.out.println(findGene(dna1));

        System.out.println("DNA 02: " + dna2);
        System.out.println(findGene(dna2));

        System.out.println("DNA 03: " + dna3);
        System.out.println(findGene(dna3));

    }



}
