package Computer;

public class GraphicsCard {

    private String brandGraphicsCard;
    private String typeGraphicsCard;
    private double amountOfMemoryGraphicsCard;
    private String coolingGraphicsCard;

    public GraphicsCard (String brandGraphicsCard, String typeGraphicsCard, double amountOfMemoryGraphicsCard, String coolingGraphicsCard) {
        this.brandGraphicsCard = brandGraphicsCard;
        this.typeGraphicsCard = typeGraphicsCard;
        this.amountOfMemoryGraphicsCard = amountOfMemoryGraphicsCard;
        this.coolingGraphicsCard = coolingGraphicsCard;
    }

    public String getBrandGraphicsCard() {
        return brandGraphicsCard;
    }

    public String getTypeGraphicsCard() {
        return typeGraphicsCard;
    }

    public double getAmountOfMemoryGraphicsCard() {
        return amountOfMemoryGraphicsCard;
    }

    public String getCoolingGraphicsCard() {
        return coolingGraphicsCard;
    }

    public void setBrandGraphicsCard(String brandGraphicsCard) {
        this.brandGraphicsCard = brandGraphicsCard;
    }

    public void setTypeGraphicsCard(String typeGraphicsCard) {
        this.typeGraphicsCard = typeGraphicsCard;
    }

    public void setAmountOfMemoryGraphicsCard(double amountOfMemoryGraphicsCard) {
        this.amountOfMemoryGraphicsCard = amountOfMemoryGraphicsCard;
    }

    public void setCoolingGraphicsCard(String coolingGraphicsCard) {
        this.coolingGraphicsCard = coolingGraphicsCard;
    }

    @Override
    public String toString() {
        return " Видеокарта:" + " Производитель - " + brandGraphicsCard + ";" + " Тип памяти - " + typeGraphicsCard + ";"
                + " Объем памяти - " + amountOfMemoryGraphicsCard + ";" + " Охлаждение - " + coolingGraphicsCard + ".";
    }
}
