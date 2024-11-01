package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Immutable
/* loaded from: classes.dex */
public final class Locale {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final PlatformLocale platformLocale;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public Locale(PlatformLocale platformLocale) {
        this.platformLocale = platformLocale;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Locale)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC3292y.d(toLanguageTag(), ((Locale) obj).toLanguageTag());
    }

    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    public final PlatformLocale getPlatformLocale$ui_text_release() {
        return this.platformLocale;
    }

    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    public String toString() {
        return toLanguageTag();
    }

    public Locale(String str) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(str));
    }
}
