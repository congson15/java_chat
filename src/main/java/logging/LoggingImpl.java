package logging;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import java.time.Clock;

import com.mashape.unirest.http.exceptions.UnirestException;
import org.vertx.java.core.json.JsonObject;

import javax.inject.Inject;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LoggingImpl implements Logging{
    private final String HOST = "https://log-api.newrelic.com/log/v1?Api-Key=7d1ce83a9ec9fcaa00ec58872d8c366cFFFFNRAL";
    private final ExecutorService executors = Executors.newWorkStealingPool(2);

    @Inject
    public LoggingImpl(){
        System.out.println("Ready to log...");
    }

    @Override
    public void log(final String message) {
        executors.execute(() -> {
            JsonObject loggingRequest = new JsonObject();
            loggingRequest.putString("message", message);
            System.out.println(loggingRequest);
            try {
                Unirest.post(HOST).body(loggingRequest.toString()).asJson();
            } catch (UnirestException e) {
                e.printStackTrace();
            }
        });
    }
}
