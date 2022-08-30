package br.com.compass.msaudit.resources.dto;

import br.com.compass.msaudit.domain.enums.Status;
import br.com.compass.msaudit.domain.model.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDate;
import java.util.List;

@Getter
@NoArgsConstructor
public class OrderDto {

    private ObjectId id;
    private Customer customer;
    private List<Sku> cart;
    private Payment payment;
    private Installment installment;
    private LocalDate date;
    private Double total;
    private Address address;
    private Status status;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.customer = order.getCustomer();
        this.payment = order.getPayment();
        this.cart = order.getCart();
        this.date = order.getDate();
        this.total = order.getTotal();
        this.status = order.getStatus();
        this.address = order.getAddress();
        this.installment = order.getInstallment();
    }
}
