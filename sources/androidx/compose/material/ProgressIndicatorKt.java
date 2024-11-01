package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import i6.InterfaceC2977e;
import i6.m;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final float StartAngleOffset = -90.0f;
    private static final float LinearIndicatorHeight = ProgressIndicatorDefaults.INSTANCE.m1276getStrokeWidthD9Ej5fM();
    private static final float LinearIndicatorWidth = Dp.m5155constructorimpl(PsExtractor.VIDEO_STREAM_MASK);
    private static final float CircularIndicatorDiameter = Dp.m5155constructorimpl(40);
    private static final CubicBezierEasing FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
    private static final CubicBezierEasing FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
    private static final CubicBezierEasing SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
    private static final CubicBezierEasing SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
    private static final CubicBezierEasing CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0058  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1277CircularProgressIndicatorDUhRLBM(float r18, androidx.compose.ui.Modifier r19, long r20, float r22, long r23, int r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1277CircularProgressIndicatorDUhRLBM(float, androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0069  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1278CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier r25, long r26, float r28, long r29, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1278CircularProgressIndicatorLxG7B9w(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1279CircularProgressIndicatorMBs18nI(float r20, androidx.compose.ui.Modifier r21, long r22, float r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1279CircularProgressIndicatorMBs18nI(float, androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1280CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier r19, long r20, float r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1280CircularProgressIndicatoraMcp0Q(androidx.compose.ui.Modifier, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$11(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CircularProgressIndicator_LxG7B9w$lambda$8(State<Integer> state) {
        return state.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CircularProgressIndicator_LxG7B9w$lambda$9(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m1281LinearProgressIndicator2cYBFYY(Modifier modifier, long j8, long j9, int i8, Composer composer, int i9, int i10) {
        Modifier modifier2;
        int i11;
        int i12;
        long j10;
        long j11;
        int i13;
        long j12;
        long j13;
        int i14;
        Modifier modifier3;
        long j14;
        long j15;
        int i15;
        long j16;
        long j17;
        Modifier modifier4;
        int i16;
        int i17;
        int i18;
        Composer startRestartGroup = composer.startRestartGroup(1501635280);
        int i19 = i10 & 1;
        if (i19 != 0) {
            i11 = i9 | 6;
            modifier2 = modifier;
        } else if ((i9 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i9;
        } else {
            modifier2 = modifier;
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            if ((i10 & 2) == 0) {
                j10 = j8;
                if (startRestartGroup.changed(j10)) {
                    i18 = 32;
                    i11 |= i18;
                }
            } else {
                j10 = j8;
            }
            i18 = 16;
            i11 |= i18;
        } else {
            j10 = j8;
        }
        if ((i9 & 896) == 0) {
            if ((i10 & 4) == 0) {
                j11 = j9;
                if (startRestartGroup.changed(j11)) {
                    i17 = 256;
                    i11 |= i17;
                }
            } else {
                j11 = j9;
            }
            i17 = 128;
            i11 |= i17;
        } else {
            j11 = j9;
        }
        if ((i9 & 7168) == 0) {
            if ((i10 & 8) == 0) {
                i13 = i8;
                if (startRestartGroup.changed(i13)) {
                    i16 = 2048;
                    i11 |= i16;
                }
            } else {
                i13 = i8;
            }
            i16 = 1024;
            i11 |= i16;
        } else {
            i13 = i8;
        }
        if ((i11 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            i15 = i13;
            modifier4 = modifier2;
            j16 = j10;
            j17 = j11;
        } else {
            startRestartGroup.startDefaults();
            if ((i9 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                i14 = i13;
                modifier3 = modifier2;
                j14 = j10;
                j15 = j11;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.Companion;
                }
                if ((i10 & 2) != 0) {
                    j12 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1155getPrimary0d7_KjU();
                } else {
                    j12 = j10;
                }
                if ((i10 & 4) != 0) {
                    j13 = Color.m2947copywmQWz5c$default(j12, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    j13 = j11;
                }
                if ((i10 & 8) != 0) {
                    i13 = StrokeCap.Companion.m3278getButtKaPHkGw();
                }
                i14 = i13;
                modifier3 = modifier2;
                j14 = j12;
                j15 = j13;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501635280, i9, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:106)");
            }
            InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1);
            InfiniteRepeatableSpec m188infiniteRepeatable9IiC70o$default = AnimationSpecKt.m188infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$2.INSTANCE), null, 0L, 6, null);
            int i20 = InfiniteTransition.$stable;
            int i21 = InfiniteRepeatableSpec.$stable;
            State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, m188infiniteRepeatable9IiC70o$default, null, startRestartGroup, i20 | 432 | (i21 << 9), 8);
            State<Float> animateFloat2 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m188infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i20 | 432 | (i21 << 9), 8);
            State<Float> animateFloat3 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m188infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i20 | 432 | (i21 << 9), 8);
            State<Float> animateFloat4 = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m188infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$2.INSTANCE), null, 0L, 6, null), null, startRestartGroup, i20 | 432 | (i21 << 9), 8);
            Modifier m626sizeVpY3zN4 = SizeKt.m626sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(modifier3), LinearIndicatorWidth, LinearIndicatorHeight);
            Object[] objArr = {Color.m2938boximpl(j15), StrokeCap.m3271boximpl(i14), animateFloat, animateFloat2, Color.m2938boximpl(j14), animateFloat3, animateFloat4};
            startRestartGroup.startReplaceableGroup(-568225417);
            boolean z8 = false;
            for (int i22 = 0; i22 < 7; i22++) {
                z8 |= startRestartGroup.changed(objArr[i22]);
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ProgressIndicatorKt$LinearProgressIndicator$3$1(j15, i14, j14, animateFloat, animateFloat2, animateFloat3, animateFloat4);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m626sizeVpY3zN4, (Function1) rememberedValue, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i15 = i14;
            j16 = j14;
            j17 = j15;
            modifier4 = modifier3;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$4(modifier4, j16, j17, i15, i9, i10));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m1282LinearProgressIndicatorRIQooxk(Modifier modifier, long j8, long j9, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        long j10;
        long j11;
        Modifier modifier3;
        long j12;
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-819397058);
        int i14 = i9 & 1;
        if (i14 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            j10 = j8;
            if ((i9 & 2) == 0 && startRestartGroup.changed(j10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        } else {
            j10 = j8;
        }
        if ((i8 & 896) == 0) {
            j11 = j9;
            if ((i9 & 4) == 0 && startRestartGroup.changed(j11)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        } else {
            j11 = j9;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            j12 = j10;
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i9 & 2) != 0) {
                    i10 &= -113;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                }
                modifier3 = modifier2;
            } else {
                if (i14 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i9 & 2) != 0) {
                    j10 = MaterialTheme.INSTANCE.getColors(startRestartGroup, 6).m1155getPrimary0d7_KjU();
                    i10 &= -113;
                }
                if ((i9 & 4) != 0) {
                    j11 = Color.m2947copywmQWz5c$default(j10, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -897;
                }
            }
            int i15 = i10;
            j12 = j10;
            long j13 = j11;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-819397058, i15, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:205)");
            }
            m1281LinearProgressIndicator2cYBFYY(modifier3, j12, j13, StrokeCap.Companion.m3278getButtKaPHkGw(), startRestartGroup, i15 & 1022, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j11 = j13;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ProgressIndicatorKt$LinearProgressIndicator$6(modifier3, j12, j11, i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[LOOP:0: B:53:0x0154->B:54:0x0156, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1283LinearProgressIndicator_5eSRE(float r25, androidx.compose.ui.Modifier r26, long r27, long r29, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1283LinearProgressIndicator_5eSRE(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1284LinearProgressIndicatoreaDK9VM(float r20, androidx.compose.ui.Modifier r21, long r22, long r24, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ProgressIndicatorKt.m1284LinearProgressIndicatoreaDK9VM(float, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LinearProgressIndicator_2cYBFYY$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m1290drawCircularIndicator42QJj7c(DrawScope drawScope, float f8, float f9, long j8, Stroke stroke) {
        float f10 = 2;
        float width = stroke.getWidth() / f10;
        float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc()) - (f10 * width);
        c.v(drawScope, j8, f8, f9, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(m2781getWidthimpl, m2781getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicatorBackground-bw27NRU, reason: not valid java name */
    public static final void m1291drawCircularIndicatorBackgroundbw27NRU(DrawScope drawScope, long j8, Stroke stroke) {
        m1290drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j8, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m1292drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f8, float f9, long j8, Stroke stroke) {
        m1290drawCircularIndicator42QJj7c(drawScope, f8, f9, j8, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m1293drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f8, float f9, float f10, long j8, Stroke stroke) {
        float m5155constructorimpl;
        if (StrokeCap.m3274equalsimpl0(stroke.m3479getCapKaPHkGw(), StrokeCap.Companion.m3278getButtKaPHkGw())) {
            m5155constructorimpl = 0.0f;
        } else {
            m5155constructorimpl = ((f9 / Dp.m5155constructorimpl(CircularIndicatorDiameter / 2)) * 57.29578f) / 2.0f;
        }
        m1290drawCircularIndicator42QJj7c(drawScope, f8 + m5155constructorimpl, Math.max(f10, 0.1f), j8, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1294drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f8, float f9, long j8, float f10, int i8) {
        boolean z8;
        float f11;
        float f12;
        float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc());
        float m2778getHeightimpl = Size.m2778getHeightimpl(drawScope.mo3391getSizeNHjbRc());
        float f13 = 2;
        float f14 = m2778getHeightimpl / f13;
        if (drawScope.getLayoutDirection() == LayoutDirection.Ltr) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            f11 = f8;
        } else {
            f11 = 1.0f - f9;
        }
        float f15 = f11 * m2781getWidthimpl;
        if (z8) {
            f12 = f9;
        } else {
            f12 = 1.0f - f8;
        }
        float f16 = f12 * m2781getWidthimpl;
        if (!StrokeCap.m3274equalsimpl0(i8, StrokeCap.Companion.m3278getButtKaPHkGw()) && m2778getHeightimpl <= m2781getWidthimpl) {
            float f17 = f10 / f13;
            InterfaceC2977e b9 = m.b(f17, m2781getWidthimpl - f17);
            float floatValue = ((Number) m.o(Float.valueOf(f15), b9)).floatValue();
            float floatValue2 = ((Number) m.o(Float.valueOf(f16), b9)).floatValue();
            if (Math.abs(f9 - f8) > 0.0f) {
                c.C(drawScope, j8, OffsetKt.Offset(floatValue, f14), OffsetKt.Offset(floatValue2, f14), f10, i8, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        c.C(drawScope, j8, OffsetKt.Offset(f15, f14), OffsetKt.Offset(f16, f14), f10, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1295drawLinearIndicatorBackgroundAZGd3zU(DrawScope drawScope, long j8, float f8, int i8) {
        m1294drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j8, f8, i8);
    }
}
