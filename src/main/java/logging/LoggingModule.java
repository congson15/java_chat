package logging;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
class LoggingModule {
    @Provides
    @Singleton
    public Logging provideLogging(LoggingImpl logging) {
        return logging;
    }
}
