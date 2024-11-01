package androidx.core.util;

import Q5.r;
import android.annotation.SuppressLint;

/* loaded from: classes3.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(r rVar) {
        return new android.util.Pair<>(rVar.c(), rVar.d());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(r rVar) {
        return new Pair<>(rVar.c(), rVar.d());
    }

    public static final <F, S> r toKotlinPair(Pair<F, S> pair) {
        return new r(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> r toKotlinPair(android.util.Pair<F, S> pair) {
        return new r(pair.first, pair.second);
    }
}
