package logging.test;

import dagger.Component;
import javax.inject.Singleton;

class LoggingMain {

    public static void main(String[] args){
        Logger logger = DaggerLoggingMain_Logger.create();
        logger.ABCService();
        logger.ABCService();
        logger.DEFService();
        logger.DEFService();
    }

    @Component(modules = {
            ServiceModule.class,
    })
    @Singleton
    public interface Logger {
        ABCService ABCService();
        DEFService DEFService();
    }
}

