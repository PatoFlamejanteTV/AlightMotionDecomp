package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.C2390l5;
import l0.InterfaceC3296B;

/* loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements InterfaceC3296B {

    /* renamed from: a, reason: collision with root package name */
    private C2390l5 f17105a;

    private final C2390l5 d() {
        if (this.f17105a == null) {
            this.f17105a = new C2390l5(this);
        }
        return this.f17105a;
    }

    @Override // l0.InterfaceC3296B
    public final boolean a(int i8) {
        return stopSelfResult(i8);
    }

    @Override // l0.InterfaceC3296B
    public final void b(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    @Override // l0.InterfaceC3296B
    public final void c(JobParameters jobParameters, boolean z8) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return d().b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i8, int i9) {
        return d().a(intent, i8, i9);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}
