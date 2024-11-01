package n2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3292y;
import v4.C4132a;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f35393a = new o();

    private o() {
    }

    public static final String a(long j8, Currency currency) {
        AbstractC3292y.i(currency, "currency");
        int c8 = C4132a.f40643a.c(currency);
        int length = String.valueOf(j8).length();
        StringBuilder sb = new StringBuilder();
        if (c8 == 0) {
            for (int i8 = 0; i8 < length; i8++) {
                sb.append('#');
            }
            DecimalFormat decimalFormat = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
            decimalFormat.setCurrency(currency);
            decimalFormat.setGroupingUsed(false);
            String format = decimalFormat.format(j8);
            AbstractC3292y.h(format, "format(...)");
            return format;
        }
        int i9 = length - c8;
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append('#');
        }
        if (length <= c8) {
            sb.append('0');
        }
        sb.append('.');
        for (int i11 = 0; i11 < c8; i11++) {
            sb.append('0');
        }
        double pow = j8 / Math.pow(10.0d, c8);
        DecimalFormat decimalFormat2 = new DecimalFormat(sb.toString(), DecimalFormatSymbols.getInstance(Locale.ROOT));
        decimalFormat2.setCurrency(currency);
        decimalFormat2.setGroupingUsed(false);
        String format2 = decimalFormat2.format(pow);
        AbstractC3292y.h(format2, "format(...)");
        return format2;
    }
}
