package com.coffeebean;

import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public int getNumPoints (Shape s) {
        // Put code here
        int numberOfPoint = 0;
        for (Point point : s.getPoints()) {
            numberOfPoint ++;
        }
        return numberOfPoint;
    }

    public double getAverageLength(Shape s) {
        // Put code here
        double length = getPerimeter(s);
        int number_of_point = getNumPoints(s);
        return length/number_of_point;
    }

    public double getLargestSide(Shape s) {
        // Put code here
        Point prevPt = s.getLastPoint();
        double prevDist = 0;

        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt
            double currDist = prevPt.distance(currPt);
            if (currDist > prevDist){
                prevDist = currDist;
            }
        }

        return prevDist;
    }

    public double getLargestX(Shape s) {
        // Put code here
        int prevPoint = 0;

        for (Point point :
                s.getPoints()) {
            int currPoint = point.getX();

            if (currPoint > prevPoint){
                prevPoint = currPoint;
            }

        }
        return prevPoint;
    }

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        double prevPerim = 0;
        DirectoryResource dr = new DirectoryResource();
        for (File f :
                dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPrem = getPerimeter(s);
            if(currPrem > prevPerim){
                prevPerim = currPrem;
            }
        }
        return prevPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        File temp = null;    // replace this code
        double prevPerim = 0;
        DirectoryResource dr = new DirectoryResource();
        for (File f :
                dr.selectedFiles()) {
            FileResource fr = new FileResource(f);
            Shape s = new Shape(fr);
            double currPrem = getPerimeter(s);
            if(currPrem > prevPerim){
                prevPerim = currPrem;
                temp = f;
            }
        }
        return temp.getName();
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int number_of_point = getNumPoints(s);
        System.out.println("Number of Points = " + number_of_point);
        System.out.println("perimeter = " + length);
        System.out.println("Average Length = " + getAverageLength(s));
        System.out.println("Largest Side = " + getLargestSide(s));
        System.out.println("Largest X = " + getLargestX(s));

    }

    public void testPerimeterMultipleFiles() {
        // Put code here
        System.out.println("Largest Perimeter = " + getLargestPerimeterMultipleFiles());
    }

    public void testFileWithLargestPerimeter() {
        // Put code here
        System.out.println("File with largest perimeter = " + getFileWithLargestPerimeter());
    }

    // This method creates a triangle that you can use to test your other methods
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

    // This method prints names of all files in a chosen folder that you can use to test your other methods
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }

    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}
