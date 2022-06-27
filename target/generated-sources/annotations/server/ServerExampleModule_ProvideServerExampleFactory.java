package server;

import dagger.internal.Factory;
import java.net.ServerSocket;
import javax.annotation.Generated;
import javax.inject.Provider;
import logging.Logging;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ServerExampleModule_ProvideServerExampleFactory implements Factory<ServerExample> {
  private final ServerExampleModule module;
  private final Provider<ServerSocket> serverSocketProvider;
  private final Provider<Logging> loggingProvider;

  public ServerExampleModule_ProvideServerExampleFactory(ServerExampleModule module, Provider<ServerSocket> serverSocketProvider, Provider<Logging> loggingProvider) {  
    assert module != null;
    this.module = module;
    assert serverSocketProvider != null;
    this.serverSocketProvider = serverSocketProvider;
    assert loggingProvider != null;
    this.loggingProvider = loggingProvider;
  }

  @Override
  public ServerExample get() {  
    ServerExample provided = module.provideServerExample(serverSocketProvider.get(), loggingProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ServerExample> create(ServerExampleModule module, Provider<ServerSocket> serverSocketProvider, Provider<Logging> loggingProvider) {  
    return new ServerExampleModule_ProvideServerExampleFactory(module, serverSocketProvider, loggingProvider);
  }
}

