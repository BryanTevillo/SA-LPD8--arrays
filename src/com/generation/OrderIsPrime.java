package com.generation;

import java.math.BigInteger;
import java.util.Scanner;

public class OrderIsPrime {

  public static void main(String[] args) {
    int[] arrayMain = new int[10];
    int[] arrayOrder = new int[10];

    Scanner in = new Scanner(System.in);
    System.out.println(
      "Programa ordena array primos Favor de ingresar los siguientes 10 numeros "
    );

    for (int i = 0; i < 10; i++) {
      System.out.println("Ingresa un numero: ");
      arrayMain[i] = in.nextInt();
    }
    System.out.println("***************Array Original***************");
    printArrya(arrayMain);
    int count = 0;
    for (int num : arrayMain) {
      if (isPrime(num)) {
        arrayOrder[count] = num;
        count++;
      }
    }
    for (int num : arrayMain) {
      if (!isPrime(num)) {
        arrayOrder[count] = num;
        count++;
      }
    }

    System.out.println(
      "***************Array Ordenado Primos Primero***************"
    );
    printArrya(arrayOrder);

    in.close();
  }

  public static boolean isPrime(int num) {
    BigInteger numBig = new BigInteger("" + num);
    return numBig.isProbablePrime(50);
  }

  static void printArrya(int[] num) {
    for (int i = 0; i < 10; i++) {
      System.out.println(i + " - " + num[i]);
    }
  }
}
