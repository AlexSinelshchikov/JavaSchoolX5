package Computer;

public class MemoryStorage {
    private String brandMemoryStorage;
    private double amountOfMemoryStorage;
    private String typeMemoryStorage;
    private String formFactor;

    public MemoryStorage (String brandMemoryStorage, double amountOfMemoryStorage, String typeMemoryStorage, String formFactor) {
        this.brandMemoryStorage = brandMemoryStorage;
        this.amountOfMemoryStorage = amountOfMemoryStorage;
        this.typeMemoryStorage = typeMemoryStorage;
        this.formFactor = formFactor;
    }

    public String getBrandMemoryStorage() {
        return brandMemoryStorage;
    }

    public double getAmountOfMemoryStorage() {
        return amountOfMemoryStorage;
    }

    public String getTypeMemoryStorage() {
        return typeMemoryStorage;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setBrandMemoryStorage(String brandMemoryStorage) {
        this.brandMemoryStorage = brandMemoryStorage;
    }

    public void setAmountOfMemoryStorage(double amountOfMemoryStorage) {
        this.amountOfMemoryStorage = amountOfMemoryStorage;
    }

    public void setTypeMemoryStorage(String typeMemoryStorage) {
        this.typeMemoryStorage = typeMemoryStorage;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Запоминающее Устройство: " + " Производитель - " + brandMemoryStorage + ";" + " Объем памяти  - " + amountOfMemoryStorage
                + ";" + " Тип накопителя - " + typeMemoryStorage + " Форм-фактор " + formFactor + ".";
    }
}
