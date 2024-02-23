package com.generation;

import java.math.BigInteger;
import java.util.Scanner;

public class OrderIsPrime {

  public static void main(String[] args) {
    int[] arrayMain = new int[10];
    int[] arrayOrder = new int[10];

    Scanner in = new Scanner(System.in);
    System.out.println("Programa ordena array primos Favor de ingresar los siguientes 10 numeros ");

    for (int i = 0; i < 10; i++) {
      System.out.println("Ingresa un numero: ");
      arrayMain[i] = in.nextInt();
    }
    System.out.println("***************Array Original***************");
    printArrya(arrayMain);
    int countPrime = 0;
    int countNonPrime = arrayMain.length - 1; // Empieza desde el final del arreglo

    for (int num : arrayMain) {
      if (isPrime(num)) {
        arrayOrder[countPrime++] = num; // Añade al principio del arreglo de primos
      } else {
        arrayOrder[countNonPrime--] = num; // Añade al final del arreglo de no primos
      }
    }

    System.out.println("***************Array Ordenado Primos Primero***************");
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
