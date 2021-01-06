package io.milio.service.rs;

import io.quarkus.vertx.web.Body;
import io.quarkus.vertx.web.Header;
import io.quarkus.vertx.web.Param;
import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@ApplicationScoped
public class Milio {

    Logger logger = Logger.getLogger(getClass());

    AtomicInteger atomicInteger = new AtomicInteger(0);

    @Route(path = "/:id", produces = "application/json", methods = HttpMethod.POST)
    Result hello(@Body Location location, @Param String id, @Header("authorization") String authorization) {
        logger.info("id:" + id);
        logger.info("location:" + location);
       // logger.info("authorization:" + authorization);
        logger.info("count:" + atomicInteger.addAndGet(1));
        logger.info("-------------------");
        return new Result("ok");
    }

}
