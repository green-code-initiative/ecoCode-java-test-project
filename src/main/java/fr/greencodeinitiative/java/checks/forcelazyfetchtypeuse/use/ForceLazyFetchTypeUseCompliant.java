package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;


import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.Order;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "COMPLIANT")
public class ForceLazyFetchTypeUseCompliant extends LazyItem {
    /**
     * Compliant class for the default value of FetchType
     * contains compliant code
     */
    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private Set<Order> ordersOneToManyLazy = new HashSet<>(); // Compliant

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Order> ordersManyToManyLazy = new HashSet<>(); // Compliant
}
