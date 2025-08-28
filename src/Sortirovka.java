import java.util.Arrays;

public class Sortirovka {

//    public static int[] sortirovka(int array[]) {
//        int temp = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        return array;
//    }
//
//    public static void main(String[] args) {
//        int massiv[] = {5, 8, 43, -1, 0, 33, -556, 99, 4};
//
//        int res[] = sortirovka(massiv);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i] + " ");
//        }
//    }

    public static void showArray(String array[][]){
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");
        }
    }

    public static void varargs(int[] a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ+=a[i];
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
//        String[][] s = {{"priv","pok"},{"ciao","nice"},{"ura"},{"PG","BR","HN"}};
//        showArray(s);
//        for (int i = 0; i< s.length; i++) {
//            System.out.print("\n" + Arrays.toString(s[i]));
//        }

//        String s1 = "a";
//        String s2 = "a";
//        System.out.println(s1 == s2);

        varargs(new int[]{2,3,4,5});

    }

}

