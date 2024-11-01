package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class r implements InterfaceC2195m, InterfaceC2243s {

    /* renamed from: a, reason: collision with root package name */
    private final Map f16952a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return AbstractC2220p.b(this.f16952a);
    }

    public InterfaceC2243s C(String str, Y2 y22, List list) {
        if ("toString".equals(str)) {
            return new C2259u(toString());
        }
        return AbstractC2220p.a(this, new C2259u(str), y22, list);
    }

    public final List a() {
        return new ArrayList(this.f16952a.keySet());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        r rVar = new r();
        for (Map.Entry entry : this.f16952a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2195m) {
                rVar.f16952a.put((String) entry.getKey(), (InterfaceC2243s) entry.getValue());
            } else {
                rVar.f16952a.put((String) entry.getKey(), ((InterfaceC2243s) entry.getValue()).b());
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final InterfaceC2243s c(String str) {
        if (this.f16952a.containsKey(str)) {
            return (InterfaceC2243s) this.f16952a.get(str);
        }
        return InterfaceC2243s.f16971b0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f16952a.equals(((r) obj).f16952a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final boolean g(String str) {
        return this.f16952a.containsKey(str);
    }

    public int hashCode() {
        return this.f16952a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final void j(String str, InterfaceC2243s interfaceC2243s) {
        if (interfaceC2243s == null) {
            this.f16952a.remove(str);
        } else {
            this.f16952a.put(str, interfaceC2243s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f16952a.isEmpty()) {
            for (String str : this.f16952a.keySet()) {
                sb.append(String.format("%s: %s,", str, this.f16952a.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
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
