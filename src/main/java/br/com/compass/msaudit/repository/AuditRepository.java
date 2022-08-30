package br.com.compass.msaudit.repository;

import br.com.compass.msaudit.domain.model.Order;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuditRepository implements PanacheMongoRepository<Order> {
}
