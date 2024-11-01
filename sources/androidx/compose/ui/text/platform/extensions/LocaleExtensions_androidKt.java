package androidx.compose.ui.text.platform.extensions;

import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LocaleExtensions_androidKt {
    public static final Locale toJavaLocale(androidx.compose.ui.text.intl.Locale locale) {
        PlatformLocale platformLocale$ui_text_release = locale.getPlatformLocale$ui_text_release();
        AbstractC3292y.g(platformLocale$ui_text_release, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        return ((AndroidLocale) platformLocale$ui_text_release).getJavaLocale();
    }
}
