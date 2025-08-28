import java.util.ArrayList;
import java.util.List;
public class arrayLists {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("provet");
        Cars car = new Cars();
        list.add(car);
        Students stu = new Students();
        list.add(stu);
        StringBuilder sb = new StringBuilder();
        list.add(sb);

        ArrayList <String> list2 = new ArrayList<>(32);
        list2.add("Privet");
        list2.add("Poka");
        list2.add("Nice");
        list2.add("Ciao");
        list2.add("Ciao");
        list2.add(3,"Vice");
        list2.add(3,"Vice");

//        System.out.println(list2.get(2));
//        list2.set(1,"ZZZ");

//        list2.remove(4);
        list2.remove("Ciao");

        List <String> list3 = new ArrayList<>();
        for(String s: list2) {
            System.out.println(s + " ");
        }

        System.out.println(list2.indexOf("Vice"));
        System.out.println(list2.lastIndexOf("Vice"));
        System.out.println(list2.size());
//        list2.clear();
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains("Vice"));

        System.out.println(list2.toString());
    }


}

class Cars {
}
class Students {
}