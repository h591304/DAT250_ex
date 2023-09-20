package no.hvl.dat250.jpa.tutorial.creditcards.driver;

import no.hvl.dat250.jpa.tutorial.creditcards.*;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CreditCardsMain {

  static final String PERSISTENCE_UNIT_NAME = "jpa-tutorial";

  public static void main(String[] args) {
    try (EntityManagerFactory factory = Persistence.createEntityManagerFactory(
        PERSISTENCE_UNIT_NAME); EntityManager em = factory.createEntityManager()) {
      em.getTransaction().begin();
      createObjects(em);
      em.getTransaction().commit();
    }

  }

  private static void createObjects(EntityManager em) {

    // creates a new Adress object
    Address address = new Address();
    address.setStreet("Inndalsveien");
    address.setNumber(28);

    // Makes a set of all adresses since each customer can have multiple addreses
    Set<Address> addresses = new HashSet<Address>();
    addresses.add(address);

    // creates a new Customer object and sets the customers address
    Customer customer = new Customer();
    customer.setName("Max Mustermann");
    customer.setAddresses(addresses);

    // creates a new Pincode object
    Pincode code = new Pincode();
    code.setCode("123");
    code.setCount(1);

    // creates a new Bank object
    Bank bank = new Bank();
    bank.setName("Pengebank");

    // creates two new CreditCards as shown in the diagram in the exercise
    CreditCard card1 = new CreditCard();
    card1.setNumber(12345);
    card1.setBalance(-5000);
    card1.setCreditLimit(-10000);
    card1.setPincode(code);
    card1.setBank(bank);

    CreditCard card2 = new CreditCard();
    card2.setNumber(123);
    card2.setBalance(1);
    card2.setCreditLimit(2000);
    card2.setPincode(code);
    card2.setBank(bank);

    // makes a set of card1 and card2 which is then set as the Customers bank cards
    Set<CreditCard> cards = new HashSet<CreditCard>();
    cards.add(card1);
    cards.add(card2);
    customer.setCreditCards(cards);

    // persists all objects
    em.persist(address);
    em.persist(code);
    em.persist(bank);
    em.persist(card1);
    em.persist(card2);
    em.persist(customer);
  }
}
