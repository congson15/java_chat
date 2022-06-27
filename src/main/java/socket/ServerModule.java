package socket;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.io.IOException;
import java.net.ServerSocket;

@Module
public class ServerModule {
    @Provides
    @Singleton
    public ServerSocket provideServerSocket() {
        try {
            return new ServerSocket(3000);
        } catch (IOException e) {
            return null;
        }
    }
}
