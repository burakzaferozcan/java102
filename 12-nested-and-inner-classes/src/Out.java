
// Outer Class
public class Out {
    public int a = 5;
    //    Inner Class
    public class In {
        public int a = 10;
        public void run() {
            int a=1;
            System.out.println("In class'ındaki run metodundaki a değişkeni : " +a);
            System.out.println("In class'ındaki a değişkeni : "+this.a);
            System.out.println("Out sınıfının yani dıştaki class'taki a değişkeni  "+Out.this.a);
        }
    }
    public void run() {
        In in = new In();
        in.run();
    }
}
