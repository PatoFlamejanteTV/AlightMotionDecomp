package v4;

import Q5.I;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4132a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4132a f40643a = new C4132a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f40644b = Q.e(x.a(a0.i("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"), 2));

    /* renamed from: c, reason: collision with root package name */
    public static final int f40645c = 8;

    private C4132a() {
    }

    public final String a(long j8, String amountCurrencyCode, Locale targetLocale) {
        AbstractC3292y.i(amountCurrencyCode, "amountCurrencyCode");
        AbstractC3292y.i(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        AbstractC3292y.h(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        AbstractC3292y.h(currency, "getInstance(...)");
        return b(j8, currency, targetLocale);
    }

    public final String b(long j8, Currency amountCurrency, Locale targetLocale) {
        AbstractC3292y.i(amountCurrency, "amountCurrency");
        AbstractC3292y.i(targetLocale, "targetLocale");
        int c8 = c(amountCurrency);
        double pow = j8 / Math.pow(10.0d, c8);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            s.a aVar = s.f8810b;
            AbstractC3292y.g(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(c8);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            s.b(I.f8786a);
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            s.b(t.a(th));
        }
        String format = currencyInstance.format(pow);
        AbstractC3292y.h(format, "format(...)");
        return format;
    }

    public final int c(Currency currency) {
        AbstractC3292y.i(currency, "currency");
        Map map = f40644b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            AbstractC3292y.h(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) AbstractC1435t.o0(arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
