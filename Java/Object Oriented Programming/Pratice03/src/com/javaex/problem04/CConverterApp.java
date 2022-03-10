package com.javaex.problem04;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar = 1000000;
        double won = 100;
        
        CConverter.setRate(1229.40);
        
        
        System.out.println("백만원은 " + CConverter.toDoller(dollar) + " 달러입니다.");
        System.out.println("백달러는"+ CConverter.toKRW(won) + "원입니다.");
        
        
    }

}
