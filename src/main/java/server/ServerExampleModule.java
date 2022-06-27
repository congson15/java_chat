package server;

import dagger.Module;
import dagger.Provides;
import logging.Logging;

import javax.inject.Singleton;
import java.net.ServerSocket;

@Module
public class ServerExampleModule {
    @Provides
    @Singleton
    public ServerExample provideServerExample(ServerSocket serverSocket, Logging logging) {
        return new ServerExample(serverSocket, logging);
    }
}
