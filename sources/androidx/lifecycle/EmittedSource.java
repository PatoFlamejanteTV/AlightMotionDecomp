package androidx.lifecycle;

import Q5.I;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3449d0;
import n6.N;

/* loaded from: classes3.dex */
public final class EmittedSource implements InterfaceC3449d0 {
    private boolean disposed;
    private final MediatorLiveData<?> mediator;
    private final LiveData<?> source;

    public EmittedSource(LiveData<?> source, MediatorLiveData<?> mediator) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(mediator, "mediator");
        this.source = source;
        this.mediator = mediator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public final void removeSource() {
        if (!this.disposed) {
            this.mediator.removeSource(this.source);
            this.disposed = true;
        }
    }

    @Override // n6.InterfaceC3449d0
    public void dispose() {
        AbstractC3462k.d(N.a(C3445b0.c().G()), null, null, new EmittedSource$dispose$1(this, null), 3, null);
    }

    public final Object disposeNow(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.c().G(), new EmittedSource$disposeNow$2(this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
