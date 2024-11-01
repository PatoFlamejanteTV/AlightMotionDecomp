package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BorderKt$drawContentWithoutBorder$1 extends AbstractC3293z implements Function1 {
    public static final BorderKt$drawContentWithoutBorder$1 INSTANCE = new BorderKt$drawContentWithoutBorder$1();

    BorderKt$drawContentWithoutBorder$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        AbstractC3292y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
    }
}
