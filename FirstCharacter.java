public class FirstCharacter{
    public static void main(String[] args) {
        // TODO:
        String str = "Hello world!";
        if (str.length()==0) System.out.println(str);

        String[] strArray = str.split(" "); // 공백 기준으로 split하여 Array에 담기
        String output = "";

        for (int i=0; i<strArray.length; i++){ // strArray[i][0]
            String word= strArray[i];
            output += word.charAt(0);
        }
        System.out.println("output:"+output);

    }
}

