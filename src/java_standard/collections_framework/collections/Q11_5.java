package java_standard.collections_framework.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Q11_5 {
    public static void main(String[] args) {
        SutdaCard c1 = new SutdaCard(3, true);
        SutdaCard c2 = new SutdaCard(3, true);
        SutdaCard c3 = new SutdaCard(1, true);

        HashSet set = new HashSet();
        set.add(c1);
        set.add(c2);
        set.add(c3);

        System.out.println(set);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1, true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof SutdaCard sutdaCard) {
            return num == sutdaCard.num && isKwang == sutdaCard.isKwang;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return String.CASE_INSENSITIVE_ORDER.hashCode();
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}
