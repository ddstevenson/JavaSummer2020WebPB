package edu.pdx.cs410J.ads6;

import java.util.Stack;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    Stack<String> stack = new Stack<String>();
    String operators = "+-/*";
    int num1, num2;
    // 2 3 + 4 *
    for(int i=0; i<args.length; i++){
      if(operators.contains(args[i])){
        num1 = Integer.parseInt(stack.pop());
        num2 = Integer.parseInt(stack.pop());
      }
      else{
        stack.push(args[i]);
      }


    }
  }
}