package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NON_COMPLIANT")
public class ForceLazyFetchTypeUseNonCompliant extends LazyItem {
    @OneToMany(mappedBy = "item", fetch = FetchType.EAGER)
    private Set<OrderUse> orderUses = new HashSet<>();
}
