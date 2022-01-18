public class RomanToInteger {
    public static void main(String[] args) {
        convertRomanToInteger ob = new convertRomanToInteger();
        System.out.println(ob.romanToInt("III"));
        System.out.println(ob.romanToInt("IV"));
        System.out.println(ob.romanToInt("MCMXCIV"));
        for(int i=10; i>=0; --i){
            System.out.print(i);
        }
        for(int i=10; i>=0; i--){
            System.out.print(i);
        }
    }

    //Java allows a class to be defined within another class. These are called Nested Classes using static keyword
    static class convertRomanToInteger {
        public int romanToInt(String roman) {
            int[] map = new int[256];
            int result = 0;
            int previous = 1;
            int current = 0;
            map['I'] = 1;
            map['V'] = 5;
            map['X'] = 10;
            map['L'] = 50;
            map['C'] = 100;
            map['D'] = 500;
            map['M'] = 1000;

            for (int i = roman.length() - 1; i >= 0; i--) {
                current = map[roman.charAt(i)];
                //it matters to check < condition first
                if (current < previous) {
                    result -= current; //result -= current
                } else {
                    previous = current;
                    result += current;
                }
            }
            return result;
        }
    }
}