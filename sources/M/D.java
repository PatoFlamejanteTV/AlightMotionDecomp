package M;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import e0.AbstractC2781e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class D {

    /* renamed from: e */
    private static D f5435e;

    /* renamed from: a */
    private final Context f5436a;

    /* renamed from: b */
    private final ScheduledExecutorService f5437b;

    /* renamed from: c */
    private x f5438c = new x(this, null);

    /* renamed from: d */
    private int f5439d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f5437b = scheduledExecutorService;
        this.f5436a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(D d8) {
        return d8.f5436a;
    }

    public static synchronized D b(Context context) {
        D d8;
        synchronized (D.class) {
            try {
                if (f5435e == null) {
                    AbstractC2781e.a();
                    f5435e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new W.a("MessengerIpcClient"))));
                }
                d8 = f5435e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return d8;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(D d8) {
        return d8.f5437b;
    }

    private final synchronized int f() {
        int i8;
        i8 = this.f5439d;
        this.f5439d = i8 + 1;
        return i8;
    }

    private final synchronized Task g(A a9) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a9.toString()));
            }
            if (!this.f5438c.g(a9)) {
                x xVar = new x(this, null);
                this.f5438c = xVar;
                xVar.g(a9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a9.f5432b.a();
    }

    public final Task c(int i8, Bundle bundle) {
        return g(new z(f(), i8, bundle));
    }

    public final Task d(int i8, Bundle bundle) {
        return g(new C(f(), i8, bundle));
    }
}
