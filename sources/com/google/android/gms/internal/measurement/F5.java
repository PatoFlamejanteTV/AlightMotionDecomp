package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class F5 extends D5 {
    private static void m(Object obj, C5 c52) {
        ((AbstractC2240r4) obj).zzb = c52;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ int a(Object obj) {
        return ((C5) obj).a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ Object b(Object obj, Object obj2) {
        C5 c52 = (C5) obj;
        C5 c53 = (C5) obj2;
        if (C5.k().equals(c53)) {
            return c52;
        }
        if (C5.k().equals(c52)) {
            return C5.c(c52, c53);
        }
        return c52.b(c53);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void c(Object obj, int i8, J3 j32) {
        ((C5) obj).e((i8 << 3) | 2, j32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void d(Object obj, V5 v52) {
        ((C5) obj).g(v52);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ int e(Object obj) {
        return ((C5) obj).i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void f(Object obj, int i8, long j8) {
        ((C5) obj).e(i8 << 3, Long.valueOf(j8));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void g(Object obj, V5 v52) {
        ((C5) obj).j(v52);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (C5) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ Object i(Object obj) {
        C5 c52 = ((AbstractC2240r4) obj).zzb;
        if (c52 == C5.k()) {
            C5 l8 = C5.l();
            m(obj, l8);
            return l8;
        }
        return c52;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ void j(Object obj, Object obj2) {
        m(obj, (C5) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ Object k(Object obj) {
        return ((AbstractC2240r4) obj).zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.D5
    public final void l(Object obj) {
        ((AbstractC2240r4) obj).zzb.m();
    }
}
