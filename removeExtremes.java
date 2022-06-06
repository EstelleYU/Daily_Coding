import java.util.ArrayList;
import java.util.Arrays;

public class removeExtremes {
    public static void main(String[] args) {

/* -----------------------------------------------
        Tue 07 JUN 2022
        Daily Coding from Coplit CodeStates
        11_removeExtremes
        - Remove the shortest string and the longest string and return output as array.

        The length of the shortest string is never equal to the length of the longest string.
        In case there are several strings which are shortest or longest, remove the string that is placed on last.
        In case input is void, return null.
        The maximum length of a string in an array is 20.

--------------------------------------------------
        example)

        String[] arr1 = {"where", "is", "the", "longest", "word"};
        String[] arr2 = {"a", "b", "c", "def"};

        output1 =>  ["where", "the", "word"]
        output2 =>  ["a", "b"]

--------------------------------------------------*/

        String[] arr = new String[]{"where", "is", "the", "longest", "word"}; // ["where", "the", "word"]
        // String[] arr =  new String[]{"a", "b", "c", "def"};  // ["a"', "b"]
        //if (arr.length == 0) System.out.println(null);

        int shortestLength = 20 ;
        int longestLength = 0 ;

        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= shortestLength){
                shortestLength = arr[i].length();
                shortestIndex = i;
            }
            if (arr[i].length() >= longestLength){
                longestLength = arr[i].length();
                longestIndex = i;
            }
        }
        ArrayList<String> resultList = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            if( j != shortestIndex && j != longestIndex ){
                resultList.add(arr[j]);
            }
        }
        String[] output = resultList.toArray(new String[resultList.size()]);
        System.out.println(Arrays.toString(output));
    }
}
