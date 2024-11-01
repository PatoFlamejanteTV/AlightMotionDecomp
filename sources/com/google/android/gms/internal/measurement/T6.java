package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class T6 implements U6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16463a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16464b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16463a = e8.d("measurement.gmscore_feature_tracking", true);
        f16464b = e8.d("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean b() {
        return ((Boolean) f16464b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.U6
    public final boolean x() {
        return ((Boolean) f16463a.e()).booleanValue();
    }
}
