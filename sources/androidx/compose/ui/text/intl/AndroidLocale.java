package androidx.compose.ui.text.intl;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidLocale implements PlatformLocale {
    public static final int $stable = 8;
    private final java.util.Locale javaLocale;

    public AndroidLocale(java.util.Locale locale) {
        this.javaLocale = locale;
    }

    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String getLanguage() {
        return this.javaLocale.getLanguage();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String getRegion() {
        return this.javaLocale.getCountry();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String getScript() {
        return this.javaLocale.getScript();
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    public String toLanguageTag() {
        return this.javaLocale.toLanguageTag();
    }
}
