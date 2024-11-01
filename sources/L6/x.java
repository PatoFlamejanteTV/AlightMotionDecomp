package l6;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import i6.C2979g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public abstract class x extends w {

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a */
        final /* synthetic */ char[] f34801a;

        /* renamed from: b */
        final /* synthetic */ boolean f34802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z8) {
            super(2);
            this.f34801a = cArr;
            this.f34802b = z8;
        }

        public final Q5.r a(CharSequence $receiver, int i8) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            int S8 = x.S($receiver, this.f34801a, i8, this.f34802b);
            if (S8 < 0) {
                return null;
            }
            return Q5.x.a(Integer.valueOf(S8), 1);
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3293z implements InterfaceC2072n {

        /* renamed from: a */
        final /* synthetic */ List f34803a;

        /* renamed from: b */
        final /* synthetic */ boolean f34804b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List list, boolean z8) {
            super(2);
            this.f34803a = list;
            this.f34804b = z8;
        }

        public final Q5.r a(CharSequence $receiver, int i8) {
            AbstractC3292y.i($receiver, "$this$$receiver");
            Q5.r J8 = x.J($receiver, this.f34803a, i8, this.f34804b, false);
            if (J8 != null) {
                return Q5.x.a(J8.c(), Integer.valueOf(((String) J8.d()).length()));
            }
            return null;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3293z implements Function1 {

        /* renamed from: a */
        final /* synthetic */ CharSequence f34805a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f34805a = charSequence;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(i6.i it) {
            AbstractC3292y.i(it, "it");
            return x.z0(this.f34805a, it);
        }
    }

    public static final String A0(String str, i6.i range) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(range, "range");
        String substring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        AbstractC3292y.h(substring, "substring(...)");
        return substring;
    }

    public static String B0(String str, char c8, String missingDelimiterValue) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(missingDelimiterValue, "missingDelimiterValue");
        int Q8 = n.Q(str, c8, 0, false, 6, null);
        if (Q8 != -1) {
            String substring = str.substring(Q8 + 1, str.length());
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final String C0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(delimiter, "delimiter");
        AbstractC3292y.i(missingDelimiterValue, "missingDelimiterValue");
        int R8 = n.R(str, delimiter, 0, false, 6, null);
        if (R8 != -1) {
            String substring = str.substring(R8 + delimiter.length(), str.length());
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final boolean D(CharSequence charSequence, char c8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (n.Q(charSequence, c8, 0, z8, 2, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String D0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return n.B0(str, c8, str2);
    }

    public static boolean E(CharSequence charSequence, CharSequence other, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(other, "other");
        if (other instanceof String) {
            if (n.R(charSequence, (String) other, 0, z8, 2, null) < 0) {
                return false;
            }
        } else if (P(charSequence, other, 0, charSequence.length(), z8, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ String E0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return C0(str, str2, str3);
    }

    public static /* synthetic */ boolean F(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return D(charSequence, c8, z8);
    }

    public static String F0(String str, char c8, String missingDelimiterValue) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(missingDelimiterValue, "missingDelimiterValue");
        int W8 = n.W(str, c8, 0, false, 6, null);
        if (W8 != -1) {
            String substring = str.substring(W8 + 1, str.length());
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ boolean G(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return n.E(charSequence, charSequence2, z8);
    }

    public static /* synthetic */ String G0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return n.F0(str, c8, str2);
    }

    public static final boolean H(CharSequence charSequence, CharSequence suffix, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(suffix, "suffix");
        if (!z8 && (charSequence instanceof String) && (suffix instanceof String)) {
            return n.r((String) charSequence, (String) suffix, false, 2, null);
        }
        return j0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z8);
    }

    public static final String H0(String str, char c8, String missingDelimiterValue) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(missingDelimiterValue, "missingDelimiterValue");
        int Q8 = n.Q(str, c8, 0, false, 6, null);
        if (Q8 != -1) {
            String substring = str.substring(0, Q8);
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static /* synthetic */ boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return H(charSequence, charSequence2, z8);
    }

    public static final String I0(String str, String delimiter, String missingDelimiterValue) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(delimiter, "delimiter");
        AbstractC3292y.i(missingDelimiterValue, "missingDelimiterValue");
        int R8 = n.R(str, delimiter, 0, false, 6, null);
        if (R8 != -1) {
            String substring = str.substring(0, R8);
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return missingDelimiterValue;
    }

    public static final Q5.r J(CharSequence charSequence, Collection collection, int i8, boolean z8, boolean z9) {
        C2979g p8;
        Object obj;
        Object obj2;
        int X8;
        if (!z8 && collection.size() == 1) {
            String str = (String) AbstractC1435t.J0(collection);
            if (!z9) {
                X8 = n.R(charSequence, str, i8, false, 4, null);
            } else {
                X8 = n.X(charSequence, str, i8, false, 4, null);
            }
            if (X8 < 0) {
                return null;
            }
            return Q5.x.a(Integer.valueOf(X8), str);
        }
        if (!z9) {
            p8 = new i6.i(i6.m.d(i8, 0), charSequence.length());
        } else {
            p8 = i6.m.p(i6.m.g(i8, n.L(charSequence)), 0);
        }
        if (charSequence instanceof String) {
            int e8 = p8.e();
            int g8 = p8.g();
            int j8 = p8.j();
            if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
                while (true) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            String str2 = (String) obj2;
                            if (n.u(str2, 0, (String) charSequence, e8, str2.length(), z8)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    String str3 = (String) obj2;
                    if (str3 != null) {
                        return Q5.x.a(Integer.valueOf(e8), str3);
                    }
                    if (e8 == g8) {
                        break;
                    }
                    e8 += j8;
                }
            }
        } else {
            int e9 = p8.e();
            int g9 = p8.g();
            int j9 = p8.j();
            if ((j9 > 0 && e9 <= g9) || (j9 < 0 && g9 <= e9)) {
                while (true) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            String str4 = (String) obj;
                            if (j0(str4, 0, charSequence, e9, str4.length(), z8)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 != null) {
                        return Q5.x.a(Integer.valueOf(e9), str5);
                    }
                    if (e9 == g9) {
                        break;
                    }
                    e9 += j9;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ String J0(String str, char c8, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = str;
        }
        return H0(str, c8, str2);
    }

    public static i6.i K(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        return new i6.i(0, charSequence.length() - 1);
    }

    public static /* synthetic */ String K0(String str, String str2, String str3, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str3 = str;
        }
        return I0(str, str2, str3);
    }

    public static int L(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static Boolean L0(String str) {
        AbstractC3292y.i(str, "<this>");
        if (AbstractC3292y.d(str, "true")) {
            return Boolean.TRUE;
        }
        if (AbstractC3292y.d(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int M(CharSequence charSequence, char c8, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c8, i8);
        }
        return S(charSequence, new char[]{c8}, i8, z8);
    }

    public static CharSequence M0(CharSequence charSequence) {
        int i8;
        AbstractC3292y.i(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i9 = 0;
        boolean z8 = false;
        while (i9 <= length) {
            if (!z8) {
                i8 = i9;
            } else {
                i8 = length;
            }
            boolean c8 = AbstractC3335a.c(charSequence.charAt(i8));
            if (!z8) {
                if (!c8) {
                    z8 = true;
                } else {
                    i9++;
                }
            } else {
                if (!c8) {
                    break;
                }
                length--;
            }
        }
        return charSequence.subSequence(i9, length + 1);
    }

    public static final int N(CharSequence charSequence, String string, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(string, i8);
        }
        return P(charSequence, string, i8, charSequence.length(), z8, false, 16, null);
    }

    public static String N0(String str, char... chars) {
        CharSequence charSequence;
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(chars, "chars");
        int length = str.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (!AbstractC1428l.T(chars, str.charAt(i8))) {
                    charSequence = str.subSequence(i8, str.length());
                    break;
                }
                i8++;
            } else {
                charSequence = "";
                break;
            }
        }
        return charSequence.toString();
    }

    private static final int O(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9) {
        C2979g p8;
        if (!z9) {
            p8 = new i6.i(i6.m.d(i8, 0), i6.m.g(i9, charSequence.length()));
        } else {
            p8 = i6.m.p(i6.m.g(i8, n.L(charSequence)), i6.m.d(i9, 0));
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int e8 = p8.e();
            int g8 = p8.g();
            int j8 = p8.j();
            if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
                while (!n.u((String) charSequence2, 0, (String) charSequence, e8, charSequence2.length(), z8)) {
                    if (e8 != g8) {
                        e8 += j8;
                    } else {
                        return -1;
                    }
                }
                return e8;
            }
            return -1;
        }
        int e9 = p8.e();
        int g9 = p8.g();
        int j9 = p8.j();
        if ((j9 > 0 && e9 <= g9) || (j9 < 0 && g9 <= e9)) {
            while (!j0(charSequence2, 0, charSequence, e9, charSequence2.length(), z8)) {
                if (e9 != g9) {
                    e9 += j9;
                } else {
                    return -1;
                }
            }
            return e9;
        }
        return -1;
    }

    static /* synthetic */ int P(CharSequence charSequence, CharSequence charSequence2, int i8, int i9, boolean z8, boolean z9, int i10, Object obj) {
        boolean z10;
        if ((i10 & 16) != 0) {
            z10 = false;
        } else {
            z10 = z9;
        }
        return O(charSequence, charSequence2, i8, i9, z8, z10);
    }

    public static /* synthetic */ int Q(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return M(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return N(charSequence, str, i8, z8);
    }

    public static final int S(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC1428l.J0(chars), i8);
        }
        int d8 = i6.m.d(i8, 0);
        int L8 = n.L(charSequence);
        if (d8 > L8) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(d8);
            for (char c8 : chars) {
                if (AbstractC3337c.h(c8, charAt, z8)) {
                    return d8;
                }
            }
            if (d8 != L8) {
                d8++;
            } else {
                return -1;
            }
        }
    }

    public static boolean T(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        for (int i8 = 0; i8 < charSequence.length(); i8++) {
            if (!AbstractC3335a.c(charSequence.charAt(i8))) {
                return false;
            }
        }
        return true;
    }

    public static final int U(CharSequence charSequence, char c8, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c8, i8);
        }
        return Y(charSequence, new char[]{c8}, i8, z8);
    }

    public static final int V(CharSequence charSequence, String string, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(string, "string");
        if (!z8 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(string, i8);
        }
        return O(charSequence, string, i8, 0, z8, true);
    }

    public static /* synthetic */ int W(CharSequence charSequence, char c8, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = n.L(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return U(charSequence, c8, i8, z8);
    }

    public static /* synthetic */ int X(CharSequence charSequence, String str, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = n.L(charSequence);
        }
        if ((i9 & 4) != 0) {
            z8 = false;
        }
        return V(charSequence, str, i8, z8);
    }

    public static final int Y(CharSequence charSequence, char[] chars, int i8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(chars, "chars");
        if (!z8 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC1428l.J0(chars), i8);
        }
        for (int g8 = i6.m.g(i8, n.L(charSequence)); -1 < g8; g8--) {
            char charAt = charSequence.charAt(g8);
            for (char c8 : chars) {
                if (AbstractC3337c.h(c8, charAt, z8)) {
                    return g8;
                }
            }
        }
        return -1;
    }

    public static final InterfaceC3255g Z(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        return u0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List a0(CharSequence charSequence) {
        AbstractC3292y.i(charSequence, "<this>");
        return AbstractC3258j.D(Z(charSequence));
    }

    public static final CharSequence b0(CharSequence charSequence, int i8, char c8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i8);
            sb.append(charSequence);
            int length = i8 - charSequence.length();
            int i9 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c8);
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
    }

    public static String c0(String str, int i8, char c8) {
        AbstractC3292y.i(str, "<this>");
        return b0(str, i8, c8).toString();
    }

    public static final CharSequence d0(CharSequence charSequence, int i8, char c8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (i8 >= 0) {
            if (i8 <= charSequence.length()) {
                return charSequence.subSequence(0, charSequence.length());
            }
            StringBuilder sb = new StringBuilder(i8);
            int length = i8 - charSequence.length();
            int i9 = 1;
            if (1 <= length) {
                while (true) {
                    sb.append(c8);
                    if (i9 == length) {
                        break;
                    }
                    i9++;
                }
            }
            sb.append(charSequence);
            return sb;
        }
        throw new IllegalArgumentException("Desired length " + i8 + " is less than zero.");
    }

    public static String e0(String str, int i8, char c8) {
        AbstractC3292y.i(str, "<this>");
        return d0(str, i8, c8).toString();
    }

    private static final InterfaceC3255g f0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9) {
        n0(i9);
        return new C3339e(charSequence, i8, i9, new a(cArr, z8));
    }

    private static final InterfaceC3255g g0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9) {
        n0(i9);
        return new C3339e(charSequence, i8, i9, new b(AbstractC1428l.c(strArr), z8));
    }

    static /* synthetic */ InterfaceC3255g h0(CharSequence charSequence, char[] cArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return f0(charSequence, cArr, i8, z8, i9);
    }

    static /* synthetic */ InterfaceC3255g i0(CharSequence charSequence, String[] strArr, int i8, boolean z8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            z8 = false;
        }
        if ((i10 & 8) != 0) {
            i9 = 0;
        }
        return g0(charSequence, strArr, i8, z8, i9);
    }

    public static final boolean j0(CharSequence charSequence, int i8, CharSequence other, int i9, int i10, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(other, "other");
        if (i9 < 0 || i8 < 0 || i8 > charSequence.length() - i10 || i9 > other.length() - i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!AbstractC3337c.h(charSequence.charAt(i8 + i11), other.charAt(i9 + i11), z8)) {
                return false;
            }
        }
        return true;
    }

    public static String k0(String str, CharSequence prefix) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(prefix, "prefix");
        if (y0(str, prefix, false, 2, null)) {
            String substring = str.substring(prefix.length());
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String l0(String str, CharSequence suffix) {
        AbstractC3292y.i(str, "<this>");
        AbstractC3292y.i(suffix, "suffix");
        if (n.I(str, suffix, false, 2, null)) {
            String substring = str.substring(0, str.length() - suffix.length());
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static CharSequence m0(CharSequence charSequence, int i8, int i9, CharSequence replacement) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(replacement, "replacement");
        if (i9 >= i8) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i8);
            AbstractC3292y.h(sb, "append(...)");
            sb.append(replacement);
            sb.append(charSequence, i9, charSequence.length());
            AbstractC3292y.h(sb, "append(...)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i9 + ") is less than start index (" + i8 + ").");
    }

    public static final void n0(int i8) {
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i8).toString());
    }

    public static final List o0(CharSequence charSequence, char[] delimiters, boolean z8, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return q0(charSequence, String.valueOf(delimiters[0]), z8, i8);
        }
        Iterable m8 = AbstractC3258j.m(h0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(m8, 10));
        Iterator it = m8.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (i6.i) it.next()));
        }
        return arrayList;
    }

    public static final List p0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return q0(charSequence, str, z8, i8);
            }
        }
        Iterable m8 = AbstractC3258j.m(i0(charSequence, delimiters, 0, z8, i8, 2, null));
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(m8, 10));
        Iterator it = m8.iterator();
        while (it.hasNext()) {
            arrayList.add(z0(charSequence, (i6.i) it.next()));
        }
        return arrayList;
    }

    private static final List q0(CharSequence charSequence, String str, boolean z8, int i8) {
        boolean z9;
        n0(i8);
        int i9 = 0;
        int N8 = N(charSequence, str, 0, z8);
        if (N8 != -1 && i8 != 1) {
            if (i8 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int i10 = 10;
            if (z9) {
                i10 = i6.m.g(i8, 10);
            }
            ArrayList arrayList = new ArrayList(i10);
            do {
                arrayList.add(charSequence.subSequence(i9, N8).toString());
                i9 = str.length() + N8;
                if (z9 && arrayList.size() == i8 - 1) {
                    break;
                }
                N8 = N(charSequence, str, i9, z8);
            } while (N8 != -1);
            arrayList.add(charSequence.subSequence(i9, charSequence.length()).toString());
            return arrayList;
        }
        return AbstractC1435t.e(charSequence.toString());
    }

    public static /* synthetic */ List r0(CharSequence charSequence, char[] cArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return o0(charSequence, cArr, z8, i8);
    }

    public static /* synthetic */ List s0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return p0(charSequence, strArr, z8, i8);
    }

    public static final InterfaceC3255g t0(CharSequence charSequence, String[] delimiters, boolean z8, int i8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(delimiters, "delimiters");
        return AbstractC3258j.y(i0(charSequence, delimiters, 0, z8, i8, 2, null), new c(charSequence));
    }

    public static /* synthetic */ InterfaceC3255g u0(CharSequence charSequence, String[] strArr, boolean z8, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        }
        return t0(charSequence, strArr, z8, i8);
    }

    public static final boolean v0(CharSequence charSequence, char c8, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        if (charSequence.length() <= 0 || !AbstractC3337c.h(charSequence.charAt(0), c8, z8)) {
            return false;
        }
        return true;
    }

    public static final boolean w0(CharSequence charSequence, CharSequence prefix, boolean z8) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(prefix, "prefix");
        if (!z8 && (charSequence instanceof String) && (prefix instanceof String)) {
            return n.B((String) charSequence, (String) prefix, false, 2, null);
        }
        return j0(charSequence, 0, prefix, 0, prefix.length(), z8);
    }

    public static /* synthetic */ boolean x0(CharSequence charSequence, char c8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return v0(charSequence, c8, z8);
    }

    public static /* synthetic */ boolean y0(CharSequence charSequence, CharSequence charSequence2, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return w0(charSequence, charSequence2, z8);
    }

    public static final String z0(CharSequence charSequence, i6.i range) {
        AbstractC3292y.i(charSequence, "<this>");
        AbstractC3292y.i(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }
}
