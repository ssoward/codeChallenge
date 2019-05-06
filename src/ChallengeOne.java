
/*
    Code challenge for generating the numeric value of Roman Numerals
    Examples:
     CXI: 111 == 111
     VII: 7 == 7
     I: 1 == 1
     LXXXIX: 89 == 89
     IV: 4 == 4
     M: 1000 == 1000
     XLVI: 46 == 46

    Roman Numeral Rule:
      IV	4 = 5 - 1
      IX	9 = 10 - 1
      XL	40 = 50 - 10
      XC	90 = 100 - 10
      CD	400 = 500 - 100
      CM	900 = 1000 - 100

    Given: Utils.romanCharToInt('char') returns int value for Roman char
     I -> 1
     V -> 5
     X -> 10
     L -> 50
     C -> 100
     D -> 500
     M -> 1000

 */

public class ChallengeOne implements CodeChallenge {

    // @TODO Implement this method
    public Integer romanStringToInt(String romanString) {
        return null;
    }


    public static void main (String args[]){
        ChallengeOne t = new ChallengeOne();
        Utils.runTestOne(t);
    }
}
