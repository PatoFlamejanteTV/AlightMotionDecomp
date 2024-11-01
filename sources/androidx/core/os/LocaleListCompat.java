package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.core.text.ICUCompat;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class LocaleListCompat {
    private static final LocaleListCompat sEmptyLocaleList = create(new Locale[0]);
    private final LocaleListInterface mImpl;

    @RequiresApi(21)
    /* loaded from: classes3.dex */
    static class Api21Impl {
        private static final Locale[] PSEUDO_LOCALE = {new Locale("en", "XA"), new Locale("ar", "XB")};

        private Api21Impl() {
        }

        @DoNotInline
        static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean isPseudoLocale(Locale locale) {
            for (Locale locale2 : PSEUDO_LOCALE) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        @DoNotInline
        static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
                return false;
            }
            String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
            if (maximizeAndGetScript.isEmpty()) {
                String country = locale.getCountry();
                if (country.isEmpty() || country.equals(locale2.getCountry())) {
                    return true;
                }
                return false;
            }
            return maximizeAndGetScript.equals(ICUCompat.maximizeAndGetScript(locale2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(24)
    /* loaded from: classes3.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static LocaleList createLocaleList(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        @DoNotInline
        static LocaleList getAdjustedDefault() {
            return LocaleList.getAdjustedDefault();
        }

        @DoNotInline
        static LocaleList getDefault() {
            return LocaleList.getDefault();
        }
    }

    private LocaleListCompat(LocaleListInterface localeListInterface) {
        this.mImpl = localeListInterface;
    }

    @NonNull
    public static LocaleListCompat create(@NonNull Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.createLocaleList(localeArr));
        }
        return new LocaleListCompat(new LocaleListCompatWrapper(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale forLanguageTagCompat(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (str.contains("_")) {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        } else {
            return new Locale(str);
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    @NonNull
    public static LocaleListCompat forLanguageTags(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i8 = 0; i8 < length; i8++) {
                localeArr[i8] = Api21Impl.forLanguageTag(split[i8]);
            }
            return create(localeArr);
        }
        return getEmptyLocaleList();
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getAdjustedDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.getAdjustedDefault());
        }
        return create(Locale.getDefault());
    }

    @NonNull
    @Size(min = 1)
    public static LocaleListCompat getDefault() {
        if (Build.VERSION.SDK_INT >= 24) {
            return wrap(Api24Impl.getDefault());
        }
        return create(Locale.getDefault());
    }

    @NonNull
    public static LocaleListCompat getEmptyLocaleList() {
        return sEmptyLocaleList;
    }

    @RequiresApi(21)
    public static boolean matchesLanguageAndScript(@NonNull Locale locale, @NonNull Locale locale2) {
        boolean matchesLanguageAndScript;
        if (Build.VERSION.SDK_INT >= 33) {
            matchesLanguageAndScript = LocaleList.matchesLanguageAndScript(locale, locale2);
            return matchesLanguageAndScript;
        }
        return Api21Impl.matchesLanguageAndScript(locale, locale2);
    }

    @RequiresApi(24)
    @Deprecated
    public static LocaleListCompat wrap(Object obj) {
        return wrap(b.a(obj));
    }

    public boolean equals(Object obj) {
        if ((obj instanceof LocaleListCompat) && this.mImpl.equals(((LocaleListCompat) obj).mImpl)) {
            return true;
        }
        return false;
    }

    @Nullable
    public Locale get(int i8) {
        return this.mImpl.get(i8);
    }

    @Nullable
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return this.mImpl.getFirstMatch(strArr);
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    @IntRange(from = -1)
    public int indexOf(@Nullable Locale locale) {
        return this.mImpl.indexOf(locale);
    }

    public boolean isEmpty() {
        return this.mImpl.isEmpty();
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    public int size() {
        return this.mImpl.size();
    }

    @NonNull
    public String toLanguageTags() {
        return this.mImpl.toLanguageTags();
    }

    @NonNull
    public String toString() {
        return this.mImpl.toString();
    }

    @Nullable
    public Object unwrap() {
        return this.mImpl.getLocaleList();
    }

    @NonNull
    @RequiresApi(24)
    public static LocaleListCompat wrap(@NonNull LocaleList localeList) {
        return new LocaleListCompat(new LocaleListPlatformWrapper(localeList));
    }
}
