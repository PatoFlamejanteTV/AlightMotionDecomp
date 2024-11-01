package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class K7 extends AbstractC2204n {

    /* renamed from: c, reason: collision with root package name */
    private final Callable f16348c;

    public K7(String str, Callable callable) {
        super(str);
        this.f16348c = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2204n
    public final InterfaceC2243s a(Y2 y22, List list) {
        try {
            return Z3.b(this.f16348c.call());
        } catch (Exception unused) {
            return InterfaceC2243s.f16971b0;
        }
    }
}
