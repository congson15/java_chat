package logging;

import dagger.internal.ScopedProvider;
import java.net.ServerSocket;
import javax.annotation.Generated;
import javax.inject.Provider;
import logging.LoggingMain.LoggerMain;
import server.ServerExample;
import server.ServerExampleModule;
import server.ServerExampleModule_ProvideServerExampleFactory;
import socket.ServerModule;
import socket.ServerModule_ProvideServerSocketFactory;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerLoggingMain_LoggerMain implements LoggerMain {
  private Provider<ServerSocket> provideServerSocketProvider;
  private Provider<Logging> provideLoggingProvider;
  private Provider<ServerExample> provideServerExampleProvider;

  private DaggerLoggingMain_LoggerMain(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  public static LoggerMain create() {  
    return builder().build();
  }

  private void initialize(final Builder builder) {  
    this.provideServerSocketProvider = ScopedProvider.create(ServerModule_ProvideServerSocketFactory.create(builder.serverModule));
    this.provideLoggingProvider = ScopedProvider.create(LoggingModule_ProvideLoggingFactory.create(builder.loggingModule, LoggingImpl_Factory.create()));
    this.provideServerExampleProvider = ScopedProvider.create(ServerExampleModule_ProvideServerExampleFactory.create(builder.serverExampleModule, provideServerSocketProvider, provideLoggingProvider));
  }

  @Override
  public ServerExample serverExample() {  
    return provideServerExampleProvider.get();
  }

  public static final class Builder {
    private LoggingModule loggingModule;
    private ServerExampleModule serverExampleModule;
    private ServerModule serverModule;
  
    private Builder() {  
    }
  
    public LoggerMain build() {  
      if (loggingModule == null) {
        this.loggingModule = new LoggingModule();
      }
      if (serverExampleModule == null) {
        this.serverExampleModule = new ServerExampleModule();
      }
      if (serverModule == null) {
        this.serverModule = new ServerModule();
      }
      return new DaggerLoggingMain_LoggerMain(this);
    }
  
    public Builder loggingModule(LoggingModule loggingModule) {  
      if (loggingModule == null) {
        throw new NullPointerException("loggingModule");
      }
      this.loggingModule = loggingModule;
      return this;
    }
  
    public Builder serverExampleModule(ServerExampleModule serverExampleModule) {  
      if (serverExampleModule == null) {
        throw new NullPointerException("serverExampleModule");
      }
      this.serverExampleModule = serverExampleModule;
      return this;
    }
  
    public Builder serverModule(ServerModule serverModule) {  
      if (serverModule == null) {
        throw new NullPointerException("serverModule");
      }
      this.serverModule = serverModule;
      return this;
    }
  }
}

