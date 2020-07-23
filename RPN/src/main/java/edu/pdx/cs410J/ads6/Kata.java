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
    Stack<Integer> stack = new Stack<>();
    //String operators = "+-/*";
    //int num1, num2;
    // 2 3 + 4 *

    int result = 0;
    for(String arg : args){

      // if number, parse get the number -> stack
      int number;
      try {
        number = Integer.parseInt(arg);
        stack.push(number);
      } catch (NumberFormatException e) {
        // do the calculation
        //result += calculation();
        switch (arg) {
          case "+":
            stack.push(stack.pop() + stack.pop());
            break;
          case "-":
            int num1 = stack.pop();
            stack.push(stack.pop()-num1);
            break;
          case "*":
            stack.push(stack.pop() * stack.pop());
            break;
          case "/":
            int num2 = stack.pop();
            stack.push(stack.pop() / num2);
            break;
          case "MAX":
            break;
          case "MIN":
            break;
          case "SQRT":
            break;
          default:
            // else error report
            System.err.println("Unrecognized operator! " + arg);
            break;
        }
      }





    }
  }
}