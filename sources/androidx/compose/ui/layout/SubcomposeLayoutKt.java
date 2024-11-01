package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SubcomposeLayoutKt {
    private static final SubcomposeLayoutKt$ReusedSlotId$1 ReusedSlotId = new Object() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$ReusedSlotId$1
        public String toString() {
            return "ReusedSlotId";
        }
    };

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SubcomposeLayout(Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1298353104);
        int i11 = i9 & 1;
        if (i11 != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changed(modifier) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changedInstance(interfaceC2072n) ? 32 : 16;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1298353104, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:73)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SubcomposeLayoutState();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue;
            int i12 = i10 << 3;
            SubcomposeLayout(subcomposeLayoutState, modifier, interfaceC2072n, startRestartGroup, (i12 & 112) | 8 | (i12 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$2(modifier, interfaceC2072n, i8, i9));
        }
    }

    public static final SubcomposeSlotReusePolicy SubcomposeSlotReusePolicy(int i8) {
        return new FixedCountSubcomposeSlotReusePolicy(i8);
    }

    public static final /* synthetic */ SubcomposeLayoutKt$ReusedSlotId$1 access$getReusedSlotId$p() {
        return ReusedSlotId;
    }

    @Composable
    @UiComposable
    public static final void SubcomposeLayout(SubcomposeLayoutState subcomposeLayoutState, Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-511989831);
        if ((i9 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511989831, i8, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:107)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier2);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Function0 constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
        startRestartGroup.startReplaceableGroup(1405779621);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new SubcomposeLayoutKt$SubcomposeLayout$$inlined$ReusableComposeNode$1(constructor$ui_release));
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, subcomposeLayoutState, subcomposeLayoutState.getSetRoot$ui_release());
        Updater.m2480setimpl(m2473constructorimpl, rememberCompositionContext, subcomposeLayoutState.getSetCompositionContext$ui_release());
        Updater.m2480setimpl(m2473constructorimpl, interfaceC2072n, subcomposeLayoutState.getSetMeasurePolicy$ui_release());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2480setimpl(m2473constructorimpl, materializeModifier, companion.getSetModifier());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (!startRestartGroup.getSkipping()) {
            EffectsKt.SideEffect(new SubcomposeLayoutKt$SubcomposeLayout$4(subcomposeLayoutState), startRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SubcomposeLayoutKt$SubcomposeLayout$5(subcomposeLayoutState, modifier2, interfaceC2072n, i8, i9));
        }
    }
}
