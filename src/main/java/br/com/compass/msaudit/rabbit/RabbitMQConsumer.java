package br.com.compass.msaudit.rabbit;

import br.com.compass.msaudit.domain.model.Order;
import br.com.compass.msaudit.repository.AuditRepository;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class RabbitMQConsumer {

    private AuditRepository auditRepository;

    @Inject
    public RabbitMQConsumer(AuditRepository auditRepository){
        this.auditRepository = auditRepository;
    }

    @Incoming("order-audit")
    public void processMessage(JsonObject msg){
        Order order = msg.mapTo(Order.class);
        auditRepository.persistOrUpdate(order);
    }
}
