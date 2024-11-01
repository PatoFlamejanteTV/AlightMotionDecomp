package androidx.compose.runtime.internal;

import Q5.r;
import R5.Q;
import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;

/* loaded from: classes.dex */
public final class PersistentCompositionLocalMapKt {
    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(r... rVarArr) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        Q.t(builder2, rVarArr);
        return builder2.build2();
    }
}
