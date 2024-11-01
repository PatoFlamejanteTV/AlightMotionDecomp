package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;

/* loaded from: classes.dex */
final class NamedFontLoader implements AndroidFont.TypefaceLoader {
    public static final NamedFontLoader INSTANCE = new NamedFontLoader();

    private NamedFontLoader() {
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public Object awaitLoad(Context context, AndroidFont androidFont, U5.d dVar) {
        throw new UnsupportedOperationException("All preloaded fonts are optional local.");
    }

    @Override // androidx.compose.ui.text.font.AndroidFont.TypefaceLoader
    public android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont) {
        DeviceFontFamilyNameFont deviceFontFamilyNameFont;
        if (androidFont instanceof DeviceFontFamilyNameFont) {
            deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) androidFont;
        } else {
            deviceFontFamilyNameFont = null;
        }
        if (deviceFontFamilyNameFont == null) {
            return null;
        }
        return deviceFontFamilyNameFont.loadCached(context);
    }
}
