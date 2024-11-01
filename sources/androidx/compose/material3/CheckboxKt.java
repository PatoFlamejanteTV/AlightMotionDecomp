package androidx.compose.material3;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m5155constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f8 = 2;
        CheckboxDefaultPadding = Dp.m5155constructorimpl(f8);
        StrokeWidth = Dp.m5155constructorimpl(f8);
        RadiusSize = Dp.m5155constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0061  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Checkbox(boolean r27, kotlin.jvm.functions.Function1 r28, androidx.compose.ui.Modifier r29, boolean r30, androidx.compose.material3.CheckboxColors r31, androidx.compose.foundation.interaction.MutableInteractionSource r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026f A[LOOP:0: B:100:0x026d->B:101:0x026f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0212  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CheckboxImpl(boolean r32, androidx.compose.ui.state.ToggleableState r33, androidx.compose.ui.Modifier r34, androidx.compose.material3.CheckboxColors r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TriStateCheckbox(androidx.compose.ui.state.ToggleableState r28, kotlin.jvm.functions.Function0 r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.material3.CheckboxColors r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1472drawBox1wkBAMs(DrawScope drawScope, long j8, long j9, float f8, float f9) {
        float f10 = f9 / 2.0f;
        Stroke stroke = new Stroke(f9, 0.0f, 0, 0, null, 30, null);
        float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc());
        if (Color.m2949equalsimpl0(j8, j9)) {
            c.M(drawScope, j8, 0L, SizeKt.Size(m2781getWidthimpl, m2781getWidthimpl), CornerRadiusKt.CornerRadius$default(f8, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f11 = m2781getWidthimpl - (2 * f9);
        c.M(drawScope, j8, OffsetKt.Offset(f9, f9), SizeKt.Size(f11, f11), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f8 - f9), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f12 = m2781getWidthimpl - f9;
        c.M(drawScope, j9, OffsetKt.Offset(f10, f10), SizeKt.Size(f12, f12), CornerRadiusKt.CornerRadius$default(f8 - f10, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1473drawCheck3IgeMak(DrawScope drawScope, long j8, float f8, float f9, float f10, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f10, 0.0f, StrokeCap.Companion.m3280getSquareKaPHkGw(), 0, null, 26, null);
        float m2781getWidthimpl = Size.m2781getWidthimpl(drawScope.mo3391getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f9);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f9);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f9);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f9);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m2781getWidthimpl, lerp3 * m2781getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m2781getWidthimpl, lerp2 * m2781getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m2781getWidthimpl, m2781getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f8, checkDrawingCache.getPathToDraw(), true);
        c.G(drawScope, checkDrawingCache.getPathToDraw(), j8, 0.0f, stroke, null, 0, 52, null);
    }
}
