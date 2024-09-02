package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NON_COMPLIANT")
public class ForceLazyFetchTypeDefNonCompliant extends LazyItem {
    /**
     * NonCompliant class for the default value of FetchType
     * contains non-compliant code
     * Reminder :
     * OneToMany: Lazy
     * ManyToOne: Eager
     * ManyToMany: Lazy
     * OneToOne: Eager
     */
    @ManyToOne
    private Order ordersManyToOne; // Non-compliant

    @OneToOne
    private Order ordersOneToOne; // Non-compliant
}
