public class LetterCapitalize {
    public static void main(String[] args) {
        // 빈칸 문제는 split함수로 해결 할 수 없다 char로 풀기
        String str = "hello apple    world!"; // "Hello Apple    World!"
//        String str = "aPPLE wORLD";  // "APPLE WORLD"
//        String str = "   ";            //   ""

        // String output = "   ";
        // System.out.println(output.length());

        char[] charArr = str.toCharArray();
        if (charArr[0]==' ') System.out.println("");  // 문장이 공백으로 시작하면 빈 거 리턴

        for (int i = 0 ;i < str.length();i++) {
            if (i == 0 ) {   //문장의 첫 문자는 대문자
                charArr[0] = str.toUpperCase().charAt(0);
            } else if (charArr[i-1] == ' ' && charArr[i] != ' ') {   //공백 다음 문자를 대문자
                charArr[i] = str.toUpperCase().charAt(i);
            }
        }
        str = new String(charArr);
        System.out.println(str);

    }
}