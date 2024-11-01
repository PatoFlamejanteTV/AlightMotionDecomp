package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class s7 implements t7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16994a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16995b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16996c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2163i3 f16997d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2163i3 f16998e;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16994a = e8.d("measurement.sgtm.google_signal.enable", false);
        f16995b = e8.d("measurement.sgtm.preview_mode_enabled", true);
        f16996c = e8.d("measurement.sgtm.rollout_percentage_fix", false);
        f16997d = e8.d("measurement.sgtm.service", true);
        f16998e = e8.d("measurement.sgtm.upload_queue", false);
        e8.b("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean A() {
        return ((Boolean) f16998e.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean b() {
        return ((Boolean) f16995b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean x() {
        return ((Boolean) f16994a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean y() {
        return ((Boolean) f16996c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.t7
    public final boolean z() {
        return ((Boolean) f16997d.e()).booleanValue();
    }
}
