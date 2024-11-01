package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ExcludeFromSystemGesture_androidKt {
    public static final Modifier excludeFromSystemGesture(Modifier modifier) {
        AbstractC3292y.i(modifier, "<this>");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier);
    }

    public static final Modifier excludeFromSystemGesture(Modifier modifier, Function1 exclusion) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(exclusion, "exclusion");
        return SystemGestureExclusionKt.systemGestureExclusion(modifier, exclusion);
    }
}
