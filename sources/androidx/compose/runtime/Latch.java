package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import n6.C3472p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class Latch {
    public static final int $stable = 8;
    private final Object lock = new Object();
    private List<U5.d> awaiters = new ArrayList();
    private List<U5.d> spareList = new ArrayList();
    private boolean _isOpen = true;

    public final Object await(U5.d dVar) {
        if (isOpen()) {
            return I.f8786a;
        }
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        synchronized (this.lock) {
            this.awaiters.add(c3472p);
        }
        c3472p.f(new Latch$await$2$2(this, c3472p));
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return I.f8786a;
    }

    public final void closeLatch() {
        synchronized (this.lock) {
            this._isOpen = false;
            I i8 = I.f8786a;
        }
    }

    public final boolean isOpen() {
        boolean z8;
        synchronized (this.lock) {
            z8 = this._isOpen;
        }
        return z8;
    }

    public final void openLatch() {
        synchronized (this.lock) {
            try {
                if (isOpen()) {
                    return;
                }
                List<U5.d> list = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = list;
                this._isOpen = true;
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    U5.d dVar = list.get(i8);
                    s.a aVar = s.f8810b;
                    dVar.resumeWith(s.b(I.f8786a));
                }
                list.clear();
                I i9 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <R> R withClosed(Function0 function0) {
        closeLatch();
        try {
            return (R) function0.invoke();
        } finally {
            AbstractC3290w.b(1);
            openLatch();
            AbstractC3290w.a(1);
        }
    }
}
