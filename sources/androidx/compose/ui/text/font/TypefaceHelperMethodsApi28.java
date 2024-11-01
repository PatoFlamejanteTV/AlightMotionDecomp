package androidx.compose.ui.text.font;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes.dex */
public final class TypefaceHelperMethodsApi28 {
    public static final int $stable = 0;
    public static final TypefaceHelperMethodsApi28 INSTANCE = new TypefaceHelperMethodsApi28();

    private TypefaceHelperMethodsApi28() {
    }

    @DoNotInline
    @RequiresApi(28)
    public final android.graphics.Typeface create(android.graphics.Typeface typeface, int i8, boolean z8) {
        android.graphics.Typeface create;
        create = android.graphics.Typeface.create(typeface, i8, z8);
        return create;
    }
}
