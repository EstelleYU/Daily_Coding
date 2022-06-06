import java.util.LinkedHashMap;

public class ConvertListToObject {
    public static void main(String[] args) {
        /* -----------------------------------------------
        Wed 01 JUN 2022
        Daily Coding from Coplit CodeStates
        07_convertListToObject
        - Convert 2D Array to HashMap. (value cannot be overwritten.)
        --------------------------------------------------
        example)

        String[][] arr1 = new String[][]{{"apple","red"}, {"kiwi","green"}, {"grape","purple"}};
        String[][] arr2 = new String[][]{{"apple","red"}, {"kiwi","green"}, {"apple","??"}};

        output1 =        {apple=red, kiwi=green, grape=purple}
        output2 =        {apple=red, kiwi=green}

        --------------------------------------------------*/

        String[][] arr = new String[][]{{"apple","red"}, {"kiwi","green"}, {"apple","??"}};

//        for(int i = 0; i < arr.length; i++) {  // 2차원 배열 출력 확인
//            for(int j = 0; j < arr[i].length; j++) {
//                String c = arr[i][j];
//                System.out.print( c + " ");
//            }
//        }

        LinkedHashMap<String, String> output = new LinkedHashMap<>();
        if (arr.length==0) System.out.println(output);  //빈 배열을 입력받은 경우, 빈 HashMap을 리턴해야 합니다

        for (int i = 0; i<arr.length; i++) {
            if (arr[i].length==0) System.out.println(output);  // [[]]을(를) 입력받은 경우, 빈 HashMap을 리턴해야 합니다
            boolean alreadyExist = output.containsKey(arr[i][0]);
            if ( ! alreadyExist )   //arr[i][0]에 해당하는 키가 Hashmap에 존재하지않는다면
                output.put(arr[i][0],arr[i][1]);
        }
        System.out.println(output);
    }
}
