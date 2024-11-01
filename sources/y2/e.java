package Y2;

import P2.d;
import Q5.p;
import R5.AbstractC1435t;
import R5.a0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11834i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f11835j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f11836a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11837b;

    /* renamed from: c, reason: collision with root package name */
    private final k f11838c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11839d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f11840e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11841f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11842g;

    /* renamed from: h, reason: collision with root package name */
    private final Z2.a f11843h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: Y2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0263a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11844a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.f12023a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.f12024b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11844a = iArr;
            }
        }

        private a() {
        }

        public final e a(k signupMode, P2.d config) {
            boolean z8;
            Set b12;
            AbstractC3292y.i(signupMode, "signupMode");
            AbstractC3292y.i(config, "config");
            boolean z9 = false;
            if (signupMode == k.f12024b) {
                z8 = true;
            } else {
                z8 = false;
            }
            d.c b9 = config.b();
            List c8 = AbstractC1435t.c();
            String b10 = b9.b();
            if (b10 == null || n.T(b10)) {
                z9 = true;
            }
            boolean z10 = !z9;
            if (z8 && z10) {
                c8.add(j.f12019b);
                c8.add(j.f12018a);
            } else if (z8) {
                c8.add(j.f12018a);
                c8.add(j.f12019b);
            } else {
                c8.add(j.f12018a);
                c8.add(j.f12019b);
            }
            if (!AbstractC3292y.d(config.p().m(), z2.b.Companion.b().b())) {
                c8.add(j.f12020c);
            }
            List a9 = AbstractC1435t.a(c8);
            int i8 = C0263a.f11844a[signupMode.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    b12 = a0.l(AbstractC1435t.b1(a9), AbstractC1435t.m0(a9));
                } else {
                    throw new p();
                }
            } else {
                b12 = AbstractC1435t.b1(a9);
            }
            return new e(null, config.i(), signupMode, a9, b12, false, false, null, 224, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11845a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f12024b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f12023a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11845a = iArr;
        }
    }

    public e(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, Z2.a signUpState) {
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(fields, "fields");
        AbstractC3292y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3292y.i(signUpState, "signUpState");
        this.f11836a = mVar;
        this.f11837b = merchantName;
        this.f11838c = kVar;
        this.f11839d = fields;
        this.f11840e = prefillEligibleFields;
        this.f11841f = z8;
        this.f11842g = z9;
        this.f11843h = signUpState;
    }

    public static /* synthetic */ e b(e eVar, m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, Z2.a aVar, int i8, Object obj) {
        m mVar2;
        String str2;
        k kVar2;
        List list2;
        Set set2;
        boolean z10;
        boolean z11;
        Z2.a aVar2;
        if ((i8 & 1) != 0) {
            mVar2 = eVar.f11836a;
        } else {
            mVar2 = mVar;
        }
        if ((i8 & 2) != 0) {
            str2 = eVar.f11837b;
        } else {
            str2 = str;
        }
        if ((i8 & 4) != 0) {
            kVar2 = eVar.f11838c;
        } else {
            kVar2 = kVar;
        }
        if ((i8 & 8) != 0) {
            list2 = eVar.f11839d;
        } else {
            list2 = list;
        }
        if ((i8 & 16) != 0) {
            set2 = eVar.f11840e;
        } else {
            set2 = set;
        }
        if ((i8 & 32) != 0) {
            z10 = eVar.f11841f;
        } else {
            z10 = z8;
        }
        if ((i8 & 64) != 0) {
            z11 = eVar.f11842g;
        } else {
            z11 = z9;
        }
        if ((i8 & 128) != 0) {
            aVar2 = eVar.f11843h;
        } else {
            aVar2 = aVar;
        }
        return eVar.a(mVar2, str2, kVar2, list2, set2, z10, z11, aVar2);
    }

    public final e a(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, Z2.a signUpState) {
        AbstractC3292y.i(merchantName, "merchantName");
        AbstractC3292y.i(fields, "fields");
        AbstractC3292y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3292y.i(signUpState, "signUpState");
        return new e(mVar, merchantName, kVar, fields, prefillEligibleFields, z8, z9, signUpState);
    }

    public final List c() {
        return this.f11839d;
    }

    public final String d() {
        return this.f11837b;
    }

    public final Set e() {
        return this.f11840e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f11836a, eVar.f11836a) && AbstractC3292y.d(this.f11837b, eVar.f11837b) && this.f11838c == eVar.f11838c && AbstractC3292y.d(this.f11839d, eVar.f11839d) && AbstractC3292y.d(this.f11840e, eVar.f11840e) && this.f11841f == eVar.f11841f && this.f11842g == eVar.f11842g && this.f11843h == eVar.f11843h) {
            return true;
        }
        return false;
    }

    public final Z2.a f() {
        return this.f11843h;
    }

    public final k g() {
        return this.f11838c;
    }

    public final boolean h() {
        int i8;
        k kVar = this.f11838c;
        if (kVar == null) {
            i8 = -1;
        } else {
            i8 = b.f11845a[kVar.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                if (!this.f11841f || this.f11842g) {
                    return false;
                }
            } else {
                throw new p();
            }
        } else if (this.f11836a == null || this.f11842g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        m mVar = this.f11836a;
        int i8 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.f11837b.hashCode()) * 31;
        k kVar = this.f11838c;
        if (kVar != null) {
            i8 = kVar.hashCode();
        }
        return ((((((((((hashCode2 + i8) * 31) + this.f11839d.hashCode()) * 31) + this.f11840e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f11841f)) * 31) + androidx.compose.foundation.a.a(this.f11842g)) * 31) + this.f11843h.hashCode();
    }

    public final m i() {
        return this.f11836a;
    }

    public final boolean j() {
        return this.f11841f;
    }

    public final boolean k() {
        if (AbstractC1435t.m0(this.f11839d) == j.f12018a) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (AbstractC1435t.m0(this.f11839d) == j.f12019b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "InlineSignupViewState(userInput=" + this.f11836a + ", merchantName=" + this.f11837b + ", signupMode=" + this.f11838c + ", fields=" + this.f11839d + ", prefillEligibleFields=" + this.f11840e + ", isExpanded=" + this.f11841f + ", apiFailed=" + this.f11842g + ", signUpState=" + this.f11843h + ")";
    }

    public /* synthetic */ e(m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, Z2.a aVar, int i8, AbstractC3284p abstractC3284p) {
        this(mVar, str, kVar, list, set, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? false : z9, (i8 & 128) != 0 ? Z2.a.f13214a : aVar);
    }
}
