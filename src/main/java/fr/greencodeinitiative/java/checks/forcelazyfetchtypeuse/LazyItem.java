package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LazyItem")
public class LazyItem implements Serializable {
    /**
     * Lazy Itep super class
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
}
