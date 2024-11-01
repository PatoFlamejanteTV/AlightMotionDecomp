package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class TabRowKt$ScrollableTabRow$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $selectedTabIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowKt$ScrollableTabRow$1(int i8) {
        super(3);
        this.$selectedTabIndex = i8;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((List<TabPosition>) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(List<TabPosition> tabPositions, Composer composer, int i8) {
        AbstractC3292y.i(tabPositions, "tabPositions");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-655609869, i8, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:229)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
        tabRowDefaults.m1356Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, tabPositions.get(this.$selectedTabIndex)), 0.0f, 0L, composer, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
