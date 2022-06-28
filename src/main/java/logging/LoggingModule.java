package logging;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public abstract class LoggingModule {
    @Binds
    @Singleton
    abstract Logging provideLogging(LoggingImpl logging);
}
