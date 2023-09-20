package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Setter;

import java.util.Collection;
import java.util.Set;

@Setter
@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "bank")
    private Set<CreditCard> creditCards;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<CreditCard> getOwnedCards() {
        return creditCards;
    }
}
