package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R5 implements InterfaceC2442t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17532a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f17533b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f17534c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R5(H5 h52, String str, V5 v52) {
        this.f17532a = str;
        this.f17533b = v52;
        this.f17534c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2442t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17534c.B(this.f17532a, i8, th, bArr, this.f17533b);
    }
}
