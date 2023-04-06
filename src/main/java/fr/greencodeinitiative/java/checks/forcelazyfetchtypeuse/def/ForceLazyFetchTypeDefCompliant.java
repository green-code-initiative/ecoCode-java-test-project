package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COMPLIANT")
public class ForceLazyFetchTypeDefCompliant extends LazyItem {
    /**
     * Compliant class for the default value of FetchType
     * contains compliant code
     * Reminder :
     * OneToMany: Lazy
     * ManyToOne: Eager
     * ManyToMany: Lazy
     * OneToOne: Eager
     */
    @OneToMany(mappedBy = "item")
    private Set<Order> ordersOneToMany = new HashSet<>(); // Compliant

    @ManyToMany
    private Set<Order> ordersManyToMany = new HashSet<>(); // Compliant
}
