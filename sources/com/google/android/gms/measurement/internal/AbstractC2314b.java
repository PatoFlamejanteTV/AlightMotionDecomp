package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import com.google.android.gms.internal.measurement.M1;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2314b {

    /* renamed from: a, reason: collision with root package name */
    String f17685a;

    /* renamed from: b, reason: collision with root package name */
    int f17686b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f17687c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f17688d;

    /* renamed from: e, reason: collision with root package name */
    Long f17689e;

    /* renamed from: f, reason: collision with root package name */
    Long f17690f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2314b(String str, int i8) {
        this.f17685a = str;
        this.f17686b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean b(double d8, com.google.android.gms.internal.measurement.K1 k12) {
        try {
            return h(new BigDecimal(d8), k12, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean c(long j8, com.google.android.gms.internal.measurement.K1 k12) {
        try {
            return h(new BigDecimal(j8), k12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean d(Boolean bool, boolean z8) {
        boolean z9;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean e(String str, com.google.android.gms.internal.measurement.K1 k12) {
        if (!Z5.g0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), k12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, M1.b bVar, boolean z8, String str2, List list, String str3, C2401n2 c2401n2) {
        int i8;
        if (str == null) {
            return null;
        }
        if (bVar == M1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z8 && bVar != M1.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (k6.f17915a[bVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i8).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c2401n2 != null) {
                        c2401n2.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(String str, com.google.android.gms.internal.measurement.M1 m12, C2401n2 c2401n2) {
        String J8;
        List list;
        String str2;
        AbstractC1396p.l(m12);
        if (str == null || !m12.O() || m12.G() == M1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        M1.b G8 = m12.G();
        M1.b bVar = M1.b.IN_LIST;
        if (G8 == bVar) {
            if (m12.j() == 0) {
                return null;
            }
        } else if (!m12.N()) {
            return null;
        }
        M1.b G9 = m12.G();
        boolean L8 = m12.L();
        if (!L8 && G9 != M1.b.REGEXP && G9 != bVar) {
            J8 = m12.J().toUpperCase(Locale.ENGLISH);
        } else {
            J8 = m12.J();
        }
        String str3 = J8;
        if (m12.j() == 0) {
            list = null;
        } else {
            List K8 = m12.K();
            if (!L8) {
                ArrayList arrayList = new ArrayList(K8.size());
                Iterator it = K8.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                K8 = DesugarCollections.unmodifiableList(arrayList);
            }
            list = K8;
        }
        if (G9 == M1.b.REGEXP) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return f(str, G9, L8, str3, list, str2, c2401n2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:            if (r3 != null) goto L36;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.K1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC2314b.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.K1, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();
}
