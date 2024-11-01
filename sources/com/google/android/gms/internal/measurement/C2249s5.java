package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2249s5 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f16989a;

    /* renamed from: b, reason: collision with root package name */
    private Object f16990b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC2218o5 f16991c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2249s5(AbstractC2218o5 abstractC2218o5, Map.Entry entry) {
        this(abstractC2218o5, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C2249s5) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (a(this.f16989a, entry.getKey()) && a(this.f16990b, entry.getValue())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f16989a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f16990b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Comparable comparable = this.f16989a;
        int i8 = 0;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f16990b;
        if (obj != null) {
            i8 = obj.hashCode();
        }
        return hashCode ^ i8;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f16991c.r();
        Object obj2 = this.f16990b;
        this.f16990b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f16989a) + "=" + String.valueOf(this.f16990b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2249s5(AbstractC2218o5 abstractC2218o5, Comparable comparable, Object obj) {
        this.f16991c = abstractC2218o5;
        this.f16989a = comparable;
        this.f16990b = obj;
    }
}
