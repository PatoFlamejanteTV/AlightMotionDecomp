package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$NavigationDrawerItem$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2072n $badge;
    final /* synthetic */ NavigationDrawerItemColors $colors;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Shape $shape;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$NavigationDrawerItem$3(InterfaceC2072n interfaceC2072n, boolean z8, Function0 function0, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Shape shape, NavigationDrawerItemColors navigationDrawerItemColors, MutableInteractionSource mutableInteractionSource, int i8, int i9) {
        super(2);
        this.$label = interfaceC2072n;
        this.$selected = z8;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$icon = interfaceC2072n2;
        this.$badge = interfaceC2072n3;
        this.$shape = shape;
        this.$colors = navigationDrawerItemColors;
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
        NavigationDrawerKt.NavigationDrawerItem(this.$label, this.$selected, this.$onClick, this.$modifier, this.$icon, this.$badge, this.$shape, this.$colors, this.$interactionSource, composer, this.$$changed | 1, this.$$default);
    }
}
