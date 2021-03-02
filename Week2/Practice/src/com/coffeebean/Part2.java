package com.coffeebean;

public class Part2 {
    public String findSimpleGene(String dna, String startCondon, String stopCondon){
        String dnaUpper = dna.toUpperCase();
        int startIndex = dnaUpper.indexOf(startCondon);
        if (startIndex == -1){
            return "No ATG";
        }
        int endIndex = dnaUpper.indexOf(stopCondon, startIndex + 3);
        if (endIndex == -1){
            return "No TAA";
        }
        int geneIndices = endIndex - startIndex;
        if (geneIndices % 3 == 0){
            return dna.substring(startIndex, endIndex + 3);
        }
        return "Dna String Not Valid!";
    }
    public void testSimple(){
        String dna1 = "ATGGGTTAAGTC";
        String dna2 = "gatgctataat";

        System.out.println("From dna1 " + findSimpleGene(dna1, "ATG", "TAA"));
        System.out.println("From dna2 " + findSimpleGene(dna2, "ATG", "TAA"));
    }
}
