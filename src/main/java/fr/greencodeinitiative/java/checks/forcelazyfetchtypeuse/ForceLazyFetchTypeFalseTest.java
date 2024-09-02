package fr.greencodeinitiative.java.checks.forcelazyfetchtypeuse;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FALSE_TEST")
public class ForceLazyFetchTypeFalseTest extends LazyItem {
    @Column(name = "STUDENT_NAME", length = 50, nullable = false)
    private String falseTest; // false test
}

