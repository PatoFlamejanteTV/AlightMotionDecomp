package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BorderKt$drawRectBorder$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ long $rectTopLeft;
    final /* synthetic */ long $size;
    final /* synthetic */ DrawStyle $style;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRectBorder$1(Brush brush, long j8, long j9, DrawStyle drawStyle) {
        super(1);
        this.$brush = brush;
        this.$rectTopLeft = j8;
        this.$size = j9;
        this.$style = drawStyle;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        AbstractC3292y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        androidx.compose.ui.graphics.drawscope.c.J(onDrawWithContent, this.$brush, this.$rectTopLeft, this.$size, 0.0f, this.$style, null, 0, 104, null);
    }
}
