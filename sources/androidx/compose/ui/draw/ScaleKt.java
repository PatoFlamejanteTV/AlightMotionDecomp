package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes.dex */
public final class ScaleKt {
    @Stable
    public static final Modifier scale(Modifier modifier, float f8, float f9) {
        return (f8 == 1.0f && f9 == 1.0f) ? modifier : GraphicsLayerModifierKt.m3108graphicsLayerAp8cVGQ$default(modifier, f8, f9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131068, null);
    }

    @Stable
    public static final Modifier scale(Modifier modifier, float f8) {
        return scale(modifier, f8, f8);
    }
}
