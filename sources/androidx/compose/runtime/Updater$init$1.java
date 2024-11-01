package androidx.compose.runtime;

import Q5.I;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Updater$init$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ Function1 $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Updater$init$1(Function1 function1) {
        super(2);
        this.$block = function1;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Updater$init$1) obj, (I) obj2);
        return I.f8786a;
    }

    public final void invoke(T t8, I i8) {
        this.$block.invoke(t8);
    }
}
