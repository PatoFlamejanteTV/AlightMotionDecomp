package l6;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class E {
    public static final String a(char c8) {
        String valueOf = String.valueOf(c8);
        AbstractC3292y.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        if (upperCase.length() > 1) {
            if (c8 != 329) {
                char charAt = upperCase.charAt(0);
                AbstractC3292y.g(upperCase, "null cannot be cast to non-null type java.lang.String");
                String substring = upperCase.substring(1);
                AbstractC3292y.h(substring, "substring(...)");
                AbstractC3292y.g(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(locale);
                AbstractC3292y.h(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return upperCase;
        }
        return String.valueOf(Character.toTitleCase(c8));
    }
}
