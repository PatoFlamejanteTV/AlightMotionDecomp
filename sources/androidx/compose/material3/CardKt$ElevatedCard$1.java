package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class CardKt$ElevatedCard$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CardColors $colors;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ CardElevation $elevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardKt$ElevatedCard$1(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$shape = shape;
        this.$colors = cardColors;
        this.$elevation = cardElevation;
        this.$content = interfaceC2073o;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        CardKt.ElevatedCard(this.$modifier, this.$shape, this.$colors, this.$elevation, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
