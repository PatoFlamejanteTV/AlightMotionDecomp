package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItem$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ RowScope $this_BottomNavigationItem;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomNavigationKt$BottomNavigationItem$3(RowScope rowScope, boolean z8, Function0 function0, InterfaceC2072n interfaceC2072n, Modifier modifier, boolean z9, InterfaceC2072n interfaceC2072n2, boolean z10, MutableInteractionSource mutableInteractionSource, long j8, long j9, int i8, int i9, int i10) {
        super(2);
        this.$this_BottomNavigationItem = rowScope;
        this.$selected = z8;
        this.$onClick = function0;
        this.$icon = interfaceC2072n;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$label = interfaceC2072n2;
        this.$alwaysShowLabel = z10;
        this.$interactionSource = mutableInteractionSource;
        this.$selectedContentColor = j8;
        this.$unselectedContentColor = j9;
        this.$$changed = i8;
        this.$$changed1 = i9;
        this.$$default = i10;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        BottomNavigationKt.m1101BottomNavigationItemjY6E1Zs(this.$this_BottomNavigationItem, this.$selected, this.$onClick, this.$icon, this.$modifier, this.$enabled, this.$label, this.$alwaysShowLabel, this.$interactionSource, this.$selectedContentColor, this.$unselectedContentColor, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
