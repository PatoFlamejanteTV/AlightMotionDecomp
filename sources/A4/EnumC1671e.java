package a4;

import R5.AbstractC1435t;
import R5.a0;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: a4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1671e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f14102e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f14103f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1671e f14104g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC1671e f14105h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC1671e f14106i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC1671e f14107j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC1671e f14108k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC1671e f14109l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC1671e f14110m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC1671e[] f14111n;

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ W5.a f14112o;

    /* renamed from: a, reason: collision with root package name */
    private final List f14113a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1667a f14114b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14115c;

    /* renamed from: d, reason: collision with root package name */
    private final V1.h f14116d;

    /* renamed from: a4.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        List e8 = AbstractC1435t.e("F055545342");
        EnumC1667a enumC1667a = EnumC1667a.f14090c;
        f14104g = new EnumC1671e("TestRsa", 0, e8, enumC1667a, "ds-test-rsa.txt", null, 8, null);
        int i8 = 8;
        AbstractC3284p abstractC3284p = null;
        V1.h hVar = null;
        f14105h = new EnumC1671e("TestEc", 1, AbstractC1435t.e("F155545342"), EnumC1667a.f14089b, "ds-test-ec.txt", hVar, i8, abstractC3284p);
        f14106i = new EnumC1671e("Visa", 2, AbstractC1435t.e("A000000003"), enumC1667a, "ds-visa.crt", hVar, i8, abstractC3284p);
        f14107j = new EnumC1671e("Mastercard", 3, AbstractC1435t.e("A000000004"), enumC1667a, "ds-mastercard.crt", hVar, i8, abstractC3284p);
        f14108k = new EnumC1671e("Amex", 4, AbstractC1435t.e("A000000025"), enumC1667a, "ds-amex.pem", hVar, i8, abstractC3284p);
        f14109l = new EnumC1671e("Discover", 5, AbstractC1435t.p("A000000152", "A000000324"), enumC1667a, "ds-discover.cer", null);
        f14110m = new EnumC1671e("CartesBancaires", 6, AbstractC1435t.e("A000000042"), enumC1667a, "ds-cartesbancaires.pem", hVar, i8, abstractC3284p);
        EnumC1671e[] a9 = a();
        f14111n = a9;
        f14112o = W5.b.a(a9);
        f14102e = new a(null);
        f14103f = a0.i(".crt", ".cer", ".pem");
    }

    private EnumC1671e(String str, int i8, List list, EnumC1667a enumC1667a, String str2, V1.h hVar) {
        this.f14113a = list;
        this.f14114b = enumC1667a;
        this.f14115c = str2;
        this.f14116d = hVar;
    }

    private static final /* synthetic */ EnumC1671e[] a() {
        return new EnumC1671e[]{f14104g, f14105h, f14106i, f14107j, f14108k, f14109l, f14110m};
    }

    public static W5.a b() {
        return f14112o;
    }

    public static EnumC1671e valueOf(String str) {
        return (EnumC1671e) Enum.valueOf(EnumC1671e.class, str);
    }

    public static EnumC1671e[] values() {
        return (EnumC1671e[]) f14111n.clone();
    }

    public final List c() {
        return this.f14113a;
    }

    public final V1.h d() {
        return this.f14116d;
    }

    /* synthetic */ EnumC1671e(String str, int i8, List list, EnumC1667a enumC1667a, String str2, V1.h hVar, int i9, AbstractC3284p abstractC3284p) {
        this(str, i8, list, enumC1667a, str2, (i9 & 8) != 0 ? V1.h.f10477b : hVar);
    }
}
