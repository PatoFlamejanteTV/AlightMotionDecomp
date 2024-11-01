package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2157h6 implements InterfaceC2130e6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16749a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.consent_state_v1", true);
        e8.d("measurement.client.3p_consent_state_v1", true);
        e8.d("measurement.service.consent_state_v1_W36", true);
        f16749a = e8.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2130e6
    public final long w() {
        return ((Long) f16749a.e()).longValue();
    }
}
