package androidx.compose.foundation;

import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class MagnifierKt {
    private static final SemanticsPropertyKey<Function0> MagnifierPositionInRoot = new SemanticsPropertyKey<>("MagnifierPositionInRoot", null, 2, null);

    public static final SemanticsPropertyKey<Function0> getMagnifierPositionInRoot() {
        return MagnifierPositionInRoot;
    }

    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isPlatformMagnifierSupported(int i8) {
        return i8 >= 28;
    }

    public static /* synthetic */ boolean isPlatformMagnifierSupported$default(int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = Build.VERSION.SDK_INT;
        }
        return isPlatformMagnifierSupported(i8);
    }

    @RequiresApi(28)
    public static final Modifier magnifier(Modifier modifier, Function1 sourceCenter, Function1 magnifierCenter, float f8, MagnifierStyle style, Function1 function1, PlatformMagnifierFactory platformMagnifierFactory) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(sourceCenter, "sourceCenter");
        AbstractC3292y.i(magnifierCenter, "magnifierCenter");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(platformMagnifierFactory, "platformMagnifierFactory");
        return ComposedModifierKt.composed$default(modifier, null, new MagnifierKt$magnifier$4(sourceCenter, magnifierCenter, f8, function1, platformMagnifierFactory, style), 1, null);
    }

    public static /* synthetic */ Modifier magnifier$default(Modifier modifier, Function1 function1, Function1 function12, float f8, MagnifierStyle magnifierStyle, Function1 function13, int i8, Object obj) {
        float f9;
        if ((i8 & 2) != 0) {
            function12 = MagnifierKt$magnifier$1.INSTANCE;
        }
        Function1 function14 = function12;
        if ((i8 & 4) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f8;
        }
        if ((i8 & 8) != 0) {
            magnifierStyle = MagnifierStyle.Companion.getDefault();
        }
        MagnifierStyle magnifierStyle2 = magnifierStyle;
        if ((i8 & 16) != 0) {
            function13 = null;
        }
        return magnifier(modifier, function1, function14, f9, magnifierStyle2, function13);
    }

    @ExperimentalFoundationApi
    public static final Modifier magnifier(Modifier modifier, Function1 sourceCenter, Function1 magnifierCenter, float f8, MagnifierStyle style, Function1 function1) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(sourceCenter, "sourceCenter");
        AbstractC3292y.i(magnifierCenter, "magnifierCenter");
        AbstractC3292y.i(style, "style");
        Function1 magnifierKt$magnifier$$inlined$debugInspectorInfo$1 = InspectableValueKt.isDebugInspectorInfoEnabled() ? new MagnifierKt$magnifier$$inlined$debugInspectorInfo$1(sourceCenter, magnifierCenter, f8, style) : InspectableValueKt.getNoInspectorInfo();
        Modifier modifier2 = Modifier.Companion;
        if (isPlatformMagnifierSupported$default(0, 1, null)) {
            modifier2 = magnifier(modifier2, sourceCenter, magnifierCenter, f8, style, function1, PlatformMagnifierFactory.Companion.getForCurrentPlatform());
        }
        return InspectableValueKt.inspectableWrapper(modifier, magnifierKt$magnifier$$inlined$debugInspectorInfo$1, modifier2);
    }
}
