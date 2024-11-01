package androidx.compose.runtime;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.InterfaceC3470o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC3470o $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Latch$await$2$2(Latch latch, InterfaceC3470o interfaceC3470o) {
        super(1);
        this.this$0 = latch;
        this.$co = interfaceC3470o;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f8786a;
    }

    public final void invoke(Throwable th) {
        Object obj = this.this$0.lock;
        Latch latch = this.this$0;
        InterfaceC3470o interfaceC3470o = this.$co;
        synchronized (obj) {
            latch.awaiters.remove(interfaceC3470o);
            I i8 = I.f8786a;
        }
    }
}
