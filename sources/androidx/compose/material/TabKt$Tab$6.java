package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TabKt$Tab$6 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ long $selectedContentColor;
    final /* synthetic */ long $unselectedContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabKt$Tab$6(boolean z8, Function0 function0, Modifier modifier, boolean z9, MutableInteractionSource mutableInteractionSource, long j8, long j9, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$selected = z8;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$enabled = z9;
        this.$interactionSource = mutableInteractionSource;
        this.$selectedContentColor = j8;
        this.$unselectedContentColor = j9;
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
        TabKt.m1349TabEVJuX4I(this.$selected, this.$onClick, this.$modifier, this.$enabled, this.$interactionSource, this.$selectedContentColor, this.$unselectedContentColor, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
