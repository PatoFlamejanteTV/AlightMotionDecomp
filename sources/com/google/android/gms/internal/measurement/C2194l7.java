package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2194l7 implements InterfaceC2167i7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16871a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f16872b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC2163i3 f16873c;

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC2163i3 f16874d;

    /* renamed from: e, reason: collision with root package name */
    private static final AbstractC2163i3 f16875e;

    /* renamed from: f, reason: collision with root package name */
    private static final AbstractC2163i3 f16876f;

    /* renamed from: g, reason: collision with root package name */
    private static final AbstractC2163i3 f16877g;

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC2163i3 f16878h;

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC2163i3 f16879i;

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC2163i3 f16880j;

    /* renamed from: k, reason: collision with root package name */
    private static final AbstractC2163i3 f16881k;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16871a = e8.d("measurement.rb.attribution.ad_campaign_info", false);
        f16872b = e8.d("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        f16873c = e8.d("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f16874d = e8.d("measurement.rb.attribution.client2", true);
        e8.d("measurement.rb.attribution.dma_fix", true);
        f16875e = e8.d("measurement.rb.attribution.followup1.service", false);
        e8.d("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f16876f = e8.d("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f16877g = e8.d("measurement.rb.attribution.retry_disposition", false);
        f16878h = e8.d("measurement.rb.attribution.service", true);
        f16879i = e8.d("measurement.rb.attribution.enable_trigger_redaction", true);
        f16880j = e8.d("measurement.rb.attribution.uuid_generation", true);
        e8.b("measurement.id.rb.attribution.retry_disposition", 0L);
        f16881k = e8.d("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean A() {
        return ((Boolean) f16875e.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean B() {
        return ((Boolean) f16877g.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean a() {
        return ((Boolean) f16879i.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean b() {
        return ((Boolean) f16872b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean d() {
        return ((Boolean) f16878h.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean e() {
        return ((Boolean) f16876f.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean f() {
        return ((Boolean) f16881k.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean g() {
        return ((Boolean) f16880j.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean x() {
        return ((Boolean) f16871a.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean y() {
        return ((Boolean) f16873c.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2167i7
    public final boolean z() {
        return ((Boolean) f16874d.e()).booleanValue();
    }
}
