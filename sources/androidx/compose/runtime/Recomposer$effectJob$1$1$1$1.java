package androidx.compose.runtime;

import Q5.AbstractC1410e;
import Q5.I;
import androidx.compose.runtime.Recomposer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import q6.w;

/* loaded from: classes.dex */
final class Recomposer$effectJob$1$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Throwable $throwable;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$effectJob$1$1$1$1(Recomposer recomposer, Throwable th) {
        super(1);
        this.this$0 = recomposer;
        this.$throwable = th;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        w wVar;
        Object obj = this.this$0.stateLock;
        Recomposer recomposer = this.this$0;
        Throwable th2 = this.$throwable;
        synchronized (obj) {
            if (th2 == null) {
                th2 = null;
            } else if (th != null) {
                try {
                    if (th instanceof CancellationException) {
                        th = null;
                    }
                    if (th != null) {
                        AbstractC1410e.a(th2, th);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th2;
            wVar = recomposer._state;
            wVar.setValue(Recomposer.State.ShutDown);
            I i8 = I.f8786a;
        }
    }
}
