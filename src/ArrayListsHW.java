import java.util.ArrayList;
import java.util.Collections;

public class ArrayListsHW {
    public static ArrayList<String> abc (String ... s) {
        ArrayList <String> al = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (!al.contains(s[i])) {
                al.add(s[i]);
            }
        }
        Collections.sort(al);
        return al;
    }
}

class Test {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "z";
        String s4 = "gg";
        String s5 = "AAA";
        String s6 = "z";
        ArrayList <String> alres = ArrayListsHW.abc(s1,s2,s3,s4,s5,s6);

        System.out.println(alres);
    }
}
