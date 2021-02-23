package com.coffeebean;


import edu.duke.DirectoryResource;
import edu.duke.FileResource;
import edu.duke.Point;
import edu.duke.Shape;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here


        DirectoryResource dr = new DirectoryResource();
        for (File f :
                dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            System.out.println(s);
        }


    }
}
