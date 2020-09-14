package ru.denfad;

import sun.rmi.runtime.Log;

import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Spliting {

    public static void main(String[] args){
        String str = "30 40 % 50 60";
        String[] strings = str.split("%");
        System.out.println(Arrays.toString(strings));
        for(String s: strings){
            String[] cutStr = s.split(" ");
            System.out.println(Arrays.toString(cutStr));
        }
    }
}
