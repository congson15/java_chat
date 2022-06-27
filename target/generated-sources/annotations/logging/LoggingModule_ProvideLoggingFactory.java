package logging;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class LoggingModule_ProvideLoggingFactory implements Factory<Logging> {
  private final LoggingModule module;
  private final Provider<LoggingImpl> loggingProvider;

  public LoggingModule_ProvideLoggingFactory(LoggingModule module, Provider<LoggingImpl> loggingProvider) {  
    assert module != null;
    this.module = module;
    assert loggingProvider != null;
    this.loggingProvider = loggingProvider;
  }

  @Override
  public Logging get() {  
    Logging provided = module.provideLogging(loggingProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Logging> create(LoggingModule module, Provider<LoggingImpl> loggingProvider) {  
    return new LoggingModule_ProvideLoggingFactory(module, loggingProvider);
  }
}

