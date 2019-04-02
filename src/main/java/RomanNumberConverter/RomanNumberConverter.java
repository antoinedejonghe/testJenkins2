package RomanNumberConverter;

public class RomanNumberConverter{

  int convert(String romanNumber) {
    if(romanNumber == null) {
      throw new IllegalArgumentException("number cannot be null");
    }
    int length = romanNumber.length();
    int number = 0;
    if(length == 1) {
      switch (romanNumber) {

        case "I" :
          number = 1;
          break;
        case "V":
          number = 5;
          break;
        case "X":
          number = 10;
          break;
        case "L":
          number = 50;
          break;
        case "C":
          number = 100;
          break;
        case "D":
          number = 500;
          break;
        case "M":
          number = 1000;
          break;
      }
    }
    return number;
  }

  String convert(int number) {
    if(String.valueOf(number) == null) {
      throw new IllegalArgumentException("number cannot be null");
    }
    int length = String.valueOf(number).length();
    String romanNumber = "";
    if(length == 1) {
      switch (number) {

        case 1 :
          romanNumber = "I";
          break;
        case 5:
          romanNumber = "V";
          break;
        case 10:
          romanNumber = "X";
          break;
        case 50:
          romanNumber = "L";
          break;
        case 100:
          romanNumber = "C";
          break;
        case 500:
          romanNumber = "D";
          break;
        case 1000:
          romanNumber = "M";
          break;
      }
    }
    return romanNumber;
  }
}
