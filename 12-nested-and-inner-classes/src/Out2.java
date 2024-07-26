public class Out2 {
    public static int a=5;
    public static class In{
        public static int a =10;
        public static void run(){
            int a=1;
            System.out.println("Out2 içerisindeki static In classının içerisindeki static run metodu çalıştı :"+a);
         System.out.println("Out2 içerisindeki static In classının içerisindeki static a değişkeni :"+In.a);
         System.out.println("Out2 içerisindeki static a değişkeni : "+Out2.a);
        }
    }
    public void run() {
        In.run();
    }
}
