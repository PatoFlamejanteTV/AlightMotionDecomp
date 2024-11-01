package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class D7 implements B7 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC2163i3 f16273a;

    static {
        C2232q3 e8 = new C2232q3(AbstractC2172j3.a("com.google.android.gms.measurement")).f().e();
        f16273a = e8.d("measurement.currency.escape_underscore_fix", true);
        e8.d("measurement.validation.value_and_currency_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.B7
    public final boolean w() {
        return ((Boolean) f16273a.e()).booleanValue();
    }
}
