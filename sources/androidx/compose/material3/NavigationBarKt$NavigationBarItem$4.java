package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationBarKt$NavigationBarItem$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ NavigationBarItemColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ RowScope $this_NavigationBarItem;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationBarKt$NavigationBarItem$4(RowScope rowScope, boolean z8, Function0 function0, InterfaceC2072n interfaceC2072n, Modifier modifier, boolean z9, InterfaceC2072n interfaceC2072n2, boolean z10, NavigationBarItemColors navigationBarItemColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$this_NavigationBarItem = rowScope;
        this.$selected = z8;
        this.$onClick = function0;
        this.$icon = interfaceC2072n;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$label = interfaceC2072n2;
        this.$alwaysShowLabel = z10;
        this.$colors = navigationBarItemColors;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        NavigationBarKt.NavigationBarItem(this.$this_NavigationBarItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
