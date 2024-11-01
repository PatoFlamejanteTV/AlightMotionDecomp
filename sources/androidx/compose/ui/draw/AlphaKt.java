package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;

/* loaded from: classes.dex */
public final class AlphaKt {
    @Stable
    public static final Modifier alpha(Modifier modifier, float f8) {
        if (f8 == 1.0f) {
            return modifier;
        }
        return GraphicsLayerModifierKt.m3108graphicsLayerAp8cVGQ$default(modifier, 0.0f, 0.0f, f8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 0, 126971, null);
    }
}
