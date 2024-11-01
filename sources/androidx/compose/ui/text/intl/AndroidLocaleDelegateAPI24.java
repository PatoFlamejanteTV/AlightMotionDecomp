package androidx.compose.ui.text.intl;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;

@StabilityInferred(parameters = 0)
@RequiresApi(api = 24)
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {
    public static final int $stable = 8;
    private LocaleList lastLocaleList;
    private android.os.LocaleList lastPlatformLocaleList;
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        android.os.LocaleList localeList;
        int size;
        java.util.Locale locale;
        localeList = android.os.LocaleList.getDefault();
        synchronized (this.lock) {
            LocaleList localeList2 = this.lastLocaleList;
            if (localeList2 == null || localeList != this.lastPlatformLocaleList) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    locale = localeList.get(i8);
                    arrayList.add(new Locale(new AndroidLocale(locale)));
                }
                LocaleList localeList3 = new LocaleList(arrayList);
                this.lastPlatformLocaleList = localeList;
                this.lastLocaleList = localeList3;
                return localeList3;
            }
            return localeList2;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public PlatformLocale parseLanguageTag(String str) {
        return new AndroidLocale(java.util.Locale.forLanguageTag(str));
    }
}
