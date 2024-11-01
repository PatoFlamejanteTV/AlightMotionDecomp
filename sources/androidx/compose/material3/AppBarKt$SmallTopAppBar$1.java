package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$SmallTopAppBar$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $actions;
    final /* synthetic */ TopAppBarColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ InterfaceC2072n $navigationIcon;
    final /* synthetic */ TopAppBarScrollBehavior $scrollBehavior;
    final /* synthetic */ InterfaceC2072n $title;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$SmallTopAppBar$1(InterfaceC2072n interfaceC2072n, Modifier modifier, InterfaceC2072n interfaceC2072n2, InterfaceC2073o interfaceC2073o, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i8, int i9) {
        super(2);
        this.$title = interfaceC2072n;
        this.$modifier = modifier;
        this.$navigationIcon = interfaceC2072n2;
        this.$actions = interfaceC2073o;
        this.$windowInsets = windowInsets;
        this.$colors = topAppBarColors;
        this.$scrollBehavior = topAppBarScrollBehavior;
        this.$$changed = i8;
        this.$$default = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        AppBarKt.SmallTopAppBar(this.$title, this.$modifier, this.$navigationIcon, this.$actions, this.$windowInsets, this.$colors, this.$scrollBehavior, composer, this.$$changed | 1, this.$$default);
    }
}
