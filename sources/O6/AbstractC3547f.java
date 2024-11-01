package o6;

import Q5.s;
import Q5.t;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3547f {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC3546e f36061a;
    private static volatile Choreographer choreographer;

    static {
        Object b9;
        Object obj = null;
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(new C3545d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        if (!s.g(b9)) {
            obj = b9;
        }
        f36061a = (AbstractC3546e) obj;
    }

    public static final Handler a(Looper looper, boolean z8) {
        if (z8) {
            if (Build.VERSION.SDK_INT >= 28) {
                Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
                AbstractC3292y.g(invoke, "null cannot be cast to non-null type android.os.Handler");
                return (Handler) invoke;
            }
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        return new Handler(looper);
    }

    public static final AbstractC3546e b(Handler handler, String str) {
        return new C3545d(handler, str);
    }
}
