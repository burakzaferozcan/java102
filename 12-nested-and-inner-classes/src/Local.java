public class Local {
    public void run (){
        class Yerel{
            private int a;
            Yerel (int a){
                this.a = a;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }
        }
        Yerel y =new Yerel(15);
        System.out.println(y.getA());
        System.out.println("Local sınıfı çalıştı");
    }
    public void print(){
// todo hata verir sadece tanımlandıgı fonksiyonda erişilerbilir
        //        Yerel y=new Yerel(15);


    }
}
