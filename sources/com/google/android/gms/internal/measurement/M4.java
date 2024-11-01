package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class M4 implements U4 {

    /* renamed from: a, reason: collision with root package name */
    private U4[] f16398a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public M4(U4... u4Arr) {
        this.f16398a = u4Arr;
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final W4 a(Class cls) {
        for (U4 u42 : this.f16398a) {
            if (u42.b(cls)) {
                return u42.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final boolean b(Class cls) {
        for (U4 u42 : this.f16398a) {
            if (u42.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
