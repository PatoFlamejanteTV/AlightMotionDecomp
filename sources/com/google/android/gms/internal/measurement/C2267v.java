package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2267v implements InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    private final String f17030a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f17031b;

    public C2267v(String str, List list) {
        this.f17030a = str;
        ArrayList arrayList = new ArrayList();
        this.f17031b = arrayList;
        arrayList.addAll(list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final String a() {
        return this.f17030a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return this;
    }

    public final ArrayList c() {
        return this.f17031b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2267v)) {
            return false;
        }
        C2267v c2267v = (C2267v) obj;
        String str = this.f17030a;
        if (str == null ? c2267v.f17030a != null : !str.equals(c2267v.f17030a)) {
            return false;
        }
        ArrayList arrayList = this.f17031b;
        ArrayList arrayList2 = c2267v.f17031b;
        if (arrayList != null) {
            return arrayList.equals(arrayList2);
        }
        if (arrayList2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        String str = this.f17030a;
        int i9 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = i8 * 31;
        ArrayList arrayList = this.f17031b;
        if (arrayList != null) {
            i9 = arrayList.hashCode();
        }
        return i10 + i9;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
