package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CombinedClickablePointerInputNode$pointerInput$5 extends AbstractC3293z implements Function1 {
    final /* synthetic */ CombinedClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickablePointerInputNode$pointerInput$5(CombinedClickablePointerInputNode combinedClickablePointerInputNode) {
        super(1);
        this.this$0 = combinedClickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m313invokek4lQ0M(((Offset) obj).m2722unboximpl());
        return I.f8786a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m313invokek4lQ0M(long j8) {
        if (this.this$0.getEnabled()) {
            this.this$0.getOnClick().invoke();
        }
    }
}
