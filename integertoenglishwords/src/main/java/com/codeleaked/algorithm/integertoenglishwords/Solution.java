package com.codeleaked.algorithm.integertoenglishwords;

public class Solution {

    private final String[] units = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] tens = new String[] { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {
        if (num < 20) {
            return units[num];
        } else if (num < 100) {
            return tens[num / 10] + (num % 10 > 0 ? " " + units[num % 10]: "");
        } else if (num < 1000) {
            return units[num / 100] + " Hundred"  + (num % 100 > 0 ? " " + numberToWords(num % 100) : "");
        } else if (num < 1000000) {
            return numberToWords(num / 1000) + " Thousand" + (num % 1000 > 0 ? " " + numberToWords(num % 1000) : "");
        } else if (num < 1000000000) {
            return numberToWords(num / 1000000) + " Million" + (num % 1000000 > 0 ? " " + numberToWords(num % 1000000) : "");
        } else {
            return numberToWords(num / 1000000000) + " Billion" + (num % 1000000000 > 0 ? " " + numberToWords(num % 1000000000) : "");
        }
    }

}
