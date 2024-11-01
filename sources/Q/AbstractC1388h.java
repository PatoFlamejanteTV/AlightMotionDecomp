package Q;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1388h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f8260a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static q0 f8261b = null;

    /* renamed from: c, reason: collision with root package name */
    static HandlerThread f8262c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Executor f8263d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f8264e = false;

    public static AbstractC1388h a(Context context) {
        Looper mainLooper;
        synchronized (f8260a) {
            try {
                if (f8261b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8264e) {
                        mainLooper = b().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    f8261b = new q0(applicationContext, mainLooper, f8263d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8261b;
    }

    public static HandlerThread b() {
        synchronized (f8260a) {
            try {
                HandlerThread handlerThread = f8262c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f8262c = handlerThread2;
                handlerThread2.start();
                return f8262c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract void c(l0 l0Var, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i8, ServiceConnection serviceConnection, String str3, boolean z8) {
        c(new l0(str, str2, 4225, z8), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean e(l0 l0Var, ServiceConnection serviceConnection, String str, Executor executor);
}
