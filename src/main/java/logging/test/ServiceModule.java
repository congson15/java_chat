package logging.test;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import logging.Logging;
import logging.LoggingModule;

@Module(includes = LoggingModule.class)
public class ServiceModule {

  @Provides
  @Singleton
  ABCService provideABCService(Logging logging) {
    return new ABCService(logging);
  }

  @Provides
  @Singleton
  DEFService provideDEFService(Logging logging) {
    return new DEFService(logging);
  }
}
