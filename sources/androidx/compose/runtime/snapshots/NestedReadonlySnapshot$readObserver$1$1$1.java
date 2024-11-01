package androidx.compose.runtime.snapshots;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class NestedReadonlySnapshot$readObserver$1$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $it;
    final /* synthetic */ Function1 $readObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedReadonlySnapshot$readObserver$1$1$1(Function1 function1, Function1 function12) {
        super(1);
        this.$readObserver = function1;
        this.$it = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2566invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2566invoke(Object obj) {
        this.$readObserver.invoke(obj);
        this.$it.invoke(obj);
    }
}
