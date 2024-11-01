package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class RunnableC2435s2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2442t2 f18036a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18037b;

    /* renamed from: c, reason: collision with root package name */
    private final Throwable f18038c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f18039d;

    /* renamed from: e, reason: collision with root package name */
    private final String f18040e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f18041f;

    @Override // java.lang.Runnable
    public final void run() {
        this.f18036a.a(this.f18040e, this.f18037b, this.f18038c, this.f18039d, this.f18041f);
    }

    private RunnableC2435s2(String str, InterfaceC2442t2 interfaceC2442t2, int i8, Throwable th, byte[] bArr, Map map) {
        AbstractC1396p.l(interfaceC2442t2);
        this.f18036a = interfaceC2442t2;
        this.f18037b = i8;
        this.f18038c = th;
        this.f18039d = bArr;
        this.f18040e = str;
        this.f18041f = map;
    }
}
