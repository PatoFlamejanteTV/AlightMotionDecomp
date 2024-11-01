package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BorderModifierNode$drawRoundRectBorder$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Brush $brush;
    final /* synthetic */ Path $roundedRectPath;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$2(Path path, Brush brush) {
        super(1);
        this.$roundedRectPath = path;
        this.$brush = brush;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        AbstractC3292y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        androidx.compose.ui.graphics.drawscope.c.F(onDrawWithContent, this.$roundedRectPath, this.$brush, 0.0f, null, null, 0, 60, null);
    }
}
