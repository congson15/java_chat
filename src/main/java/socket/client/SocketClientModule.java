package socket.client;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

@Module
public class SocketClientModule {

    @Provides
    @Singleton
    @ForSocketClient
    public Socket provideSocketClient() {
        try {
            return new Socket("localhost", 3000);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
