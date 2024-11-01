package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AspectRatioKt {
    @Stable
    public static final Modifier aspectRatio(Modifier modifier, float f8, boolean z8) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1(f8, z8);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AspectRatioElement(f8, z8, noInspectorInfo));
    }

    public static /* synthetic */ Modifier aspectRatio$default(Modifier modifier, float f8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return aspectRatio(modifier, f8, z8);
    }
}
