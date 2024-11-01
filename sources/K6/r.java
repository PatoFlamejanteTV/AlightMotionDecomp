package K6;

import U6.C1449e;
import j$.util.DesugarCollections;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: j, reason: collision with root package name */
    private static final char[] f5067j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    final String f5068a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5069b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5070c;

    /* renamed from: d, reason: collision with root package name */
    final String f5071d;

    /* renamed from: e, reason: collision with root package name */
    final int f5072e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5073f;

    /* renamed from: g, reason: collision with root package name */
    private final List f5074g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5075h;

    /* renamed from: i, reason: collision with root package name */
    private final String f5076i;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f5077a;

        /* renamed from: d, reason: collision with root package name */
        String f5080d;

        /* renamed from: f, reason: collision with root package name */
        final List f5082f;

        /* renamed from: g, reason: collision with root package name */
        List f5083g;

        /* renamed from: h, reason: collision with root package name */
        String f5084h;

        /* renamed from: b, reason: collision with root package name */
        String f5078b = "";

        /* renamed from: c, reason: collision with root package name */
        String f5079c = "";

        /* renamed from: e, reason: collision with root package name */
        int f5081e = -1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: K6.r$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public enum EnumC0086a {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5082f = arrayList;
            arrayList.add("");
        }

        private static String b(String str, int i8, int i9) {
            return L6.c.b(r.r(str, i8, i9, false));
        }

        private boolean f(String str) {
            if (!str.equals(".") && !str.equalsIgnoreCase("%2e")) {
                return false;
            }
            return true;
        }

        private boolean g(String str) {
            if (!str.equals("..") && !str.equalsIgnoreCase("%2e.") && !str.equalsIgnoreCase(".%2e") && !str.equalsIgnoreCase("%2e%2e")) {
                return false;
            }
            return true;
        }

        private static int i(String str, int i8, int i9) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(r.a(str, i8, i9, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private void j() {
            if (((String) this.f5082f.remove(r0.size() - 1)).isEmpty() && !this.f5082f.isEmpty()) {
                this.f5082f.set(r0.size() - 1, "");
            } else {
                this.f5082f.add("");
            }
        }

        private static int l(String str, int i8, int i9) {
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt != ':') {
                    if (charAt != '[') {
                        i8++;
                    }
                    do {
                        i8++;
                        if (i8 < i9) {
                        }
                        i8++;
                    } while (str.charAt(i8) != ']');
                    i8++;
                } else {
                    return i8;
                }
            }
            return i9;
        }

        private void m(String str, int i8, int i9, boolean z8, boolean z9) {
            String a9 = r.a(str, i8, i9, " \"<>^`{}|/\\?#", z9, false, false, true, null);
            if (f(a9)) {
                return;
            }
            if (g(a9)) {
                j();
                return;
            }
            if (((String) this.f5082f.get(r11.size() - 1)).isEmpty()) {
                this.f5082f.set(r11.size() - 1, a9);
            } else {
                this.f5082f.add(a9);
            }
            if (z8) {
                this.f5082f.add("");
            }
        }

        private void o(String str, int i8, int i9) {
            boolean z8;
            if (i8 == i9) {
                return;
            }
            char charAt = str.charAt(i8);
            if (charAt != '/' && charAt != '\\') {
                List list = this.f5082f;
                list.set(list.size() - 1, "");
            } else {
                this.f5082f.clear();
                this.f5082f.add("");
                i8++;
            }
            while (true) {
                int i10 = i8;
                if (i10 < i9) {
                    i8 = L6.c.l(str, i10, i9, "/\\");
                    if (i8 < i9) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    m(str, i10, i8, z8, true);
                    if (z8) {
                        i8++;
                    }
                } else {
                    return;
                }
            }
        }

        private static int q(String str, int i8, int i9) {
            if (i9 - i8 < 2) {
                return -1;
            }
            char charAt = str.charAt(i8);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i8++;
                    if (i8 >= i9) {
                        break;
                    }
                    char charAt2 = str.charAt(i8);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int r(String str, int i8, int i9) {
            int i10 = 0;
            while (i8 < i9) {
                char charAt = str.charAt(i8);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i10++;
                i8++;
            }
            return i10;
        }

        public r a() {
            if (this.f5077a != null) {
                if (this.f5080d != null) {
                    return new r(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int c() {
            int i8 = this.f5081e;
            if (i8 == -1) {
                return r.d(this.f5077a);
            }
            return i8;
        }

        public a d(String str) {
            List list;
            if (str != null) {
                list = r.y(r.b(str, " \"'<>#", true, false, true, true));
            } else {
                list = null;
            }
            this.f5083g = list;
            return this;
        }

        public a e(String str) {
            if (str != null) {
                String b9 = b(str, 0, str.length());
                if (b9 != null) {
                    this.f5080d = b9;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new NullPointerException("host == null");
        }

        EnumC0086a h(r rVar, String str) {
            int l8;
            char c8;
            int i8;
            int z8 = L6.c.z(str, 0, str.length());
            int A8 = L6.c.A(str, z8, str.length());
            if (q(str, z8, A8) != -1) {
                if (str.regionMatches(true, z8, "https:", 0, 6)) {
                    this.f5077a = "https";
                    z8 += 6;
                } else if (str.regionMatches(true, z8, "http:", 0, 5)) {
                    this.f5077a = "http";
                    z8 += 5;
                } else {
                    return EnumC0086a.UNSUPPORTED_SCHEME;
                }
            } else if (rVar != null) {
                this.f5077a = rVar.f5068a;
            } else {
                return EnumC0086a.MISSING_SCHEME;
            }
            int r8 = r(str, z8, A8);
            char c9 = '?';
            char c10 = '#';
            if (r8 < 2 && rVar != null && rVar.f5068a.equals(this.f5077a)) {
                this.f5078b = rVar.j();
                this.f5079c = rVar.f();
                this.f5080d = rVar.f5071d;
                this.f5081e = rVar.f5072e;
                this.f5082f.clear();
                this.f5082f.addAll(rVar.h());
                if (z8 == A8 || str.charAt(z8) == '#') {
                    d(rVar.i());
                }
            } else {
                int i9 = z8 + r8;
                boolean z9 = false;
                boolean z10 = false;
                while (true) {
                    l8 = L6.c.l(str, i9, A8, "@/\\?#");
                    if (l8 != A8) {
                        c8 = str.charAt(l8);
                    } else {
                        c8 = 65535;
                    }
                    if (c8 == 65535 || c8 == c10 || c8 == '/' || c8 == '\\' || c8 == c9) {
                        break;
                    }
                    if (c8 == '@') {
                        if (!z9) {
                            int k8 = L6.c.k(str, i9, l8, ':');
                            i8 = l8;
                            String a9 = r.a(str, i9, k8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z10) {
                                a9 = this.f5078b + "%40" + a9;
                            }
                            this.f5078b = a9;
                            if (k8 != i8) {
                                this.f5079c = r.a(str, k8 + 1, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z9 = true;
                            }
                            z10 = true;
                        } else {
                            i8 = l8;
                            this.f5079c += "%40" + r.a(str, i9, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        }
                        i9 = i8 + 1;
                    }
                    c9 = '?';
                    c10 = '#';
                }
                int l9 = l(str, i9, l8);
                int i10 = l9 + 1;
                if (i10 < l8) {
                    this.f5080d = b(str, i9, l9);
                    int i11 = i(str, i10, l8);
                    this.f5081e = i11;
                    if (i11 == -1) {
                        return EnumC0086a.INVALID_PORT;
                    }
                } else {
                    this.f5080d = b(str, i9, l9);
                    this.f5081e = r.d(this.f5077a);
                }
                if (this.f5080d == null) {
                    return EnumC0086a.INVALID_HOST;
                }
                z8 = l8;
            }
            int l10 = L6.c.l(str, z8, A8, "?#");
            o(str, z8, l10);
            if (l10 < A8 && str.charAt(l10) == '?') {
                int k9 = L6.c.k(str, l10, A8, '#');
                this.f5083g = r.y(r.a(str, l10 + 1, k9, " \"'<>#", true, false, true, true, null));
                l10 = k9;
            }
            if (l10 < A8 && str.charAt(l10) == '#') {
                this.f5084h = r.a(str, 1 + l10, A8, "", true, false, false, false, null);
            }
            return EnumC0086a.SUCCESS;
        }

        public a k(int i8) {
            if (i8 > 0 && i8 <= 65535) {
                this.f5081e = i8;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i8);
        }

        a n() {
            int size = this.f5082f.size();
            for (int i8 = 0; i8 < size; i8++) {
                this.f5082f.set(i8, r.b((String) this.f5082f.get(i8), "[]", true, true, false, true));
            }
            List list = this.f5083g;
            if (list != null) {
                int size2 = list.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String str = (String) this.f5083g.get(i9);
                    if (str != null) {
                        this.f5083g.set(i9, r.b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f5084h;
            if (str2 != null) {
                this.f5084h = r.b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a p(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f5077a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f5077a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new NullPointerException("scheme == null");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5077a);
            sb.append("://");
            if (!this.f5078b.isEmpty() || !this.f5079c.isEmpty()) {
                sb.append(this.f5078b);
                if (!this.f5079c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f5079c);
                }
                sb.append('@');
            }
            if (this.f5080d.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f5080d);
                sb.append(']');
            } else {
                sb.append(this.f5080d);
            }
            int c8 = c();
            if (c8 != r.d(this.f5077a)) {
                sb.append(':');
                sb.append(c8);
            }
            r.q(sb, this.f5082f);
            if (this.f5083g != null) {
                sb.append('?');
                r.m(sb, this.f5083g);
            }
            if (this.f5084h != null) {
                sb.append('#');
                sb.append(this.f5084h);
            }
            return sb.toString();
        }
    }

    r(a aVar) {
        List list;
        this.f5068a = aVar.f5077a;
        this.f5069b = s(aVar.f5078b, false);
        this.f5070c = s(aVar.f5079c, false);
        this.f5071d = aVar.f5080d;
        this.f5072e = aVar.c();
        this.f5073f = t(aVar.f5082f, false);
        List list2 = aVar.f5083g;
        if (list2 != null) {
            list = t(list2, true);
        } else {
            list = null;
        }
        this.f5074g = list;
        String str = aVar.f5084h;
        this.f5075h = str != null ? s(str, false) : null;
        this.f5076i = aVar.toString();
    }

    static String a(String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        int i10 = i8;
        while (i10 < i9) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z11)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z8 && (!z9 || v(str, i10, i9)))) && (codePointAt != 43 || !z10))) {
                    i10 += Character.charCount(codePointAt);
                }
            }
            C1449e c1449e = new C1449e();
            c1449e.T(str, i8, i10);
            c(c1449e, str, i10, i9, str2, z8, z9, z10, z11, charset);
            return c1449e.readUtf8();
        }
        return str.substring(i8, i9);
    }

    static String b(String str, String str2, boolean z8, boolean z9, boolean z10, boolean z11) {
        return a(str, 0, str.length(), str2, z8, z9, z10, z11, null);
    }

    static void c(C1449e c1449e, String str, int i8, int i9, String str2, boolean z8, boolean z9, boolean z10, boolean z11, Charset charset) {
        String str3;
        C1449e c1449e2 = null;
        while (i8 < i9) {
            int codePointAt = str.codePointAt(i8);
            if (!z8 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z10) {
                    if (z8) {
                        str3 = "+";
                    } else {
                        str3 = "%2B";
                    }
                    c1449e.writeUtf8(str3);
                } else if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z11) && str2.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z8 && (!z9 || v(str, i8, i9)))))) {
                    c1449e.U(codePointAt);
                } else {
                    if (c1449e2 == null) {
                        c1449e2 = new C1449e();
                    }
                    if (charset != null && !charset.equals(L6.c.f5419j)) {
                        c1449e2.R(str, i8, Character.charCount(codePointAt) + i8, charset);
                    } else {
                        c1449e2.U(codePointAt);
                    }
                    while (!c1449e2.exhausted()) {
                        byte readByte = c1449e2.readByte();
                        c1449e.writeByte(37);
                        char[] cArr = f5067j;
                        c1449e.writeByte(cArr[((readByte & 255) >> 4) & 15]);
                        c1449e.writeByte(cArr[readByte & 15]);
                    }
                }
            }
            i8 += Character.charCount(codePointAt);
        }
    }

    public static int d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        if (str.equals("https")) {
            return 443;
        }
        return -1;
    }

    static void m(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8 += 2) {
            String str = (String) list.get(i8);
            String str2 = (String) list.get(i8 + 1);
            if (i8 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static r p(String str) {
        a aVar = new a();
        if (aVar.h(null, str) != a.EnumC0086a.SUCCESS) {
            return null;
        }
        return aVar.a();
    }

    static void q(StringBuilder sb, List list) {
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            sb.append('/');
            sb.append((String) list.get(i8));
        }
    }

    static String r(String str, int i8, int i9, boolean z8) {
        for (int i10 = i8; i10 < i9; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '%' || (charAt == '+' && z8)) {
                C1449e c1449e = new C1449e();
                c1449e.T(str, i8, i10);
                u(c1449e, str, i10, i9, z8);
                return c1449e.readUtf8();
            }
        }
        return str.substring(i8, i9);
    }

    static String s(String str, boolean z8) {
        return r(str, 0, str.length(), z8);
    }

    private List t(List list, boolean z8) {
        String str;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = (String) list.get(i8);
            if (str2 != null) {
                str = s(str2, z8);
            } else {
                str = null;
            }
            arrayList.add(str);
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    static void u(C1449e c1449e, String str, int i8, int i9, boolean z8) {
        int i10;
        while (i8 < i9) {
            int codePointAt = str.codePointAt(i8);
            if (codePointAt == 37 && (i10 = i8 + 2) < i9) {
                int h8 = L6.c.h(str.charAt(i8 + 1));
                int h9 = L6.c.h(str.charAt(i10));
                if (h8 != -1 && h9 != -1) {
                    c1449e.writeByte((h8 << 4) + h9);
                    i8 = i10;
                }
                c1449e.U(codePointAt);
            } else {
                if (codePointAt == 43 && z8) {
                    c1449e.writeByte(32);
                }
                c1449e.U(codePointAt);
            }
            i8 += Character.charCount(codePointAt);
        }
    }

    static boolean v(String str, int i8, int i9) {
        int i10 = i8 + 2;
        if (i10 < i9 && str.charAt(i8) == '%' && L6.c.h(str.charAt(i8 + 1)) != -1 && L6.c.h(str.charAt(i10)) != -1) {
            return true;
        }
        return false;
    }

    static List y(String str) {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 <= str.length()) {
            int indexOf = str.indexOf(38, i8);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i8);
            if (indexOf2 != -1 && indexOf2 <= indexOf) {
                arrayList.add(str.substring(i8, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            } else {
                arrayList.add(str.substring(i8, indexOf));
                arrayList.add(null);
            }
            i8 = indexOf + 1;
        }
        return arrayList;
    }

    public String A() {
        return this.f5068a;
    }

    public URI B() {
        String aVar = n().n().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e8) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public String e() {
        if (this.f5075h == null) {
            return null;
        }
        return this.f5076i.substring(this.f5076i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof r) && ((r) obj).f5076i.equals(this.f5076i)) {
            return true;
        }
        return false;
    }

    public String f() {
        if (this.f5070c.isEmpty()) {
            return "";
        }
        return this.f5076i.substring(this.f5076i.indexOf(58, this.f5068a.length() + 3) + 1, this.f5076i.indexOf(64));
    }

    public String g() {
        int indexOf = this.f5076i.indexOf(47, this.f5068a.length() + 3);
        String str = this.f5076i;
        return this.f5076i.substring(indexOf, L6.c.l(str, indexOf, str.length(), "?#"));
    }

    public List h() {
        int indexOf = this.f5076i.indexOf(47, this.f5068a.length() + 3);
        String str = this.f5076i;
        int l8 = L6.c.l(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < l8) {
            int i8 = indexOf + 1;
            int k8 = L6.c.k(this.f5076i, i8, l8, '/');
            arrayList.add(this.f5076i.substring(i8, k8));
            indexOf = k8;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f5076i.hashCode();
    }

    public String i() {
        if (this.f5074g == null) {
            return null;
        }
        int indexOf = this.f5076i.indexOf(63) + 1;
        String str = this.f5076i;
        return this.f5076i.substring(indexOf, L6.c.k(str, indexOf, str.length(), '#'));
    }

    public String j() {
        if (this.f5069b.isEmpty()) {
            return "";
        }
        int length = this.f5068a.length() + 3;
        String str = this.f5076i;
        return this.f5076i.substring(length, L6.c.l(str, length, str.length(), ":@"));
    }

    public String k() {
        return this.f5071d;
    }

    public boolean l() {
        return this.f5068a.equals("https");
    }

    public a n() {
        int i8;
        a aVar = new a();
        aVar.f5077a = this.f5068a;
        aVar.f5078b = j();
        aVar.f5079c = f();
        aVar.f5080d = this.f5071d;
        if (this.f5072e != d(this.f5068a)) {
            i8 = this.f5072e;
        } else {
            i8 = -1;
        }
        aVar.f5081e = i8;
        aVar.f5082f.clear();
        aVar.f5082f.addAll(h());
        aVar.d(i());
        aVar.f5084h = e();
        return aVar;
    }

    public a o(String str) {
        a aVar = new a();
        if (aVar.h(this, str) != a.EnumC0086a.SUCCESS) {
            return null;
        }
        return aVar;
    }

    public String toString() {
        return this.f5076i;
    }

    public int w() {
        return this.f5072e;
    }

    public String x() {
        if (this.f5074g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m(sb, this.f5074g);
        return sb.toString();
    }

    public r z(String str) {
        a o8 = o(str);
        if (o8 != null) {
            return o8.a();
        }
        return null;
    }
}
