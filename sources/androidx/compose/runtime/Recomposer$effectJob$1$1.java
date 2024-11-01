package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3467m0;
import n6.InterfaceC3470o;
import n6.InterfaceC3488x0;
import q6.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$effectJob$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1(Recomposer recomposer) {
        super(1);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        InterfaceC3488x0 interfaceC3488x0;
        InterfaceC3470o interfaceC3470o;
        w wVar;
        w wVar2;
        boolean z8;
        InterfaceC3470o interfaceC3470o2;
        InterfaceC3470o interfaceC3470o3;
        CancellationException a9 = AbstractC3467m0.a("Recomposer effect job completed", th);
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            try {
                interfaceC3488x0 = recomposer.runnerJob;
                interfaceC3470o = null;
                if (interfaceC3488x0 != null) {
                    wVar2 = recomposer._state;
                    wVar2.setValue(Recomposer.State.ShuttingDown);
                    z8 = recomposer.isClosed;
                    if (z8) {
                        interfaceC3470o2 = recomposer.workContinuation;
                        if (interfaceC3470o2 != null) {
                            interfaceC3470o3 = recomposer.workContinuation;
                            recomposer.workContinuation = null;
                            interfaceC3488x0.u(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                            interfaceC3470o = interfaceC3470o3;
                        }
                    } else {
                        interfaceC3488x0.cancel(a9);
                    }
                    interfaceC3470o3 = null;
                    recomposer.workContinuation = null;
                    interfaceC3488x0.u(new Recomposer$effectJob$1$1$1$1(recomposer, th));
                    interfaceC3470o = interfaceC3470o3;
                } else {
                    recomposer.closeCause = a9;
                    wVar = recomposer._state;
                    wVar.setValue(Recomposer.State.ShutDown);
                    I i8 = I.f8786a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (interfaceC3470o != null) {
            s.a aVar = s.f8810b;
            interfaceC3470o.resumeWith(s.b(I.f8786a));
        }
    }
}
