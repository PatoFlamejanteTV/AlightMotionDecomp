package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2166i6 implements InterfaceC2175j6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16771a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16772b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16773c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2163i3 f16774d;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16771a = e8.d("measurement.consent.stop_reset_on_storage_denied.client", true);
        f16772b = e8.d("measurement.consent.stop_reset_on_storage_denied.service", true);
        f16773c = e8.d("measurement.consent.scrub_audience_data_analytics_consent", true);
        f16774d = e8.d("measurement.consent.fix_first_open_count_from_snapshot", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2175j6
    public final boolean b() {
        return ((Boolean) f16772b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2175j6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2175j6
    public final boolean x() {
        return ((Boolean) f16771a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2175j6
    public final boolean y() {
        return ((Boolean) f16773c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2175j6
    public final boolean z() {
        return ((Boolean) f16774d.e()).booleanValue();
    }
}
