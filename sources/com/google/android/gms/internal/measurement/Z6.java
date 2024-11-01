package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class Z6 implements W6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16569a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16569a = e8.d("measurement.gmscore_network_migration", false);
        e8.b("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.W6
    public final boolean x() {
        return ((Boolean) f16569a.e()).booleanValue();
    }
}
