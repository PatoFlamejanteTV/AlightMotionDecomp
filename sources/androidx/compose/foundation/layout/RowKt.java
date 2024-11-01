package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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

/* loaded from: classes.dex */
public final class RowKt {
    private static final MeasurePolicy DefaultRowMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        float mo497getSpacingD9Ej5fM = Arrangement.INSTANCE.getStart().mo497getSpacingD9Ej5fM();
        CrossAxisAlignment vertical$foundation_layout_release = CrossAxisAlignment.Companion.vertical$foundation_layout_release(Alignment.Companion.getTop());
        DefaultRowMeasurePolicy = RowColumnImplKt.m602rowColumnMeasurePolicyTDGSqEk(layoutOrientation, RowKt$DefaultRowMeasurePolicy$1.INSTANCE, mo497getSpacingD9Ej5fM, SizeMode.Wrap, vertical$foundation_layout_release);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Row(Modifier modifier, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, InterfaceC2073o content, Composer composer, int i8, int i9) {
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(693286680);
        if ((i9 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i9 & 2) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        if ((i9 & 4) != 0) {
            vertical = Alignment.Companion.getTop();
        }
        MeasurePolicy rowMeasurePolicy = rowMeasurePolicy(horizontal, vertical, composer, (i8 >> 3) & 126);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
        Updater.m2480setimpl(m2473constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(RowScopeInstance.INSTANCE, composer, Integer.valueOf(((i8 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final MeasurePolicy getDefaultRowMeasurePolicy() {
        return DefaultRowMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultRowMeasurePolicy$annotations() {
    }

    @Composable
    public static final MeasurePolicy rowMeasurePolicy(Arrangement.Horizontal horizontalArrangement, Alignment.Vertical verticalAlignment, Composer composer, int i8) {
        MeasurePolicy measurePolicy;
        AbstractC3292y.i(horizontalArrangement, "horizontalArrangement");
        AbstractC3292y.i(verticalAlignment, "verticalAlignment");
        composer.startReplaceableGroup(-837807694);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-837807694, i8, -1, "androidx.compose.foundation.layout.rowMeasurePolicy (Row.kt:100)");
        }
        if (AbstractC3292y.d(horizontalArrangement, Arrangement.INSTANCE.getStart()) && AbstractC3292y.d(verticalAlignment, Alignment.Companion.getTop())) {
            measurePolicy = DefaultRowMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(horizontalArrangement) | composer.changed(verticalAlignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
                float mo497getSpacingD9Ej5fM = horizontalArrangement.mo497getSpacingD9Ej5fM();
                CrossAxisAlignment vertical$foundation_layout_release = CrossAxisAlignment.Companion.vertical$foundation_layout_release(verticalAlignment);
                rememberedValue = RowColumnImplKt.m602rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new RowKt$rowMeasurePolicy$1$1(horizontalArrangement), mo497getSpacingD9Ej5fM, SizeMode.Wrap, vertical$foundation_layout_release);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            measurePolicy = (MeasurePolicy) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return measurePolicy;
    }
}
