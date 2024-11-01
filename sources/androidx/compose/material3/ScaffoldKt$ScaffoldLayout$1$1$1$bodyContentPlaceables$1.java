package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $bottomBarHeight;
    final /* synthetic */ List<Placeable> $bottomBarPlaceables;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ WindowInsets $contentWindowInsets;
    final /* synthetic */ SubcomposeMeasureScope $this_SubcomposeLayout;
    final /* synthetic */ int $topBarHeight;
    final /* synthetic */ List<Placeable> $topBarPlaceables;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScaffoldKt$ScaffoldLayout$1$1$1$bodyContentPlaceables$1(WindowInsets windowInsets, SubcomposeMeasureScope subcomposeMeasureScope, List<? extends Placeable> list, int i8, List<? extends Placeable> list2, Integer num, InterfaceC2073o interfaceC2073o, int i9) {
        super(2);
        this.$contentWindowInsets = windowInsets;
        this.$this_SubcomposeLayout = subcomposeMeasureScope;
        this.$topBarPlaceables = list;
        this.$topBarHeight = i8;
        this.$bottomBarPlaceables = list2;
        this.$bottomBarHeight = num;
        this.$content = interfaceC2073o;
        this.$$dirty = i9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        float mo422toDpu2uoSUM;
        float mo527calculateBottomPaddingD9Ej5fM;
        Integer num;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1643221465, i8, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:222)");
        }
        PaddingValues asPaddingValues = WindowInsetsKt.asPaddingValues(this.$contentWindowInsets, this.$this_SubcomposeLayout);
        if (this.$topBarPlaceables.isEmpty()) {
            mo422toDpu2uoSUM = asPaddingValues.mo530calculateTopPaddingD9Ej5fM();
        } else {
            mo422toDpu2uoSUM = this.$this_SubcomposeLayout.mo422toDpu2uoSUM(this.$topBarHeight);
        }
        if (!this.$bottomBarPlaceables.isEmpty() && (num = this.$bottomBarHeight) != null) {
            mo527calculateBottomPaddingD9Ej5fM = this.$this_SubcomposeLayout.mo422toDpu2uoSUM(num.intValue());
        } else {
            mo527calculateBottomPaddingD9Ej5fM = asPaddingValues.mo527calculateBottomPaddingD9Ej5fM();
        }
        this.$content.invoke(PaddingKt.m573PaddingValuesa9UjIt4(PaddingKt.calculateStartPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), mo422toDpu2uoSUM, PaddingKt.calculateEndPadding(asPaddingValues, this.$this_SubcomposeLayout.getLayoutDirection()), mo527calculateBottomPaddingD9Ej5fM), composer, Integer.valueOf((this.$$dirty >> 3) & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
