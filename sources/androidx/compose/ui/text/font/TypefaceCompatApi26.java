package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Paint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.util.ListUtilsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class TypefaceCompatApi26 {
    public static final TypefaceCompatApi26 INSTANCE = new TypefaceCompatApi26();
    private static ThreadLocal<Paint> threadLocalPaint = new ThreadLocal<>();

    private TypefaceCompatApi26() {
    }

    @ExperimentalTextApi
    private final String toAndroidString(FontVariation.Settings settings, Context context) {
        return ListUtilsKt.fastJoinToString$default(settings.getSettings(), null, null, null, 0, null, new TypefaceCompatApi26$toAndroidString$1(AndroidDensity_androidKt.Density(context)), 31, null);
    }

    @ExperimentalTextApi
    public final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        if (typeface == null) {
            return null;
        }
        if (settings.getSettings().isEmpty()) {
            return typeface;
        }
        Paint paint = threadLocalPaint.get();
        if (paint == null) {
            paint = new Paint();
            threadLocalPaint.set(paint);
        }
        paint.setTypeface(typeface);
        paint.setFontVariationSettings(toAndroidString(settings, context));
        return paint.getTypeface();
    }
}
