package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class r7 implements o7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16969a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16970b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.client.sessions.background_sessions_enabled", true);
        f16969a = e8.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e8.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f16970b = e8.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e8.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e8.d("measurement.client.sessions.session_id_enabled", true);
        e8.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean w() {
        return ((Boolean) f16969a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean x() {
        return ((Boolean) f16970b.e()).booleanValue();
    }
}
