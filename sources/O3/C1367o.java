package O3;

import g3.EnumC2906e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import r4.t0;

/* renamed from: O3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1367o {

    /* renamed from: a, reason: collision with root package name */
    private final b f7717a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7718b;

    /* renamed from: c, reason: collision with root package name */
    private final C2.c f7719c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7720d;

    /* renamed from: e, reason: collision with root package name */
    private final a f7721e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7722f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7723g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7724h;

    /* renamed from: i, reason: collision with root package name */
    private final C2.c f7725i;

    /* renamed from: O3.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements t0 {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC2906e f7726a;

        public a(EnumC2906e brand) {
            AbstractC3292y.i(brand, "brand");
            this.f7726a = brand;
        }

        public final EnumC2906e a() {
            return this.f7726a;
        }

        @Override // r4.t0
        public C2.c b() {
            return C2.d.b(this.f7726a.h());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f7726a == ((a) obj).f7726a) {
                return true;
            }
            return false;
        }

        @Override // r4.t0
        public Integer getIcon() {
            return Integer.valueOf(this.f7726a.k());
        }

        public int hashCode() {
            return this.f7726a.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(brand=" + this.f7726a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: O3.o$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7727a = new b("Idle", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f7728b = new b("Updating", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f7729c = new b("Removing", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f7730d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f7731e;

        static {
            b[] a9 = a();
            f7730d = a9;
            f7731e = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f7727a, f7728b, f7729c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f7730d.clone();
        }
    }

    public C1367o(b status, String last4, C2.c displayName, boolean z8, a selectedBrand, List availableBrands, boolean z9, boolean z10, C2.c cVar) {
        AbstractC3292y.i(status, "status");
        AbstractC3292y.i(last4, "last4");
        AbstractC3292y.i(displayName, "displayName");
        AbstractC3292y.i(selectedBrand, "selectedBrand");
        AbstractC3292y.i(availableBrands, "availableBrands");
        this.f7717a = status;
        this.f7718b = last4;
        this.f7719c = displayName;
        this.f7720d = z8;
        this.f7721e = selectedBrand;
        this.f7722f = availableBrands;
        this.f7723g = z9;
        this.f7724h = z10;
        this.f7725i = cVar;
    }

    public final List a() {
        return this.f7722f;
    }

    public final boolean b() {
        return this.f7723g;
    }

    public final boolean c() {
        return this.f7720d;
    }

    public final boolean d() {
        return this.f7724h;
    }

    public final C2.c e() {
        return this.f7719c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1367o)) {
            return false;
        }
        C1367o c1367o = (C1367o) obj;
        if (this.f7717a == c1367o.f7717a && AbstractC3292y.d(this.f7718b, c1367o.f7718b) && AbstractC3292y.d(this.f7719c, c1367o.f7719c) && this.f7720d == c1367o.f7720d && AbstractC3292y.d(this.f7721e, c1367o.f7721e) && AbstractC3292y.d(this.f7722f, c1367o.f7722f) && this.f7723g == c1367o.f7723g && this.f7724h == c1367o.f7724h && AbstractC3292y.d(this.f7725i, c1367o.f7725i)) {
            return true;
        }
        return false;
    }

    public final C2.c f() {
        return this.f7725i;
    }

    public final String g() {
        return this.f7718b;
    }

    public final a h() {
        return this.f7721e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f7717a.hashCode() * 31) + this.f7718b.hashCode()) * 31) + this.f7719c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f7720d)) * 31) + this.f7721e.hashCode()) * 31) + this.f7722f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f7723g)) * 31) + androidx.compose.foundation.a.a(this.f7724h)) * 31;
        C2.c cVar = this.f7725i;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final b i() {
        return this.f7717a;
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.f7717a + ", last4=" + this.f7718b + ", displayName=" + this.f7719c + ", canUpdate=" + this.f7720d + ", selectedBrand=" + this.f7721e + ", availableBrands=" + this.f7722f + ", canRemove=" + this.f7723g + ", confirmRemoval=" + this.f7724h + ", error=" + this.f7725i + ")";
    }

    public /* synthetic */ C1367o(b bVar, String str, C2.c cVar, boolean z8, a aVar, List list, boolean z9, boolean z10, C2.c cVar2, int i8, AbstractC3284p abstractC3284p) {
        this(bVar, str, cVar, z8, aVar, list, z9, (i8 & 128) != 0 ? false : z10, (i8 & 256) != 0 ? null : cVar2);
    }
}
