package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class WindowInsetsSizeKt {
    @Stable
    public static final Modifier windowInsetsBottomHeight(Modifier modifier, WindowInsets insets) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsBottomHeight$$inlined$debugInspectorInfo$1(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(insets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsBottomHeight$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsEndWidth(Modifier modifier, WindowInsets insets) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsEndWidth$$inlined$debugInspectorInfo$1(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(insets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsEndWidth$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsStartWidth(Modifier modifier, WindowInsets insets) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsStartWidth$$inlined$debugInspectorInfo$1(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedWidthModifier(insets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsStartWidth$2.INSTANCE));
    }

    @Stable
    public static final Modifier windowInsetsTopHeight(Modifier modifier, WindowInsets insets) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(insets, "insets");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new WindowInsetsSizeKt$windowInsetsTopHeight$$inlined$debugInspectorInfo$1(insets);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new DerivedHeightModifier(insets, noInspectorInfo, WindowInsetsSizeKt$windowInsetsTopHeight$2.INSTANCE));
    }
}
