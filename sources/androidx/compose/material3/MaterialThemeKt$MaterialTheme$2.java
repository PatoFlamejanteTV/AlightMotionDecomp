package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MaterialThemeKt$MaterialTheme$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ColorScheme $colorScheme;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ Shapes $shapes;
    final /* synthetic */ Typography $typography;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialThemeKt$MaterialTheme$2(ColorScheme colorScheme, Shapes shapes, Typography typography, InterfaceC2072n interfaceC2072n, int i8, int i9) {
        super(2);
        this.$colorScheme = colorScheme;
        this.$shapes = shapes;
        this.$typography = typography;
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
        MaterialThemeKt.MaterialTheme(this.$colorScheme, this.$shapes, this.$typography, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
