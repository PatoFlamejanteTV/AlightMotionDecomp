package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class B6 implements C6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16239a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16240b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16241c;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f16239a = e8.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        f16240b = e8.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f16241c = e8.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean b() {
        return ((Boolean) f16240b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean x() {
        return ((Boolean) f16239a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean y() {
        return ((Boolean) f16241c.e()).booleanValue();
    }
}
