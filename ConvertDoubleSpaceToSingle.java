public class ConvertDoubleSpaceToSingle {
    public static void main(String[] args) {

        String str = "string  with  double  spaces";
        String[] strArr = str.split("  "); // 두칸공백을 기준으로 나누어 문자열을 배열에 담기
        String output = String.join(" ",strArr); // join()함수로 배열요소 사이 공백하나를 넣어 문자열로 만들기
        System.out.println(output);

    }
}
