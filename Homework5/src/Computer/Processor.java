package Computer;

public class Processor {

    private double clockFrequency;
    private int numberOfCores;
    private int memoryCache;
    private String title;
    private String brandProcessor;

    public Processor(double clockFrequency, int numberOfCores, int memoryCache, String title, String brandProcessor) {
        this.clockFrequency = clockFrequency;
        this.numberOfCores = numberOfCores;
        this.memoryCache = memoryCache;
        this.title = title;
        this.brandProcessor = brandProcessor;
        }

    public double getClockFrequency() {
        return clockFrequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public int getMemoryCache() {
        return memoryCache;
    }

    public String getTitle() {
        return title;
    }

    public String getBrandProcessor() {
        return brandProcessor;
    }

    public void setClockFrequency(double clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setMemoryCache(int memoryCache) {
        this.memoryCache = memoryCache;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBrandProcessor(String brandProcessor) {
        this.brandProcessor = brandProcessor;
    }

    @Override
    public String toString() {
        return "Процессор: " + " Тактовая чистота - " + clockFrequency + ";" + " Количество ядер - " + numberOfCores +
                ";" + " Кэш памяти - " + memoryCache + ";" + " Название - " + title + ";" + " Производитель - " + brandProcessor
                + ".";
            }
}



