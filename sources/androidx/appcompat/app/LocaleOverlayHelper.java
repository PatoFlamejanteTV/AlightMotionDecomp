package androidx.appcompat.app;

import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

@RequiresApi(24)
/* loaded from: classes.dex */
final class LocaleOverlayHelper {
    private LocaleOverlayHelper() {
    }

    private static LocaleListCompat combineLocales(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i8 = 0; i8 < localeListCompat.size() + localeListCompat2.size(); i8++) {
            if (i8 < localeListCompat.size()) {
                locale = localeListCompat.get(i8);
            } else {
                locale = localeListCompat2.get(i8 - localeListCompat.size());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return LocaleListCompat.create((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocaleListCompat combineLocalesIfOverlayExists(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        if (localeListCompat != null && !localeListCompat.isEmpty()) {
            return combineLocales(localeListCompat, localeListCompat2);
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    static LocaleListCompat combineLocalesIfOverlayExists(LocaleList localeList, LocaleList localeList2) {
        boolean isEmpty;
        if (localeList != null) {
            isEmpty = localeList.isEmpty();
            if (!isEmpty) {
                return combineLocales(LocaleListCompat.wrap(localeList), LocaleListCompat.wrap(localeList2));
            }
        }
        return LocaleListCompat.getEmptyLocaleList();
    }
}
