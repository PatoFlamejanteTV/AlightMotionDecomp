package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C2390l5;
import l0.InterfaceC3296B;

@TargetApi(24)
/* loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC3296B {

    /* renamed from: a, reason: collision with root package name */
    private C2390l5 f17103a;

    private final C2390l5 d() {
        if (this.f17103a == null) {
            this.f17103a = new C2390l5(this);
        }
        return this.f17103a;
    }

    @Override // l0.InterfaceC3296B
    public final boolean a(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // l0.InterfaceC3296B
    public final void b(Intent intent) {
    }

    @Override // l0.InterfaceC3296B
    public final void c(JobParameters jobParameters, boolean z8) {
        jobFinished(jobParameters, false);
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return d().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().k(intent);
    }
}
