package server;

import logging.Logging;

import javax.inject.Inject;
import java.net.ServerSocket;

import static java.lang.Thread.sleep;

public class ServerExample {
    private final Logging LOGGER;
    private final ServerSocket serverSocket;

    @Inject
    public ServerExample(ServerSocket serverSocket, Logging logging) {
        this.serverSocket = serverSocket;
        this.LOGGER = logging;
    }

    public void start() {
        try {
            LOGGER.log(getInfo() + " Starting socketServer on port" + serverSocket.getLocalPort());
            while(true) {

                sleep(5000L);
                LOGGER.log(getInfo() + " This will log after 5 seconds " + serverSocket.isClosed());

            }
        } catch (Exception exception) {
            LOGGER.log(getInfo() + " Failed in start server due to" + exception.getMessage());
        }
    }

    private String getInfo() {
        return "["+Thread.currentThread().getName()+"]"+"["+this.getClass().getSimpleName()+"]";
    }
}
