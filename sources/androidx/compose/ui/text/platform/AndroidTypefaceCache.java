package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import androidx.collection.LruCache;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.AndroidPreloadedFont;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {
    public static final AndroidTypefaceCache INSTANCE = new AndroidTypefaceCache();
    private static final LruCache<String, Typeface> cache = new LruCache<>(16);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final String getKey(Context context, Font font) {
        String str;
        if (font instanceof ResourceFont) {
            TypedValue typedValue = new TypedValue();
            context.getResources().getValue(((ResourceFont) font).getResId(), typedValue, true);
            StringBuilder sb = new StringBuilder();
            sb.append("res:");
            CharSequence charSequence = typedValue.string;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            AbstractC3292y.f(str);
            sb.append(str);
            return sb.toString();
        }
        if (font instanceof AndroidPreloadedFont) {
            return ((AndroidPreloadedFont) font).getCacheKey();
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    public final Typeface getOrCreate(Context context, Font font) {
        Typeface loadBlocking;
        Typeface typeface;
        String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                loadBlocking = AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((ResourceFont) font).getResId());
            } else {
                loadBlocking = ResourcesCompat.getFont(context, ((ResourceFont) font).getResId());
                AbstractC3292y.f(loadBlocking);
            }
        } else if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        } else {
            throw new IllegalArgumentException("Unknown font type: " + font);
        }
        if (loadBlocking != null) {
            if (key != null) {
                cache.put(key, loadBlocking);
            }
            return loadBlocking;
        }
        throw new IllegalArgumentException("Unable to load font " + font);
    }
}
