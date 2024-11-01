package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2466w5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2418p5 f18110a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2466w5(C2418p5 c2418p5) {
        this.f18110a = c2418p5;
    }

    private final void c(long j8, boolean z8) {
        this.f18110a.k();
        if (!this.f18110a.f18099a.m()) {
            return;
        }
        this.f18110a.e().f18159r.b(j8);
        this.f18110a.a().K().b("Session started, time", Long.valueOf(this.f18110a.x().elapsedRealtime()));
        long j9 = j8 / 1000;
        this.f18110a.o().i0("auto", "_sid", Long.valueOf(j9), j8);
        this.f18110a.e().f18160s.b(j9);
        this.f18110a.e().f18155n.a(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j9);
        this.f18110a.o().c0("auto", "_s", j8, bundle);
        String a9 = this.f18110a.e().f18165x.a();
        if (!TextUtils.isEmpty(a9)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", a9);
            this.f18110a.o().c0("auto", "_ssr", j8, bundle2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.f18110a.k();
        if (this.f18110a.e().z(this.f18110a.x().currentTimeMillis())) {
            this.f18110a.e().f18155n.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f18110a.a().K().a("Detected application was in foreground");
                c(this.f18110a.x().currentTimeMillis(), false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j8, boolean z8) {
        this.f18110a.k();
        this.f18110a.G();
        if (this.f18110a.e().z(j8)) {
            this.f18110a.e().f18155n.a(true);
            this.f18110a.m().I();
        }
        this.f18110a.e().f18159r.b(j8);
        if (this.f18110a.e().f18155n.b()) {
            c(j8, z8);
        }
    }
}
