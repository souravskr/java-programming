package com.coffeebean;

import java.util.Locale;

public class Part1 {

    public String findSimpleGene(String dna){
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1){
            return "No ATG";
        }
        int endIndex = dna.indexOf("TAA", startIndex + 3);
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
        String dna1 = "GTTAATGTAGCTTAAACCTTTAAAGCAAGGCACTGAAAATGCCTAGATGA";
        String dna2 = "atggatcctccatatacaacggtatctccacctcaggtttagatctcaacaacggaaccattgccgacatgagacagttaggtatcgtcgagagttacaagctaaaac";
        String dna3 = "AACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAACCCTAA";
        String dna4 = "acaagtttgtacaaaaaagcagaagggccgtcaaggcccaccatgcctattggatccaaagagaggccaacattttttgaaatttttaagacacg";
        String dna5 = "acaagtttgtacaaaaaagcagaagggccgtcaaggcccaccatgcctattggatccaaa\n" +
                "gagaggccaacattttttgaaatttttaagacacgctgcaacaaagcagatttaggacca";

        System.out.println("For dna1: " + findSimpleGene(dna1));
        System.out.println("For dna2: " + findSimpleGene(dna2.toUpperCase()));
        System.out.println("For dna3: " + findSimpleGene(dna3));
        System.out.println("For dna4: " + findSimpleGene(dna4.toUpperCase()));
        System.out.println("For dna5: " + findSimpleGene(dna5.toUpperCase()));

    }
}
