package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k0;
import java.util.concurrent.ExecutorService;
import q0.AbstractC3628n;
import q0.C3626l;
import q0.InterfaceC3620f;

/* renamed from: com.google.firebase.messaging.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractServiceC2577i extends Service {

    /* renamed from: b, reason: collision with root package name */
    private Binder f18689b;

    /* renamed from: d, reason: collision with root package name */
    private int f18691d;

    /* renamed from: a, reason: collision with root package name */
    final ExecutorService f18688a = AbstractC2583o.d();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18690c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private int f18692e = 0;

    /* renamed from: com.google.firebase.messaging.i$a */
    /* loaded from: classes4.dex */
    class a implements k0.a {
        a() {
        }

        @Override // com.google.firebase.messaging.k0.a
        public Task a(Intent intent) {
            return AbstractServiceC2577i.this.j(intent);
        }
    }

    private void d(Intent intent) {
        if (intent != null) {
            i0.c(intent);
        }
        synchronized (this.f18690c) {
            try {
                int i8 = this.f18692e - 1;
                this.f18692e = i8;
                if (i8 == 0) {
                    k(this.f18691d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(Intent intent, Task task) {
        d(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Intent intent, C3626l c3626l) {
        try {
            f(intent);
        } finally {
            c3626l.c(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task j(final Intent intent) {
        if (g(intent)) {
            return AbstractC3628n.e(null);
        }
        final C3626l c3626l = new C3626l();
        this.f18688a.execute(new Runnable() { // from class: com.google.firebase.messaging.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractServiceC2577i.this.i(intent, c3626l);
            }
        });
        return c3626l.a();
    }

    protected abstract Intent e(Intent intent);

    public abstract void f(Intent intent);

    public boolean g(Intent intent) {
        return false;
    }

    boolean k(int i8) {
        return stopSelfResult(i8);
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.f18689b == null) {
                this.f18689b = new k0(new a());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f18689b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f18688a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i8, int i9) {
        synchronized (this.f18690c) {
            this.f18691d = i9;
            this.f18692e++;
        }
        Intent e8 = e(intent);
        if (e8 == null) {
            d(intent);
            return 2;
        }
        Task j8 = j(e8);
        if (j8.m()) {
            d(intent);
            return 2;
        }
        j8.b(new androidx.privacysandbox.ads.adservices.adid.g(), new InterfaceC3620f() { // from class: com.google.firebase.messaging.g
            @Override // q0.InterfaceC3620f
            public final void a(Task task) {
                AbstractServiceC2577i.this.h(intent, task);
            }
        });
        return 3;
    }
}
