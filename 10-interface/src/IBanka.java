public interface IBanka {
    final String hostIpAddress = "127.0.0.1";

    //  abstract methodlarda oldugu gibi interfacelerde'de methodların içi boş bırakılır
    public boolean connect(String ipAddress);

    public boolean payment(double price, String cardNumber, String expiryDate, String cvc);
}
