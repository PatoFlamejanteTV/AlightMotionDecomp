package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class L3 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        J3 j32 = (J3) obj;
        J3 j33 = (J3) obj2;
        P3 p32 = (P3) j32.iterator();
        P3 p33 = (P3) j33.iterator();
        while (p32.hasNext() && p33.hasNext()) {
            int compare = Integer.compare(J3.e(p32.w()), J3.e(p33.w()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(j32.r(), j33.r());
    }
}
