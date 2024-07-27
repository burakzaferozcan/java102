public class Main {
    public static void main(String[] args) {
        Integer a=null;
        Integer b=15;
        NumberGenericNullable<Integer> n1=new NumberGenericNullable<>(a);
        NumberGenericNullable<Integer> n2=new NumberGenericNullable<>(b);
        n1.run();
        n2.run();

        Double c=null;
        Double d=15.4;
        NumberGenericNullable<Double> n3=new NumberGenericNullable<>(c);
        NumberGenericNullable<Double> n4=new NumberGenericNullable<>(d);
        n3.run();
        n4.run();


//todo   NUmber veri tipiyle sınırlandırıldıgı için hata verir
        String e=null;
        String f="asd";
//        NumberGenericNullable<String> n5=new NumberGenericNullable<>(e);
//        NumberGenericNullable<String> n6=new NumberGenericNullable<>(f);



    }
}
