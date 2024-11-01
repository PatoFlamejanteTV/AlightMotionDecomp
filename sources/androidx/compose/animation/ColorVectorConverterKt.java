package androidx.compose.animation;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ColorVectorConverterKt {
    private static final Function1 ColorToVector = ColorVectorConverterKt$ColorToVector$1.INSTANCE;

    public static final Function1 getVectorConverter(Color.Companion companion) {
        AbstractC3292y.i(companion, "<this>");
        return ColorToVector;
    }
}
