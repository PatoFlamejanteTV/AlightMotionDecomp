package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2106c0;
import com.google.android.gms.internal.measurement.InterfaceC2115d0;

/* loaded from: classes3.dex */
public final class G2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f17347a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ E2 f17348b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public G2(E2 e22, String str) {
        this.f17348b = e22;
        this.f17347a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f17348b.f17196a.a().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC2115d0 i8 = AbstractBinderC2106c0.i(iBinder);
            if (i8 == null) {
                this.f17348b.f17196a.a().L().a("Install Referrer Service implementation was not found");
            } else {
                this.f17348b.f17196a.a().K().a("Install Referrer Service connected");
                this.f17348b.f17196a.f().D(new F2(this, i8, this));
            }
        } catch (RuntimeException e8) {
            this.f17348b.f17196a.a().L().b("Exception occurred while calling Install Referrer API", e8);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17348b.f17196a.a().K().a("Install Referrer Service disconnected");
    }
}
