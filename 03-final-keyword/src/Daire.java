public class Daire {
//    final deyimiyle tanımlanan değerler değiştirilemez sabittir.
    final double PI=3.14;

    public int r;
    public Daire(int r){
        this.r = r;
// hata verir -> this.PI=3.142;
    }
    public void calcArea(){
        double area=PI*r*r;
        System.out.println("dairenin alanı :  "+area);
    }

}
