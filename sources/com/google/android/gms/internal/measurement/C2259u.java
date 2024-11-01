package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2259u implements InterfaceC2243s, Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final String f17015a;

    public C2259u(String str) {
        if (str != null) {
            this.f17015a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final String A() {
        return this.f17015a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Iterator B() {
        return new C2283x(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0317  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC2243s C(java.lang.String r22, com.google.android.gms.internal.measurement.Y2 r23, java.util.List r24) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C2259u.C(java.lang.String, com.google.android.gms.internal.measurement.Y2, java.util.List):com.google.android.gms.internal.measurement.s");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final InterfaceC2243s b() {
        return new C2259u(this.f17015a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2259u)) {
            return false;
        }
        return this.f17015a.equals(((C2259u) obj).f17015a);
    }

    public final int hashCode() {
        return this.f17015a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2275w(this);
    }

    public final String toString() {
        return "\"" + this.f17015a + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Boolean y() {
        return Boolean.valueOf(!this.f17015a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2243s
    public final Double z() {
        if (this.f17015a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.f17015a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }
}
