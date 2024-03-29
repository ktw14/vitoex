package org.vito.chap3;

//: c03:BitManipulation.java
// Using the bitwise operators.
// 应用涉及“按位”操作的所有操作符
// From 'Thinking in Java, 3rd ed.' (c) Bruce Eckel 2002
// www.BruceEckel.com. See copyright notice in CopyRight.txt.
import org.vito.simpletest.*;
import java.util.*;

public class BitManipulation {
  static Test monitor = new Test();
  public static void main(String[] args) {
    Random rand = new Random();
    int i = rand.nextInt();
    int j = rand.nextInt();
    
    printBinaryInt("-1", -1);  // 补码
    printBinaryInt("+1", +1);
    
    int maxpos = 2147483647;   // 2^31-1 , 32位的最大正值
    printBinaryInt("maxpos", maxpos);
    int maxneg = -2147483648;  // -2^31
    printBinaryInt("maxneg", maxneg);
    
    printBinaryInt("i", i);
    printBinaryInt("~i", ~i);
    printBinaryInt("-i", -i);
    printBinaryInt("j", j);
    printBinaryInt("i & j", i & j);
    printBinaryInt("i | j", i | j);
    printBinaryInt("i ^ j", i ^ j);
    printBinaryInt("i << 5", i << 5);
    printBinaryInt("i >> 5", i >> 5);
    printBinaryInt("(~i) >> 5", (~i) >> 5);
    printBinaryInt("i >>> 5", i >>> 5);
    printBinaryInt("(~i) >>> 5", (~i) >>> 5);

    long l = rand.nextLong();
    long m = rand.nextLong();
    printBinaryLong("-1L", -1L);
    printBinaryLong("+1L", +1L);
    long ll = 9223372036854775807L;
    printBinaryLong("maxpos", ll);
    long lln = -9223372036854775808L;
    printBinaryLong("maxneg", lln);
    printBinaryLong("l", l);
    printBinaryLong("~l", ~l);
    printBinaryLong("-l", -l);
    printBinaryLong("m", m);
    printBinaryLong("l & m", l & m);
    printBinaryLong("l | m", l | m);
    printBinaryLong("l ^ m", l ^ m);
    printBinaryLong("l << 5", l << 5);
    printBinaryLong("l >> 5", l >> 5);
    printBinaryLong("(~l) >> 5", (~l) >> 5);
    printBinaryLong("l >>> 5", l >>> 5);
    printBinaryLong("(~l) >>> 5", (~l) >>> 5);
    
    //monitor.expect("BitManipulation.out");
    //monitor.expect("D:\\MyDocument\\eclipse\\ThinkInJava\\TIJ3rd\\src\\org\\vito\\chap3\\BitManipulation.out");
    monitor.expect(".\\src\\org\\vito\\chap3\\BitManipulation.out");
  }
  
  /**
   * 以二进制输出 int 整型
   * @param s
   * @param i
   */
  static void printBinaryInt(String s, int i) {
    System.out.println(
      s + "; int: " + i + ", binary: ");
    System.out.print("   ");
    for(int j = 31; j >= 0; j--)
      if(((1 << j) &  i) != 0) // 进行按位与取数
        System.out.print("1");
      else
        System.out.print("0");
    System.out.println();
  }
  static void printBinaryLong(String s, long l) {
    System.out.println(
      s + "; long: " + l + ", binary: ");
    System.out.print("   ");
    for(int i = 63; i >= 0; i--)
      if(((1L << i) & l) != 0)
        System.out.print("1");
      else
        System.out.print("0");
    System.out.println();
  }
} ///:~
