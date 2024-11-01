package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;

/* loaded from: classes.dex */
public final class PlatformTypefaces_androidKt {
    public static final PlatformTypefaces PlatformTypefaces() {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PlatformTypefacesApi28();
        }
        return new PlatformTypefacesApi();
    }

    @VisibleForTesting
    public static final String getWeightSuffixForFallbackFamilyName(String str, FontWeight fontWeight) {
        int weight = fontWeight.getWeight() / 100;
        if (weight >= 0 && weight < 2) {
            return str + "-thin";
        }
        if (2 <= weight && weight < 4) {
            return str + "-light";
        }
        if (weight != 4) {
            if (weight == 5) {
                return str + "-medium";
            }
            if ((6 > weight || weight >= 8) && 8 <= weight && weight < 11) {
                return str + "-black";
            }
            return str;
        }
        return str;
    }

    @ExperimentalTextApi
    public static final android.graphics.Typeface setFontVariationSettings(android.graphics.Typeface typeface, FontVariation.Settings settings, Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceCompatApi26.INSTANCE.setFontVariationSettings(typeface, settings, context);
        }
        return typeface;
    }
}
