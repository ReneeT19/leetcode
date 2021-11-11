public class RomanToInteger {
    public static void main(String[] args) {
        convertRomanToInteger ob = new convertRomanToInteger();
        System.out.println(ob.romanToInt("III"));
        System.out.println(ob.romanToInt("IV"));
    }
}

class convertRomanToInteger {
    public int romanToInt(String s) {
        int outcome = 0;
        for(int i = 0; i < s.length()-1; i++) {
            if(getRomanNumeralsValue(s.charAt(i)) == getRomanNumeralsValue(s.charAt(i+1))) {
                outcome = getRomanNumeralsValue(s.charAt(i))*s.length();
            } else if (getRomanNumeralsValue(s.charAt(i)) < getRomanNumeralsValue(s.charAt(i+1))) {
                outcome = getRomanNumeralsValue(s.charAt(i+1))-getRomanNumeralsValue(s.charAt(i));
            } else if(getRomanNumeralsValue(s.charAt(i)) > getRomanNumeralsValue(s.charAt(i+1))) {
                outcome = 0;
            }
        }
        return outcome;
    }

    public int getRomanNumeralsValue(char ch) {
        int value = 0;
        switch(ch) {
            case 'M':
                value = 1000;
                break;
            case 'D':
                value = 500;
                break;
            case 'C':
                value = 100;
                break;
            case 'L':
                value = 50;
                break;
            case 'X':
                value = 10;
                break;
            case 'V':
                value = 5;
                break;
            case 'I':
                value = 1;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

}