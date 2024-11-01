package androidx.compose.foundation.text.selection;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SelectionManager$modifier$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$modifier$1(SelectionManager selectionManager) {
        super(0);
        this.this$0 = selectionManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1037invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1037invoke() {
        this.this$0.onRelease();
    }
}
