package s6;

import java.util.Collection;
import java.util.ServiceLoader;
import k6.AbstractC3258j;

/* renamed from: s6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3987g {

    /* renamed from: a, reason: collision with root package name */
    private static final Collection f39193a = AbstractC3258j.D(AbstractC3258j.c(ServiceLoader.load(n6.J.class, n6.J.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f39193a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
