import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;


    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }


    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("-----------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() + " Karakter : " + gameChar.getName() + " | Hasar : " + gameChar.getDamage() + " | Sağlık : " + gameChar.getHealth() + " | Para : " + gameChar.getMoney());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Lütfen bir karakter seçiniz : ");
        int selectChar = input.nextInt();

        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakteriniz : " + this.getCharName() +
                " | Hasar : " + this.getDamage() +
                " | Sağlık : " + this.getHealth() +
                " | Para : " + this.getMoney());
    }


    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOriginalHealth(gameChar.getHealth());

    }

    public void printInfo() {
        System.out.println("Silahınız : " + this.getInventory().getWeapon().getName() +
                " | Zırhınız : " + this.getInventory().getArmor().getName() +
                " | Bloklamanız : " + this.getInventory().getArmor().getBlock() +
                " | Hasarınız : " + this.getTotalDamage() +
                " | Sağlığınız : " + this.getHealth() +
                " | Paranız : " + this.getMoney());
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();

    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}
