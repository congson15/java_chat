package logging;

import dagger.Component;
import server.ServerExample;
import server.ServerExampleModule;
import socket.ServerModule;

import javax.inject.Singleton;

import static java.lang.Thread.sleep;

class LoggingMain {

    public static void main(String[] args) throws InterruptedException {
        DaggerLoggingMain_LoggerMain.create().serverExample().start();

    }

    @Component(modules = {
            LoggingModule.class,
            ServerExampleModule.class,
            ServerModule.class,
    })
    @Singleton
    public interface LoggerMain {
        ServerExample serverExample();
    }
}

