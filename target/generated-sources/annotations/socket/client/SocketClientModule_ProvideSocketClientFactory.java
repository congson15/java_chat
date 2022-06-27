package socket.client;

import dagger.internal.Factory;
import java.net.Socket;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class SocketClientModule_ProvideSocketClientFactory implements Factory<Socket> {
  private final SocketClientModule module;

  public SocketClientModule_ProvideSocketClientFactory(SocketClientModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Socket get() {  
    Socket provided = module.provideSocketClient();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Socket> create(SocketClientModule module) {  
    return new SocketClientModule_ProvideSocketClientFactory(module);
  }
}

