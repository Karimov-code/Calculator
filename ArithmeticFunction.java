package com.company;

import com.company.RomanNumbers;

public class ArithmeticFunction {

    public String getResult(String line){
        String result = "";
        char arithmeticSign = getSign(line);

        if (arithmeticSign != 0){

            int indexOfSign ;
            indexOfSign = line.indexOf(arithmeticSign);
            if (isRoman(line)){
                RomanNumbers romanNumbers = new RomanNumbers();

                int number1, number2;

                number1 = romanNumbers.getArabicValue(line.substring(0,indexOfSign).trim());
                number2 = romanNumbers.getArabicValue(line.substring(indexOfSign+1).trim());
                if (number1>=0 && number1<=10 && number2>=0 && number2<=10){
                    result = romanNumbers.getRomanValue(calculate(number1, number2, arithmeticSign));
                }else {
                    System.exit(-1);
                }

            }else{
                int number1, number2;
                number1 = Integer.parseInt(line.substring(0,indexOfSign).trim());
                number2 = Integer.parseInt(line.substring(indexOfSign+1).trim());

                if (number1>=0 && number1<=10 && number2>=0 && number2<=10){
                    result = String.valueOf(calculate(number1, number2, arithmeticSign));
                }else {
                    System.exit(-2);
                }
            }
        }else {
            System.exit(-3);
        }
        return line + " = " + result;
    }

    private int calculate(int number1, int number2, char sign){
        int result = 0;

        switch (String.valueOf(sign)) {
            case "+" :
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
        }
        return result;
    }

    private char getSign(String line){
        String a = "+-*/";
        for (int i = 0; i<a.length(); i++) {
            if (line.indexOf(a.charAt(i)) != -1) {
                return a.charAt(i);
            }
        }
        return 0;
    }
    public boolean isRoman(String line){
       String a = "IVXCD";
        for (int i = 0; i<a.length(); i++) {
            if (line.indexOf(a.charAt(i)) != -1) {
                return true;
            }
        }
       return false;

    }
}
