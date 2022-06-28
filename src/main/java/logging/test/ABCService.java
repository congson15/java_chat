package logging.test;

import javax.inject.Inject;
import logging.Logging;


public class ABCService {
  private Logging LOGGER;
  @Inject
  public ABCService(Logging logging) {
    this.LOGGER = logging;
    System.out.println(this + " - " + LOGGER);
  }
}
