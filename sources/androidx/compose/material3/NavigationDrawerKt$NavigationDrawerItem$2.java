package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationDrawerKt$NavigationDrawerItem$2 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $badge;
    final /* synthetic */ NavigationDrawerItemColors $colors;
    final /* synthetic */ InterfaceC2072n $icon;
    final /* synthetic */ InterfaceC2072n $label;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$NavigationDrawerItem$2(InterfaceC2072n interfaceC2072n, NavigationDrawerItemColors navigationDrawerItemColors, boolean z8, int i8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3) {
        super(2);
        this.$icon = interfaceC2072n;
        this.$colors = navigationDrawerItemColors;
        this.$selected = z8;
        this.$$dirty = i8;
        this.$badge = interfaceC2072n2;
        this.$label = interfaceC2072n3;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(191488423, i8, -1, "androidx.compose.material3.NavigationDrawerItem.<anonymous> (NavigationDrawer.kt:679)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(companion, Dp.m5155constructorimpl(16), 0.0f, Dp.m5155constructorimpl(24), 0.0f, 10, null);
        Alignment.Companion companion2 = Alignment.Companion;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        InterfaceC2072n interfaceC2072n = this.$icon;
        NavigationDrawerItemColors navigationDrawerItemColors = this.$colors;
        boolean z8 = this.$selected;
        int i9 = this.$$dirty;
        InterfaceC2072n interfaceC2072n2 = this.$badge;
        InterfaceC2072n interfaceC2072n3 = this.$label;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC2073o materializerOf = LayoutKt.materializerOf(m581paddingqDBjuR0$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, density, companion3.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-678309503);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer.startReplaceableGroup(1789891011);
        composer.startReplaceableGroup(-1538531826);
        if (interfaceC2072n != null) {
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(navigationDrawerItemColors.iconColor(z8, composer, ((i9 >> 3) & 14) | ((i9 >> 18) & 112)).getValue().m2958unboximpl()))}, interfaceC2072n, composer, ((i9 >> 9) & 112) | 8);
            SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, Dp.m5155constructorimpl(12)), composer, 6);
        }
        composer.endReplaceableGroup();
        Modifier a9 = e.a(rowScopeInstance, companion, 1.0f, false, 2, null);
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor2 = companion3.getConstructor();
        InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(a9);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor2);
        } else {
            composer.useNode();
        }
        composer.disableReusing();
        Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl2, density2, companion3.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1847258627);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(navigationDrawerItemColors.textColor(z8, composer, ((i9 >> 3) & 14) | ((i9 >> 18) & 112)).getValue().m2958unboximpl()))}, interfaceC2072n3, composer, ((i9 << 3) & 112) | 8);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (interfaceC2072n2 != null) {
            SpacerKt.Spacer(SizeKt.m629width3ABfNKs(companion, Dp.m5155constructorimpl(12)), composer, 6);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(navigationDrawerItemColors.badgeColor(z8, composer, ((i9 >> 3) & 14) | ((i9 >> 18) & 112)).getValue().m2958unboximpl()))}, interfaceC2072n2, composer, ((i9 >> 12) & 112) | 8);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
