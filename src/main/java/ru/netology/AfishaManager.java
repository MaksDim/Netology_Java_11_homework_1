package ru.netology;

public class AfishaManager {
    private Afisha[] items = new Afisha[0];
    private int lastMaxCount = 10;

    public AfishaManager() {
    }

    public AfishaManager(int lastMaxCount) {
        this.lastMaxCount = lastMaxCount;
    }

    public void add(Afisha item) {
        Afisha[] tmp = new Afisha[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }

    public Afisha[] findAll() {
        return this.items;
    }

    public Afisha[] findLast() {
        int resultLength;
        if (items.length < lastMaxCount) {
            resultLength = items.length;
        } else {
            resultLength = lastMaxCount;
        }
        Afisha[] result = new Afisha[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = items[items.length - 1 - i];
        }

        return result;
    }
}
