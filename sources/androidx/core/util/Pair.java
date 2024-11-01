package androidx.core.util;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f8, S s8) {
        this.first = f8;
        this.second = s8;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a9, B b9) {
        return new Pair<>(a9, b9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        if (!ObjectsCompat.equals(pair.first, this.first) || !ObjectsCompat.equals(pair.second, this.second)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f8 = this.first;
        int i8 = 0;
        if (f8 == null) {
            hashCode = 0;
        } else {
            hashCode = f8.hashCode();
        }
        S s8 = this.second;
        if (s8 != null) {
            i8 = s8.hashCode();
        }
        return hashCode ^ i8;
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.first + " " + this.second + "}";
    }
}
