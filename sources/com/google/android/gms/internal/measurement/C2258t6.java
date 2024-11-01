package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2258t6 implements InterfaceC2235q6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f17012a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f17013b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f17014c;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.dma_consent.client", true);
        e8.d("measurement.dma_consent.client_bow_check2", true);
        e8.d("measurement.dma_consent.separate_service_calls_fix", true);
        e8.d("measurement.dma_consent.service", true);
        f17012a = e8.d("measurement.dma_consent.service_database_update_fix", true);
        e8.d("measurement.dma_consent.service_dcu_event", true);
        f17013b = e8.d("measurement.dma_consent.service_dcu_event2", true);
        e8.d("measurement.dma_consent.service_npa_remote_default", true);
        e8.d("measurement.dma_consent.service_split_batch_on_consent", true);
        e8.d("measurement.dma_consent.set_consent_inline_on_worker", true);
        f17014c = e8.d("measurement.dma_consent.setting_npa_inline_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2235q6
    public final boolean b() {
        return ((Boolean) f17014c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2235q6
    public final boolean w() {
        return ((Boolean) f17012a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2235q6
    public final boolean x() {
        return ((Boolean) f17013b.e()).booleanValue();
    }
}
