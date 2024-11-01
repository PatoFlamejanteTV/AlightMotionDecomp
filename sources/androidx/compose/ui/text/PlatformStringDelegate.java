package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.PlatformLocale;

/* loaded from: classes.dex */
public interface PlatformStringDelegate {
    String capitalize(String str, PlatformLocale platformLocale);

    String decapitalize(String str, PlatformLocale platformLocale);

    String toLowerCase(String str, PlatformLocale platformLocale);

    String toUpperCase(String str, PlatformLocale platformLocale);
}
