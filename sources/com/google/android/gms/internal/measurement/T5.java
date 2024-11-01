package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class T5 extends r {

    /* renamed from: b, reason: collision with root package name */
    private final C2114d f16462b;

    public T5(C2114d c2114d) {
        this.f16462b = c2114d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s C(String str, Y2 y22, List list) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c8 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c8 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c8 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c8 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c8 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                AbstractC2262u2.g("getEventName", 0, list);
                return new C2259u(this.f16462b.d().e());
            case 1:
                AbstractC2262u2.g("getTimestamp", 0, list);
                return new C2177k(Double.valueOf(this.f16462b.d().a()));
            case 2:
                AbstractC2262u2.g("getParamValue", 1, list);
                return Z3.b(this.f16462b.d().b(y22.b((InterfaceC2243s) list.get(0)).A()));
            case 3:
                AbstractC2262u2.g("getParams", 0, list);
                Map g8 = this.f16462b.d().g();
                r rVar = new r();
                for (String str2 : g8.keySet()) {
                    rVar.j(str2, Z3.b(g8.get(str2)));
                }
                return rVar;
            case 4:
                AbstractC2262u2.g("setParamValue", 2, list);
                String A8 = y22.b((InterfaceC2243s) list.get(0)).A();
                InterfaceC2243s b9 = y22.b((InterfaceC2243s) list.get(1));
                this.f16462b.d().d(A8, AbstractC2262u2.d(b9));
                return b9;
            case 5:
                AbstractC2262u2.g("setEventName", 1, list);
                InterfaceC2243s b10 = y22.b((InterfaceC2243s) list.get(0));
                if (!InterfaceC2243s.f16971b0.equals(b10) && !InterfaceC2243s.f16972c0.equals(b10)) {
                    this.f16462b.d().f(b10.A());
                    return new C2259u(b10.A());
                }
                throw new IllegalArgumentException("Illegal event name");
            default:
                return super.C(str, y22, list);
        }
    }
}
