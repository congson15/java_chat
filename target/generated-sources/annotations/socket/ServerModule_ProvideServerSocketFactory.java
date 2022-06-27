package socket;

import dagger.internal.Factory;
import java.net.ServerSocket;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerModule_ProvideServerSocketFactory implements Factory<ServerSocket> {
  private final ServerModule module;

  public ServerModule_ProvideServerSocketFactory(ServerModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public ServerSocket get() {  
    ServerSocket provided = module.provideServerSocket();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ServerSocket> create(ServerModule module) {  
    return new ServerModule_ProvideServerSocketFactory(module);
  }
}

