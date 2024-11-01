package androidx.compose.ui.draw;

import Q5.I;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class CacheDrawScope$onDrawBehind$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$onDrawBehind$1(Function1 function1) {
        super(1);
        this.$block = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope contentDrawScope) {
        this.$block.invoke(contentDrawScope);
        contentDrawScope.drawContent();
    }
}
