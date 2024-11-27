package com.levi.customer.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private FirstName firstName;

    private LastName lastName;

    private BirthDate birthDate;

    private EmailAddress emailAddress;

    public Customer(FirstName firstName, LastName lastName, BirthDate birthDate, EmailAddress emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
    }

    public static Customer create(
            FirstName firstName, LastName lastName, BirthDate birthDate, EmailAddress emailAddress) {
        return new Customer(firstName, lastName, birthDate, emailAddress);
    }

    public void changeEmail(final EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }
}