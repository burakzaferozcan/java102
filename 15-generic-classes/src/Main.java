public class Main {
    public static void main(String[] args) {
//        undefined
        String s;
//        null
        String s1=null;
//        empty
        String s2="";


        String str=null;
        StringNullable n= new StringNullable(str);
        n.run();

        Integer nmr=5;
        IntegerNullable n2= new IntegerNullable(null);
        n2.run();


        Integer a=5;
        GenericNullable<Integer> n3= new GenericNullable<>(a);
        n3.run();

        String b="";
        GenericNullable<String> n4=new GenericNullable<>(b);
        n4.run();


        String c="asd";
        Integer d=5;
        Boolean e=true;
        TestGeneric<String,Integer,Boolean> deneme=new TestGeneric<>(c,d,e);
        deneme.showInfo();

    }

}
