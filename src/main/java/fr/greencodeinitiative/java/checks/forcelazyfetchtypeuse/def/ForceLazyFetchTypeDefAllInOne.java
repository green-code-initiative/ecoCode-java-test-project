package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;
import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use.OrderUse;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALL_IN_ONE")
public class ForceLazyFetchTypeDefAllInOne extends LazyItem {
    @OneToMany(mappedBy = "item")
    private Set<OrderUse> ordersEager = new HashSet<>();

    @OneToMany(mappedBy = "item")
    private Set<OrderUse> ordersLazy = new HashSet<>();

    @Column(name = "STUDENT_NAME", length = 50, nullable = false, unique = false)
    private String studentNames;

    @OneToOne
    private OrderUse orderUse;
}
