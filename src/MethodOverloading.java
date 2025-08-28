public class MethodOverloading {
        void showInt(int i1) {
            System.out.println(i1);
        }


}

class MethodTEst {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int i = 500;
        mO.showInt(i);
    }
}