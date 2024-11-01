package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AppBarKt$BottomAppBar$4 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $tonalElevation;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$4(Modifier modifier, long j8, long j9, float f8, PaddingValues paddingValues, WindowInsets windowInsets, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$containerColor = j8;
        this.$contentColor = j9;
        this.$tonalElevation = f8;
        this.$contentPadding = paddingValues;
        this.$windowInsets = windowInsets;
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
        AppBarKt.m1432BottomAppBar1oL4kX8(this.$modifier, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$contentPadding, this.$windowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
