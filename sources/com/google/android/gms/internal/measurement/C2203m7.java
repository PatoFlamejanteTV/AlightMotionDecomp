package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.m7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2203m7 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16886a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        e8.d("measurement.collection.enable_session_stitching_token.client.dev", true);
        e8.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f16886a = e8.d("measurement.session_stitching_token_enabled", false);
        e8.d("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean w() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean x() {
        return ((Boolean) f16886a.e()).booleanValue();
    }
}
