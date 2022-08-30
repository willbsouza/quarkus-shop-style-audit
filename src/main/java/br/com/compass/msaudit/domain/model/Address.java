package br.com.compass.msaudit.domain.model;

import br.com.compass.msaudit.domain.enums.State;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {

    private Long id;
    private State state;
    private String city;
    private String district;
    private String street;
    private String number;
    private String complement;
    private String cep;
}
