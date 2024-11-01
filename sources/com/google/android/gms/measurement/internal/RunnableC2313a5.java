package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import l0.InterfaceC3306f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2313a5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ AtomicReference f17673a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f17674b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f17675c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ String f17676d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ M5 f17677e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ boolean f17678f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ F4 f17679g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2313a5(F4 f42, AtomicReference atomicReference, String str, String str2, String str3, M5 m52, boolean z8) {
        this.f17673a = atomicReference;
        this.f17674b = str;
        this.f17675c = str2;
        this.f17676d = str3;
        this.f17677e = m52;
        this.f17678f = z8;
        this.f17679g = f42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3306f interfaceC3306f;
        synchronized (this.f17673a) {
            try {
                try {
                    interfaceC3306f = this.f17679g.f17223d;
                } catch (RemoteException e8) {
                    this.f17679g.a().G().d("(legacy) Failed to get user properties; remote exception", C2401n2.s(this.f17674b), this.f17675c, e8);
                    this.f17673a.set(Collections.emptyList());
                }
                if (interfaceC3306f == null) {
                    this.f17679g.a().G().d("(legacy) Failed to get user properties; not connected to service", C2401n2.s(this.f17674b), this.f17675c, this.f17676d);
                    this.f17673a.set(Collections.emptyList());
                    return;
                }
                if (TextUtils.isEmpty(this.f17674b)) {
                    AbstractC1396p.l(this.f17677e);
                    this.f17673a.set(interfaceC3306f.f0(this.f17675c, this.f17676d, this.f17678f, this.f17677e));
                } else {
                    this.f17673a.set(interfaceC3306f.s(this.f17674b, this.f17675c, this.f17676d, this.f17678f));
                }
                this.f17679g.m0();
                this.f17673a.notify();
            } finally {
                this.f17673a.notify();
            }
        }
    }
}
