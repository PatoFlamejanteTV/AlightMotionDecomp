package androidx.compose.foundation;

import Q5.I;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;

/* loaded from: classes.dex */
final class BorderModifierNode$drawGenericBorder$3 extends AbstractC3293z implements Function1 {
    final /* synthetic */ T $cacheImageBitmap;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ Rect $pathBounds;
    final /* synthetic */ long $pathBoundsSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$3(Rect rect, T t8, long j8, ColorFilter colorFilter) {
        super(1);
        this.$pathBounds = rect;
        this.$cacheImageBitmap = t8;
        this.$pathBoundsSize = j8;
        this.$colorFilter = colorFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ContentDrawScope) obj);
        return I.f8786a;
    }

    public final void invoke(ContentDrawScope onDrawWithContent) {
        AbstractC3292y.i(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        float left = this.$pathBounds.getLeft();
        float top = this.$pathBounds.getTop();
        T t8 = this.$cacheImageBitmap;
        long j8 = this.$pathBoundsSize;
        ColorFilter colorFilter = this.$colorFilter;
        onDrawWithContent.getDrawContext().getTransform().translate(left, top);
        androidx.compose.ui.graphics.drawscope.c.z(onDrawWithContent, (ImageBitmap) t8.f34573a, 0L, j8, 0L, 0L, 0.0f, null, colorFilter, 0, 0, 890, null);
        onDrawWithContent.getDrawContext().getTransform().translate(-left, -top);
    }
}
