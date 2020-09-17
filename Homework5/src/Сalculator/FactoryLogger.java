package Сalculator;

public class FactoryLogger {
    public static Logger createConfigurator(LoggerType loggerType) {
        Logger log = null;

        switch (loggerType) {
            case FILE:
                return log = new FileLogger();

            case DB:
                return log = new DbLogger();

            case CONSOLE:
                return log = new ConsoleLogger();
        }

        return log;
    }
}











