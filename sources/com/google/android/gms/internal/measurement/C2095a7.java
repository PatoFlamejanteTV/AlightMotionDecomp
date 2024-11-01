package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2095a7 implements InterfaceC2104b7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16581a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        e8.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        f16581a = e8.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        e8.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2104b7
    public final boolean w() {
        return ((Boolean) f16581a.e()).booleanValue();
    }
}
