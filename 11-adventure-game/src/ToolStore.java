public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    public boolean onLocation() {
        System.out.println("**************Mağazaya Hoşgeldiniz**************");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1- Silahlar");
            System.out.println("2- Zırhlar");
            System.out.println("3- Çıkış yap");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Geçersiz değer, tekrar giriniz : ");
                selectCase = Location.input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                default:
                    System.out.println("Yine bekleriz !");
                    showMenu = false;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---------- Silahlar ----------");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "- " + w.getName() + ", Para : " + w.getPrice() + ", Hasar : " + w.getDamage() + " ");
        }
        System.out.println("0- Çıkış yap");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz : ");
        int selectWeaponID = Location.input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectWeaponID = Location.input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                } else {
                    System.out.println(selectedWeapon.getName() + " silahını satın aldınız");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                }

            }
        }

    }

    public void printArmor() {
        System.out.println("---------- Zırhlar ----------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + "- Zırh : " + a.getName() + ", Para : " + a.getPrice() + ", Blok : " + a.getBlock() + " ");
        }
        System.out.println("0- Çıkış yap");

    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz : ");
        int selectArmorID = Location.input.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Geçersiz değer, tekrar giriniz : ");
            selectArmorID = Location.input.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır !");
                } else {
                    System.out.println(selectedArmor.getName() + " zırhını satın aldınız");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paranız : " + this.getPlayer().getMoney());
                    System.out.println("Önceki Silahınız : " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Yeni Zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                }
            }
        }

    }
}
