package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println("********");

        System.out.println(convertDecimalToBinary(13));
        System.out.println(convertDecimalToBinary(5));



    }



    public static boolean checkForPalindrome(String text) {
        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("Cleaned String: " + cleanedStr);

        LinkedList<Character> charList = new LinkedList<>();
        for (char c : cleanedStr.toCharArray()) {
            charList.add(c);
        }

        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }
        return true;
    }



    public static String convertDecimalToBinary(int decimal){
        if (decimal == 0) {
            return "0";
        }
        LinkedList<Integer> binary = new LinkedList<>();

        // Sayı 0'dan büyük olduğu sürece bölme işlemi yap
        while (decimal > 0) {
            // Kalanı ekle
            int remainder = decimal % 2;
            binary.addFirst(remainder);

            // Sayıyı 2'ye böl
            decimal = decimal / 2;
        }
        StringBuilder binaryString = new StringBuilder();
        for(int digits: binary){
            binaryString.append(digits);
        }
        return binaryString.toString();
    }
}