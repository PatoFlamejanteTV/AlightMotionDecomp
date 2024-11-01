package androidx.compose.runtime;

import Q5.s;
import Q5.t;
import U5.g;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.C3472p;
import n6.InterfaceC3470o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) AbstractC3458i.e(C3445b0.c().E(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC2072n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b
    public /* synthetic */ g.c getKey() {
        return h.a(this);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public U5.g minusKey(g.c cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g
    public U5.g plus(U5.g gVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, gVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public <R> Object withFrameNanos(final Function1 function1, U5.d dVar) {
        final C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b9;
                InterfaceC3470o interfaceC3470o = InterfaceC3470o.this;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                Function1 function12 = function1;
                try {
                    s.a aVar = s.f8810b;
                    b9 = s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = s.f8810b;
                    b9 = s.b(t.a(th));
                }
                interfaceC3470o.resumeWith(b9);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        c3472p.f(new DefaultChoreographerFrameClock$withFrameNanos$2$1(frameCallback));
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }
}
