package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;

/* loaded from: classes.dex */
final class AndroidPreloadedFontTypefaceLoader implements AndroidFont.TypefaceLoader {
    public static final AndroidPreloadedFontTypefaceLoader INSTANCE = new AndroidPreloadedFontTypefaceLoader();

    private AndroidPreloadedFontTypefaceLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, U5.d dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are blocking.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont) {
        AndroidPreloadedFont androidPreloadedFont;
        if (androidFont instanceof AndroidPreloadedFont) {
            androidPreloadedFont = (AndroidPreloadedFont) androidFont;
        } else {
            androidPreloadedFont = null;
        }
        if (androidPreloadedFont == null) {
            return null;
        }
        return androidPreloadedFont.loadCached$ui_text_release(context);
    }
}
