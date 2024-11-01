package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n0;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q0.C3626l;
import q0.InterfaceC3620f;

/* loaded from: classes4.dex */
class n0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18710a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f18711b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f18712c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue f18713d;

    /* renamed from: e, reason: collision with root package name */
    private k0 f18714e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f18715f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f18716a;

        /* renamed from: b, reason: collision with root package name */
        private final C3626l f18717b = new C3626l();

        a(Intent intent) {
            this.f18716a = intent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.f18716a.getAction() + " finishing.");
            d();
        }

        void c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.messaging.l0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.this.f();
                }
            }, 20L, TimeUnit.SECONDS);
            e().b(scheduledExecutorService, new InterfaceC3620f() { // from class: com.google.firebase.messaging.m0
                @Override // q0.InterfaceC3620f
                public final void a(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void d() {
            this.f18717b.e(null);
        }

        Task e() {
            return this.f18717b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new W.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private void a() {
        while (!this.f18713d.isEmpty()) {
            ((a) this.f18713d.poll()).d();
        }
    }

    private synchronized void b() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f18713d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                k0 k0Var = this.f18714e;
                if (k0Var != null && k0Var.isBinderAlive()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    this.f18714e.c((a) this.f18713d.poll());
                } else {
                    d();
                    return;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f18715f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f18715f) {
            return;
        }
        this.f18715f = true;
        try {
        } catch (SecurityException e8) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e8);
        }
        if (U.b.b().a(this.f18710a, this.f18711b, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f18715f = false;
        a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Task c(Intent intent) {
        a aVar;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            aVar = new a(intent);
            aVar.c(this.f18712c);
            this.f18713d.add(aVar);
            b();
        } catch (Throwable th) {
            throw th;
        }
        return aVar.e();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f18715f = false;
            if (!(iBinder instanceof k0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
                a();
                return;
            }
            this.f18714e = (k0) iBinder;
            b();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        b();
    }

    n0(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f18713d = new ArrayDeque();
        this.f18715f = false;
        Context applicationContext = context.getApplicationContext();
        this.f18710a = applicationContext;
        this.f18711b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f18712c = scheduledExecutorService;
    }
}
