package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class W5 implements X5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16478a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16478a = e8.d("measurement.service.ad_impression.convert_value_to_double", true);
        e8.d("measurement.client.ad_impression", true);
        e8.d("measurement.service.separate_public_internal_event_blacklisting", true);
        e8.d("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final boolean w() {
        return ((Boolean) f16478a.e()).booleanValue();
    }
}
