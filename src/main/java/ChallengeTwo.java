/*
 _____ _ _                                _
|  ___(_) |__   ___  _ __   __ _  ___ ___(_)
| |_  | | '_ \ / _ \| '_ \ / _` |/ __/ __| |
|  _| | | |_) | (_) | | | | (_| | (_| (__| |
|_|   |_|_.__/ \___/|_| |_|\__,_|\___\___|_|


  In fibonacci series:
  next number is the sum of previous two numbers for example:
  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765,
  10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, ...
  The first two numbers of fibonacci series are 0 and 1.
*/

import java.util.List;

public class ChallengeTwo {

    // @TODO Implement this method
    private static List<Integer> runFibonacci(int limit) {
        return null;

//        return Arrays.asList(
//                new Integer(0),
//                new Integer(1),
//                new Integer(1),
//                new Integer(2),
//                new Integer(3),
//                new Integer(5),
//                new Integer(8),
//                new Integer(13),
//                new Integer(21)
//        );

    }

    public static void main(String args[]) {
        Utils.runTestTwo(runFibonacci(10));
    }

}
