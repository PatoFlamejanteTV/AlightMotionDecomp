package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public final class D5 extends E5 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f17189d;

    /* renamed from: e, reason: collision with root package name */
    private AbstractC2439t f17190e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f17191f;

    /* JADX INFO: Access modifiers changed from: protected */
    public D5(H5 h52) {
        super(h52);
        this.f17189d = (AlarmManager) w().getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private final int A() {
        if (this.f17191f == null) {
            this.f17191f = Integer.valueOf(("measurement" + w().getPackageName()).hashCode());
        }
        return this.f17191f.intValue();
    }

    private final PendingIntent B() {
        Context w8 = w();
        return com.google.android.gms.internal.measurement.B0.a(w8, 0, new Intent().setClassName(w8, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.B0.f16229a);
    }

    private final AbstractC2439t C() {
        if (this.f17190e == null) {
            this.f17190e = new C5(this, this.f17229b.t0());
        }
        return this.f17190e;
    }

    private final void D() {
        JobScheduler jobScheduler = (JobScheduler) w().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(A());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2377k n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2376j5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        AlarmManager alarmManager = this.f17189d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            D();
            return false;
        }
        return false;
    }

    public final void v(long j8) {
        r();
        Context w8 = w();
        if (!d6.d0(w8)) {
            a().F().a("Receiver not registered/enabled");
        }
        if (!d6.e0(w8, false)) {
            a().F().a("Service not registered/enabled");
        }
        z();
        a().K().b("Scheduling upload, millis", Long.valueOf(j8));
        long elapsedRealtime = x().elapsedRealtime() + j8;
        if (j8 < Math.max(0L, ((Long) G.f17345z.a(null)).longValue()) && !C().e()) {
            C().b(j8);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context w9 = w();
            ComponentName componentName = new ComponentName(w9, "com.google.android.gms.measurement.AppMeasurementJobService");
            int A8 = A();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            com.google.android.gms.internal.measurement.A0.c(w9, new JobInfo.Builder(A8, componentName).setMinimumLatency(j8).setOverrideDeadline(j8 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f17189d;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, elapsedRealtime, Math.max(((Long) G.f17335u.a(null)).longValue(), j8), B());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }

    public final void z() {
        r();
        a().K().a("Unscheduling upload");
        AlarmManager alarmManager = this.f17189d;
        if (alarmManager != null) {
            alarmManager.cancel(B());
        }
        C().a();
        if (Build.VERSION.SDK_INT >= 24) {
            D();
        }
    }
}
