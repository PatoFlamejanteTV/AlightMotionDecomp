package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Y2 {

    /* renamed from: a, reason: collision with root package name */
    private final Y2 f16484a;

    /* renamed from: b, reason: collision with root package name */
    private E f16485b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16486c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map f16487d = new HashMap();

    public Y2(Y2 y22, E e8) {
        this.f16484a = y22;
        this.f16485b = e8;
    }

    public final InterfaceC2243s a(C2141g c2141g) {
        InterfaceC2243s interfaceC2243s = InterfaceC2243s.f16971b0;
        Iterator s8 = c2141g.s();
        while (s8.hasNext()) {
            interfaceC2243s = this.f16485b.a(this, c2141g.e(((Integer) s8.next()).intValue()));
            if (interfaceC2243s instanceof C2186l) {
                break;
            }
        }
        return interfaceC2243s;
    }

    public final InterfaceC2243s b(InterfaceC2243s interfaceC2243s) {
        return this.f16485b.a(this, interfaceC2243s);
    }

    public final InterfaceC2243s c(String str) {
        Y2 y22 = this;
        while (!y22.f16486c.containsKey(str)) {
            y22 = y22.f16484a;
            if (y22 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC2243s) y22.f16486c.get(str);
    }

    public final Y2 d() {
        return new Y2(this, this.f16485b);
    }

    public final void e(String str, InterfaceC2243s interfaceC2243s) {
        if (!this.f16487d.containsKey(str)) {
            if (interfaceC2243s == null) {
                this.f16486c.remove(str);
            } else {
                this.f16486c.put(str, interfaceC2243s);
            }
        }
    }

    public final void f(String str, InterfaceC2243s interfaceC2243s) {
        e(str, interfaceC2243s);
        this.f16487d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        Y2 y22 = this;
        while (!y22.f16486c.containsKey(str)) {
            y22 = y22.f16484a;
            if (y22 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC2243s interfaceC2243s) {
        Y2 y22;
        Y2 y23 = this;
        while (!y23.f16486c.containsKey(str) && (y22 = y23.f16484a) != null && y22.g(str)) {
            y23 = y23.f16484a;
        }
        if (!y23.f16487d.containsKey(str)) {
            if (interfaceC2243s == null) {
                y23.f16486c.remove(str);
            } else {
                y23.f16486c.put(str, interfaceC2243s);
            }
        }
    }
}
