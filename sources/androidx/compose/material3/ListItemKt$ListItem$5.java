package androidx.compose.material3;

import Q5.I;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$5 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ InterfaceC2072n $headlineText;
    final /* synthetic */ InterfaceC2072n $leadingContent;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC2072n $overlineText;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ InterfaceC2072n $supportingText;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ InterfaceC2072n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$5(InterfaceC2072n interfaceC2072n, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4, InterfaceC2072n interfaceC2072n5, ListItemColors listItemColors, float f8, float f9, int i8, int i9) {
        super(2);
        this.$headlineText = interfaceC2072n;
        this.$modifier = modifier;
        this.$overlineText = interfaceC2072n2;
        this.$supportingText = interfaceC2072n3;
        this.$leadingContent = interfaceC2072n4;
        this.$trailingContent = interfaceC2072n5;
        this.$colors = listItemColors;
        this.$tonalElevation = f8;
        this.$shadowElevation = f9;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ListItemKt.m1657ListItemHXNGIdc(this.$headlineText, this.$modifier, this.$overlineText, this.$supportingText, this.$leadingContent, this.$trailingContent, this.$colors, this.$tonalElevation, this.$shadowElevation, composer, this.$$changed | 1, this.$$default);
    }
}
