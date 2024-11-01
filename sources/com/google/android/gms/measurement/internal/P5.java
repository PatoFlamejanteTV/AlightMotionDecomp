package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class P5 implements InterfaceC2442t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17515a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f17516b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f17517c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public P5(H5 h52, String str, List list) {
        this.f17515a = str;
        this.f17516b = list;
        this.f17517c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2442t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17517c.L(true, i8, th, bArr, this.f17515a, this.f17516b);
    }
}
