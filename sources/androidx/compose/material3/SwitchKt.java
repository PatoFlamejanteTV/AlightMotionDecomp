package androidx.compose.material3;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float m2363getSelectedHandleWidthD9Ej5fM = switchTokens.m2363getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = m2363getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m2370getUnselectedHandleWidthD9Ej5fM();
        float m2368getTrackWidthD9Ej5fM = switchTokens.m2368getTrackWidthD9Ej5fM();
        SwitchWidth = m2368getTrackWidthD9Ej5fM;
        float m2366getTrackHeightD9Ej5fM = switchTokens.m2366getTrackHeightD9Ej5fM();
        SwitchHeight = m2366getTrackHeightD9Ej5fM;
        float m5155constructorimpl = Dp.m5155constructorimpl(Dp.m5155constructorimpl(m2366getTrackHeightD9Ej5fM - m2363getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = m5155constructorimpl;
        ThumbPathLength = Dp.m5155constructorimpl(Dp.m5155constructorimpl(m2368getTrackWidthD9Ej5fM - m2363getSelectedHandleWidthD9Ej5fM) - m5155constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r52, kotlin.jvm.functions.Function1 r53, androidx.compose.ui.Modifier r54, c6.InterfaceC2072n r55, boolean r56, androidx.compose.material3.SwitchColors r57, androidx.compose.foundation.interaction.MutableInteractionSource r58, androidx.compose.runtime.Composer r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, c6.n, boolean, androidx.compose.material3.SwitchColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SwitchImpl-0DmnUew, reason: not valid java name */
    public static final void m1794SwitchImpl0DmnUew(BoxScope boxScope, boolean z8, boolean z9, SwitchColors switchColors, State<Float> state, InterfaceC2072n interfaceC2072n, InteractionSource interactionSource, Shape shape, float f8, float f9, float f10, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        float m5155constructorimpl;
        float floatValue;
        Composer composer2;
        float m2367getTrackOutlineWidthD9Ej5fM;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Composer startRestartGroup = composer.startRestartGroup(-1968109941);
        int i22 = 4;
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i21 | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z9)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            i10 |= i19;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(switchColors)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i10 |= i18;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(state)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i10 |= i17;
        }
        if ((i8 & 458752) == 0) {
            if (startRestartGroup.changed(interfaceC2072n)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i10 |= i16;
        }
        if ((i8 & 3670016) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i10 |= i15;
        }
        if ((i8 & 29360128) == 0) {
            if (startRestartGroup.changed(shape)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i10 |= i14;
        }
        if ((i8 & 234881024) == 0) {
            if (startRestartGroup.changed(f8)) {
                i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i13 = 33554432;
            }
            i10 |= i13;
        }
        if ((i8 & 1879048192) == 0) {
            if (startRestartGroup.changed(f9)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i10 |= i12;
        }
        if ((i9 & 14) == 0) {
            if (!startRestartGroup.changed(f10)) {
                i22 = 2;
            }
            i11 = i9 | i22;
        } else {
            i11 = i9;
        }
        if ((i10 & 1533916891) == 306783378 && (i11 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i10, i11, "androidx.compose.material3.SwitchImpl (Switch.kt:171)");
            }
            int i23 = ((i10 >> 6) & 14) | (i10 & 112) | ((i10 >> 3) & 896);
            State<Color> trackColor$material3_release = switchColors.trackColor$material3_release(z9, z8, startRestartGroup, i23);
            State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, startRestartGroup, (i10 >> 18) & 14);
            int i24 = i10;
            float mo421toDpu2uoSUM = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo421toDpu2uoSUM(state.getValue().floatValue());
            if (m1797SwitchImpl_0DmnUew$lambda7(collectIsPressedAsState)) {
                m5155constructorimpl = SwitchTokens.INSTANCE.m2361getPressedHandleWidthD9Ej5fM();
            } else {
                m5155constructorimpl = Dp.m5155constructorimpl(Dp.m5155constructorimpl(Dp.m5155constructorimpl(ThumbDiameter - f8) * (Dp.m5155constructorimpl(mo421toDpu2uoSUM - f9) / Dp.m5155constructorimpl(f10 - f9))) + f8);
            }
            startRestartGroup.startReplaceableGroup(-993794194);
            if (m1797SwitchImpl_0DmnUew$lambda7(collectIsPressedAsState)) {
                Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if (z8) {
                    m2367getTrackOutlineWidthD9Ej5fM = Dp.m5155constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m2367getTrackOutlineWidthD9Ej5fM());
                } else {
                    m2367getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m2367getTrackOutlineWidthD9Ej5fM();
                }
                floatValue = density.mo425toPx0680j_4(m2367getTrackOutlineWidthD9Ej5fM);
            } else {
                floatValue = state.getValue().floatValue();
            }
            startRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape shape2 = ShapesKt.toShape(switchTokens.getTrackShape(), startRestartGroup, 6);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            Modifier m258backgroundbw27NRU = BackgroundKt.m258backgroundbw27NRU(BorderKt.m270borderxT4_qwU(SizeKt.m610height3ABfNKs(SizeKt.m629width3ABfNKs(boxScope.align(companion, companion2.getCenter()), SwitchWidth), SwitchHeight), switchTokens.m2367getTrackOutlineWidthD9Ej5fM(), switchColors.borderColor$material3_release(z9, z8, startRestartGroup, i23).getValue().m2958unboximpl(), shape2), m1796SwitchImpl_0DmnUew$lambda6(trackColor$material3_release), shape2);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(m258backgroundbw27NRU);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density2, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(968687813);
            long m1795SwitchImpl_0DmnUew$lambda13$lambda10 = m1795SwitchImpl_0DmnUew$lambda13$lambda10(switchColors.thumbColor$material3_release(z9, z8, startRestartGroup, i23));
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterStart());
            Float valueOf = Float.valueOf(floatValue);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(valueOf);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SwitchKt$SwitchImpl$1$1$1(floatValue);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            Modifier m258backgroundbw27NRU2 = BackgroundKt.m258backgroundbw27NRU(SizeKt.m616requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue), interactionSource, RippleKt.m1421rememberRipple9IZ8Weo(false, Dp.m5155constructorimpl(switchTokens.m2365getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4)), m5155constructorimpl), m1795SwitchImpl_0DmnUew$lambda13$lambda10, shape);
            Alignment center = companion2.getCenter();
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion3.getConstructor();
            InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(m258backgroundbw27NRU2);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            composer2.disableReusing();
            Composer m2473constructorimpl2 = Updater.m2473constructorimpl(composer2);
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, density3, companion3.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion3.getSetViewConfiguration());
            composer2.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer2)), composer2, 0);
            composer2.startReplaceableGroup(2058660585);
            composer2.startReplaceableGroup(-2137368960);
            composer2.startReplaceableGroup(881862015);
            if (interfaceC2072n != null) {
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(switchColors.iconColor$material3_release(z9, z8, composer2, i23).getValue())}, interfaceC2072n, composer2, ((i24 >> 12) & 112) | 8);
            }
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$2(boxScope, z8, z9, switchColors, state, interfaceC2072n, interactionSource, shape, f8, f9, f10, i8, i9));
        }
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-13$lambda-10, reason: not valid java name */
    private static final long m1795SwitchImpl_0DmnUew$lambda13$lambda10(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-6, reason: not valid java name */
    private static final long m1796SwitchImpl_0DmnUew$lambda6(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* renamed from: SwitchImpl_0DmnUew$lambda-7, reason: not valid java name */
    private static final boolean m1797SwitchImpl_0DmnUew$lambda7(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }
}
