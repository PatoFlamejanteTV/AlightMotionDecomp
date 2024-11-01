package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2274v6 implements InterfaceC2282w6 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f17052a;

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC2163i3 f17053b;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.event_safelist", true);
        f17052a = e8.d("measurement.service.store_null_safelist", true);
        f17053b = e8.d("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2282w6
    public final boolean b() {
        return ((Boolean) f17053b.e()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2282w6
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2282w6
    public final boolean x() {
        return ((Boolean) f17052a.e()).booleanValue();
    }
}
