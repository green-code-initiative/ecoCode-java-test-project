package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.use;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER")
public class OrderUse implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private LazyItem items;
}
