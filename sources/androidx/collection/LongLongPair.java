package androidx.collection;

/* loaded from: classes.dex */
public final class LongLongPair {
    private final long first;
    private final long second;

    public LongLongPair(long j8, long j9) {
        this.first = j8;
        this.second = j9;
    }

    public final long component1() {
        return getFirst();
    }

    public final long component2() {
        return getSecond();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LongLongPair)) {
            return false;
        }
        LongLongPair longLongPair = (LongLongPair) obj;
        if (longLongPair.first != this.first || longLongPair.second != this.second) {
            return false;
        }
        return true;
    }

    public final long getFirst() {
        return this.first;
    }

    public final long getSecond() {
        return this.second;
    }

    public int hashCode() {
        return a.a(this.first) ^ a.a(this.second);
    }

    public String toString() {
        return '(' + this.first + ", " + this.second + ')';
    }
}
