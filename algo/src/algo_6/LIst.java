package algo_6;

import java.util.Scanner;

public class LIst {
    static class Node {
        int coef; // 계수
        int expo; // 지수
        Node link;

        public Node(int coef, int expo) {
            this.coef = coef;
            this.expo = expo;
            this.link = null;
        }
    }

    static class ListHead {
        Node head;

        public ListHead() {
            this.head = null;
        }
    }

    static void addLastNode(ListHead L, int coef, int expo) {
        Node newNode = new Node(coef, expo);
        if (L.head == null) {
            L.head = newNode;
        } else {
            Node p = L.head;
            while (p.link != null) {
                p = p.link;
            }
            p.link = newNode;
        }
    }

    static ListHead createSparsePolynomial(String polynomialName) {
        Scanner scanner = new Scanner(System.in);
        ListHead polynomial = new ListHead();

        System.out.print(polynomialName + " 다항식 입력>> ");
        String[] terms = scanner.nextLine().split(" ");

        for (int i = 0; i < terms.length; i += 2) {
            int coef = Integer.parseInt(terms[i]);
            int expo = Integer.parseInt(terms[i + 1]);
            addLastNode(polynomial, coef, expo);
        }

        return polynomial;
    }

    static ListHead addPolynomials(ListHead A, ListHead B) {
        ListHead result = new ListHead();
        Node pA = A.head;
        Node pB = B.head;

        while (pA != null && pB != null) {
            if (pA.expo == pB.expo) {
                addLastNode(result, pA.coef + pB.coef, pA.expo);
                pA = pA.link;
                pB = pB.link;
            } else if (pA.expo > pB.expo) {
                addLastNode(result, pA.coef, pA.expo);
                pA = pA.link;
            } else {
                addLastNode(result, pB.coef, pB.expo);
                pB = pB.link;
            }
        }

        while (pA != null) {
            addLastNode(result, pA.coef, pA.expo);
            pA = pA.link;
        }

        while (pB != null) {
            addLastNode(result, pB.coef, pB.expo);
            pB = pB.link;
        }

        return result;
    }

    static void printPolynomial(ListHead polynomial) {
        Node p = polynomial.head;
        while (p != null) {
            System.out.printf("%d %d ", p.coef, p.expo);
            p = p.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListHead firstPolynomial = createSparsePolynomial("첫번째");
        ListHead secondPolynomial = createSparsePolynomial("두번째");

        System.out.print("다항식 덧셈 결과 >> ");
        ListHead sumPolynomial = addPolynomials(firstPolynomial, secondPolynomial);
        printPolynomial(sumPolynomial);
    }
}
