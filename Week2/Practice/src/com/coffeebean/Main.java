package com.coffeebean;

import edu.duke.URLResource;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Part2 part2 = new Part2();
//        part2.testSimple();
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        String myLink = "youtube.com";
        for (String s :
                ur.words()) {
            System.out.println(s);
        }
    }
}
