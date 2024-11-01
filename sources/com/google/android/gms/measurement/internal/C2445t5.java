package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2445t5 {

    /* renamed from: a, reason: collision with root package name */
    private RunnableC2438s5 f18060a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2418p5 f18061b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2445t5(C2418p5 c2418p5) {
        this.f18061b = c2418p5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Handler handler;
        this.f18061b.k();
        if (this.f18060a != null) {
            handler = this.f18061b.f18012c;
            handler.removeCallbacks(this.f18060a);
        }
        this.f18061b.e().f18162u.a(false);
        this.f18061b.D(false);
        if (this.f18061b.b().q(G.f17255M0) && this.f18061b.o().J0()) {
            this.f18061b.a().K().a("Retrying trigger URI registration in foreground");
            this.f18061b.o().H0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8) {
        Handler handler;
        this.f18060a = new RunnableC2438s5(this, this.f18061b.x().currentTimeMillis(), j8);
        handler = this.f18061b.f18012c;
        handler.postDelayed(this.f18060a, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }
}
