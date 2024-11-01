package N3;

import Q5.p;
import R5.AbstractC1435t;
import com.stripe.android.googlepaylauncher.j;
import com.stripe.android.model.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n2.m;
import v3.w;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6609g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f6610h = m.a.f35359d;

    /* renamed from: a, reason: collision with root package name */
    private final c f6611a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6612b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6613c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6614d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f6615e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6616f;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: N3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0123a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6617a;

            static {
                int[] iArr = new int[j.b.EnumC0474b.values().length];
                try {
                    iArr[j.b.EnumC0474b.f25148b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.b.EnumC0474b.f25149c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6617a = iArr;
            }
        }

        private a() {
        }

        public final n a(Boolean bool, String str, boolean z8, D3.b googlePayButtonType, boolean z9, List paymentMethodTypes, j.d dVar, Function0 onGooglePayPressed, Function0 onLinkPressed, boolean z10) {
            c cVar;
            boolean z11;
            m.a aVar;
            int i8;
            m.a.b bVar;
            AbstractC3292y.i(googlePayButtonType, "googlePayButtonType");
            AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
            AbstractC3292y.i(onGooglePayPressed, "onGooglePayPressed");
            AbstractC3292y.i(onLinkPressed, "onLinkPressed");
            c cVar2 = new c(str);
            if (AbstractC3292y.d(bool, Boolean.TRUE)) {
                cVar = cVar2;
            } else {
                cVar = null;
            }
            if (dVar != null) {
                z11 = dVar.a();
            } else {
                z11 = false;
            }
            if (dVar != null) {
                boolean f8 = dVar.b().f();
                int i9 = C0123a.f6617a[dVar.b().a().ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        bVar = m.a.b.f35364c;
                    } else {
                        throw new p();
                    }
                } else {
                    bVar = m.a.b.f35363b;
                }
                aVar = new m.a(f8, bVar, dVar.b().b());
            } else {
                aVar = null;
            }
            b bVar2 = new b(googlePayButtonType, z11, aVar);
            if (!z8) {
                bVar2 = null;
            }
            if (cVar == null && bVar2 == null) {
                return null;
            }
            Object M02 = AbstractC1435t.M0(paymentMethodTypes);
            o.p pVar = o.p.f25755i;
            if (AbstractC3292y.d(M02, pVar.f25773a) && !z10) {
                i8 = w.f40592P;
            } else if (AbstractC1435t.M0(paymentMethodTypes) == null && !z10) {
                i8 = w.f40591O;
            } else if (AbstractC3292y.d(AbstractC1435t.M0(paymentMethodTypes), pVar.f25773a) && z10) {
                i8 = w.f40594R;
            } else {
                i8 = w.f40593Q;
            }
            return new n(cVar, bVar2, z9, i8, onGooglePayPressed, onLinkPressed);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f6618d = m.a.f35359d;

        /* renamed from: a, reason: collision with root package name */
        private final D3.b f6619a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6620b;

        /* renamed from: c, reason: collision with root package name */
        private final m.a f6621c;

        public b(D3.b buttonType, boolean z8, m.a aVar) {
            AbstractC3292y.i(buttonType, "buttonType");
            this.f6619a = buttonType;
            this.f6620b = z8;
            this.f6621c = aVar;
        }

        public final boolean a() {
            return this.f6620b;
        }

        public final m.a b() {
            return this.f6621c;
        }

        public final D3.b c() {
            return this.f6619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6619a == bVar.f6619a && this.f6620b == bVar.f6620b && AbstractC3292y.d(this.f6621c, bVar.f6621c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f6619a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6620b)) * 31;
            m.a aVar = this.f6621c;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.f6619a + ", allowCreditCards=" + this.f6620b + ", billingAddressParameters=" + this.f6621c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f6622a;

        public c(String str) {
            this.f6622a = str;
        }

        public final String a() {
            return this.f6622a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3292y.d(this.f6622a, ((c) obj).f6622a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f6622a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(email=" + this.f6622a + ")";
        }
    }

    public n(c cVar, b bVar, boolean z8, int i8, Function0 onGooglePayPressed, Function0 onLinkPressed) {
        AbstractC3292y.i(onGooglePayPressed, "onGooglePayPressed");
        AbstractC3292y.i(onLinkPressed, "onLinkPressed");
        this.f6611a = cVar;
        this.f6612b = bVar;
        this.f6613c = z8;
        this.f6614d = i8;
        this.f6615e = onGooglePayPressed;
        this.f6616f = onLinkPressed;
    }

    public final boolean a() {
        return this.f6613c;
    }

    public final int b() {
        return this.f6614d;
    }

    public final b c() {
        return this.f6612b;
    }

    public final c d() {
        return this.f6611a;
    }

    public final Function0 e() {
        return this.f6615e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3292y.d(this.f6611a, nVar.f6611a) && AbstractC3292y.d(this.f6612b, nVar.f6612b) && this.f6613c == nVar.f6613c && this.f6614d == nVar.f6614d && AbstractC3292y.d(this.f6615e, nVar.f6615e) && AbstractC3292y.d(this.f6616f, nVar.f6616f)) {
            return true;
        }
        return false;
    }

    public final Function0 f() {
        return this.f6616f;
    }

    public int hashCode() {
        int hashCode;
        c cVar = this.f6611a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = hashCode * 31;
        b bVar = this.f6612b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((((((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f6613c)) * 31) + this.f6614d) * 31) + this.f6615e.hashCode()) * 31) + this.f6616f.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.f6611a + ", googlePay=" + this.f6612b + ", buttonsEnabled=" + this.f6613c + ", dividerTextResource=" + this.f6614d + ", onGooglePayPressed=" + this.f6615e + ", onLinkPressed=" + this.f6616f + ")";
    }
}
