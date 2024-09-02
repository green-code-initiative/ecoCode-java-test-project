package fr.greencodeinitiative.java.checks;

public class MakeVariableConstant {

    String test = "test"; //Non Compliant : A variable is never reassigned and can be made constant
    public void testEc82() {
        String test = "test"; //Non Compliant : A variable is never reassigned and can be made constant
        System.out.println("Hello World");
    }
}
