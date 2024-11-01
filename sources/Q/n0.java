package Q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class n0 implements ServiceConnection, r0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8288a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f8289b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8290c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f8291d;

    /* renamed from: e, reason: collision with root package name */
    private final l0 f8292e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f8293f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q0 f8294g;

    public n0(q0 q0Var, l0 l0Var) {
        this.f8294g = q0Var;
        this.f8292e = l0Var;
    }

    public final int a() {
        return this.f8289b;
    }

    public final ComponentName b() {
        return this.f8293f;
    }

    public final IBinder c() {
        return this.f8291d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f8288a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        U.b bVar;
        Context context;
        Context context2;
        U.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j8;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f8289b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (V.k.l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            q0 q0Var = this.f8294g;
            bVar = q0Var.f8304j;
            context = q0Var.f8301g;
            l0 l0Var = this.f8292e;
            context2 = q0Var.f8301g;
            boolean d8 = bVar.d(context, str, l0Var.b(context2), this, 4225, executor);
            this.f8290c = d8;
            if (d8) {
                handler = this.f8294g.f8302h;
                Message obtainMessage = handler.obtainMessage(1, this.f8292e);
                handler2 = this.f8294g.f8302h;
                j8 = this.f8294g.f8306l;
                handler2.sendMessageDelayed(obtainMessage, j8);
            } else {
                this.f8289b = 2;
                try {
                    q0 q0Var2 = this.f8294g;
                    bVar2 = q0Var2.f8304j;
                    context3 = q0Var2.f8301g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f8288a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        U.b bVar;
        Context context;
        l0 l0Var = this.f8292e;
        handler = this.f8294g.f8302h;
        handler.removeMessages(1, l0Var);
        q0 q0Var = this.f8294g;
        bVar = q0Var.f8304j;
        context = q0Var.f8301g;
        bVar.c(context, this);
        this.f8290c = false;
        this.f8289b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f8288a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f8288a.isEmpty();
    }

    public final boolean j() {
        return this.f8290c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8294g.f8300f;
        synchronized (hashMap) {
            try {
                handler = this.f8294g.f8302h;
                handler.removeMessages(1, this.f8292e);
                this.f8291d = iBinder;
                this.f8293f = componentName;
                Iterator it = this.f8288a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8289b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8294g.f8300f;
        synchronized (hashMap) {
            try {
                handler = this.f8294g.f8302h;
                handler.removeMessages(1, this.f8292e);
                this.f8291d = null;
                this.f8293f = componentName;
                Iterator it = this.f8288a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8289b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
