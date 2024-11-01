package androidx.compose.material;

import Q5.I;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRail$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2073o $content;
    final /* synthetic */ InterfaceC2073o $header;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$NavigationRail$1(InterfaceC2073o interfaceC2073o, int i8, InterfaceC2073o interfaceC2073o2) {
        super(2);
        this.$header = interfaceC2073o;
        this.$$dirty = i8;
        this.$content = interfaceC2073o2;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        float f8;
        float f9;
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1571506489, i8, -1, "androidx.compose.material.NavigationRail.<anonymous> (NavigationRail.kt:105)");
        }
        Modifier.Companion companion = Modifier.Companion;
        Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
        f8 = NavigationRailKt.NavigationRailPadding;
        Modifier selectableGroup = SelectableGroupKt.selectableGroup(PaddingKt.m579paddingVpY3zN4$default(fillMaxHeight$default, 0.0f, f8, 1, null));
        Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
        InterfaceC2073o interfaceC2073o = this.$header;
        int i9 = this.$$dirty;
        InterfaceC2073o interfaceC2073o2 = this.$content;
        composer.startReplaceableGroup(-483455358);
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(selectableGroup);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(65525382);
        if (interfaceC2073o != null) {
            interfaceC2073o.invoke(columnScopeInstance, composer, Integer.valueOf(((i9 >> 9) & 112) | 6));
            f9 = NavigationRailKt.HeaderPadding;
            SpacerKt.Spacer(SizeKt.m610height3ABfNKs(companion, f9), composer, 6);
        }
        composer.endReplaceableGroup();
        interfaceC2073o2.invoke(columnScopeInstance, composer, Integer.valueOf(((i9 >> 12) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
