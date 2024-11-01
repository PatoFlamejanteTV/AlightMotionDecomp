package com.google.android.gms.measurement.internal;

import android.util.SparseArray;
import z0.InterfaceC4257a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class R3 implements InterfaceC4257a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ B5 f17528a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ F3 f17529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public R3(F3 f32, B5 b52) {
        this.f17528a = b52;
        this.f17529b = f32;
    }

    private final void c() {
        SparseArray K8 = this.f17529b.e().K();
        B5 b52 = this.f17528a;
        K8.put(b52.f17160c, Long.valueOf(b52.f17159b));
        this.f17529b.e().s(K8);
    }

    @Override // z0.InterfaceC4257a
    public final void a(Object obj) {
        this.f17529b.k();
        if (!this.f17529b.b().q(G.f17259O0)) {
            this.f17529b.f17208i = false;
            this.f17529b.H0();
            this.f17529b.a().F().b("registerTriggerAsync ran. uri", this.f17528a.f17158a);
        } else {
            c();
            this.f17529b.f17208i = false;
            this.f17529b.f17209j = 1;
            this.f17529b.a().F().b("Successfully registered trigger URI", this.f17528a.f17158a);
            this.f17529b.H0();
        }
    }

    @Override // z0.InterfaceC4257a
    public final void b(Throwable th) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this.f17529b.k();
        this.f17529b.f17208i = false;
        if (!this.f17529b.b().q(G.f17259O0)) {
            this.f17529b.H0();
            this.f17529b.a().G().b("registerTriggerAsync failed with throwable", th);
            return;
        }
        if (this.f17529b.b().q(G.f17255M0)) {
            i8 = F3.C(this.f17529b, th);
        } else {
            i8 = 2;
        }
        int i13 = i8 - 1;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    this.f17529b.a().G().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C2401n2.s(this.f17529b.m().F()), th);
                    c();
                    this.f17529b.f17209j = 1;
                    this.f17529b.H0();
                    return;
                }
                return;
            }
            this.f17529b.A0().add(this.f17528a);
            i9 = this.f17529b.f17209j;
            if (i9 > 32) {
                this.f17529b.f17209j = 1;
                this.f17529b.a().L().c("registerTriggerAsync failed. May try later. App ID, throwable", C2401n2.s(this.f17529b.m().F()), C2401n2.s(th.toString()));
                return;
            }
            C2415p2 L8 = this.f17529b.a().L();
            Object s8 = C2401n2.s(this.f17529b.m().F());
            i10 = this.f17529b.f17209j;
            L8.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", s8, C2401n2.s(String.valueOf(i10)), C2401n2.s(th.toString()));
            F3 f32 = this.f17529b;
            i11 = f32.f17209j;
            F3.P0(f32, i11);
            F3 f33 = this.f17529b;
            i12 = f33.f17209j;
            f33.f17209j = i12 << 1;
            return;
        }
        this.f17529b.a().L().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C2401n2.s(this.f17529b.m().F()), C2401n2.s(th.toString()));
        this.f17529b.f17209j = 1;
        this.f17529b.A0().add(this.f17528a);
    }
}
