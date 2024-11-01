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
public final class ColumnKt {
    private static final MeasurePolicy DefaultColumnMeasurePolicy;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float mo497getSpacingD9Ej5fM = Arrangement.INSTANCE.getTop().mo497getSpacingD9Ej5fM();
        CrossAxisAlignment horizontal$foundation_layout_release = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(Alignment.Companion.getStart());
        DefaultColumnMeasurePolicy = RowColumnImplKt.m602rowColumnMeasurePolicyTDGSqEk(layoutOrientation, ColumnKt$DefaultColumnMeasurePolicy$1.INSTANCE, mo497getSpacingD9Ej5fM, SizeMode.Wrap, horizontal$foundation_layout_release);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Column(Modifier modifier, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, InterfaceC2073o content, Composer composer, int i8, int i9) {
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-483455358);
        if ((i9 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i9 & 2) != 0) {
            vertical = Arrangement.INSTANCE.getTop();
        }
        if ((i9 & 4) != 0) {
            horizontal = Alignment.Companion.getStart();
        }
        MeasurePolicy columnMeasurePolicy = columnMeasurePolicy(vertical, horizontal, composer, (i8 >> 3) & 126);
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
        Updater.m2480setimpl(m2473constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        content.invoke(ColumnScopeInstance.INSTANCE, composer, Integer.valueOf(((i8 >> 6) & 112) | 6));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    @Composable
    public static final MeasurePolicy columnMeasurePolicy(Arrangement.Vertical verticalArrangement, Alignment.Horizontal horizontalAlignment, Composer composer, int i8) {
        MeasurePolicy measurePolicy;
        AbstractC3292y.i(verticalArrangement, "verticalArrangement");
        AbstractC3292y.i(horizontalAlignment, "horizontalAlignment");
        composer.startReplaceableGroup(1089876336);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089876336, i8, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:96)");
        }
        if (AbstractC3292y.d(verticalArrangement, Arrangement.INSTANCE.getTop()) && AbstractC3292y.d(horizontalAlignment, Alignment.Companion.getStart())) {
            measurePolicy = DefaultColumnMeasurePolicy;
        } else {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(verticalArrangement) | composer.changed(horizontalAlignment);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
                float mo497getSpacingD9Ej5fM = verticalArrangement.mo497getSpacingD9Ej5fM();
                CrossAxisAlignment horizontal$foundation_layout_release = CrossAxisAlignment.Companion.horizontal$foundation_layout_release(horizontalAlignment);
                rememberedValue = RowColumnImplKt.m602rowColumnMeasurePolicyTDGSqEk(layoutOrientation, new ColumnKt$columnMeasurePolicy$1$1(verticalArrangement), mo497getSpacingD9Ej5fM, SizeMode.Wrap, horizontal$foundation_layout_release);
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

    public static final MeasurePolicy getDefaultColumnMeasurePolicy() {
        return DefaultColumnMeasurePolicy;
    }

    public static /* synthetic */ void getDefaultColumnMeasurePolicy$annotations() {
    }
}
