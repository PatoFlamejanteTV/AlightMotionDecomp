package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class G4 implements H4 {
    private static B4 c(Object obj, long j8) {
        return (B4) E5.B(obj, j8);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void a(Object obj, long j8) {
        c(obj, j8).x();
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void b(Object obj, Object obj2, long j8) {
        B4 c8 = c(obj, j8);
        B4 c9 = c(obj2, j8);
        int size = c8.size();
        int size2 = c9.size();
        if (size > 0 && size2 > 0) {
            if (!c8.b()) {
                c8 = c8.a(size2 + size);
            }
            c8.addAll(c9);
        }
        if (size > 0) {
            c9 = c8;
        }
        E5.j(obj, j8, c9);
    }
}
