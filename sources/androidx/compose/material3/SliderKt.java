package androidx.compose.material3;

import Q5.I;
import R5.AbstractC1428l;
import R5.N;
import U5.d;
import V5.b;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Strings;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import i6.InterfaceC2977e;
import i6.i;
import i6.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.P;

/* loaded from: classes.dex */
public final class SliderKt {
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbDefaultElevation;
    private static final float ThumbHeight;
    private static final float ThumbPressedElevation;
    private static final long ThumbSize;
    private static final float ThumbWidth;
    private static final float TickSize;
    private static final float TrackHeight;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        float m2336getHandleWidthD9Ej5fM = sliderTokens.m2336getHandleWidthD9Ej5fM();
        ThumbWidth = m2336getHandleWidthD9Ej5fM;
        float m2335getHandleHeightD9Ej5fM = sliderTokens.m2335getHandleHeightD9Ej5fM();
        ThumbHeight = m2335getHandleHeightD9Ej5fM;
        ThumbSize = DpKt.m5177DpSizeYgX7TsA(m2336getHandleWidthD9Ej5fM, m2335getHandleHeightD9Ej5fM);
        ThumbDefaultElevation = Dp.m5155constructorimpl(1);
        ThumbPressedElevation = Dp.m5155constructorimpl(6);
        TickSize = sliderTokens.m2342getTickMarksContainerSizeD9Ej5fM();
        TrackHeight = sliderTokens.m2337getInactiveTrackHeightD9Ej5fM();
        float m5155constructorimpl = Dp.m5155constructorimpl(48);
        SliderHeight = m5155constructorimpl;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(144);
        SliderMinWidth = m5155constructorimpl2;
        DefaultSliderConstraints = SizeKt.m612heightInVpY3zN4$default(SizeKt.m631widthInVpY3zN4$default(Modifier.Companion, m5155constructorimpl2, 0.0f, 2, null), 0.0f, m5155constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RangeSlider(i6.InterfaceC2977e r42, kotlin.jvm.functions.Function1 r43, androidx.compose.ui.Modifier r44, boolean r45, i6.InterfaceC2977e r46, int r47, kotlin.jvm.functions.Function0 r48, androidx.compose.material3.SliderColors r49, androidx.compose.runtime.Composer r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.RangeSlider(i6.e, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, i6.e, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(boolean z8, float f8, float f9, float[] fArr, SliderColors sliderColors, float f10, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i8, int i9) {
        Composer startRestartGroup = composer.startRestartGroup(-597471305);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-597471305, i8, i9, "androidx.compose.material3.RangeSliderImpl (Slider.kt:511)");
        }
        Strings.Companion companion = Strings.Companion;
        String m1772getStringNWtq28 = Strings_androidKt.m1772getStringNWtq28(companion.m1771getSliderRangeStartadMyvUU(), startRestartGroup, 6);
        String m1772getStringNWtq282 = Strings_androidKt.m1772getStringNWtq28(companion.m1770getSliderRangeEndadMyvUU(), startRestartGroup, 6);
        Modifier then = modifier.then(DefaultSliderConstraints);
        startRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        Function0 constructor = companion3.getConstructor();
        InterfaceC2073o materializerOf = LayoutKt.materializerOf(then);
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
        Updater.m2480setimpl(m2473constructorimpl, density, companion3.getSetDensity());
        Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion3.getSetLayoutDirection());
        Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion3.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.startReplaceableGroup(-2137368960);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        startRestartGroup.startReplaceableGroup(1755032509);
        Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float mo425toPx0680j_4 = density2.mo425toPx0680j_4(TrackHeight);
        float mo421toDpu2uoSUM = density2.mo421toDpu2uoSUM(f10);
        float m5155constructorimpl = Dp.m5155constructorimpl(mo421toDpu2uoSUM * f8);
        float m5155constructorimpl2 = Dp.m5155constructorimpl(mo421toDpu2uoSUM * f9);
        int i10 = i8 << 6;
        m1737TempRangeSliderTrackau3_HiA(SizeKt.fillMaxSize$default(boxScopeInstance.align(Modifier.Companion, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z8, f8, f9, fArr, ThumbWidth, mo425toPx0680j_4, startRestartGroup, ((i8 >> 9) & 112) | 1835008 | (i10 & 896) | (i10 & 7168) | (i10 & 57344));
        m1736TempRangeSliderThumbrAjV9yQ(boxScopeInstance, m5155constructorimpl, ComposableLambdaKt.composableLambda(startRestartGroup, -1592025586, true, new SliderKt$RangeSliderImpl$1$2(m1772getStringNWtq28, mutableInteractionSource, modifier2, sliderColors, z8, i8)), startRestartGroup, 390);
        m1736TempRangeSliderThumbrAjV9yQ(boxScopeInstance, m5155constructorimpl2, ComposableLambdaKt.composableLambda(startRestartGroup, -1141545019, true, new SliderKt$RangeSliderImpl$1$3(m1772getStringNWtq282, mutableInteractionSource2, modifier3, sliderColors, z8, i8)), startRestartGroup, 390);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$RangeSliderImpl$2(z8, f8, f9, fArr, sliderColors, f10, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e7  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(float r44, kotlin.jvm.functions.Function1 r45, androidx.compose.ui.Modifier r46, boolean r47, i6.InterfaceC2977e r48, int r49, kotlin.jvm.functions.Function0 r50, androidx.compose.material3.SliderColors r51, androidx.compose.foundation.interaction.MutableInteractionSource r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, i6.e, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SliderImpl(androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.foundation.interaction.MutableInteractionSource r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function0 r33, int r34, float r35, i6.InterfaceC2977e r36, c6.InterfaceC2073o r37, c6.InterfaceC2073o r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.SliderImpl(androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, int, float, i6.e, c6.o, c6.o, androidx.compose.runtime.Composer, int):void");
    }

    public static final float SliderImpl$scaleToOffset(InterfaceC2977e interfaceC2977e, float f8, float f9, float f10) {
        return scale(((Number) interfaceC2977e.getStart()).floatValue(), ((Number) interfaceC2977e.getEndInclusive()).floatValue(), f10, f8, f9);
    }

    public static final float SliderImpl$scaleToUserValue(InterfaceC2977e interfaceC2977e, float f8, float f9, float f10) {
        return scale(f8, f9, f10, ((Number) interfaceC2977e.getStart()).floatValue(), ((Number) interfaceC2977e.getEndInclusive()).floatValue());
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TempRangeSliderThumb-rAjV9yQ */
    public static final void m1736TempRangeSliderThumbrAjV9yQ(BoxScope boxScope, float f8, InterfaceC2073o interfaceC2073o, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-2104116536);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(f8)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(interfaceC2073o)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2104116536, i9, -1, "androidx.compose.material3.TempRangeSliderThumb (Slider.kt:946)");
            }
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(Modifier.Companion, f8, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope.align(m581paddingqDBjuR0$default, companion.getCenterStart());
            int i13 = (i9 << 3) & 7168;
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            Function0 constructor = companion2.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(align);
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
            Updater.m2480setimpl(m2473constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion2.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            interfaceC2073o.invoke(BoxScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i13 >> 6) & 112) | 6));
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$TempRangeSliderThumb$1(boxScope, f8, interfaceC2073o, i8));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: TempRangeSliderTrack-au3_HiA */
    public static final void m1737TempRangeSliderTrackau3_HiA(Modifier modifier, SliderColors sliderColors, boolean z8, float f8, float f9, float[] fArr, float f10, float f11, Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1015664062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1015664062, i8, -1, "androidx.compose.material3.TempRangeSliderTrack (Slider.kt:960)");
        }
        P p8 = new P();
        P p9 = new P();
        Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        p8.f34570a = density.mo425toPx0680j_4(f10) / 2;
        p9.f34570a = density.mo425toPx0680j_4(TickSize);
        int i9 = ((i8 >> 6) & 14) | 48 | ((i8 << 3) & 896);
        CanvasKt.Canvas(modifier, new SliderKt$TempRangeSliderTrack$2(p8, sliderColors.trackColor$material3_release(z8, false, startRestartGroup, i9), f11, f9, f8, sliderColors.trackColor$material3_release(z8, true, startRestartGroup, i9), fArr, sliderColors.tickColor$material3_release(z8, false, startRestartGroup, i9), sliderColors.tickColor$material3_release(z8, true, startRestartGroup, i9), p9), startRestartGroup, i8 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SliderKt$TempRangeSliderTrack$3(modifier, sliderColors, z8, f8, f9, fArr, f10, f11, i8));
        }
    }

    public static final /* synthetic */ float access$getTickSize$p() {
        return TickSize;
    }

    public static final Object animateToTarget(DraggableState draggableState, float f8, float f9, float f10, d dVar) {
        Object a9 = androidx.compose.foundation.gestures.a.a(draggableState, null, new SliderKt$animateToTarget$2(f8, f9, f10, null), dVar, 1, null);
        if (a9 == b.e()) {
            return a9;
        }
        return I.f8786a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: awaitSlop-8vUncbI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m1741awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, U5.d r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material3.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = (androidx.compose.material3.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.SliderKt$awaitSlop$1 r0 = new androidx.compose.material3.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = V5.b.e()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.P r8 = (kotlin.jvm.internal.P) r8
            Q5.t.b(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            Q5.t.b(r12)
            kotlin.jvm.internal.P r12 = new kotlin.jvm.internal.P
            r12.<init>()
            androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material3.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>(r12)
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material3.DragGestureDetectorCopyKt.m1581awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.f34570a
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.b.b(r8)
            Q5.r r8 = Q5.x.a(r12, r8)
            goto L65
        L64:
            r8 = 0
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.m1741awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, U5.d):java.lang.Object");
    }

    public static final float calcFraction(float f8, float f9, float f10) {
        float f11;
        float f12 = f9 - f8;
        if (f12 == 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = (f10 - f8) / f12;
        }
        return m.j(f11, 0.0f, 1.0f);
    }

    public static final float getThumbWidth() {
        return ThumbWidth;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z8, boolean z9, float f8, InterfaceC2977e interfaceC2977e, State<? extends Function1> state3, State<? extends InterfaceC2072n> state4) {
        if (z8) {
            return SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f8), Boolean.valueOf(z9), interfaceC2977e}, (InterfaceC2072n) new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z9, f8, state3, null));
        }
        return modifier;
    }

    public static final float scale(float f8, float f9, float f10, float f11, float f12) {
        return MathHelpersKt.lerp(f11, f12, calcFraction(f8, f9, f10));
    }

    public static final Modifier sliderSemantics(Modifier modifier, float f8, boolean z8, Function1 function1, Function0 function0, InterfaceC2977e interfaceC2977e, int i8) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new SliderKt$sliderSemantics$1(z8, interfaceC2977e, i8, m.j(f8, ((Number) interfaceC2977e.getStart()).floatValue(), ((Number) interfaceC2977e.getEndInclusive()).floatValue()), function1, function0), 1, null), f8, interfaceC2977e, i8);
    }

    static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f8, boolean z8, Function1 function1, Function0 function0, InterfaceC2977e interfaceC2977e, int i8, int i9, Object obj) {
        int i10;
        if ((i9 & 8) != 0) {
            function0 = null;
        }
        Function0 function02 = function0;
        if ((i9 & 16) != 0) {
            interfaceC2977e = m.b(0.0f, 1.0f);
        }
        InterfaceC2977e interfaceC2977e2 = interfaceC2977e;
        if ((i9 & 32) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        return sliderSemantics(modifier, f8, z8, function1, function02, interfaceC2977e2, i10);
    }

    private static final Modifier sliderTapModifier(Modifier modifier, DraggableState draggableState, MutableInteractionSource mutableInteractionSource, int i8, boolean z8, State<Float> state, State<? extends Function0> state2, MutableState<Float> mutableState, boolean z9) {
        Function1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1(draggableState, mutableInteractionSource, i8, z8, state, state2, mutableState, z9);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new SliderKt$sliderTapModifier$2(z9, draggableState, mutableInteractionSource, i8, z8, mutableState, state, state2));
    }

    public static final float snapValueToTick(float f8, float[] fArr, float f9, float f10) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f11 = fArr[0];
            int f02 = AbstractC1428l.f0(fArr);
            if (f02 == 0) {
                valueOf = Float.valueOf(f11);
            } else {
                float abs = Math.abs(MathHelpersKt.lerp(f9, f10, f11) - f8);
                N it = new i(1, f02).iterator();
                while (it.hasNext()) {
                    float f12 = fArr[it.nextInt()];
                    float abs2 = Math.abs(MathHelpersKt.lerp(f9, f10, f12) - f8);
                    if (Float.compare(abs, abs2) > 0) {
                        f11 = f12;
                        abs = abs2;
                    }
                }
                valueOf = Float.valueOf(f11);
            }
        }
        if (valueOf != null) {
            return MathHelpersKt.lerp(f9, f10, valueOf.floatValue());
        }
        return f8;
    }

    public static final float[] stepsToTickFractions(int i8) {
        if (i8 == 0) {
            return new float[0];
        }
        int i9 = i8 + 2;
        float[] fArr = new float[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            fArr[i10] = i10 / (i8 + 1);
        }
        return fArr;
    }

    public static final InterfaceC2977e scale(float f8, float f9, InterfaceC2977e interfaceC2977e, float f10, float f11) {
        return m.b(scale(f8, f9, ((Number) interfaceC2977e.getStart()).floatValue(), f10, f11), scale(f8, f9, ((Number) interfaceC2977e.getEndInclusive()).floatValue(), f10, f11));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(float r45, kotlin.jvm.functions.Function1 r46, androidx.compose.ui.Modifier r47, boolean r48, i6.InterfaceC2977e r49, int r50, kotlin.jvm.functions.Function0 r51, androidx.compose.material3.SliderColors r52, androidx.compose.foundation.interaction.MutableInteractionSource r53, c6.InterfaceC2073o r54, androidx.compose.runtime.Composer r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, i6.e, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Slider(float r47, kotlin.jvm.functions.Function1 r48, c6.InterfaceC2073o r49, androidx.compose.ui.Modifier r50, boolean r51, i6.InterfaceC2977e r52, int r53, kotlin.jvm.functions.Function0 r54, androidx.compose.material3.SliderColors r55, androidx.compose.foundation.interaction.MutableInteractionSource r56, c6.InterfaceC2073o r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt.Slider(float, kotlin.jvm.functions.Function1, c6.o, androidx.compose.ui.Modifier, boolean, i6.e, int, kotlin.jvm.functions.Function0, androidx.compose.material3.SliderColors, androidx.compose.foundation.interaction.MutableInteractionSource, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
