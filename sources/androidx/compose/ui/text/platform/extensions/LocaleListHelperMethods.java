package androidx.compose.ui.text.platform.extensions;

import R5.AbstractC1435t;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

@StabilityInferred(parameters = 1)
@RequiresApi(24)
/* loaded from: classes.dex */
public final class LocaleListHelperMethods {
    public static final int $stable = 0;
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    private LocaleListHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final Object localeSpan(LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return c.a(b.a((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setTextLocales(AndroidTextPaint androidTextPaint, LocaleList localeList) {
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        androidTextPaint.setTextLocales(b.a((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
