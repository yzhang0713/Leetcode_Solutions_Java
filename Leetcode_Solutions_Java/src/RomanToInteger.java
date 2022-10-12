/**
 * Problem 13. Roman to Integer
 */
public class RomanToInteger {

    public RomanToInteger(){

    }

    public int romanToInt(String s) {
        int decimalNumber = 0;
        int nCharacter = s.length();
        for (int i = 0; i < nCharacter; i++) {
            if (s.charAt(i) == 'M') {
                decimalNumber += 1000;
            } else if (s.charAt(i) == 'D') {
                decimalNumber += 500;
            } else if (s.charAt(i) == 'C') {
                if (i+1 < nCharacter && s.charAt(i+1) == 'M') {
                    decimalNumber += 900;
                    i++;
                } else if (i+1 < nCharacter && s.charAt(i+1) == 'D') {
                    decimalNumber += 400;
                    i++;
                } else {
                    decimalNumber += 100;
                }
            } else if (s.charAt(i) == 'L') {
                decimalNumber += 50;
            } else if (s.charAt(i) == 'X') {
                if (i+1 < nCharacter && s.charAt(i+1) == 'C') {
                    decimalNumber += 90;
                    i++;
                } else if (i+1 < nCharacter && s.charAt(i+1) == 'L') {
                    decimalNumber += 40;
                    i++;
                } else {
                    decimalNumber += 10;
                }
            } else if (s.charAt(i) == 'V') {
                decimalNumber += 5;
            } else if (s.charAt(i) == 'I') {
                if (i+1 < nCharacter && s.charAt(i+1) == 'X') {
                    decimalNumber += 9;
                    i++;
                } else if (i+1 < nCharacter && s.charAt(i+1) == 'V') {
                    decimalNumber += 4;
                    i++;
                } else {
                    decimalNumber += 1;
                }
            }
        }
        return decimalNumber;
    }

    public int romanToIntWithSwitch(String s) {
        int decimalNumber = 0;
        int nCharacter = s.length();
        for (int i = 0; i < nCharacter; i++) {
            switch (s.charAt(i)) {
                case 'M':
                    decimalNumber += 1000;
                    break;
                case 'D':
                    decimalNumber += 500;
                    break;
                case 'C':
                    if (i+1 < nCharacter && s.charAt(i+1) == 'M') {
                        decimalNumber += 900;
                        i++;
                    } else if (i+1 < nCharacter && s.charAt(i+1) == 'D') {
                        decimalNumber += 400;
                        i++;
                    } else {
                        decimalNumber += 100;
                    }
                    break;
                case 'L':
                    decimalNumber += 50;
                    break;
                case 'X':
                    if (i+1 < nCharacter && s.charAt(i+1) == 'C') {
                        decimalNumber += 90;
                        i++;
                    } else if (i+1 < nCharacter && s.charAt(i+1) == 'L') {
                        decimalNumber += 40;
                        i++;
                    } else {
                        decimalNumber += 10;
                    }
                    break;
                case 'V':
                    decimalNumber += 5;
                    break;
                case 'I':
                    if (i+1 < nCharacter && s.charAt(i+1) == 'X') {
                        decimalNumber += 9;
                        i++;
                    } else if (i+1 < nCharacter && s.charAt(i+1) == 'V') {
                        decimalNumber += 4;
                        i++;
                    } else {
                        decimalNumber += 1;
                    }
                    break;
                default:
                    break;
            }
        }
        return decimalNumber;
    }
}
