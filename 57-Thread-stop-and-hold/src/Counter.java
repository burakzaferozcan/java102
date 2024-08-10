public class Counter implements Runnable{
    private String name;
    private int id;
    private boolean isRunning = true;

    public Counter(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " sayacı başladı");
        for (int i = 0; i <= 100; i++) {
            if (this.id == 1) {
                if(i==15){
                    // Thread Durdurmak
                break;
                }
            }
                try {
                    // Thread Bekletmek
                    Thread.sleep(1000L*this.id);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println(this.getName() + " " + i);
        }
        System.out.println(this.getName() + " sayacı bitti");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
