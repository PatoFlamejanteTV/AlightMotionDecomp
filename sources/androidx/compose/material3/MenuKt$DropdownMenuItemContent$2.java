package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class MenuKt$DropdownMenuItemContent$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MenuItemColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ InterfaceC2072n $leadingIcon;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0 $onClick;
    final /* synthetic */ InterfaceC2072n $text;
    final /* synthetic */ InterfaceC2072n $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuKt$DropdownMenuItemContent$2(InterfaceC2072n interfaceC2072n, Function0 function0, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, boolean z8, MenuItemColors menuItemColors, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i8) {
        super(2);
        this.$text = interfaceC2072n;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$leadingIcon = interfaceC2072n2;
        this.$trailingIcon = interfaceC2072n3;
        this.$enabled = z8;
        this.$colors = menuItemColors;
        this.$contentPadding = paddingValues;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        MenuKt.DropdownMenuItemContent(this.$text, this.$onClick, this.$modifier, this.$leadingIcon, this.$trailingIcon, this.$enabled, this.$colors, this.$contentPadding, this.$interactionSource, composer, this.$$changed | 1);
    }
}
