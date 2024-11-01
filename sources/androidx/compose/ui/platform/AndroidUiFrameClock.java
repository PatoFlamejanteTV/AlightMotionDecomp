package androidx.compose.ui.platform;

import Q5.s;
import U5.g;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import n6.InterfaceC3470o;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <R> R fold(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r8, interfaceC2072n);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b, U5.g
    public <E extends g.b> E get(g.c cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, U5.g.b
    public /* synthetic */ g.c getKey() {
        return androidx.compose.runtime.h.a(this);
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
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            g.b bVar = dVar.getContext().get(U5.e.f10146a0);
            if (bVar instanceof AndroidUiDispatcher) {
                androidUiDispatcher = (AndroidUiDispatcher) bVar;
            } else {
                androidUiDispatcher = null;
            }
        }
        final C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j8) {
                Object b9;
                InterfaceC3470o interfaceC3470o = InterfaceC3470o.this;
                Function1 function12 = function1;
                try {
                    s.a aVar = Q5.s.f8810b;
                    b9 = Q5.s.b(function12.invoke(Long.valueOf(j8)));
                } catch (Throwable th) {
                    s.a aVar2 = Q5.s.f8810b;
                    b9 = Q5.s.b(Q5.t.a(th));
                }
                interfaceC3470o.resumeWith(b9);
            }
        };
        if (androidUiDispatcher != null && AbstractC3292y.d(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            c3472p.f(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        } else {
            getChoreographer().postFrameCallback(frameCallback);
            c3472p.f(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }
}
