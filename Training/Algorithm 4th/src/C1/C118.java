package C1;

public class C118 {

    public static void main(String[] args) {

        System.out.println(C118.mystery(3, 11));

    }

    public static int mystery(int a, int b) {

        if (a == 0) return 0;
        if (b % 2== 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
}
