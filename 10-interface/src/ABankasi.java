// bir sınıfa interface atamak için implemets kullanılır  birden fazla interface implement edilebilir
public class ABankasi implements IBanka, BirdenFazlaInterfaceImplementEdilebilir {
    private String bankaAdi;
    private String terminalId;
    private String password;

    public ABankasi(String bankaAdi, String terminalId, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalId = terminalId;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("kullanıcı ip : " + ipAddress);
        System.out.println("makina ip : " + this.hostIpAddress);
        System.out.println(this.bankaAdi + " Bağlanıldı.");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        System.out.println("bankadan cevap bekleniyor...");
        System.out.println("İşlem başarılı oldu.");
        return true;
    }

    public String getBankaAdi() {
        return bankaAdi;
    }

    public void setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
