
import java.util.ArrayList;
import java.util.List;

public class ChallengeThree {

    public String VowelSquare(String[] strArr) {
        List<List<Integer>> list = new ArrayList<>();
        for(String s: strArr){

            List<Integer> innerList = new ArrayList<>();
            char[] cc = s.toCharArray();

            for(int cInx = 0; cInx<  cc.length; cInx++){
                char curr = cc[cInx];
                //is current a vowel
                if("aeiou".indexOf(curr)>-1
                        && cc.length>cInx+1 &&
                        "aeiou".indexOf(cc[cInx+1])>-1){
                    innerList.add(cInx);
                }
            }
            list.add(innerList);
        }
        //check each row
        for(int i = 0; i< list.size(); i++){
            List<Integer> ll = list.get(i);
            for(int o = 0; o< ll.size(); o++){
            Integer ii = ll.get(o);
                if(list.size()>i+1 && list.get(i+1).contains(ii)){
                    return i+"-"+ii;
                }
            }

        }
        return "Not Found";

    }

    public static void main (String[] args) {
        String[] s1 = new String[] {"aqrst", "ukaei", "ffooo"}; //Output:"1-2"
        String[] s2 = new String[] {"gg", "ff", "hi"}; //Output:"0-0-1"
        String[] s3 = new String[] {"ggeafffff", "ffiubbbb", "hioopppppp"}; //Output:"0-0-1"
        ChallengeThree challengeThree = new ChallengeThree();
        System.out.println(challengeThree.VowelSquare(s1));
    }

}
