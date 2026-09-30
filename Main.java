
class Main {
    public static void main(String[] args) {
        int input = _takeInput(args);

        // oddNum();
        // divBy7();
        // perfSqr();
        // perfCube();
        // palindrom(input);
        faboSeries(input);
    }

    private static void faboSeries(int num) {
        int  a = 0;
        int b = 1;
        
        // int res = 0;
        // if (num == 0) {
        //     res = 0;
        // }
        // if (num == 1) {
        //     res = 1;
        // }


        for (int i = 0; i < num; i++) {   
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }


    }

    private static void oddNum(int n) {
        while (n <= 100) {
            if (n % 2 == 1) {
                System.out.println(n);
            }
            n++;
        }
    }

    private static void divBy7() {
        int n = 1;
        while (n <= 100) {
            if (n % 7 == 0) {
                System.out.println(n);
            }
            n++;
        }
    }

    private static void perfSqr() {
        int n = 1;
        while ((n * n) <= 100) {
            System.out.println(n * n);
            n++;
        }
    }

    private static void perfCube() {
        int n = 1;
        while ((n * n * n) <= 100) {
            System.out.println(n * n * n);
            n++;
        }
    }

    private static void palindrom(int num) {
        int r = 0;
        int temp = num;
        while (num > 0) {
            int c = num % 10;
            r = r * 10 + c;
            num = num / 10;

        }

        if (r == temp) {
            System.out.println("This one is palandrom: " + temp);

        } else {

            System.out.println("This one is not palandrom: " + temp);
        }
    }

    private static int _takeInput(String[] args) {

        if (args.length < 1) {
            System.out.println("No input given, Default to 100");
            return 100;
        }

        return Integer.parseInt(args[0]);
    }

}