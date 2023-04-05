package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.def;

import fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse.LazyItem;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER")
public class OrderDef implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "id")
    private LazyItem items;
}
