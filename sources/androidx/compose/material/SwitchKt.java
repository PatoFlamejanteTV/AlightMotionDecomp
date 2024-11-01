package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class SwitchKt {
    private static final TweenSpec<Float> AnimationSpec;
    private static final float DefaultSwitchPadding;
    private static final float SwitchHeight;
    private static final float SwitchPositionalThreshold = 0.7f;
    private static final float SwitchVelocityThreshold;
    private static final float SwitchWidth;
    private static final float ThumbDefaultElevation;
    private static final float ThumbDiameter;
    private static final float ThumbPathLength;
    private static final float ThumbPressedElevation;
    private static final float ThumbRippleRadius;
    private static final float TrackStrokeWidth;
    private static final float TrackWidth;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl(34);
        TrackWidth = m5155constructorimpl;
        TrackStrokeWidth = Dp.m5155constructorimpl(14);
        float m5155constructorimpl2 = Dp.m5155constructorimpl(20);
        ThumbDiameter = m5155constructorimpl2;
        ThumbRippleRadius = Dp.m5155constructorimpl(24);
        DefaultSwitchPadding = Dp.m5155constructorimpl(2);
        SwitchWidth = m5155constructorimpl;
        SwitchHeight = m5155constructorimpl2;
        ThumbPathLength = Dp.m5155constructorimpl(m5155constructorimpl - m5155constructorimpl2);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
        ThumbDefaultElevation = Dp.m5155constructorimpl(1);
        ThumbPressedElevation = Dp.m5155constructorimpl(6);
        SwitchVelocityThreshold = Dp.m5155constructorimpl(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0248 A[LOOP:0: B:60:0x0246->B:61:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0425  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Switch(boolean r40, kotlin.jvm.functions.Function1 r41, androidx.compose.ui.Modifier r42, boolean r43, androidx.compose.foundation.interaction.MutableInteractionSource r44, androidx.compose.material.SwitchColors r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.Switch(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Switch$lambda$4(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 Switch$lambda$7(State<? extends Function1> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Switch$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SwitchImpl(BoxScope boxScope, boolean z8, boolean z9, SwitchColors switchColors, Function0 function0, InteractionSource interactionSource, Composer composer, int i8) {
        int i9;
        float f8;
        long SwitchImpl$lambda$18;
        Composer composer2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(70908914);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(boxScope)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(z9)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(switchColors)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changed(interactionSource)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        if ((374491 & i9) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(70908914, i9, -1, "androidx.compose.material.SwitchImpl (Switch.kt:212)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            int i16 = (i9 >> 15) & 14;
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(interactionSource) | startRestartGroup.changed(snapshotStateList);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (InterfaceC2072n) rememberedValue2, startRestartGroup, i16 | 64);
            if (!snapshotStateList.isEmpty()) {
                f8 = ThumbPressedElevation;
            } else {
                f8 = ThumbDefaultElevation;
            }
            float f9 = f8;
            int i17 = ((i9 >> 6) & 14) | (i9 & 112) | ((i9 >> 3) & 896);
            State<Color> trackColor = switchColors.trackColor(z9, z8, startRestartGroup, i17);
            Modifier.Companion companion2 = Modifier.Companion;
            Alignment.Companion companion3 = Alignment.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScope.align(companion2, companion3.getCenter()), 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed2 = startRestartGroup.changed(trackColor);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new SwitchKt$SwitchImpl$2$1(trackColor);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(fillMaxSize$default, (Function1) rememberedValue3, startRestartGroup, 0);
            State<Color> thumbColor = switchColors.thumbColor(z9, z8, startRestartGroup, i17);
            ElevationOverlay elevationOverlay = (ElevationOverlay) startRestartGroup.consume(ElevationOverlayKt.getLocalElevationOverlay());
            float m5155constructorimpl = Dp.m5155constructorimpl(((Dp) startRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m5169unboximpl() + f9);
            startRestartGroup.startReplaceableGroup(-539243578);
            if (Color.m2949equalsimpl0(SwitchImpl$lambda$18(thumbColor), MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1159getSurface0d7_KjU()) && elevationOverlay != null) {
                SwitchImpl$lambda$18 = elevationOverlay.mo1189apply7g2Lkgo(SwitchImpl$lambda$18(thumbColor), m5155constructorimpl, startRestartGroup, 0);
            } else {
                SwitchImpl$lambda$18 = SwitchImpl$lambda$18(thumbColor);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            State<Color> m164animateColorAsStateeuL9pac = SingleValueAnimationKt.m164animateColorAsStateeuL9pac(SwitchImpl$lambda$18, null, null, null, startRestartGroup, 0, 14);
            Modifier align = boxScope.align(companion2, companion3.getCenterStart());
            composer2.startReplaceableGroup(1157296644);
            boolean changed3 = composer2.changed(function0);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed3 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new SwitchKt$SwitchImpl$3$1(function0);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            SpacerKt.Spacer(BackgroundKt.m258backgroundbw27NRU(ShadowKt.m2622shadows4CzXII$default(SizeKt.m616requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(align, (Function1) rememberedValue4), interactionSource, RippleKt.m1421rememberRipple9IZ8Weo(false, ThumbRippleRadius, 0L, composer2, 54, 4)), ThumbDiameter), f9, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), SwitchImpl$lambda$19(m164animateColorAsStateeuL9pac), RoundedCornerShapeKt.getCircleShape()), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new SwitchKt$SwitchImpl$4(boxScope, z8, z9, switchColors, function0, interactionSource, i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SwitchImpl$lambda$16(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    private static final long SwitchImpl$lambda$18(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    private static final long SwitchImpl$lambda$19(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-RPmYEkk, reason: not valid java name */
    public static final void m1344drawTrackRPmYEkk(DrawScope drawScope, long j8, float f8, float f9) {
        float f10 = f9 / 2;
        c.C(drawScope, j8, androidx.compose.ui.geometry.OffsetKt.Offset(f10, Offset.m2713getYimpl(drawScope.mo3390getCenterF1C5BW0())), androidx.compose.ui.geometry.OffsetKt.Offset(f8 - f10, Offset.m2713getYimpl(drawScope.mo3390getCenterF1C5BW0())), f9, StrokeCap.Companion.m3279getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getTrackStrokeWidth() {
        return TrackStrokeWidth;
    }

    public static final float getTrackWidth() {
        return TrackWidth;
    }
}
