package com.google.android.gms.common.api.internal;

import N.C1339b;
import P.C1378b;
import Q.AbstractC1383c;
import Q.C1385e;
import Q.C1393m;
import Q.C1397q;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import q0.InterfaceC3620f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class r implements InterfaceC3620f {

    /* renamed from: a, reason: collision with root package name */
    private final C2085c f16163a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16164b;

    /* renamed from: c, reason: collision with root package name */
    private final C1378b f16165c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16166d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16167e;

    r(C2085c c2085c, int i8, C1378b c1378b, long j8, long j9, String str, String str2) {
        this.f16163a = c2085c;
        this.f16164b = i8;
        this.f16165c = c1378b;
        this.f16166d = j8;
        this.f16167e = j9;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r b(C2085c c2085c, int i8, C1378b c1378b) {
        boolean z8;
        long j8;
        long j9;
        if (c2085c.e()) {
            Q.r a9 = C1397q.b().a();
            if (a9 != null) {
                if (a9.v()) {
                    z8 = a9.y();
                    n t8 = c2085c.t(c1378b);
                    if (t8 != null) {
                        if (t8.v() instanceof AbstractC1383c) {
                            AbstractC1383c abstractC1383c = (AbstractC1383c) t8.v();
                            if (abstractC1383c.J() && !abstractC1383c.f()) {
                                C1385e c8 = c(t8, abstractC1383c, i8);
                                if (c8 != null) {
                                    t8.G();
                                    z8 = c8.z();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                z8 = true;
            }
            if (z8) {
                j8 = System.currentTimeMillis();
            } else {
                j8 = 0;
            }
            if (z8) {
                j9 = SystemClock.elapsedRealtime();
            } else {
                j9 = 0;
            }
            return new r(c2085c, i8, c1378b, j8, j9, null, null);
        }
        return null;
    }

    private static C1385e c(n nVar, AbstractC1383c abstractC1383c, int i8) {
        int[] u8;
        int[] v8;
        C1385e H8 = abstractC1383c.H();
        if (H8 == null || !H8.y() || ((u8 = H8.u()) != null ? !V.b.a(u8, i8) : !((v8 = H8.v()) == null || !V.b.a(v8, i8))) || nVar.t() >= H8.s()) {
            return null;
        }
        return H8;
    }

    @Override // q0.InterfaceC3620f
    public final void a(Task task) {
        n t8;
        boolean z8;
        int i8;
        int i9;
        int i10;
        int i11;
        int s8;
        long j8;
        long j9;
        int i12;
        if (this.f16163a.e()) {
            Q.r a9 = C1397q.b().a();
            if ((a9 == null || a9.v()) && (t8 = this.f16163a.t(this.f16165c)) != null && (t8.v() instanceof AbstractC1383c)) {
                AbstractC1383c abstractC1383c = (AbstractC1383c) t8.v();
                boolean z9 = true;
                if (this.f16166d > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int z10 = abstractC1383c.z();
                if (a9 != null) {
                    z8 &= a9.y();
                    int s9 = a9.s();
                    int u8 = a9.u();
                    i8 = a9.z();
                    if (abstractC1383c.J() && !abstractC1383c.f()) {
                        C1385e c8 = c(t8, abstractC1383c, this.f16164b);
                        if (c8 != null) {
                            if (!c8.z() || this.f16166d <= 0) {
                                z9 = false;
                            }
                            u8 = c8.s();
                            z8 = z9;
                        } else {
                            return;
                        }
                    }
                    i9 = s9;
                    i10 = u8;
                } else {
                    i8 = 0;
                    i9 = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
                    i10 = 100;
                }
                C2085c c2085c = this.f16163a;
                if (task.n()) {
                    i11 = 0;
                    s8 = 0;
                } else {
                    if (task.l()) {
                        i11 = 100;
                    } else {
                        Exception i13 = task.i();
                        if (i13 instanceof O.b) {
                            Status a10 = ((O.b) i13).a();
                            int v8 = a10.v();
                            C1339b s10 = a10.s();
                            if (s10 == null) {
                                i11 = v8;
                            } else {
                                s8 = s10.s();
                                i11 = v8;
                            }
                        } else {
                            i11 = 101;
                        }
                    }
                    s8 = -1;
                }
                if (z8) {
                    long j10 = this.f16166d;
                    long j11 = this.f16167e;
                    long currentTimeMillis = System.currentTimeMillis();
                    i12 = (int) (SystemClock.elapsedRealtime() - j11);
                    j8 = j10;
                    j9 = currentTimeMillis;
                } else {
                    j8 = 0;
                    j9 = 0;
                    i12 = -1;
                }
                c2085c.C(new C1393m(this.f16164b, i11, s8, j8, j9, null, null, z10, i12), i8, i9, i10);
            }
        }
    }
}
