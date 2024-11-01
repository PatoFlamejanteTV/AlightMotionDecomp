package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2211n6 implements InterfaceC2184k6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16900a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16901b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16902c;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16900a = e8.d("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        f16901b = e8.d("measurement.defensively_copy_bundles_validate_default_params", true);
        f16902c = e8.d("measurement.set_default_event_parameters_with_backfill.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2184k6
    public final boolean b() {
        return ((Boolean) f16901b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2184k6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2184k6
    public final boolean x() {
        return ((Boolean) f16900a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2184k6
    public final boolean y() {
        return ((Boolean) f16902c.e()).booleanValue();
    }
}
