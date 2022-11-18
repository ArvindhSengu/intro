import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;


class MarksClient {
  public static void main(String[] args) {
    boolean useEquationSover = validateStringInput();
    if(useEquationSover){
      System.out.println("Using EQ Solver");
    }
    else{
      System.out.println("Not equation solver");
    }
    userInput();
  }
    
    dsadasasddsa
    
    
   public static boolean validateStringInput(){
    System.out.println("Welcome to Student Marking AI V5.3");
    System.out.println("Select one of the options below to continue");
    System.out.println("A. Import answer data and mark student data");
    System.out.println("B. Run equation solver and mark student data");
    Scanner reader = new Scanner(System.in);
    String choice = reader.nextLine();

    while(!choice.equalsIgnoreCase("A") && !choice.equalsIgnoreCase("B")){
      System.out.println("Invalid resonse, try again.");
      choice = reader.nextLine();
    }

    if(choice.equalsIgnoreCase("B")){
      return true;
    }
    else if(choice.equalsIgnoreCase("A")){
      return false;
    }
    return true;
  }
}
