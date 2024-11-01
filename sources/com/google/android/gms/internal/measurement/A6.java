package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class A6 implements InterfaceC2290x6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16226a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16227b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.ad_id_consent_fix", true);
        e8.d("measurement.service.consent.aiid_reset_fix", false);
        e8.d("measurement.service.consent.aiid_reset_fix2", true);
        e8.d("measurement.service.consent.app_start_fix", true);
        f16226a = e8.d("measurement.service.consent.params_on_fx", true);
        f16227b = e8.d("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2290x6
    public final boolean w() {
        return ((Boolean) f16226a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2290x6
    public final boolean x() {
        return ((Boolean) f16227b.e()).booleanValue();
    }
}
