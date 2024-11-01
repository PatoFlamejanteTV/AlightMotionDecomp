package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2141g implements InterfaceC2195m, InterfaceC2243s, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final SortedMap f16730a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f16731b;

    public C2141g() {
        this.f16730a = new TreeMap();
        this.f16731b = new TreeMap();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        return toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return new C2132f(this, this.f16730a.keySet().iterator(), this.f16731b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return AbstractC2220p.a(this, new C2259u(str), y22, list);
        }
        return H.d(str, this, y22, list);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        C2141g c2141g = new C2141g();
        for (Map.Entry entry : this.f16730a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC2195m) {
                c2141g.f16730a.put((Integer) entry.getKey(), (InterfaceC2243s) entry.getValue());
            } else {
                c2141g.f16730a.put((Integer) entry.getKey(), ((InterfaceC2243s) entry.getValue()).b());
            }
        }
        return c2141g;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final InterfaceC2243s c(String str) {
        InterfaceC2243s interfaceC2243s;
        if ("length".equals(str)) {
            return new C2177k(Double.valueOf(m()));
        }
        if (g(str) && (interfaceC2243s = (InterfaceC2243s) this.f16731b.get(str)) != null) {
            return interfaceC2243s;
        }
        return InterfaceC2243s.f16971b0;
    }

    public final int d() {
        return this.f16730a.size();
    }

    public final InterfaceC2243s e(int i8) {
        InterfaceC2243s interfaceC2243s;
        if (i8 < m()) {
            if (r(i8) && (interfaceC2243s = (InterfaceC2243s) this.f16730a.get(Integer.valueOf(i8))) != null) {
                return interfaceC2243s;
            }
            return InterfaceC2243s.f16971b0;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2141g)) {
            return false;
        }
        C2141g c2141g = (C2141g) obj;
        if (m() != c2141g.m()) {
            return false;
        }
        if (this.f16730a.isEmpty()) {
            return c2141g.f16730a.isEmpty();
        }
        for (int intValue = ((Integer) this.f16730a.firstKey()).intValue(); intValue <= ((Integer) this.f16730a.lastKey()).intValue(); intValue++) {
            if (!e(intValue).equals(c2141g.e(intValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final boolean g(String str) {
        if (!"length".equals(str) && !this.f16731b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f16730a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2159i(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2195m
    public final void j(String str, InterfaceC2243s interfaceC2243s) {
        if (interfaceC2243s == null) {
            this.f16731b.remove(str);
        } else {
            this.f16731b.put(str, interfaceC2243s);
        }
    }

    public final void k(int i8, InterfaceC2243s interfaceC2243s) {
        if (i8 >= 0) {
            if (i8 >= m()) {
                q(i8, interfaceC2243s);
                return;
            }
            for (int intValue = ((Integer) this.f16730a.lastKey()).intValue(); intValue >= i8; intValue--) {
                InterfaceC2243s interfaceC2243s2 = (InterfaceC2243s) this.f16730a.get(Integer.valueOf(intValue));
                if (interfaceC2243s2 != null) {
                    q(intValue + 1, interfaceC2243s2);
                    this.f16730a.remove(Integer.valueOf(intValue));
                }
            }
            q(i8, interfaceC2243s);
            return;
        }
        throw new IllegalArgumentException("Invalid value index: " + i8);
    }

    public final void l(InterfaceC2243s interfaceC2243s) {
        q(m(), interfaceC2243s);
    }

    public final int m() {
        if (this.f16730a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f16730a.lastKey()).intValue() + 1;
    }

    public final String n(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f16730a.isEmpty()) {
            for (int i8 = 0; i8 < m(); i8++) {
                InterfaceC2243s e8 = e(i8);
                sb.append(str);
                if (!(e8 instanceof C2299z) && !(e8 instanceof C2228q)) {
                    sb.append(e8.A());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void o(int i8) {
        int intValue = ((Integer) this.f16730a.lastKey()).intValue();
        if (i8 <= intValue && i8 >= 0) {
            this.f16730a.remove(Integer.valueOf(i8));
            if (i8 == intValue) {
                int i9 = i8 - 1;
                if (!this.f16730a.containsKey(Integer.valueOf(i9)) && i9 >= 0) {
                    this.f16730a.put(Integer.valueOf(i9), InterfaceC2243s.f16971b0);
                    return;
                }
                return;
            }
            while (true) {
                i8++;
                if (i8 <= ((Integer) this.f16730a.lastKey()).intValue()) {
                    InterfaceC2243s interfaceC2243s = (InterfaceC2243s) this.f16730a.get(Integer.valueOf(i8));
                    if (interfaceC2243s != null) {
                        this.f16730a.put(Integer.valueOf(i8 - 1), interfaceC2243s);
                        this.f16730a.remove(Integer.valueOf(i8));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void q(int i8, InterfaceC2243s interfaceC2243s) {
        if (i8 <= 32468) {
            if (i8 >= 0) {
                if (interfaceC2243s == null) {
                    this.f16730a.remove(Integer.valueOf(i8));
                    return;
                } else {
                    this.f16730a.put(Integer.valueOf(i8), interfaceC2243s);
                    return;
                }
            }
            throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
        }
        throw new IllegalStateException("Array too large");
    }

    public final boolean r(int i8) {
        if (i8 >= 0 && i8 <= ((Integer) this.f16730a.lastKey()).intValue()) {
            return this.f16730a.containsKey(Integer.valueOf(i8));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i8);
    }

    public final Iterator s() {
        return this.f16730a.keySet().iterator();
    }

    public final List t() {
        ArrayList arrayList = new ArrayList(m());
        for (int i8 = 0; i8 < m(); i8++) {
            arrayList.add(e(i8));
        }
        return arrayList;
    }

    public final String toString() {
        return n(",");
    }

    public final void u() {
        this.f16730a.clear();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        if (this.f16730a.size() == 1) {
            return e(0).z();
        }
        if (this.f16730a.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public C2141g(List list) {
        this();
        if (list != null) {
            for (int i8 = 0; i8 < list.size(); i8++) {
                q(i8, (InterfaceC2243s) list.get(i8));
            }
        }
    }

    public C2141g(InterfaceC2243s... interfaceC2243sArr) {
        this(Arrays.asList(interfaceC2243sArr));
    }
}
