package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class D extends A {
    public D() {
        this.f16219a.add(Z.EQUALS);
        this.f16219a.add(Z.GREATER_THAN);
        this.f16219a.add(Z.GREATER_THAN_EQUALS);
        this.f16219a.add(Z.IDENTITY_EQUALS);
        this.f16219a.add(Z.IDENTITY_NOT_EQUALS);
        this.f16219a.add(Z.LESS_THAN);
        this.f16219a.add(Z.LESS_THAN_EQUALS);
        this.f16219a.add(Z.NOT_EQUALS);
    }

    private static boolean c(InterfaceC2243s interfaceC2243s, InterfaceC2243s interfaceC2243s2) {
        InterfaceC2243s c2177k;
        InterfaceC2243s c2177k2;
        while (!interfaceC2243s.getClass().equals(interfaceC2243s2.getClass())) {
            if (((interfaceC2243s instanceof C2299z) || (interfaceC2243s instanceof C2228q)) && ((interfaceC2243s2 instanceof C2299z) || (interfaceC2243s2 instanceof C2228q))) {
                return true;
            }
            boolean z8 = interfaceC2243s instanceof C2177k;
            if (z8 && (interfaceC2243s2 instanceof C2259u)) {
                c2177k2 = new C2177k(interfaceC2243s2.z());
            } else {
                boolean z9 = interfaceC2243s instanceof C2259u;
                if (z9 && (interfaceC2243s2 instanceof C2177k)) {
                    c2177k = new C2177k(interfaceC2243s.z());
                } else if (interfaceC2243s instanceof C2150h) {
                    c2177k = new C2177k(interfaceC2243s.z());
                } else if (interfaceC2243s2 instanceof C2150h) {
                    c2177k2 = new C2177k(interfaceC2243s2.z());
                } else if ((z9 || z8) && (interfaceC2243s2 instanceof InterfaceC2195m)) {
                    c2177k2 = new C2259u(interfaceC2243s2.A());
                } else {
                    if (!(interfaceC2243s instanceof InterfaceC2195m) || (!(interfaceC2243s2 instanceof C2259u) && !(interfaceC2243s2 instanceof C2177k))) {
                        return false;
                    }
                    c2177k = new C2259u(interfaceC2243s.A());
                }
                interfaceC2243s = c2177k;
            }
            interfaceC2243s2 = c2177k2;
        }
        if ((interfaceC2243s instanceof C2299z) || (interfaceC2243s instanceof C2228q)) {
            return true;
        }
        if (interfaceC2243s instanceof C2177k) {
            if (Double.isNaN(interfaceC2243s.z().doubleValue()) || Double.isNaN(interfaceC2243s2.z().doubleValue()) || interfaceC2243s.z().doubleValue() != interfaceC2243s2.z().doubleValue()) {
                return false;
            }
            return true;
        }
        if (interfaceC2243s instanceof C2259u) {
            return interfaceC2243s.A().equals(interfaceC2243s2.A());
        }
        if (interfaceC2243s instanceof C2150h) {
            return interfaceC2243s.y().equals(interfaceC2243s2.y());
        }
        if (interfaceC2243s != interfaceC2243s2) {
            return false;
        }
        return true;
    }

    private static boolean d(InterfaceC2243s interfaceC2243s, InterfaceC2243s interfaceC2243s2) {
        if (interfaceC2243s instanceof InterfaceC2195m) {
            interfaceC2243s = new C2259u(interfaceC2243s.A());
        }
        if (interfaceC2243s2 instanceof InterfaceC2195m) {
            interfaceC2243s2 = new C2259u(interfaceC2243s2.A());
        }
        if ((interfaceC2243s instanceof C2259u) && (interfaceC2243s2 instanceof C2259u)) {
            if (interfaceC2243s.A().compareTo(interfaceC2243s2.A()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC2243s.z().doubleValue();
        double doubleValue2 = interfaceC2243s2.z().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    private static boolean e(InterfaceC2243s interfaceC2243s, InterfaceC2243s interfaceC2243s2) {
        if (interfaceC2243s instanceof InterfaceC2195m) {
            interfaceC2243s = new C2259u(interfaceC2243s.A());
        }
        if (interfaceC2243s2 instanceof InterfaceC2195m) {
            interfaceC2243s2 = new C2259u(interfaceC2243s2.A());
        }
        if (((!(interfaceC2243s instanceof C2259u) || !(interfaceC2243s2 instanceof C2259u)) && (Double.isNaN(interfaceC2243s.z().doubleValue()) || Double.isNaN(interfaceC2243s2.z().doubleValue()))) || d(interfaceC2243s2, interfaceC2243s)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x002a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // com.google.android.gms.internal.measurement.A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2243s b(java.lang.String r4, com.google.android.gms.internal.measurement.Y2 r5, java.util.List r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.measurement.Z r0 = com.google.android.gms.internal.measurement.AbstractC2262u2.c(r4)
            r1 = 2
            com.google.android.gms.internal.measurement.AbstractC2262u2.f(r0, r1, r6)
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            com.google.android.gms.internal.measurement.s r0 = (com.google.android.gms.internal.measurement.InterfaceC2243s) r0
            com.google.android.gms.internal.measurement.s r0 = r5.b(r0)
            r1 = 1
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.measurement.s r6 = (com.google.android.gms.internal.measurement.InterfaceC2243s) r6
            com.google.android.gms.internal.measurement.s r5 = r5.b(r6)
            int[] r6 = com.google.android.gms.internal.measurement.G.f16306a
            com.google.android.gms.internal.measurement.Z r2 = com.google.android.gms.internal.measurement.AbstractC2262u2.c(r4)
            int r2 = r2.ordinal()
            r6 = r6[r2]
            switch(r6) {
                case 1: goto L56;
                case 2: goto L51;
                case 3: goto L4c;
                case 4: goto L47;
                case 5: goto L42;
                case 6: goto L3d;
                case 7: goto L38;
                case 8: goto L32;
                default: goto L2d;
            }
        L2d:
            com.google.android.gms.internal.measurement.s r4 = super.a(r4)
            return r4
        L32:
            boolean r4 = c(r0, r5)
        L36:
            r4 = r4 ^ r1
            goto L5a
        L38:
            boolean r4 = e(r0, r5)
            goto L5a
        L3d:
            boolean r4 = d(r0, r5)
            goto L5a
        L42:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC2262u2.h(r0, r5)
            goto L36
        L47:
            boolean r4 = com.google.android.gms.internal.measurement.AbstractC2262u2.h(r0, r5)
            goto L5a
        L4c:
            boolean r4 = e(r5, r0)
            goto L5a
        L51:
            boolean r4 = d(r5, r0)
            goto L5a
        L56:
            boolean r4 = c(r0, r5)
        L5a:
            if (r4 == 0) goto L5f
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2243s.f16976g0
            return r4
        L5f:
            com.google.android.gms.internal.measurement.s r4 = com.google.android.gms.internal.measurement.InterfaceC2243s.f16977h0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.D.b(java.lang.String, com.google.android.gms.internal.measurement.Y2, java.util.List):com.google.android.gms.internal.measurement.s");
    }
}
