import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
    private LinkedList<Term> terms;

    public Polynomial() {
        terms = new LinkedList<>();
    }

    public Polynomial(Term t) {
        terms = new LinkedList<>();
        terms.add(t);
    }

    public void add(Polynomial p) {
        for (Term newTerm : p.terms) {
            boolean added = false;
            ListIterator<Term> iter = terms.listIterator();

            while (iter.hasNext()) {
                Term currentTerm = iter.next();
                if (currentTerm.getPower() == newTerm.getPower()) {
                    currentTerm.addIfSamePower(newTerm);
                    added = true;
                    break;
                } else if (currentTerm.getPower() < newTerm.getPower()) {
                    iter.previous();
                    iter.add(newTerm);
                    added = true;
                    break;
                }
            }

            if (!added) {
                terms.addLast(newTerm);
            }
        }
    }

    public Polynomial multiply(Polynomial p) {
        Polynomial result = new Polynomial();

        for (Term t1 : terms) {
            for (Term t2 : p.terms) {
                result.add(new Polynomial(t1.multiply(t2)));
            }
        }

        return result;
    }

    public void print() {
        if (terms.isEmpty()) {
            System.out.println("0");
            return;
        }

        boolean first = true;
        for (Term t : terms) {
            if (t.getCoefficient() == 0) {
                continue;
            }

            if (first) {
                System.out.print(t);
                first = false;
            } else {
                if (t.getCoefficient() > 0) {
                    System.out.print(" + " + t);
                } else {
                    System.out.print(" - " + t.toString().substring(1));
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Polynomial p = new Polynomial(new Term(-10, 0));
        p.print();
        System.out.println("\nExpected: - 10.0");

        p.add(new Polynomial(new Term(-1, 1)));
        p.print();
        System.out.println("\nExpected: - 1.0x - 10.0");

        p.add(new Polynomial(new Term(9, 7)));
        p.print();
        System.out.println("\nExpected: 9.0x^7 - 1.0x - 10.0");

        p.add(new Polynomial(new Term(5, 10)));
        p.print();
        System.out.println("\nExpected: 5.0x^10 + 9.0x^7 - 1.0x - 10.0");

        Polynomial q = p.multiply(p);
        q.print();
        System.out.println("\nExpected: 25.0x^20 + 90.0x^17 + 81.0x^14 - 10.0x^11 - 100.0x^10 - 18.0x^8 - 180.0x^7 + 1.0x^2 + 20.0x + 100.0");
    }
}
