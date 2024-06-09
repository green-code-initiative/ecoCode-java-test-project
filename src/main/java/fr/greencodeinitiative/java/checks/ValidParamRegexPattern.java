package fr.greencodeinitiative.java.checks;

import java.util.regex.Pattern;

public class ValidParamRegexPattern {

    public void epjPatternWithParam(String codeEpj) {
        final Pattern pattern = Pattern.compile("\"codeEpj\"\\s*:\\s" + codeEpj + ","); // Compliant - Pattern is used with a parameter
        final Pattern pattern2 = Pattern.compile(codeEpj); // Compliant - Pattern is used with a parameter
    }
}
