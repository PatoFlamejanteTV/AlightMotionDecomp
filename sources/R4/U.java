package r4;

import R5.AbstractC1435t;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.os.LocaleListCompat;
import i6.C2975c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.U;

/* loaded from: classes4.dex */
public abstract class U {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38189a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C2975c f38190b = new C2975c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private static final Map f38191c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List a(String str) {
            Map map = U.f38191c;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (AbstractC3292y.d(((b) entry.getValue()).b(), str)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((b) ((Map.Entry) it.next()).getValue()).c());
            }
            return arrayList;
        }

        private final String b(String str, LocaleListCompat localeListCompat) {
            List a9 = a(str);
            if (!(!a9.isEmpty())) {
                a9 = null;
            }
            if (a9 == null) {
                return null;
            }
            int size = localeListCompat.size();
            for (int i8 = 0; i8 < size; i8++) {
                Locale locale = localeListCompat.get(i8);
                AbstractC3292y.f(locale);
                if (a9.contains(locale.getCountry())) {
                    return locale.getCountry();
                }
            }
            return (String) AbstractC1435t.m0(a9);
        }

        public final U c(String countryCode) {
            AbstractC3292y.i(countryCode, "countryCode");
            Map map = U.f38191c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return new d(bVar);
            }
            return new c(countryCode);
        }

        public final U d(String phoneNumber) {
            AbstractC3292y.i(phoneNumber, "phoneNumber");
            int i8 = 1;
            while (i8 < l6.n.L(phoneNumber) && i8 < 4) {
                i8++;
                String substring = phoneNumber.substring(0, i8);
                AbstractC3292y.h(substring, "substring(...)");
                LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
                AbstractC3292y.h(adjustedDefault, "getAdjustedDefault(...)");
                String b9 = b(substring, adjustedDefault);
                if (b9 != null) {
                    return c(b9);
                }
            }
            return null;
        }

        public final C2975c e() {
            return U.f38190b;
        }

        public final Integer f(String countryCode) {
            String a9;
            AbstractC3292y.i(countryCode, "countryCode");
            Map map = U.f38191c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null && (a9 = bVar.a()) != null) {
                int i8 = 0;
                for (int i9 = 0; i9 < a9.length(); i9++) {
                    if (a9.charAt(i9) == '#') {
                        i8++;
                    }
                }
                return Integer.valueOf(i8);
            }
            return null;
        }

        public final String g(String countryCode) {
            AbstractC3292y.i(countryCode, "countryCode");
            Map map = U.f38191c;
            String upperCase = countryCode.toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            b bVar = (b) map.get(upperCase);
            if (bVar != null) {
                return bVar.b();
            }
            return null;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends U {

        /* renamed from: d, reason: collision with root package name */
        private final String f38195d;

        /* renamed from: e, reason: collision with root package name */
        private final String f38196e;

        /* renamed from: f, reason: collision with root package name */
        private final String f38197f;

        /* renamed from: g, reason: collision with root package name */
        private final VisualTransformation f38198g;

        /* loaded from: classes4.dex */
        public static final class a implements OffsetMapping {
            a() {
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int originalToTransformed(int i8) {
                return i8 + 1;
            }

            @Override // androidx.compose.ui.text.input.OffsetMapping
            public int transformedToOriginal(int i8) {
                return Math.max(i8 - 1, 0);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String countryCode) {
            super(null);
            AbstractC3292y.i(countryCode, "countryCode");
            this.f38195d = countryCode;
            this.f38196e = "";
            this.f38197f = "+############";
            this.f38198g = new VisualTransformation() { // from class: r4.V
                @Override // androidx.compose.ui.text.input.VisualTransformation
                public final TransformedText filter(AnnotatedString annotatedString) {
                    TransformedText j8;
                    j8 = U.c.j(annotatedString);
                    return j8;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TransformedText j(AnnotatedString text) {
            AbstractC3292y.i(text, "text");
            return new TransformedText(new AnnotatedString("+" + text.getText(), null, null, 6, null), new a());
        }

        @Override // r4.U
        public String c() {
            return this.f38195d;
        }

        @Override // r4.U
        public String d() {
            return this.f38197f;
        }

        @Override // r4.U
        public String e() {
            return this.f38196e;
        }

        @Override // r4.U
        public VisualTransformation f() {
            return this.f38198g;
        }

        @Override // r4.U
        public String g(String input) {
            AbstractC3292y.i(input, "input");
            return "+" + l6.n.N0(h(input), '0');
        }

        @Override // r4.U
        public String h(String input) {
            AbstractC3292y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f38189a.e().k(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends U {

        /* renamed from: d, reason: collision with root package name */
        private final b f38199d;

        /* renamed from: e, reason: collision with root package name */
        private final String f38200e;

        /* renamed from: f, reason: collision with root package name */
        private final String f38201f;

        /* renamed from: g, reason: collision with root package name */
        private final String f38202g;

        /* renamed from: h, reason: collision with root package name */
        private final VisualTransformation f38203h;

        /* loaded from: classes4.dex */
        public static final class a implements VisualTransformation {

            /* renamed from: r4.U$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0846a implements OffsetMapping {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ d f38205a;

                C0846a(d dVar) {
                    this.f38205a = dVar;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int originalToTransformed(int i8) {
                    if (this.f38205a.f38199d.a() == null) {
                        return i8;
                    }
                    String a9 = this.f38205a.f38199d.a();
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = 0;
                    int i10 = 0;
                    int i11 = -1;
                    for (int i12 = 0; i12 < a9.length(); i12++) {
                        i9++;
                        if (a9.charAt(i12) == '#' && (i10 = i10 + 1) == i8) {
                            i11 = i9;
                        }
                    }
                    if (i11 == -1) {
                        return a9.length() + 1 + (i8 - i10);
                    }
                    return i11;
                }

                @Override // androidx.compose.ui.text.input.OffsetMapping
                public int transformedToOriginal(int i8) {
                    if (this.f38205a.f38199d.a() != null) {
                        if (i8 == 0) {
                            return 0;
                        }
                        String a9 = this.f38205a.f38199d.a();
                        String substring = a9.substring(0, Math.min(i8, a9.length()));
                        AbstractC3292y.h(substring, "substring(...)");
                        StringBuilder sb = new StringBuilder();
                        int length = substring.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            char charAt = substring.charAt(i9);
                            if (charAt != '#') {
                                sb.append(charAt);
                            }
                        }
                        String sb2 = sb.toString();
                        AbstractC3292y.h(sb2, "toString(...)");
                        int length2 = sb2.length();
                        if (i8 > a9.length()) {
                            length2++;
                        }
                        return i8 - length2;
                    }
                    return i8;
                }
            }

            a() {
            }

            @Override // androidx.compose.ui.text.input.VisualTransformation
            public TransformedText filter(AnnotatedString text) {
                AbstractC3292y.i(text, "text");
                return new TransformedText(new AnnotatedString(d.this.j(text.getText()), null, null, 6, null), new C0846a(d.this));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b metadata) {
            super(null);
            String y8;
            AbstractC3292y.i(metadata, "metadata");
            this.f38199d = metadata;
            this.f38200e = metadata.b();
            String a9 = metadata.a();
            this.f38201f = (a9 == null || (y8 = l6.n.y(a9, '#', '5', false, 4, null)) == null) ? "" : y8;
            this.f38202g = metadata.c();
            this.f38203h = new a();
        }

        @Override // r4.U
        public String c() {
            return this.f38202g;
        }

        @Override // r4.U
        public String d() {
            return this.f38201f;
        }

        @Override // r4.U
        public String e() {
            return this.f38200e;
        }

        @Override // r4.U
        public VisualTransformation f() {
            return this.f38203h;
        }

        @Override // r4.U
        public String g(String input) {
            AbstractC3292y.i(input, "input");
            return e() + l6.n.N0(h(input), '0');
        }

        @Override // r4.U
        public String h(String input) {
            AbstractC3292y.i(input, "input");
            StringBuilder sb = new StringBuilder();
            int length = input.length();
            for (int i8 = 0; i8 < length; i8++) {
                char charAt = input.charAt(i8);
                if (U.f38189a.e().k(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            String substring = sb2.substring(0, Math.min(sb2.length(), 15));
            AbstractC3292y.h(substring, "substring(...)");
            return substring;
        }

        public final String j(String filteredInput) {
            AbstractC3292y.i(filteredInput, "filteredInput");
            if (this.f38199d.a() == null) {
                return filteredInput;
            }
            StringBuilder sb = new StringBuilder();
            String a9 = this.f38199d.a();
            int i8 = 0;
            for (int i9 = 0; i9 < a9.length(); i9++) {
                char charAt = a9.charAt(i9);
                if (i8 < filteredInput.length()) {
                    if (charAt == '#') {
                        charAt = filteredInput.charAt(i8);
                        i8++;
                    }
                    sb.append(charAt);
                }
            }
            if (i8 < filteredInput.length()) {
                sb.append(' ');
                String substring = filteredInput.substring(i8);
                AbstractC3292y.h(substring, "substring(...)");
                char[] charArray = substring.toCharArray();
                AbstractC3292y.h(charArray, "toCharArray(...)");
                sb.append(charArray);
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "toString(...)");
            return sb2;
        }
    }

    static {
        int i8 = 4;
        AbstractC3284p abstractC3284p = null;
        String str = null;
        int i9 = 4;
        AbstractC3284p abstractC3284p2 = null;
        String str2 = null;
        int i10 = 4;
        AbstractC3284p abstractC3284p3 = null;
        String str3 = null;
        int i11 = 4;
        AbstractC3284p abstractC3284p4 = null;
        String str4 = null;
        f38191c = R5.Q.k(Q5.x.a("US", new b("+1", "US", "(###) ###-####")), Q5.x.a("CA", new b("+1", "CA", "(###) ###-####")), Q5.x.a("AG", new b("+1", "AG", "(###) ###-####")), Q5.x.a("AS", new b("+1", "AS", "(###) ###-####")), Q5.x.a("AI", new b("+1", "AI", "(###) ###-####")), Q5.x.a("BB", new b("+1", "BB", "(###) ###-####")), Q5.x.a("BM", new b("+1", "BM", "(###) ###-####")), Q5.x.a("BS", new b("+1", "BS", "(###) ###-####")), Q5.x.a("DM", new b("+1", "DM", "(###) ###-####")), Q5.x.a("DO", new b("+1", "DO", "(###) ###-####")), Q5.x.a("GD", new b("+1", "GD", "(###) ###-####")), Q5.x.a("GU", new b("+1", "GU", "(###) ###-####")), Q5.x.a("JM", new b("+1", "JM", "(###) ###-####")), Q5.x.a("KN", new b("+1", "KN", "(###) ###-####")), Q5.x.a("KY", new b("+1", "KY", "(###) ###-####")), Q5.x.a("LC", new b("+1", "LC", "(###) ###-####")), Q5.x.a("MP", new b("+1", "MP", "(###) ###-####")), Q5.x.a("MS", new b("+1", "MS", "(###) ###-####")), Q5.x.a("PR", new b("+1", "PR", "(###) ###-####")), Q5.x.a("SX", new b("+1", "SX", "(###) ###-####")), Q5.x.a("TC", new b("+1", "TC", "(###) ###-####")), Q5.x.a("TT", new b("+1", "TT", "(###) ###-####")), Q5.x.a("VC", new b("+1", "VC", "(###) ###-####")), Q5.x.a("VG", new b("+1", "VG", "(###) ###-####")), Q5.x.a("VI", new b("+1", "VI", "(###) ###-####")), Q5.x.a("EG", new b("+20", "EG", "### ### ####")), Q5.x.a("SS", new b("+211", "SS", "### ### ###")), Q5.x.a("MA", new b("+212", "MA", "###-######")), Q5.x.a("EH", new b("+212", "EH", "###-######")), Q5.x.a("DZ", new b("+213", "DZ", "### ## ## ##")), Q5.x.a("TN", new b("+216", "TN", "## ### ###")), Q5.x.a("LY", new b("+218", "LY", "##-#######")), Q5.x.a("GM", new b("+220", "GM", "### ####")), Q5.x.a("SN", new b("+221", "SN", "## ### ## ##")), Q5.x.a("MR", new b("+222", "MR", "## ## ## ##")), Q5.x.a("ML", new b("+223", "ML", "## ## ## ##")), Q5.x.a("GN", new b("+224", "GN", "### ## ## ##")), Q5.x.a("CI", new b("+225", "CI", "## ## ## ##")), Q5.x.a("BF", new b("+226", "BF", "## ## ## ##")), Q5.x.a("NE", new b("+227", "NE", "## ## ## ##")), Q5.x.a("TG", new b("+228", "TG", "## ## ## ##")), Q5.x.a("BJ", new b("+229", "BJ", "## ## ## ##")), Q5.x.a("MU", new b("+230", "MU", "#### ####")), Q5.x.a("LR", new b("+231", "LR", "### ### ###")), Q5.x.a("SL", new b("+232", "SL", "## ######")), Q5.x.a("GH", new b("+233", "GH", "## ### ####")), Q5.x.a("NG", new b("+234", "NG", "### ### ####")), Q5.x.a("TD", new b("+235", "TD", "## ## ## ##")), Q5.x.a("CF", new b("+236", "CF", "## ## ## ##")), Q5.x.a("CM", new b("+237", "CM", "## ## ## ##")), Q5.x.a("CV", new b("+238", "CV", "### ## ##")), Q5.x.a("ST", new b("+239", "ST", "### ####")), Q5.x.a("GQ", new b("+240", "GQ", "### ### ###")), Q5.x.a("GA", new b("+241", "GA", "## ## ## ##")), Q5.x.a("CG", new b("+242", "CG", "## ### ####")), Q5.x.a("CD", new b("+243", "CD", "### ### ###")), Q5.x.a("AO", new b("+244", "AO", "### ### ###")), Q5.x.a("GW", new b("+245", "GW", "### ####")), Q5.x.a("IO", new b("+246", "IO", "### ####")), Q5.x.a("AC", new b("+247", "AC", null, 4, null)), Q5.x.a("SC", new b("+248", "SC", "# ### ###")), Q5.x.a("RW", new b("+250", "RW", "### ### ###")), Q5.x.a("ET", new b("+251", "ET", "## ### ####")), Q5.x.a("SO", new b("+252", "SO", "## #######")), Q5.x.a("DJ", new b("+253", "DJ", "## ## ## ##")), Q5.x.a("KE", new b("+254", "KE", "## #######")), Q5.x.a("TZ", new b("+255", "TZ", "### ### ###")), Q5.x.a("UG", new b("+256", "UG", "### ######")), Q5.x.a("BI", new b("+257", "BI", "## ## ## ##")), Q5.x.a("MZ", new b("+258", "MZ", "## ### ####")), Q5.x.a("ZM", new b("+260", "ZM", "## #######")), Q5.x.a("MG", new b("+261", "MG", "## ## ### ##")), Q5.x.a("RE", new b("+262", "RE", str, i8, abstractC3284p)), Q5.x.a("TF", new b("+262", "TF", str, i8, abstractC3284p)), Q5.x.a("YT", new b("+262", "YT", "### ## ## ##")), Q5.x.a("ZW", new b("+263", "ZW", "## ### ####")), Q5.x.a("NA", new b("+264", "NA", "## ### ####")), Q5.x.a("MW", new b("+265", "MW", "### ## ## ##")), Q5.x.a("LS", new b("+266", "LS", "#### ####")), Q5.x.a("BW", new b("+267", "BW", "## ### ###")), Q5.x.a("SZ", new b("+268", "SZ", "#### ####")), Q5.x.a("KM", new b("+269", "KM", "### ## ##")), Q5.x.a("ZA", new b("+27", "ZA", "## ### ####")), Q5.x.a("SH", new b("+290", "SH", str2, i9, abstractC3284p2)), Q5.x.a("TA", new b("+290", "TA", str2, i9, abstractC3284p2)), Q5.x.a("ER", new b("+291", "ER", "# ### ###")), Q5.x.a("AW", new b("+297", "AW", "### ####")), Q5.x.a("FO", new b("+298", "FO", "######")), Q5.x.a("GL", new b("+299", "GL", "## ## ##")), Q5.x.a("GR", new b("+30", "GR", "### ### ####")), Q5.x.a("NL", new b("+31", "NL", "# ########")), Q5.x.a("BE", new b("+32", "BE", "### ## ## ##")), Q5.x.a("FR", new b("+33", "FR", "# ## ## ## ##")), Q5.x.a("ES", new b("+34", "ES", "### ## ## ##")), Q5.x.a("GI", new b("+350", "GI", "### #####")), Q5.x.a("PT", new b("+351", "PT", "### ### ###")), Q5.x.a("LU", new b("+352", "LU", "## ## ## ###")), Q5.x.a("IE", new b("+353", "IE", "## ### ####")), Q5.x.a("IS", new b("+354", "IS", "### ####")), Q5.x.a("AL", new b("+355", "AL", "## ### ####")), Q5.x.a("MT", new b("+356", "MT", "#### ####")), Q5.x.a("CY", new b("+357", "CY", "## ######")), Q5.x.a("FI", new b("+358", "FI", "## ### ## ##")), Q5.x.a("AX", new b("+358", "AX", null, 4, null)), Q5.x.a("BG", new b("+359", "BG", "### ### ##")), Q5.x.a("HU", new b("+36", "HU", "## ### ####")), Q5.x.a("LT", new b("+370", "LT", "### #####")), Q5.x.a("LV", new b("+371", "LV", "## ### ###")), Q5.x.a("EE", new b("+372", "EE", "#### ####")), Q5.x.a("MD", new b("+373", "MD", "### ## ###")), Q5.x.a("AM", new b("+374", "AM", "## ######")), Q5.x.a("BY", new b("+375", "BY", "## ###-##-##")), Q5.x.a("AD", new b("+376", "AD", "### ###")), Q5.x.a("MC", new b("+377", "MC", "# ## ## ## ##")), Q5.x.a("SM", new b("+378", "SM", "## ## ## ##")), Q5.x.a("VA", new b("+379", "VA", null, 4, null)), Q5.x.a("UA", new b("+380", "UA", "## ### ####")), Q5.x.a("RS", new b("+381", "RS", "## #######")), Q5.x.a("ME", new b("+382", "ME", "## ### ###")), Q5.x.a("XK", new b("+383", "XK", "## ### ###")), Q5.x.a("HR", new b("+385", "HR", "## ### ####")), Q5.x.a("SI", new b("+386", "SI", "## ### ###")), Q5.x.a("BA", new b("+387", "BA", "## ###-###")), Q5.x.a("MK", new b("+389", "MK", "## ### ###")), Q5.x.a("IT", new b("+39", "IT", "## #### ####")), Q5.x.a("RO", new b("+40", "RO", "## ### ####")), Q5.x.a("CH", new b("+41", "CH", "## ### ## ##")), Q5.x.a("CZ", new b("+420", "CZ", "### ### ###")), Q5.x.a("SK", new b("+421", "SK", "### ### ###")), Q5.x.a("LI", new b("+423", "LI", "### ### ###")), Q5.x.a("AT", new b("+43", "AT", "### ######")), Q5.x.a("GB", new b("+44", "GB", "#### ######")), Q5.x.a("GG", new b("+44", "GG", "#### ######")), Q5.x.a("JE", new b("+44", "JE", "#### ######")), Q5.x.a("IM", new b("+44", "IM", "#### ######")), Q5.x.a("DK", new b("+45", "DK", "## ## ## ##")), Q5.x.a("SE", new b("+46", "SE", "##-### ## ##")), Q5.x.a("NO", new b("+47", "NO", "### ## ###")), Q5.x.a("BV", new b("+47", "BV", null, 4, null)), Q5.x.a("SJ", new b("+47", "SJ", "## ## ## ##")), Q5.x.a("PL", new b("+48", "PL", "## ### ## ##")), Q5.x.a("DE", new b("+49", "DE", "### #######")), Q5.x.a("FK", new b("+500", "FK", str3, i10, abstractC3284p3)), Q5.x.a("GS", new b("+500", "GS", str3, i10, abstractC3284p3)), Q5.x.a("BZ", new b("+501", "BZ", "###-####")), Q5.x.a("GT", new b("+502", "GT", "#### ####")), Q5.x.a("SV", new b("+503", "SV", "#### ####")), Q5.x.a("HN", new b("+504", "HN", "####-####")), Q5.x.a("NI", new b("+505", "NI", "#### ####")), Q5.x.a("CR", new b("+506", "CR", "#### ####")), Q5.x.a("PA", new b("+507", "PA", "####-####")), Q5.x.a("PM", new b("+508", "PM", "## ## ##")), Q5.x.a("HT", new b("+509", "HT", "## ## ####")), Q5.x.a("PE", new b("+51", "PE", "### ### ###")), Q5.x.a("MX", new b("+52", "MX", "### ### ####")), Q5.x.a("CY", new b("+537", "CY", null, 4, null)), Q5.x.a("AR", new b("+54", "AR", "## ##-####-####")), Q5.x.a("BR", new b("+55", "BR", "## #####-####")), Q5.x.a("CL", new b("+56", "CL", "# #### ####")), Q5.x.a("CO", new b("+57", "CO", "### #######")), Q5.x.a("VE", new b("+58", "VE", "###-#######")), Q5.x.a("BL", new b("+590", "BL", "### ## ## ##")), Q5.x.a("MF", new b("+590", "MF", null, 4, null)), Q5.x.a("GP", new b("+590", "GP", "### ## ## ##")), Q5.x.a("BO", new b("+591", "BO", "########")), Q5.x.a("GY", new b("+592", "GY", "### ####")), Q5.x.a("EC", new b("+593", "EC", "## ### ####")), Q5.x.a("GF", new b("+594", "GF", "### ## ## ##")), Q5.x.a("PY", new b("+595", "PY", "## #######")), Q5.x.a("MQ", new b("+596", "MQ", "### ## ## ##")), Q5.x.a("SR", new b("+597", "SR", "###-####")), Q5.x.a("UY", new b("+598", "UY", "#### ####")), Q5.x.a("CW", new b("+599", "CW", "# ### ####")), Q5.x.a("BQ", new b("+599", "BQ", "### ####")), Q5.x.a("MY", new b("+60", "MY", "##-### ####")), Q5.x.a("AU", new b("+61", "AU", "### ### ###")), Q5.x.a("ID", new b("+62", "ID", "###-###-###")), Q5.x.a("PH", new b("+63", "PH", "#### ######")), Q5.x.a("NZ", new b("+64", "NZ", "## ### ####")), Q5.x.a("SG", new b("+65", "SG", "#### ####")), Q5.x.a("TH", new b("+66", "TH", "## ### ####")), Q5.x.a("TL", new b("+670", "TL", "#### ####")), Q5.x.a("AQ", new b("+672", "AQ", "## ####")), Q5.x.a("BN", new b("+673", "BN", "### ####")), Q5.x.a("NR", new b("+674", "NR", "### ####")), Q5.x.a("PG", new b("+675", "PG", "### ####")), Q5.x.a("TO", new b("+676", "TO", "### ####")), Q5.x.a("SB", new b("+677", "SB", "### ####")), Q5.x.a("VU", new b("+678", "VU", "### ####")), Q5.x.a("FJ", new b("+679", "FJ", "### ####")), Q5.x.a("WF", new b("+681", "WF", "## ## ##")), Q5.x.a("CK", new b("+682", "CK", "## ###")), Q5.x.a("NU", new b("+683", "NU", str4, i11, abstractC3284p4)), Q5.x.a("WS", new b("+685", "WS", str4, i11, abstractC3284p4)), Q5.x.a("KI", new b("+686", "KI", str4, i11, abstractC3284p4)), Q5.x.a("NC", new b("+687", "NC", "########")), Q5.x.a("TV", new b("+688", "TV", null, 4, null)), Q5.x.a("PF", new b("+689", "PF", "## ## ##")), Q5.x.a("TK", new b("+690", "TK", null, 4, null)), Q5.x.a("RU", new b("+7", "RU", "### ###-##-##")), Q5.x.a("KZ", new b("+7", "KZ", 0 == true ? 1 : 0, 4, null)), Q5.x.a("JP", new b("+81", "JP", "##-####-####")), Q5.x.a("KR", new b("+82", "KR", "##-####-####")), Q5.x.a("VN", new b("+84", "VN", "## ### ## ##")), Q5.x.a("HK", new b("+852", "HK", "#### ####")), Q5.x.a("MO", new b("+853", "MO", "#### ####")), Q5.x.a("KH", new b("+855", "KH", "## ### ###")), Q5.x.a("LA", new b("+856", "LA", "## ## ### ###")), Q5.x.a("CN", new b("+86", "CN", "### #### ####")), Q5.x.a("PN", new b("+872", "PN", null, 4, null)), Q5.x.a("BD", new b("+880", "BD", "####-######")), Q5.x.a("TW", new b("+886", "TW", "### ### ###")), Q5.x.a("TR", new b("+90", "TR", "### ### ####")), Q5.x.a("IN", new b("+91", "IN", "## ## ######")), Q5.x.a("PK", new b("+92", "PK", "### #######")), Q5.x.a("AF", new b("+93", "AF", "## ### ####")), Q5.x.a("LK", new b("+94", "LK", "## # ######")), Q5.x.a("MM", new b("+95", "MM", "# ### ####")), Q5.x.a("MV", new b("+960", "MV", "###-####")), Q5.x.a("LB", new b("+961", "LB", "## ### ###")), Q5.x.a("JO", new b("+962", "JO", "# #### ####")), Q5.x.a("IQ", new b("+964", "IQ", "### ### ####")), Q5.x.a("KW", new b("+965", "KW", "### #####")), Q5.x.a("SA", new b("+966", "SA", "## ### ####")), Q5.x.a("YE", new b("+967", "YE", "### ### ###")), Q5.x.a("OM", new b("+968", "OM", "#### ####")), Q5.x.a("PS", new b("+970", "PS", "### ### ###")), Q5.x.a("AE", new b("+971", "AE", "## ### ####")), Q5.x.a("IL", new b("+972", "IL", "##-###-####")), Q5.x.a("BH", new b("+973", "BH", "#### ####")), Q5.x.a("QA", new b("+974", "QA", "#### ####")), Q5.x.a("BT", new b("+975", "BT", "## ## ## ##")), Q5.x.a("MN", new b("+976", "MN", "#### ####")), Q5.x.a("NP", new b("+977", "NP", "###-#######")), Q5.x.a("TJ", new b("+992", "TJ", "### ## ####")), Q5.x.a("TM", new b("+993", "TM", "## ##-##-##")), Q5.x.a("AZ", new b("+994", "AZ", "## ### ## ##")), Q5.x.a("GE", new b("+995", "GE", "### ## ## ##")), Q5.x.a("KG", new b("+996", "KG", "### ### ###")), Q5.x.a("UZ", new b("+998", "UZ", "## ### ## ##")));
    }

    private U() {
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract VisualTransformation f();

    public abstract String g(String str);

    public abstract String h(String str);

    public /* synthetic */ U(AbstractC3284p abstractC3284p) {
        this();
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f38192a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38193b;

        /* renamed from: c, reason: collision with root package name */
        private final String f38194c;

        public b(String prefix, String regionCode, String str) {
            AbstractC3292y.i(prefix, "prefix");
            AbstractC3292y.i(regionCode, "regionCode");
            this.f38192a = prefix;
            this.f38193b = regionCode;
            this.f38194c = str;
            if (str != null && str.length() <= 0) {
                throw new IllegalArgumentException("Pattern should not be empty. Set it to null if it's missing.".toString());
            }
        }

        public final String a() {
            return this.f38194c;
        }

        public final String b() {
            return this.f38192a;
        }

        public final String c() {
            return this.f38193b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f38192a, bVar.f38192a) && AbstractC3292y.d(this.f38193b, bVar.f38193b) && AbstractC3292y.d(this.f38194c, bVar.f38194c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f38192a.hashCode() * 31) + this.f38193b.hashCode()) * 31;
            String str = this.f38194c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "Metadata(prefix=" + this.f38192a + ", regionCode=" + this.f38193b + ", pattern=" + this.f38194c + ")";
        }

        public /* synthetic */ b(String str, String str2, String str3, int i8, AbstractC3284p abstractC3284p) {
            this(str, str2, (i8 & 4) != 0 ? null : str3);
        }
    }
}
