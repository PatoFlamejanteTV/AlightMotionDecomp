package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2111c5 implements InterfaceC2210n5 {

    /* renamed from: a, reason: collision with root package name */
    private final Y4 f16615a;

    /* renamed from: b, reason: collision with root package name */
    private final D5 f16616b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f16617c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2146g4 f16618d;

    private C2111c5(D5 d52, AbstractC2146g4 abstractC2146g4, Y4 y42) {
        this.f16616b = d52;
        this.f16617c = abstractC2146g4.d(y42);
        this.f16618d = abstractC2146g4;
        this.f16615a = y42;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2111c5 i(D5 d52, AbstractC2146g4 abstractC2146g4, Y4 y42) {
        return new C2111c5(d52, abstractC2146g4, y42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final int a(Object obj) {
        D5 d52 = this.f16616b;
        int e8 = d52.e(d52.k(obj));
        if (this.f16617c) {
            return e8 + this.f16618d.b(obj).a();
        }
        return e8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final boolean b(Object obj) {
        return this.f16618d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void c(Object obj) {
        this.f16616b.l(obj);
        this.f16618d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final int d(Object obj) {
        int hashCode = this.f16616b.k(obj).hashCode();
        if (this.f16617c) {
            return (hashCode * 53) + this.f16618d.b(obj).hashCode();
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void e(Object obj, Object obj2) {
        AbstractC2226p5.n(this.f16616b, obj, obj2);
        if (this.f16617c) {
            AbstractC2226p5.l(this.f16618d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void f(Object obj, V5 v52) {
        Iterator l8 = this.f16618d.b(obj).l();
        if (!l8.hasNext()) {
            D5 d52 = this.f16616b;
            d52.d(d52.k(obj), v52);
        } else {
            android.support.v4.media.a.a(((Map.Entry) l8.next()).getKey());
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final void g(Object obj, byte[] bArr, int i8, int i9, I3 i32) {
        AbstractC2240r4 abstractC2240r4 = (AbstractC2240r4) obj;
        if (abstractC2240r4.zzb == C5.k()) {
            abstractC2240r4.zzb = C5.l();
        }
        android.support.v4.media.a.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final boolean h(Object obj, Object obj2) {
        if (!this.f16616b.k(obj).equals(this.f16616b.k(obj2))) {
            return false;
        }
        if (this.f16617c) {
            return this.f16618d.b(obj).equals(this.f16618d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2210n5
    public final Object w() {
        Y4 y42 = this.f16615a;
        if (y42 instanceof AbstractC2240r4) {
            return ((AbstractC2240r4) y42).y();
        }
        return y42.c().u();
    }
}
