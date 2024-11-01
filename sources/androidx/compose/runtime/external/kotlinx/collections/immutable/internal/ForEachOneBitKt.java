package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i8, InterfaceC2072n interfaceC2072n) {
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i8);
            interfaceC2072n.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i9));
            i9++;
            i8 ^= lowestOneBit;
        }
    }
}
