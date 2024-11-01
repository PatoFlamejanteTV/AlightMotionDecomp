package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    public static final Modifier overscroll(Modifier modifier, OverscrollEffect overscrollEffect) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(overscrollEffect, "overscrollEffect");
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
