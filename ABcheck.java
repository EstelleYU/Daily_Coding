public class ABcheck {
    public static void main(String[] args) {

        String str = "lane Borrowed";
//        String str = "vsZYkn LOfgbAabbHYw4tO1O";
        str = str.toLowerCase();
        int count = 0;
        String[] strArr = str.split("");
        for (int i=0; i<str.length()-4; i++){
            if ( strArr[i].equals("a") && strArr[i+4].equals("b") ) count++;
            else if ( strArr[i].equals("b") && strArr[i+4].equals("a") ) count++;
        }

        if ( count >= 1 ) System.out.println(true);
        else System.out.println(false);
    }
}


/* --------------------------------------

    str = str.toLowerCase();
    int count=0;
    String[] strArr = str.split("");
    for (int i=0; i<str.length()-4; i++){
      if ( strArr[i].equals("a") && strArr[i+4].equals("b") ) count++;
      else if ( strArr[i].equals("b") && strArr[i+4].equals("a") ) count++;
    }
    if (count>=1) return true;
    else return false;

 ---------------------------------------- */

/*



 */
