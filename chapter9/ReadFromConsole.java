package com.chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import acm.program.ConsoleProgram;

public class ReadFromConsole extends ConsoleProgram {

  public static void main(String[] args) {

    System.out.println("Enter here : ");

    try{
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

        String value = bufferRead.readLine();
        
        System.out.println(value);
        
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
  }

}