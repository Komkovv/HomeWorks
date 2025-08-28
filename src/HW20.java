public class HW20 {

//    public static String[][] abc(String[] ... s) {
//        String[][] arrays = new String[s.length][];
//        for (int i=0; i<s.length; i++) {
//            arrays[i] = new String[s[i].length];
//            for (int j=0; j < s[i].length; j++){
//                arrays[i][j] = s[i][j];
//            }
//        }
//        return arrays;
//    }
//
//    public static void main(String[] args) {
//        String[] s1 = {"a","b","c"};
//        String[] s2 = {"d"};
//        String[] s3 = {"e","f","g","h"};
//        String[] s4 = {"."};
//        String[][] ss = abc(s1,s2,s3,s4);
//
//        for (int i = 0; i < ss.length; i++) {
//            for (int j = 0; j < ss[i].length; j++) {
//                System.out.print(ss[i][j] + " ");
//            }
//    }
//
//
//    }

//    public static int findMax(int[] array) {
//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max) {
//                max = array[i];
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] t = {5, 12, -3, 7, 19, 0};
//        System.out.println(findMax(t));
//    }
//}


    public static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] > secondMax) && (secondMax < max) && (secondMax != max)) {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] t = {5, 12, -3, 7, 19, 0};
        System.out.println(findSecondMax(t)); // Ожидаем: 12
    }
}