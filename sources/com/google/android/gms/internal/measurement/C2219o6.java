package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2219o6 implements InterfaceC2227p6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16924a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16925b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16924a = e8.d("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f16925b = e8.d("measurement.set_default_event_parameters_propagate_clear.service", false);
        e8.b("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2227p6
    public final boolean w() {
        return ((Boolean) f16924a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2227p6
    public final boolean x() {
        return ((Boolean) f16925b.e()).booleanValue();
    }
}
