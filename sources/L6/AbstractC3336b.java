package l6;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3336b {
    public static int a(int i8) {
        if (2 <= i8 && i8 < 37) {
            return i8;
        }
        throw new IllegalArgumentException("radix " + i8 + " was not in valid range " + new i6.i(2, 36));
    }

    public static final int b(char c8, int i8) {
        return Character.digit((int) c8, i8);
    }

    public static boolean c(char c8) {
        if (!Character.isWhitespace(c8) && !Character.isSpaceChar(c8)) {
            return false;
        }
        return true;
    }

    public static String d(char c8, Locale locale) {
        AbstractC3292y.i(locale, "locale");
        String valueOf = String.valueOf(c8);
        AbstractC3292y.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        AbstractC3292y.h(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static String e(char c8, Locale locale) {
        AbstractC3292y.i(locale, "locale");
        String f8 = f(c8, locale);
        if (f8.length() > 1) {
            if (c8 != 329) {
                char charAt = f8.charAt(0);
                AbstractC3292y.g(f8, "null cannot be cast to non-null type java.lang.String");
                String substring = f8.substring(1);
                AbstractC3292y.h(substring, "substring(...)");
                AbstractC3292y.g(substring, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = substring.toLowerCase(Locale.ROOT);
                AbstractC3292y.h(lowerCase, "toLowerCase(...)");
                return charAt + lowerCase;
            }
            return f8;
        }
        String valueOf = String.valueOf(c8);
        AbstractC3292y.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        if (!AbstractC3292y.d(f8, upperCase)) {
            return f8;
        }
        return String.valueOf(Character.toTitleCase(c8));
    }

    public static final String f(char c8, Locale locale) {
        AbstractC3292y.i(locale, "locale");
        String valueOf = String.valueOf(c8);
        AbstractC3292y.g(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
