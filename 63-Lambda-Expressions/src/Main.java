public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        });
        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable sınıfı");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("runnable sınıfı 2 (lambda)");
        r2.run();


        Matematik toplama1 = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a + b;
            }
        };
        Matematik cikarma1 = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a - b;
            }
        };
        Matematik carpma1 = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                return a * b;
            }
        };

        Matematik bolme1 = new Matematik() {
            @Override
            public int transaction(int a, int b) {
                if (b == 0) {
                    b = 1;
                }
                return a / b;
            }
        };
        System.out.println("Toplama : " + toplama1.transaction(10, 2));
        System.out.println("Çıkarma : " + cikarma1.transaction(10, 2));
        System.out.println("Çarpma : " + carpma1.transaction(10, 2));
        System.out.println("Bölme : " + bolme1.transaction(10, 2));

        System.out.println("--------------------------");
        Matematik toplama2 = (int a, int b) -> a + b;
        Matematik cikarma2 = (int a, int b) -> a - b;
        Matematik carpma2 = (int a, int b) -> a * b;
        Matematik bolme2 = (a, b) -> {
            if (b == 0) {
                b = 1;
            }
            return a / b;
        };

        System.out.println("Lambda Toplama : " + toplama2.transaction(10, 2));
        System.out.println("Lambda Çıkarma : " + cikarma2.transaction(10, 2));
        System.out.println("Lambda Çarpma : " + carpma2.transaction(10, 2));
        System.out.println("Lambda Bölme : " + bolme2.transaction(10, 2));


    }
}
