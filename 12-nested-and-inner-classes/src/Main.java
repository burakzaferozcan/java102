public class Main {
    public static void main(String[] args) {
//todo        Non-Static Inner Class
        Out outNesnesi = new Out();
        outNesnesi.run();
//        inner class'tan bir nesne üretmek için :
        Out.In inNesnesi = outNesnesi.new In();
        System.out.println("***************************** üretilen in nesnesinden run metodu *****************************");
        inNesnesi.run();
        System.out.println("**********************************************************");


//todo Static Inner Class
        Out2.In.run();
        System.out.println("**********************************************************");


//        todo Local Class
        Local l = new Local();
        l.run();
        System.out.println("**********************************************************");


        //    todo Anonymus Class
        Anonim anonim = new Anonim(){
            @Override
            public void run(){
                System.out.println("anonim olarak yazılmış run metodu");
                this.print();
                print();
            }
            public void print(){
                System.out.println("print metodu nesne üzerinden direkt ulaşılamaz sadece override edilmiş olanlara ulaşılabilir");
            }
        };
        anonim.run();
//        anonim.print();

    }





}
