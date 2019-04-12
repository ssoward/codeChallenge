import java.util.HashMap;
import java.util.Map;

public class Utils {

    /**
     * Gets the integer value for a roman character
     * @param roman char
     * @return integer value of roman char
     */

    public static Integer romanCharToInt(char roman) {
        switch(roman) {
            case 'I':
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    private static Map<String, Integer> createTest(){
        Map<String, Integer> tests = new HashMap< String,Integer>();

        tests.put("I", 1);
        tests.put("IV", 4);
        tests.put("VII", 7);
        tests.put("CXI", 111);
        tests.put("XLVI", 46);
        tests.put("LXXXIX", 89);
        tests.put("M", 1000);
        return tests;
    }

    public static void runTest(CodeChallenge t) {
        Utils.createTest().forEach((key, value)-> {
            Integer x = t.romanStringToInt(key);
            if(value == x) {
                System.out.println("\u001B[30m" + key + ": " + value + " == " + x);
            }else{
                System.out.println("\u001B[31m" + "ERROR: "+key + ": " + value + " != " + x);
            }
        });
    }
}
