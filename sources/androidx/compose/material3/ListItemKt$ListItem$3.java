package androidx.compose.material3;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.e;
import androidx.compose.material3.tokens.ListTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ListItemKt$ListItem$3 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ListItemColors $colors;
    final /* synthetic */ InterfaceC2072n $headlineText;
    final /* synthetic */ InterfaceC2072n $leadingContent;
    final /* synthetic */ InterfaceC2072n $overlineText;
    final /* synthetic */ InterfaceC2072n $trailingContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListItemKt$ListItem$3(InterfaceC2072n interfaceC2072n, ListItemColors listItemColors, int i8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, InterfaceC2072n interfaceC2072n4) {
        super(3);
        this.$leadingContent = interfaceC2072n;
        this.$colors = listItemColors;
        this.$$dirty = i8;
        this.$trailingContent = interfaceC2072n2;
        this.$overlineText = interfaceC2072n3;
        this.$headlineText = interfaceC2072n4;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(RowScope ListItem, Composer composer, int i8) {
        int i9;
        InterfaceC2073o m1665trailingContentiJQMabo;
        InterfaceC2073o m1664leadingContentiJQMabo;
        AbstractC3292y.i(ListItem, "$this$ListItem");
        if ((i8 & 14) == 0) {
            i9 = i8 | (composer.changed(ListItem) ? 4 : 2);
        } else {
            i9 = i8;
        }
        if ((i9 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1733969726, i9, -1, "androidx.compose.material3.ListItem.<anonymous> (ListItem.kt:173)");
        }
        composer.startReplaceableGroup(1316675520);
        InterfaceC2072n interfaceC2072n = this.$leadingContent;
        if (interfaceC2072n != null) {
            m1664leadingContentiJQMabo = ListItemKt.m1664leadingContentiJQMabo(interfaceC2072n, this.$colors.leadingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2958unboximpl(), false, composer, ((this.$$dirty >> 12) & 14) | 384);
            m1664leadingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        composer.endReplaceableGroup();
        Modifier.Companion companion = Modifier.Companion;
        Modifier a9 = e.a(ListItem, companion, 1.0f, false, 2, null);
        Alignment.Companion companion2 = Alignment.Companion;
        Modifier align = ListItem.align(a9, companion2.getCenterVertically());
        ListItemColors listItemColors = this.$colors;
        int i10 = this.$$dirty;
        InterfaceC2072n interfaceC2072n2 = this.$overlineText;
        InterfaceC2072n interfaceC2072n3 = this.$headlineText;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC2073o materializerOf = LayoutKt.materializerOf(align);
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
        Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, density, companion3.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1917170824);
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        Density density2 = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection2 = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        Function0 constructor2 = companion3.getConstructor();
        InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(companion);
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
        Updater.m2480setimpl(m2473constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl2, density2, companion3.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        composer.startReplaceableGroup(-1163856341);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(562295746);
        long m2958unboximpl = listItemColors.overlineColor$material3_release(composer, (i10 >> 18) & 14).getValue().m2958unboximpl();
        ListTokens listTokens = ListTokens.INSTANCE;
        ListItemKt.m1659ProvideTextStyleFromToken3JVO9M(m2958unboximpl, listTokens.getListItemOverlineFont(), interfaceC2072n2, composer, (i10 & 896) | 48);
        ListItemKt.m1659ProvideTextStyleFromToken3JVO9M(listItemColors.headlineColor$material3_release(true, composer, ((i10 >> 15) & 112) | 6).getValue().m2958unboximpl(), listTokens.getListItemLabelTextFont(), interfaceC2072n3, composer, ((i10 << 6) & 896) | 48);
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        InterfaceC2072n interfaceC2072n4 = this.$trailingContent;
        if (interfaceC2072n4 != null) {
            m1665trailingContentiJQMabo = ListItemKt.m1665trailingContentiJQMabo(interfaceC2072n4, this.$colors.trailingIconColor$material3_release(true, composer, ((this.$$dirty >> 15) & 112) | 6).getValue().m2958unboximpl(), false, composer, ((this.$$dirty >> 15) & 14) | 384);
            m1665trailingContentiJQMabo.invoke(ListItem, composer, Integer.valueOf(i9 & 14));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
