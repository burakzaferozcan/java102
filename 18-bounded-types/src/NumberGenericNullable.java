// sınırlandırılmış sınıf
public class NumberGenericNullable<T extends Number> {
    private final T value;
    public NumberGenericNullable(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public boolean isNull(){
        return this.getValue() == null;
    }
    public void run(){
        if(isNull()){
            System.out.println("Bu değişkene değer atanmamıştır (null)");
        }else{
            System.out.println("değişken null değildir");
        }
    }


}
