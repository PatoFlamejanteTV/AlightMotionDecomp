package androidx.compose.ui.text.intl;

import R5.AbstractC1435t;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        return new LocaleList((List<Locale>) AbstractC1435t.e(new Locale(new AndroidLocale(java.util.Locale.getDefault()))));
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public PlatformLocale parseLanguageTag(String str) {
        return new AndroidLocale(java.util.Locale.forLanguageTag(str));
    }
}
