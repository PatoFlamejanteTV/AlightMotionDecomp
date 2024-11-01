package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsPadding_androidKt {
    public static final Modifier captionBarPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$captionBarPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier displayCutoutPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$displayCutoutPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier imePadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$imePadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier mandatorySystemGesturesPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$mandatorySystemGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier navigationBarsPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier safeContentPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeContentPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier safeDrawingPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeDrawingPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier safeGesturesPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$safeGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier statusBarsPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$statusBarsPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier systemBarsPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$systemBarsPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier systemGesturesPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$systemGesturesPadding$$inlined$windowInsetsPadding$1());
    }

    public static final Modifier waterfallPadding(Modifier modifier) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$debugInspectorInfo$1();
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new WindowInsetsPadding_androidKt$waterfallPadding$$inlined$windowInsetsPadding$1());
    }

    @Stable
    private static final Modifier windowInsetsPadding(Modifier modifier, Function1 function1, Function1 function12) {
        return ComposedModifierKt.composed(modifier, function1, new WindowInsetsPadding_androidKt$windowInsetsPadding$1(function12));
    }
}
