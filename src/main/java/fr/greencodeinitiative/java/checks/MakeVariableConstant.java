package fr.greencodeinitiative.java.checks;

public class MakeVariableConstant {
    private static final int constant = 0;          // Compliant
    private int varDefinedInClassNotReassigned = 0; // Noncompliant {{Make variable constant}}
    private int varDefinedInClassReassigned = 0;    // Compliant

    void changeVarDefinedInClassReassigned() {
        varDefinedInClassReassigned = 1;
        System.out.println("varDefinedInClassReassigned = " + varDefinedInClassReassigned);
        System.out.println("varDefinedInClassNotReassigned = " + varDefinedInClassNotReassigned);
        System.out.println("constant = " + constant);

    }

    void simpleMethod() {
        String varDefinedInMethodNotReassigned = "hello";   // Noncompliant {{Make variable constant}}
        String varDefinedInMethodReassigned = "hello";      // Compliant
        varDefinedInMethodReassigned = "bye";

        System.out.println("varDefinedInMethodNotReassigned = " + varDefinedInMethodNotReassigned);
        System.out.println("varDefinedInMethodReassigned = " + varDefinedInMethodReassigned);
    }
}