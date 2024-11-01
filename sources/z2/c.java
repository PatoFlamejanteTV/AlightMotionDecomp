package z2;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import z2.b;

/* loaded from: classes4.dex */
public abstract class c {
    public static final b a(Locale locale) {
        AbstractC3292y.i(locale, "<this>");
        b.C0945b c0945b = b.Companion;
        String country = locale.getCountry();
        AbstractC3292y.h(country, "getCountry(...)");
        return c0945b.a(country);
    }
}
