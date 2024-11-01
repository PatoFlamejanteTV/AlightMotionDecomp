package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;

    /* renamed from: P1, reason: collision with root package name */
    private static final float f14407P1 = 0.175f;

    /* renamed from: P2, reason: collision with root package name */
    private static final float f14408P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    @ExperimentalLayoutApi
    public static final Modifier imeNestedScroll(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, WindowInsetsConnection_androidKt$imeNestedScroll$2.INSTANCE);
    }

    @Composable
    @ExperimentalLayoutApi
    /* renamed from: rememberWindowInsetsConnection-VRgvIgI, reason: not valid java name */
    public static final NestedScrollConnection m647rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets windowInsets, int i8, Composer composer, int i9) {
        AbstractC3292y.i(windowInsets, "windowInsets");
        composer.startReplaceableGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i9, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator m607chooseCalculatorni1skBw = SideCalculator.Companion.m607chooseCalculatorni1skBw(i8, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {windowInsets, view, m607chooseCalculatorni1skBw, density};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            z8 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowInsetsNestedScrollConnection(windowInsets, view, m607chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) rememberedValue;
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, new WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1(windowInsetsNestedScrollConnection), composer, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsNestedScrollConnection;
    }
}
