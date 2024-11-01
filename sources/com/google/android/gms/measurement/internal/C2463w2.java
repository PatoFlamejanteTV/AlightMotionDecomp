package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2463w2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final H5 f18096a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f18097b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18098c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2463w2(H5 h52) {
        AbstractC1396p.l(h52);
        this.f18096a = h52;
    }

    public final void b() {
        this.f18096a.A0();
        this.f18096a.f().k();
        if (this.f18097b) {
            return;
        }
        this.f18096a.w().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f18098c = this.f18096a.p0().C();
        this.f18096a.a().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f18098c));
        this.f18097b = true;
    }

    public final void c() {
        this.f18096a.A0();
        this.f18096a.f().k();
        this.f18096a.f().k();
        if (!this.f18097b) {
            return;
        }
        this.f18096a.a().K().a("Unregistering connectivity change receiver");
        this.f18097b = false;
        this.f18098c = false;
        try {
            this.f18096a.w().unregisterReceiver(this);
        } catch (IllegalArgumentException e8) {
            this.f18096a.a().G().b("Failed to unregister the network broadcast receiver", e8);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f18096a.A0();
        String action = intent.getAction();
        this.f18096a.a().K().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean C8 = this.f18096a.p0().C();
            if (this.f18098c != C8) {
                this.f18098c = C8;
                this.f18096a.f().D(new RunnableC2456v2(this, C8));
                return;
            }
            return;
        }
        this.f18096a.a().L().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
