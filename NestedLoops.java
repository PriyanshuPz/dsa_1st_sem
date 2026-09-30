
public class NestedLoops {

    // public static void main(String[] args) {
    // // p1();
    // // p2();
    // // p3();
    // // p4();
    // p5();
    // }

    private static void p1() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void p2() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static void p3() {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    private static void p4() {
        int i = 1;
        while (i <= 30) {
            System.out.print(i + " ");
            while (i % 5 == 0) {
                System.out.println();
                if (i + 1 <= 30) {
                    System.out.print(i + 1 + " ");
                }
                i++;
            }

            i++;
        }

    }

    // private static void p5() {
    // for (int i = 1; i <= 6; i++) {
    // for (int j = 1; j <= 6; j++) {
    // if (i > j) {
    // System.out.print(j + " ");
    // // System.out.print("* ");

    // }
    // }
    // System.out.println();
    // }

    // }

    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.format("%02d ", c);
                c++;
            }
            System.out.println();
        }
    }

}