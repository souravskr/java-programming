package com.coffeebean;

public class Part2 {

    public void findAbc(String input){
        int index = input.indexOf("abc");
        String found;
        while (true){
            if (index == -1 || index >= input.length() - 3){
                break;
            }
            System.out.println("Index " +index);
            found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc",index+3);
        }
    }
}
