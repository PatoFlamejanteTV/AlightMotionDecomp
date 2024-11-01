package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class O5 implements InterfaceC2442t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17497a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f17498b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f17499c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O5(H5 h52, String str, V5 v52) {
        this.f17497a = str;
        this.f17498b = v52;
        this.f17499c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2442t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17499c.B(this.f17497a, i8, th, bArr, this.f17498b);
    }
}
