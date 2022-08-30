package br.com.compass.msaudit.domain.model;

import br.com.compass.msaudit.domain.enums.Status;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.List;

@MongoEntity(collection = "audit")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Order {

    private ObjectId id;
    private Customer customer;
    private Address address;
    private Payment payment;
    private Installment installment;
    private List<Sku> cart;
    private LocalDate date;
    private Status status;
    private Double total;
}
