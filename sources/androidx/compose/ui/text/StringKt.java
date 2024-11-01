package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;

/* loaded from: classes.dex */
public final class StringKt {
    private static final PlatformStringDelegate stringDelegate = AndroidStringDelegate_androidKt.ActualStringDelegate();

    public static final String capitalize(String str, Locale locale) {
        return stringDelegate.capitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String decapitalize(String str, Locale locale) {
        return stringDelegate.decapitalize(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toLowerCase(String str, Locale locale) {
        return stringDelegate.toLowerCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String toUpperCase(String str, Locale locale) {
        return stringDelegate.toUpperCase(str, locale.getPlatformLocale$ui_text_release());
    }

    public static final String capitalize(String str, LocaleList localeList) {
        return capitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String decapitalize(String str, LocaleList localeList) {
        return decapitalize(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toLowerCase(String str, LocaleList localeList) {
        return toLowerCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }

    public static final String toUpperCase(String str, LocaleList localeList) {
        return toUpperCase(str, localeList.isEmpty() ? Locale.Companion.getCurrent() : localeList.get(0));
    }
}
