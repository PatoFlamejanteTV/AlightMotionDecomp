package n6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: n6.C, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3437C {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f35625b = AtomicIntegerFieldUpdater.newUpdater(C3437C.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f35626a;

    public C3437C(Throwable th, boolean z8) {
        this.f35626a = th;
        this._handled = z8 ? 1 : 0;
    }

    public final boolean a() {
        if (f35625b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        return f35625b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return Q.a(this) + '[' + this.f35626a + ']';
    }

    public /* synthetic */ C3437C(Throwable th, boolean z8, int i8, AbstractC3284p abstractC3284p) {
        this(th, (i8 & 2) != 0 ? false : z8);
    }
}
