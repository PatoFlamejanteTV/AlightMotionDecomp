package androidx.compose.ui.graphics.vector;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class VectorPainter$vector$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ VectorPainter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VectorPainter$vector$1$1(VectorPainter vectorPainter) {
        super(0);
        this.this$0 = vectorPainter;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m3523invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m3523invoke() {
        int i8;
        int invalidateCount;
        int invalidateCount2;
        i8 = this.this$0.drawCount;
        invalidateCount = this.this$0.getInvalidateCount();
        if (i8 == invalidateCount) {
            VectorPainter vectorPainter = this.this$0;
            invalidateCount2 = vectorPainter.getInvalidateCount();
            vectorPainter.setInvalidateCount(invalidateCount2 + 1);
        }
    }
}
