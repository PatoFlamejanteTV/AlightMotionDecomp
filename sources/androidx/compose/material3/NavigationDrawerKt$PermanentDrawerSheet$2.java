package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$PermanentDrawerSheet$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ long $drawerContainerColor;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ float $drawerTonalElevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$PermanentDrawerSheet$2(Modifier modifier, Shape shape, long j8, long j9, float f8, WindowInsets windowInsets, InterfaceC2073o interfaceC2073o, int i8, int i9) {
        super(2);
        this.$modifier = modifier;
        this.$drawerShape = shape;
        this.$drawerContainerColor = j8;
        this.$drawerContentColor = j9;
        this.$drawerTonalElevation = f8;
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
        NavigationDrawerKt.m1693PermanentDrawerSheetafqeVBk(this.$modifier, this.$drawerShape, this.$drawerContainerColor, this.$drawerContentColor, this.$drawerTonalElevation, this.$windowInsets, this.$content, composer, this.$$changed | 1, this.$$default);
    }
}
