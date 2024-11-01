package androidx.compose.material3.internal;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, ExposedDropdownMenuPopupKt$LocalPopupTestTag$1.INSTANCE, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuPopup(Function0 function0, PopupPositionProvider popupPositionProvider, InterfaceC2072n content, Composer composer, int i8, int i9) {
        Function0 function02;
        int i10;
        int i11;
        int i12;
        int i13;
        Function0 function03;
        final LayoutDirection layoutDirection;
        String str;
        Function0 function04;
        int i14;
        Composer composer2;
        Object obj;
        Function0 function05;
        Composer composer3;
        AbstractC3292y.i(popupPositionProvider, "popupPositionProvider");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(187306684);
        int i15 = i9 & 1;
        if (i15 != 0) {
            i10 = i8 | 6;
            function02 = function0;
        } else if ((i8 & 14) == 0) {
            function02 = function0;
            if (startRestartGroup.changed(function02)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            function02 = function0;
            i10 = i8;
        }
        if ((i9 & 2) != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(popupPositionProvider)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i9 & 4) != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        int i16 = i10;
        if ((i16 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            function05 = function02;
            composer3 = startRestartGroup;
        } else {
            if (i15 != 0) {
                function03 = null;
            } else {
                function03 = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187306684, i16, -1, "androidx.compose.material3.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.kt:78)");
            }
            View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            String str2 = (String) startRestartGroup.consume(LocalPopupTestTag);
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            CompositionContext rememberCompositionContext = ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
            State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, startRestartGroup, (i16 >> 6) & 14);
            UUID popupId = (UUID) RememberSaveableKt.m2560rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupId$1.INSTANCE, startRestartGroup, 3080, 6);
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                AbstractC3292y.h(popupId, "popupId");
                layoutDirection = layoutDirection2;
                str = str2;
                function04 = function03;
                i14 = i16;
                Composer composer4 = startRestartGroup;
                PopupLayout popupLayout = new PopupLayout(function03, str2, view, density, popupPositionProvider, popupId);
                popupLayout.setContent(rememberCompositionContext, ComposableLambdaKt.composableLambdaInstance(686046343, true, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$popupLayout$1$1$1(popupLayout, rememberUpdatedState)));
                composer4.updateRememberedValue(popupLayout);
                obj = popupLayout;
                composer2 = composer4;
            } else {
                layoutDirection = layoutDirection2;
                str = str2;
                function04 = function03;
                i14 = i16;
                composer2 = startRestartGroup;
                obj = rememberedValue;
            }
            composer2.endReplaceableGroup();
            final PopupLayout popupLayout2 = (PopupLayout) obj;
            EffectsKt.DisposableEffect(popupLayout2, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$1(popupLayout2, function04, str, layoutDirection), composer2, 8);
            EffectsKt.SideEffect(new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$2(popupLayout2, function04, str, layoutDirection), composer2, 0);
            EffectsKt.DisposableEffect(popupPositionProvider, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$3(popupLayout2, popupPositionProvider), composer2, (i14 >> 3) & 14);
            Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.Companion, new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$5(popupLayout2));
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.internal.ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                    return g.a(this, intrinsicMeasureScope, list, i17);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                    return g.b(this, intrinsicMeasureScope, list, i17);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j8) {
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(list, "<anonymous parameter 0>");
                    PopupLayout.this.setParentLayoutDirection(layoutDirection);
                    return MeasureScope.CC.q(Layout, 0, 0, null, ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$6$measure$1.INSTANCE, 4, null);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                    return g.c(this, intrinsicMeasureScope, list, i17);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i17) {
                    return g.d(this, intrinsicMeasureScope, list, i17);
                }
            };
            composer2.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(onGloballyPositioned);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m2473constructorimpl = Updater.m2473constructorimpl(composer2);
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density2, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection3, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(975527269);
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function05 = function04;
            composer3 = composer2;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuPopupKt$ExposedDropdownMenuPopup$7(function05, popupPositionProvider, content, i8, i9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ExposedDropdownMenuPopup$lambda-0, reason: not valid java name */
    public static final InterfaceC2072n m1931ExposedDropdownMenuPopup$lambda0(State<? extends InterfaceC2072n> state) {
        return state.getValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(-483170785);
        ExposedDropdownMenuPopupKt$SimpleStack$1 exposedDropdownMenuPopupKt$SimpleStack$1 = ExposedDropdownMenuPopupKt$SimpleStack$1.INSTANCE;
        int i9 = ((i8 << 3) & 112) | ((i8 >> 3) & 14);
        composer.startReplaceableGroup(-1323940314);
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o materializerOf = LayoutKt.materializerOf(modifier);
        int i10 = ((i9 << 9) & 7168) | 6;
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
        Updater.m2480setimpl(m2473constructorimpl, exposedDropdownMenuPopupKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
        composer.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        interfaceC2072n.invoke(composer, Integer.valueOf((i10 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }
}
