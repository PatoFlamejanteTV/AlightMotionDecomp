package androidx.compose.ui.text.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidStringDelegate implements PlatformStringDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String capitalize(String str, PlatformLocale platformLocale) {
        String valueOf;
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                AbstractC3292y.g(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                valueOf = AbstractC3335a.e(charAt, ((AndroidLocale) platformLocale).getJavaLocale());
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb.append((Object) valueOf);
            String substring = str.substring(1);
            AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String decapitalize(String str, PlatformLocale platformLocale) {
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            char charAt = str.charAt(0);
            AbstractC3292y.g(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            sb.append((Object) AbstractC3335a.d(charAt, ((AndroidLocale) platformLocale).getJavaLocale()));
            String substring = str.substring(1);
            AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            return sb.toString();
        }
        return str;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toLowerCase(String str, PlatformLocale platformLocale) {
        AbstractC3292y.g(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String lowerCase = str.toLowerCase(((AndroidLocale) platformLocale).getJavaLocale());
        AbstractC3292y.h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    public String toUpperCase(String str, PlatformLocale platformLocale) {
        AbstractC3292y.g(platformLocale, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
        String upperCase = str.toUpperCase(((AndroidLocale) platformLocale).getJavaLocale());
        AbstractC3292y.h(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
