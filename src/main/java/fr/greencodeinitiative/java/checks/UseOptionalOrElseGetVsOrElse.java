package fr.greencodeinitiative.java.checks;

public class UseOptionalOrElseGetVsOrElse {
    java.util.Optional<String> optional = java.util.Optional.of("test");

    public void nonCompliantOrElse() {
        String value = optional.orElse(getDefaultValue()); // Noncompliant {{Use optional orElseGet instead of orElse.}}
    }

    public void compliantOrElseGet() {
        String value = optional.orElseGet(() -> getDefaultValue()); // Compliant
    }

    public void compliantOrElse() {
        String value = new RandomClass().orElse(getDefaultValue()); // Compliant
    }

    private String getDefaultValue() {
        return "default";
    }

    private class RandomClass {

        public String orElse(String value) {
            return value;
        }
    }
}
