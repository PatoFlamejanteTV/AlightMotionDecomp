package androidx.compose.foundation;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImageKt$Image$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ float $alpha;
    final /* synthetic */ ColorFilter $colorFilter;
    final /* synthetic */ String $contentDescription;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Painter $painter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageKt$Image$3(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, int i9) {
        super(2);
        this.$painter = painter;
        this.$contentDescription = str;
        this.$modifier = modifier;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$alpha = f8;
        this.$colorFilter = colorFilter;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ImageKt.Image(this.$painter, this.$contentDescription, this.$modifier, this.$alignment, this.$contentScale, this.$alpha, this.$colorFilter, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
