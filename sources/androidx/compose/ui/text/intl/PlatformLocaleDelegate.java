package androidx.compose.ui.text.intl;

/* loaded from: classes.dex */
public interface PlatformLocaleDelegate {
    LocaleList getCurrent();

    PlatformLocale parseLanguageTag(String str);
}
