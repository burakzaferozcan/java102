public class SafeHouse extends NormalLoc {
    public SafeHouse(Player p) {
        super(p, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Güvenli evdesiniz!");
        System.out.println("Canınız yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
