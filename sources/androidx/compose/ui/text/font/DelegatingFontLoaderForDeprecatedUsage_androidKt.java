package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;

/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader, Context context) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    public static final FontFamily.Resolver createFontFamilyResolver(Font.ResourceLoader resourceLoader) {
        return new FontFamilyResolverImpl(new DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
