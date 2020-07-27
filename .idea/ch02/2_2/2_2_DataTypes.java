package com.company;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.PropertyResourceBundle;

/**
 * 자료형(Data Type)
 * 자료형 - 기본형(Primitive Type), 참조형(Reference Type)
 * 기본형 자료형 - 정수형, 실수형, 문자형, 논리형
 * 참조형 자료형 - 문자열(String)
 */
public class Main {

    public static void main(String[] args) {
        //정수형: byte, short, int, long
        System.out.println("Byte");
        System.out.println(Byte.BYTES);
        byte byteValue = 42;
        System.out.println(byteValue);
        System.out.println(Byte.MAX_VALUE); //2^7-1
        System.out.println(Byte.MIN_VALUE); // -2^7
//        byte byteValue1 = 128;
        System.out.println("");

        System.out.println("Short");
        System.out.println(Short.BYTES);
        System.out.println(Short.MAX_VALUE); //2^15-1
        System.out.println(Short.MIN_VALUE); //-2^15
        System.out.println("");

        System.out.println("Int");
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MAX_VALUE); //2^31-1
        System.out.println(Integer.MIN_VALUE); //-2^31
        System.out.println("");

        System.out.println("Long");
        System.out.println(Long.BYTES);
        System.out.println(Long.MAX_VALUE); //2^63-1
        System.out.println(Long.MIN_VALUE); //-2^63
        System.out.println("");

        //OverFlow
        short shortValue = (short)64000;
        System.out.println(shortValue);

        //정수형은 기본적으로 int
        //byte byteValue3 =  144;
        short shortA = 10;
        short shortB = 20;
        short shortC = (short)(shortA + shortB); //short 둘을 더하면 오버플로우 발생할 수 있다 -> int형으로 지동 형 변환 된다.

        int bigInt = Integer.MAX_VALUE;
        int biggerInt = bigInt + 1; //overflow 주의
        System.out.println(biggerInt);

        long veryBigInt = 10000000000000L;
        System.out.println(veryBigInt);


        // 진수법 - Binary(2), Octal(8), Decimal(10), Hexadecimal(16)
        System.out.println(0b1101); //2진수
        System.out.println(071);
        System.out.println(1423);
        System.out.println(0x10); //0~9 10~15: a b c d e f
        System.out.println(0xff);
    }
}
