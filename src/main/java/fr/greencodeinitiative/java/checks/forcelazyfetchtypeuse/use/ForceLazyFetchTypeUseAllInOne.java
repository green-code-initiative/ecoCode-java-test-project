package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALL_IN_ONE")
public class ForceLazyFetchTypeUseAllInOne extends LazyItem {
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private Set<OrderUse> ordersEager = new HashSet<>();

    @OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
    private Set<OrderUse> ordersLazy = new HashSet<>();

    @Column(name = "STUDENT_NAME", length = 50, nullable = false, unique = false)
    private String studentNames;
}
