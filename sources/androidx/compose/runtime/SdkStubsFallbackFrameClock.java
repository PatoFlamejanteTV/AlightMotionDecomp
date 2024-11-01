package androidx.compose.runtime;

import U5.g;
import androidx.compose.runtime.MonotonicFrameClock;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import n6.AbstractC3458i;
import n6.C3445b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SdkStubsFallbackFrameClock implements MonotonicFrameClock {
    private static final long DefaultFrameDelay = 16;
    public static final SdkStubsFallbackFrameClock INSTANCE = new SdkStubsFallbackFrameClock();

    private SdkStubsFallbackFrameClock() {
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
    public <R> Object withFrameNanos(Function1 function1, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.c(), new SdkStubsFallbackFrameClock$withFrameNanos$2(function1, null), dVar);
    }
}
