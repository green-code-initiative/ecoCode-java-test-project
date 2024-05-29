package fr.greencodeinitiative.java.checks;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;

class NoFunctionCallWhenDeclaringForLoop {
    NoFunctionCallWhenDeclaringForLoop(NoFunctionCallWhenDeclaringForLoop mc) {
    }

    public int getMyValue() {
        return 6;
    }

    public int incrementeMyValue(int i) {
        return i + 100;
    }

    public void test1() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
            boolean b = getMyValue() > 6;
        }
    }

    public void test2() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }

    public void test3() {
        for (int i = getMyValue(); i < 20; i++) {  // Noncompliant {{Do not call a function when declaring a for-type loop}}
            System.out.println(i);
            boolean b = getMyValue() > 6;
        }
    }

    public void test4() {
        for (int i = 0; i < getMyValue(); i++) {  // Noncompliant {{Do not call a function when declaring a for-type loop}}
            System.out.println(i);
            boolean b = getMyValue() > 6;
        }
    }

    public void test5() {
        for (int i = 0; i < getMyValue(); incrementeMyValue(i)) {  // Noncompliant {{Do not call a function when declaring a for-type loop}}
            System.out.println(i);
            boolean b = getMyValue() > 6;
        }
    }

    public void test6() {
        for (int i = getMyValue(); i < getMyValue(); i++) { // Noncompliant {{Do not call a function when declaring a for-type loop}}
            System.out.println(i);
            boolean b = getMyValue() > 6;
        }
    }
    public void test7() {
        List<String> joursSemaine = Arrays.asList("Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche");
        
        String jour;
        // iterator is allowed
        for (Iterator<String> iterator = joursSemaine.iterator(); iterator.hasNext(); jour = iterator.next()) {
            System.out.println(jour);
        }

        // subclass of iterator is allowed
        for (ListIterator<String> iterator = joursSemaine.listIterator(); iterator.hasNext(); jour = iterator.next()) {
            System.out.println(jour);
        }

        // iterator called in an indirect way is allowed
        for (OtherClassWithIterator otherClass = new OtherClassWithIterator(joursSemaine); otherClass.iterator.hasNext(); jour = otherClass.iterator.next()) {
            System.out.println(jour);
        }
        // but using a method that returns an iterator causes an issue
        for (OtherClassWithIterator otherClass = new OtherClassWithIterator(joursSemaine); otherClass.getIterator().hasNext(); jour = otherClass.getIterator().next()) {  // Noncompliant {{Do not call a function when declaring a for-type loop}}
            System.out.println(jour);
        }

    }

}

class OtherClassWithIterator {
    public Iterator<String> iterator;

    public OtherClassWithIterator(Iterator<String> iterator){
        this.iterator = iterator;
    }

    public Iterator getIterator(){
        return iterator;
    }
}