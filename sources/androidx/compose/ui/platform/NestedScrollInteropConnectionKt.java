package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;

/* loaded from: classes.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f8) {
        double floor;
        if (f8 >= 0.0f) {
            floor = Math.ceil(f8);
        } else {
            floor = Math.floor(f8);
        }
        return (float) floor;
    }

    public static final int composeToViewOffset(float f8) {
        return ((int) ceilAwayFromZero(f8)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m4467getScrollAxesk4lQ0M(long j8) {
        int i8;
        if (Math.abs(Offset.m2712getXimpl(j8)) >= 0.5f) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        if (Math.abs(Offset.m2713getYimpl(j8)) >= 0.5f) {
            return i8 | 2;
        }
        return i8;
    }

    @Composable
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(View view, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1075877987);
        if ((i9 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i8, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:235)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i8) {
        return i8 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m4468toOffsetUv8p0NA(int[] iArr, long j8) {
        float c8;
        float c9;
        if (Offset.m2712getXimpl(j8) >= 0.0f) {
            c8 = i6.m.f(reverseAxis(iArr[0]), Offset.m2712getXimpl(j8));
        } else {
            c8 = i6.m.c(reverseAxis(iArr[0]), Offset.m2712getXimpl(j8));
        }
        if (Offset.m2713getYimpl(j8) >= 0.0f) {
            c9 = i6.m.f(reverseAxis(iArr[1]), Offset.m2713getYimpl(j8));
        } else {
            c9 = i6.m.c(reverseAxis(iArr[1]), Offset.m2713getYimpl(j8));
        }
        return OffsetKt.Offset(c8, c9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m4469toViewTypeGyEprt8(int i8) {
        return !NestedScrollSource.m3895equalsimpl0(i8, NestedScrollSource.Companion.m3900getDragWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f8) {
        return f8 * (-1.0f);
    }
}
