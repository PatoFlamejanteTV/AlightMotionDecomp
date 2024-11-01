package androidx.compose.ui.text.intl;

/* loaded from: classes.dex */
public interface PlatformLocale {
    String getLanguage();

    String getRegion();

    String getScript();

    String toLanguageTag();
}
