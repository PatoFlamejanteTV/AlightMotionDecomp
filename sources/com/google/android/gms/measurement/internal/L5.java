package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class L5 implements InterfaceC2442t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f17443a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f17444b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f17445c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L5(H5 h52, String str, List list) {
        this.f17443a = str;
        this.f17444b = list;
        this.f17445c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2442t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f17445c.L(true, i8, th, bArr, this.f17443a, this.f17444b);
    }
}
