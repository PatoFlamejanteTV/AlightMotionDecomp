package g3;

import R5.AbstractC1435t;
import R5.Q;
import R5.a0;
import androidx.core.os.EnvironmentCompat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import p2.AbstractC3564f;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: g3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2906e {

    /* renamed from: m, reason: collision with root package name */
    public static final a f32115m;

    /* renamed from: n, reason: collision with root package name */
    private static final List f32116n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2906e f32117o = new EnumC2906e("Visa", 0, "visa", "Visa", D4.a.f1338s, 0, 0, null, 0, Pattern.compile("^(4)[0-9]*$"), Q.e(Q5.x.a(1, Pattern.compile("^4$"))), null, false, 1, 1656, null);

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC2906e f32118p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC2906e f32119q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC2906e f32120r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC2906e f32121s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC2906e f32122t;

    /* renamed from: u, reason: collision with root package name */
    public static final EnumC2906e f32123u;

    /* renamed from: v, reason: collision with root package name */
    public static final EnumC2906e f32124v;

    /* renamed from: w, reason: collision with root package name */
    public static final EnumC2906e f32125w;

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ EnumC2906e[] f32126x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ W5.a f32127y;

    /* renamed from: a, reason: collision with root package name */
    private final String f32128a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32129b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32130c;

    /* renamed from: d, reason: collision with root package name */
    private final int f32131d;

    /* renamed from: e, reason: collision with root package name */
    private final int f32132e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f32133f;

    /* renamed from: g, reason: collision with root package name */
    private final int f32134g;

    /* renamed from: h, reason: collision with root package name */
    private final Pattern f32135h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f32136i;

    /* renamed from: j, reason: collision with root package name */
    private final Map f32137j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f32138k;

    /* renamed from: l, reason: collision with root package name */
    private final int f32139l;

    /* renamed from: g3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final List d(String str) {
            Matcher matcher;
            W5.a i8 = EnumC2906e.i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : i8) {
                Pattern o8 = ((EnumC2906e) obj).o(str);
                if (o8 != null && (matcher = o8.matcher(str)) != null && matcher.matches()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((EnumC2906e) obj2).f32138k) {
                    arrayList2.add(obj2);
                }
            }
            return arrayList2;
        }

        public final EnumC2906e a(String str) {
            if (str != null && !l6.n.T(str)) {
                List d8 = d(str);
                if (d8.size() != 1) {
                    d8 = null;
                }
                if (d8 == null) {
                    d8 = AbstractC1435t.e(EnumC2906e.f32125w);
                }
                return (EnumC2906e) AbstractC1435t.m0(d8);
            }
            return EnumC2906e.f32125w;
        }

        public final EnumC2906e b(String str) {
            Object obj;
            Iterator<E> it = EnumC2906e.i().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (l6.n.s(((EnumC2906e) obj).f(), str, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            EnumC2906e enumC2906e = (EnumC2906e) obj;
            if (enumC2906e == null) {
                return EnumC2906e.f32125w;
            }
            return enumC2906e;
        }

        public final List c(String str) {
            if (str != null && !l6.n.T(str)) {
                List d8 = d(str);
                if (!(!d8.isEmpty())) {
                    d8 = null;
                }
                if (d8 == null) {
                    return AbstractC1435t.e(EnumC2906e.f32125w);
                }
                return d8;
            }
            return e();
        }

        public final List e() {
            return EnumC2906e.f32116n;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        int i8 = 0;
        f32118p = new EnumC2906e("MasterCard", 1, "mastercard", "Mastercard", D4.a.f1333n, 0, i8, null, 0, Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(Q5.x.a(1, Pattern.compile("^2|5|6$")), Q5.x.a(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, false, 2, 1656, null);
        int i9 = 0;
        f32119q = new EnumC2906e("AmericanExpress", 2, "amex", "American Express", D4.a.f1320a, D4.a.f1325f, i9, a0.i(3, 4), 15, Pattern.compile("^(34|37)[0-9]*$"), Q.e(Q5.x.a(1, Pattern.compile("^3$"))), null, false, 3, 1552, null);
        AbstractC3284p abstractC3284p = null;
        int i10 = 0;
        int i11 = 0;
        Set set = null;
        boolean z8 = false;
        f32120r = new EnumC2906e("Discover", 3, "discover", "Discover", D4.a.f1328i, i10, i11, set, i8, Pattern.compile("^(60|64|65)[0-9]*$"), Q.e(Q5.x.a(1, Pattern.compile("^6$"))), null, z8, 4, 1656, abstractC3284p);
        int i12 = 1656;
        AbstractC3284p abstractC3284p2 = null;
        int i13 = 0;
        int i14 = 0;
        Set set2 = null;
        Map map = null;
        boolean z9 = false;
        f32121s = new EnumC2906e("JCB", 4, "jcb", "JCB", D4.a.f1331l, i13, i14, set2, i9, Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$"), Q.k(Q5.x.a(1, Pattern.compile("^3$")), Q5.x.a(2, Pattern.compile("^(35)$")), Q5.x.a(3, Pattern.compile("^(35[2-8])$"))), map, z9, 5, i12, abstractC3284p2);
        f32122t = new EnumC2906e("DinersClub", 5, "diners", "Diners Club", D4.a.f1326g, i10, i11, set, 16, Pattern.compile("^(36|30|38|39)[0-9]*$"), Q.e(Q5.x.a(1, Pattern.compile("^3$"))), Q.e(Q5.x.a(Pattern.compile("^(36)[0-9]*$"), 14)), z8, 6, 1080, abstractC3284p);
        f32123u = new EnumC2906e("UnionPay", 6, "unionpay", "UnionPay", D4.a.f1335p, i13, i14, set2, i9, Pattern.compile("^(62|81)[0-9]*$"), Q.e(Q5.x.a(1, Pattern.compile("^6|8$"))), map, z9, 7, i12, abstractC3284p2);
        f32124v = new EnumC2906e("CartesBancaires", 7, "cartes_bancaires", "Cartes Bancaires", D4.a.f1322c, i10, i11, set, 0, Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$"), Q.k(Q5.x.a(1, Pattern.compile("^4$")), Q5.x.a(2, Pattern.compile("^2|5|6$")), Q5.x.a(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$"))), null, z8, 8, 632, abstractC3284p);
        f32125w = new EnumC2906e("Unknown", 8, EnvironmentCompat.MEDIA_UNKNOWN, "Unknown", D4.a.f1337r, i13, i14, a0.i(3, 4), i9, null, Q.h(), map, z9, -1, 1752, abstractC3284p2);
        EnumC2906e[] a9 = a();
        f32126x = a9;
        f32127y = W5.b.a(a9);
        f32115m = new a(null);
        W5.a i15 = i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : i15) {
            if (((EnumC2906e) obj).f32138k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((EnumC2906e) obj2).f32139l > 0) {
                arrayList2.add(obj2);
            }
        }
        f32116n = AbstractC1435t.P0(arrayList2, new Comparator() { // from class: g3.e.b
            @Override // java.util.Comparator
            public final int compare(Object obj3, Object obj4) {
                return T5.a.a(Integer.valueOf(((EnumC2906e) obj3).f32139l), Integer.valueOf(((EnumC2906e) obj4).f32139l));
            }
        });
    }

    private EnumC2906e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13) {
        this.f32128a = str2;
        this.f32129b = str3;
        this.f32130c = i9;
        this.f32131d = i10;
        this.f32132e = i11;
        this.f32133f = set;
        this.f32134g = i12;
        this.f32135h = pattern;
        this.f32136i = map;
        this.f32137j = map2;
        this.f32138k = z8;
        this.f32139l = i13;
    }

    private static final /* synthetic */ EnumC2906e[] a() {
        return new EnumC2906e[]{f32117o, f32118p, f32119q, f32120r, f32121s, f32122t, f32123u, f32124v, f32125w};
    }

    public static W5.a i() {
        return f32127y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern o(String str) {
        Pattern pattern = (Pattern) this.f32136i.get(Integer.valueOf(str.length()));
        if (pattern == null) {
            return this.f32135h;
        }
        return pattern;
    }

    public static EnumC2906e valueOf(String str) {
        return (EnumC2906e) Enum.valueOf(EnumC2906e.class, str);
    }

    public static EnumC2906e[] values() {
        return (EnumC2906e[]) f32126x.clone();
    }

    public final String f() {
        return this.f32128a;
    }

    public final int g() {
        return this.f32131d;
    }

    public final String h() {
        return this.f32129b;
    }

    public final int j() {
        return this.f32132e;
    }

    public final int k() {
        return this.f32130c;
    }

    public final int m() {
        Integer num = (Integer) AbstractC1435t.A0(this.f32133f);
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int n(String cardNumber) {
        Object obj;
        AbstractC3292y.i(cardNumber, "cardNumber");
        String g8 = new AbstractC3564f.b(cardNumber).g();
        Iterator it = this.f32137j.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Pattern) ((Map.Entry) obj).getKey()).matcher(g8).matches()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getValue()).intValue();
        }
        return this.f32134g;
    }

    public final boolean p(String str) {
        int i8;
        String obj;
        if (str != null && (obj = l6.n.M0(str).toString()) != null) {
            i8 = obj.length();
        } else {
            i8 = 0;
        }
        if (m() != i8) {
            return false;
        }
        return true;
    }

    /* synthetic */ EnumC2906e(String str, int i8, String str2, String str3, int i9, int i10, int i11, Set set, int i12, Pattern pattern, Map map, Map map2, boolean z8, int i13, int i14, AbstractC3284p abstractC3284p) {
        this(str, i8, str2, str3, i9, (i14 & 8) != 0 ? D4.a.f1324e : i10, (i14 & 16) != 0 ? D4.a.f1330k : i11, (i14 & 32) != 0 ? a0.d(3) : set, (i14 & 64) != 0 ? 16 : i12, (i14 & 128) != 0 ? null : pattern, map, (i14 & 512) != 0 ? Q.h() : map2, (i14 & 1024) != 0 ? true : z8, i13);
    }
}
