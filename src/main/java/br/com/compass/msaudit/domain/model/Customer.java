package br.com.compass.msaudit.domain.model;

import br.com.compass.msaudit.domain.enums.Sex;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private Sex sex;

    private LocalDate birthdate;
    private String email;
    private Boolean active;
}