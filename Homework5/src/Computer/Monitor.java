package Computer;

public class Monitor {
    private String brandMonitor;
    private double screenSizeMonitor;
    private String matrixMonitor;

    public Monitor (String brandMonitor, double screenSizeMonitor, String matrixMonitor ) {
        this.brandMonitor = brandMonitor;
        this.screenSizeMonitor = screenSizeMonitor;
        this.matrixMonitor = matrixMonitor;
    }

    public String getBrandMonitor() {
        return brandMonitor;
    }

    public void setBrandMonitor(String brandMonitor) {
        this.brandMonitor = brandMonitor;
    }

    public double getScreenSizeMonitor() {
        return screenSizeMonitor;
    }

    public void setScreenSizeMonitor(double screenSizeMonitor) {
        this.screenSizeMonitor = screenSizeMonitor;
    }

    public String getMatrixMonitor() {
        return matrixMonitor;
    }

    public void setMatrixMonitor(String matrixMonitor) {
        this.matrixMonitor = matrixMonitor;
    }

    @Override
    public String toString() {
        return "Монитор: " + " Произвоитель - " + brandMonitor + ";" + " Диагональ экрана - " +  screenSizeMonitor + ";"
                + " Матрица - " + matrixMonitor + ".";
    }
}
