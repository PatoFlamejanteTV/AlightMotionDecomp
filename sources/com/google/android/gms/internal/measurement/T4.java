package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class T4 implements Q4 {
    @Override // com.google.android.gms.internal.measurement.Q4
    public final O4 a(Object obj) {
        android.support.v4.media.a.a(obj);
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final Map b(Object obj) {
        return (R4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final Map c(Object obj) {
        return (R4) obj;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final Object d(Object obj) {
        return R4.b().e();
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final Object e(Object obj, Object obj2) {
        R4 r42 = (R4) obj;
        R4 r43 = (R4) obj2;
        if (!r43.isEmpty()) {
            if (!r42.g()) {
                r42 = r42.e();
            }
            r42.c(r43);
        }
        return r42;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final boolean f(Object obj) {
        if (!((R4) obj).g()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final Object g(Object obj) {
        ((R4) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.Q4
    public final int h(int i8, Object obj, Object obj2) {
        R4 r42 = (R4) obj;
        android.support.v4.media.a.a(obj2);
        if (r42.isEmpty()) {
            return 0;
        }
        Iterator it = r42.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
