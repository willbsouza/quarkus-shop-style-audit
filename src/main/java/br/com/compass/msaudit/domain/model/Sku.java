package br.com.compass.msaudit.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Sku {

    private Long id;
    private Double price;
    private Integer quantity;
    private String color;
    private String size;
    private Integer height;
    private Integer width;
}