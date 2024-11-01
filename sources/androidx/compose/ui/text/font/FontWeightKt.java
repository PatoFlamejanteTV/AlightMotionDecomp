package androidx.compose.ui.text.font;

import androidx.compose.ui.util.MathHelpersKt;

/* loaded from: classes.dex */
public final class FontWeightKt {
    public static final FontWeight lerp(FontWeight fontWeight, FontWeight fontWeight2, float f8) {
        return new FontWeight(i6.m.k(MathHelpersKt.lerp(fontWeight.getWeight(), fontWeight2.getWeight(), f8), 1, 1000));
    }
}
