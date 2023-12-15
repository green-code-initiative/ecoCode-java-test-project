package fr.greencodeinitiative.java.checks;

import fr.greencodeinitiative.java.utils.User;
import jakarta.persistence.*;

@Entity
class FetchTypeLazyCheckBad {


    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long orderId;

    @ManyToOne(fetch = FetchType.EAGER) // Noncompliant {{Use lazy fetch type instead of egger}}
    @JoinColumn(name = "USER_ID")
    private User user;

}
