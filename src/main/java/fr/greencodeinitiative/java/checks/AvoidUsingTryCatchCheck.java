package fr.greencodeinitiative.java.checks;

import java.util.Optional;
import java.util.stream.Stream;

public class AvoidUsingTryCatchCheck {

    public void shouldUseIfForThrowBad() {
        try {
            if (itCanBeNull() == null)
                throw new Exception("null");
            System.out.println("ok");
        } catch (Exception e) { // Noncompliant {{ Avoid Using Try Catch }}
            System.out.println("null");
        } finally {
            System.out.println("finally");
        }
    }

    public void shouldUseIfForThrowGood() {
        if (itCanBeNull() != null)
            System.out.println("ok");
        else
            System.out.println("null");
    }

    public void shouldUseIfForOptionalBad() {
        try {
            Object value = itIsOptional().orElseThrow();
            System.out.println("ok");
        } catch (NullPointerException e) { // Noncompliant {{ Avoid Using Try Catch OR "NullPointerException" should not be caught }}
            System.out.println("null");
        } finally {
            System.out.println("finally");
        }
    }

    public void shouldUseIfForOptionalWithSupplierBad() {
        try {
            Object value = itIsOptional().orElseThrow(Exception::new);
            System.out.println("ok");
        } catch (Throwable e) { // Noncompliant {{ Avoid Using Try Catch  OR Throwable and Error should not be caught}}
            System.out.println("null");
        } finally {
            System.out.println("finally");
        }
    }

    public void shouldUseIfForOptionalGood() {
        itIsOptional().ifPresentOrElse((Object value) -> {
            System.out.println("ok");
        }, () -> {
            System.out.println("null");
        });
        System.out.println("finally");
    }

    public Object itCanBeNull() {
        return null;
    }

    public Optional itIsOptional() {
        return Optional.of(null);
    }

    public void itThrows() throws Exception {
        throw new Exception();
    }

    public void shouldTryCatchGood() {
        try {
            itThrows();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }

    public void shouldTryCatchWithResourceGood() {
        try (Stream stream = itCreateResource()){
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }

    public Stream itCreateResource(){
        return null;
    }

}
