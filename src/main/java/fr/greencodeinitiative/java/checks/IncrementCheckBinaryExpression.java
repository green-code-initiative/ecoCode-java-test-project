package fr.greencodeinitiative.java.checks;

class IncrementCheckBinaryExpression {
    IncrementCheckBinaryExpression(IncrementCheckBinaryExpression mc) {
    }
    void unaryExpressionWithinBinaryExpression() {
        var i = 0;
        for (int j=0; j < 10; ++j) {
            System.out.println("test" + i++);
            System.out.println(2 + i++);
            System.out.println(2 - i++);
            System.out.println(2 * i++);
            System.out.println(2 / i++);
        }
    }
}
