package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class S6 implements P6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16449a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16450b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16449a = e8.d("measurement.gbraid_campaign.gbraid.client", true);
        f16450b = e8.d("measurement.gbraid_campaign.gbraid.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean b() {
        return ((Boolean) f16450b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean x() {
        return ((Boolean) f16449a.e()).booleanValue();
    }
}
