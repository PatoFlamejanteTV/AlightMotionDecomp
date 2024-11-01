package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import l0.InterfaceC3296B;

/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2390l5 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17935a;

    public C2390l5(Context context) {
        AbstractC1396p.l(context);
        this.f17935a = context;
    }

    private final void f(Runnable runnable) {
        H5 j8 = H5.j(this.f17935a);
        j8.f().D(new RunnableC2397m5(this, j8, runnable));
    }

    private final C2401n2 j() {
        return S2.b(this.f17935a, null, null).a();
    }

    public final int a(final Intent intent, int i8, final int i9) {
        final C2401n2 a9 = S2.b(this.f17935a, null, null).a();
        if (intent == null) {
            a9.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        a9.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i9), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                @Override // java.lang.Runnable
                public final void run() {
                    C2390l5.this.d(i9, a9, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new X2(H5.j(this.f17935a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        S2.b(this.f17935a, null, null).a().K().a("Local AppMeasurementService is starting up");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i8, C2401n2 c2401n2, Intent intent) {
        if (((InterfaceC3296B) this.f17935a).a(i8)) {
            c2401n2.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i8));
            j().K().a("Completed wakeful intent.");
            ((InterfaceC3296B) this.f17935a).b(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(C2401n2 c2401n2, JobParameters jobParameters) {
        c2401n2.K().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC3296B) this.f17935a).c(jobParameters, false);
    }

    public final boolean g(final JobParameters jobParameters) {
        final C2401n2 a9 = S2.b(this.f17935a, null, null).a();
        String string = jobParameters.getExtras().getString("action");
        a9.K().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            f(new Runnable() { // from class: com.google.android.gms.measurement.internal.k5
                @Override // java.lang.Runnable
                public final void run() {
                    C2390l5.this.e(a9, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    public final void h() {
        S2.b(this.f17935a, null, null).a().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().K().b("onRebind called. action", intent.getAction());
        }
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
