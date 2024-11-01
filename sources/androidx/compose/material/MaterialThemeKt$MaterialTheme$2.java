package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Colors $colors;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Shapes $shapes;
    final /* synthetic */ Typography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$2(Colors colors, Typography typography, Shapes shapes, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$colors = colors;
        this.$typography = typography;
        this.$shapes = shapes;
        this.$content = interfaceC2072n;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        MaterialThemeKt.MaterialTheme(this.$colors, this.$typography, this.$shapes, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
