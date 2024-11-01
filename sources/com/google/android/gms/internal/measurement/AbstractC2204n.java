package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2204n implements InterfaceC2195m, InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    protected final String f16887a;

    /* renamed from: b, reason: collision with root package name */
    protected final Map f16888b = new HashMap();

    public AbstractC2204n(String str) {
        this.f16887a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        return this.f16887a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return AbstractC2220p.b(this.f16888b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        if ("toString".equals(str)) {
            return new C2259u(this.f16887a);
        }
        return AbstractC2220p.a(this, new C2259u(str), y22, list);
    }

    public abstract InterfaceC2243s a(Y2 y22, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public InterfaceC2243s b() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final InterfaceC2243s c(String str) {
        if (this.f16888b.containsKey(str)) {
            return (InterfaceC2243s) this.f16888b.get(str);
        }
        return InterfaceC2243s.f16971b0;
    }

    public final String d() {
        return this.f16887a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2204n)) {
            return false;
        }
        AbstractC2204n abstractC2204n = (AbstractC2204n) obj;
        String str = this.f16887a;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC2204n.f16887a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final boolean g(String str) {
        return this.f16888b.containsKey(str);
    }

    public int hashCode() {
        String str = this.f16887a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final void j(String str, InterfaceC2243s interfaceC2243s) {
        if (interfaceC2243s == null) {
            this.f16888b.remove(str);
        } else {
            this.f16888b.put(str, interfaceC2243s);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        return Double.valueOf(Double.NaN);
    }
}
