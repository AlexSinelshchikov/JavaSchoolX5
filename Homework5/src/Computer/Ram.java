package Computer;

public class Ram {
    private String brandRam;
    private double amountOfMemoryRam;
    private double frequency;
    private String typeRam;

    public Ram (String brandRam, double amountOfMemoryRam, double frequency, String typeRam) {
        this.brandRam = brandRam;
        this.amountOfMemoryRam = amountOfMemoryRam;
        this.frequency = frequency;
        this.typeRam = typeRam;
    }

    public String getBrandRam() {
        return brandRam;
    }

    public double getAmountOfMemoryRam() {
        return amountOfMemoryRam;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getTypeRam() {
        return typeRam;
    }

    public void setBrandRam(String brandRam) {
        this.brandRam = brandRam;
    }

    public void setAmountOfMemoryRam(double amountOfMemoryRam) {
        this.amountOfMemoryRam = amountOfMemoryRam;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public void setTypeRam(String typeRam) {
        this.typeRam = typeRam;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + "Производитель - " + brandRam + ";" + " Объем - " + amountOfMemoryRam + ";" +
                " Частота - " + frequency + ";" + " Тип - " + typeRam + ".";
    }
}
