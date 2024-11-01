package androidx.compose.runtime;

import Q5.I;
import Q5.s;
import androidx.compose.runtime.Recomposer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3467m0;
import n6.InterfaceC3470o;
import q6.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$broadcastFrameClock$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$broadcastFrameClock$1(Recomposer recomposer) {
        super(0);
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2458invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2458invoke() {
        InterfaceC3470o deriveStateLocked;
        w wVar;
        Throwable th;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        synchronized (obj) {
            deriveStateLocked = recomposer.deriveStateLocked();
            wVar = recomposer._state;
            if (((Recomposer.State) wVar.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                th = recomposer.closeCause;
                throw AbstractC3467m0.a("Recomposer shutdown; frame clock awaiter will never resume", th);
            }
        }
        if (deriveStateLocked != null) {
            s.a aVar = s.f8810b;
            deriveStateLocked.resumeWith(s.b(I.f8786a));
        }
    }
}
