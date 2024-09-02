package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ORDER")
public class Order implements Serializable {
    /**
     * Order class to simulate ORM actions
     */
    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private LazyItem items;
}
