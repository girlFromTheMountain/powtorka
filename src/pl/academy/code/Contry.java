package pl.academy.code;

public enum Contry implements Continent {

    POLAND("PLN",380000, "Polish"),
    GERMANY("EUR", 26000, "German"),
    France("EUR", 36000, "French");
    private String currency;
    private  long populations;
    private  String language;

    Contry(String currency, long populations, String language) {
        this.currency = currency;
        this.populations = populations;
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getPopulations() {
        return populations;
    }

    public void setPopulations(long populations) {
        this.populations = populations;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
