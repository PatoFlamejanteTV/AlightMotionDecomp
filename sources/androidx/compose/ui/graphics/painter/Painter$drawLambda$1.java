package androidx.compose.ui.graphics.painter;

import Q5.I;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class Painter$drawLambda$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Painter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Painter$drawLambda$1(Painter painter) {
        super(1);
        this.this$0 = painter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((DrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(DrawScope drawScope) {
        this.this$0.onDraw(drawScope);
    }
}
