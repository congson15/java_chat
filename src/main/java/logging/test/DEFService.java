package logging.test;

import javax.inject.Inject;
import logging.Logging;


public class DEFService {
  private Logging LOGGER;
  @Inject
  public DEFService(Logging logging) {
    this.LOGGER = logging;
    System.out.println(this + " - " + LOGGER);
  }
}
