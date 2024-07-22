package fr.greencodeinitiative.java.checks;

class IncrementCheckMethod {
    IncrementCheckMethod(IncrementCheckMethod mc) {
    }
    void unaryExpressionWithinBinaryExpression() {
        var i = 0;
        for (int j=0; j < 10; ++j) {
            doSomething(i++);
        }
    }

    private void doSomething(int i) {}
}