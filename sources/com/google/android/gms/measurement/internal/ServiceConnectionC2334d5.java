package com.google.android.gms.measurement.internal;

import N.C1339b;
import Q.AbstractC1383c;
import Q.AbstractC1396p;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import l0.InterfaceC3306f;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC2334d5 implements ServiceConnection, AbstractC1383c.a, AbstractC1383c.b {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f17768a;

    /* renamed from: b, reason: collision with root package name */
    private volatile C2373j2 f17769b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ F4 f17770c;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC2334d5(F4 f42) {
        this.f17770c = f42;
    }

    public final void a() {
        this.f17770c.k();
        Context w8 = this.f17770c.w();
        synchronized (this) {
            try {
                if (this.f17768a) {
                    this.f17770c.a().K().a("Connection attempt already in progress");
                    return;
                }
                if (this.f17769b != null && (this.f17769b.f() || this.f17769b.h())) {
                    this.f17770c.a().K().a("Already awaiting connection attempt");
                    return;
                }
                this.f17769b = new C2373j2(w8, Looper.getMainLooper(), this, this);
                this.f17770c.a().K().a("Connecting to remote service");
                this.f17768a = true;
                AbstractC1396p.l(this.f17769b);
                this.f17769b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Intent intent) {
        ServiceConnectionC2334d5 serviceConnectionC2334d5;
        this.f17770c.k();
        Context w8 = this.f17770c.w();
        U.b b9 = U.b.b();
        synchronized (this) {
            try {
                if (this.f17768a) {
                    this.f17770c.a().K().a("Connection attempt already in progress");
                    return;
                }
                this.f17770c.a().K().a("Using local app measurement service");
                this.f17768a = true;
                serviceConnectionC2334d5 = this.f17770c.f17222c;
                b9.a(w8, intent, serviceConnectionC2334d5, TsExtractor.TS_STREAM_TYPE_AC3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f17769b != null && (this.f17769b.h() || this.f17769b.f())) {
            this.f17769b.b();
        }
        this.f17769b = null;
    }

    @Override // Q.AbstractC1383c.a
    public final void h(int i8) {
        AbstractC1396p.e("MeasurementServiceConnection.onConnectionSuspended");
        this.f17770c.a().F().a("Service connection suspended");
        this.f17770c.f().D(new RunnableC2362h5(this));
    }

    @Override // Q.AbstractC1383c.b
    public final void i(C1339b c1339b) {
        AbstractC1396p.e("MeasurementServiceConnection.onConnectionFailed");
        C2401n2 E8 = this.f17770c.f18099a.E();
        if (E8 != null) {
            E8.L().b("Service connection failed", c1339b);
        }
        synchronized (this) {
            this.f17768a = false;
            this.f17769b = null;
        }
        this.f17770c.f().D(new RunnableC2355g5(this));
    }

    @Override // Q.AbstractC1383c.a
    public final void k(Bundle bundle) {
        AbstractC1396p.e("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC1396p.l(this.f17769b);
                this.f17770c.f().D(new RunnableC2341e5(this, (InterfaceC3306f) this.f17769b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f17769b = null;
                this.f17768a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC2334d5 serviceConnectionC2334d5;
        InterfaceC3306f c2338e2;
        AbstractC1396p.e("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f17768a = false;
                this.f17770c.a().G().a("Service connected with null binder");
                return;
            }
            InterfaceC3306f interfaceC3306f = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC3306f) {
                        c2338e2 = (InterfaceC3306f) queryLocalInterface;
                    } else {
                        c2338e2 = new C2338e2(iBinder);
                    }
                    interfaceC3306f = c2338e2;
                    this.f17770c.a().K().a("Bound to IMeasurementService interface");
                } else {
                    this.f17770c.a().G().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f17770c.a().G().a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC3306f == null) {
                this.f17768a = false;
                try {
                    U.b b9 = U.b.b();
                    Context w8 = this.f17770c.w();
                    serviceConnectionC2334d5 = this.f17770c.f17222c;
                    b9.c(w8, serviceConnectionC2334d5);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f17770c.f().D(new RunnableC2327c5(this, interfaceC3306f));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC1396p.e("MeasurementServiceConnection.onServiceDisconnected");
        this.f17770c.a().F().a("Service disconnected");
        this.f17770c.f().D(new RunnableC2348f5(this, componentName));
    }
}
