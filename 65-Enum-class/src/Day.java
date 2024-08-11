public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);

    private int day;

    private Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void getDayName() {
        String dayName = null;
        switch (this) {
            case PAZARTESI:
                dayName = "Pazartesi";
                break;
            case SALI:
                dayName = "Salı";
                break;
            case CARSAMBA:
                dayName = "Çarşamba";
                break;
            case PERSEMBE:
                dayName = "Perşembe";
                break;
            case CUMA:
                dayName = "Cuma";
                break;
            case CUMARTESI:
                dayName = "Cumartesi";
                break;
            case PAZAR:
                dayName = "Pazar";
                break;

        }
        System.out.println(dayName);
    }
}
