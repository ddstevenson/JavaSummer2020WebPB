package edu.pdx.cs410J.roper;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static void main(String[] args) {
    char center = args[0].charAt(0);
    if(center > 'r' || center <= 'a') {
      System.err.println("command line argument must be a character between a-r");
      System.exit(1);
    }
    char[] toCenter = new char[center-'a'];
    for(int i = 'a'; i < center; ++i){
      toCenter[i-'a'] = (char) i;
    }
    for (char blah : toCenter) {
      System.out.println(blah);
    }
    System.exit(1);
  }
}