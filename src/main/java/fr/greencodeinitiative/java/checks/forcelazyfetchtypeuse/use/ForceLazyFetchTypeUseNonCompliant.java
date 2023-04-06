package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NON_COMPLIANT")
public class ForceLazyFetchTypeUseNonCompliant extends LazyItem {
    /**
     * NonCompliant class for the default value of FetchType
     * contains non-compliant code
     */
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private Set<Order> ordersOneToManyEager = new HashSet<>(); // Non-Compliant

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Order> ordersManyToManyEager = new HashSet<>(); // Non-compliant
}
