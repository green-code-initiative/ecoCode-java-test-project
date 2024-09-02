package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALL_IN_ONE")
public class ForceLazyFetchTypeDefAllInOne extends LazyItem {
    /**
     * AllInOne class for the default value of FetchType
     * contains false test, compliant code and non-compliant code
     * Reminder :
     * OneToMany: Lazy
     * ManyToOne: Eager
     * ManyToMany: Lazy
     * OneToOne: Eager
     */
    @OneToMany(mappedBy = "item")
    private Set<Order> ordersOneToMany = new HashSet<>(); // Compliant

    @Column(name = "STUDENT_NAME", length = 50, nullable = false)
    private String falseTest; // false test

    @OneToOne
    private Order ordersOneToOne; // NonCompliant
}
