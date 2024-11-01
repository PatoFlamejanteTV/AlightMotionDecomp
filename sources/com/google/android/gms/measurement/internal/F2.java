package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC2115d0;
import com.google.android.gms.internal.measurement.Q6;

/* loaded from: classes3.dex */
final class F2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ InterfaceC2115d0 f17199a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f17200b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ G2 f17201c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F2(G2 g22, InterfaceC2115d0 interfaceC2115d0, ServiceConnection serviceConnection) {
        this.f17199a = interfaceC2115d0;
        this.f17200b = serviceConnection;
        this.f17201c = g22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean z8;
        G2 g22 = this.f17201c;
        E2 e22 = g22.f17348b;
        str = g22.f17347a;
        InterfaceC2115d0 interfaceC2115d0 = this.f17199a;
        ServiceConnection serviceConnection = this.f17200b;
        Bundle a9 = e22.a(str, interfaceC2115d0);
        e22.f17196a.f().k();
        e22.f17196a.Q();
        if (a9 != null) {
            long j8 = a9.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                e22.f17196a.a().L().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a9.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    e22.f17196a.a().K().b("InstallReferrer API result", string);
                    if (Q6.a() && e22.f17196a.z().q(G.f17273V0)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Bundle C8 = e22.f17196a.L().C(Uri.parse("?" + string), z8);
                    if (C8 == null) {
                        e22.f17196a.a().G().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (z8) {
                            if (C8.containsKey("gclid") || C8.containsKey("gbraid")) {
                                long j9 = a9.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j9 > 0) {
                                    C8.putLong("click_timestamp", j9);
                                }
                            }
                        } else {
                            String string2 = C8.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j10 = a9.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j10 == 0) {
                                    e22.f17196a.a().G().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    C8.putLong("click_timestamp", j10);
                                }
                            }
                        }
                        if (j8 == e22.f17196a.F().f18149h.a()) {
                            e22.f17196a.a().K().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (e22.f17196a.m()) {
                            e22.f17196a.F().f18149h.b(j8);
                            e22.f17196a.a().K().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            C8.putString("_cis", "referrer API v2");
                            e22.f17196a.H().g0("auto", "_cmp", C8, str);
                        }
                    }
                } else {
                    e22.f17196a.a().G().a("No referrer defined in Install Referrer response");
                }
            }
        }
        if (serviceConnection != null) {
            U.b.b().c(e22.f17196a.w(), serviceConnection);
        }
    }
}
