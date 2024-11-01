package D6;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1469a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1470b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1471c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1472d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1473e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1474f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1475g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1476h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f1477i;

    /* renamed from: j, reason: collision with root package name */
    private final String f1478j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f1479k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f1480l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f1481m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f1482n;

    public f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String prettyPrintIndent, boolean z14, boolean z15, String classDiscriminator, boolean z16, boolean z17, s sVar, boolean z18, boolean z19) {
        AbstractC3292y.i(prettyPrintIndent, "prettyPrintIndent");
        AbstractC3292y.i(classDiscriminator, "classDiscriminator");
        this.f1469a = z8;
        this.f1470b = z9;
        this.f1471c = z10;
        this.f1472d = z11;
        this.f1473e = z12;
        this.f1474f = z13;
        this.f1475g = prettyPrintIndent;
        this.f1476h = z14;
        this.f1477i = z15;
        this.f1478j = classDiscriminator;
        this.f1479k = z16;
        this.f1480l = z17;
        this.f1481m = z18;
        this.f1482n = z19;
    }

    public final boolean a() {
        return this.f1479k;
    }

    public final boolean b() {
        return this.f1472d;
    }

    public final boolean c() {
        return this.f1482n;
    }

    public final String d() {
        return this.f1478j;
    }

    public final boolean e() {
        return this.f1476h;
    }

    public final boolean f() {
        return this.f1481m;
    }

    public final boolean g() {
        return this.f1469a;
    }

    public final boolean h() {
        return this.f1474f;
    }

    public final boolean i() {
        return this.f1470b;
    }

    public final s j() {
        return null;
    }

    public final boolean k() {
        return this.f1473e;
    }

    public final String l() {
        return this.f1475g;
    }

    public final boolean m() {
        return this.f1480l;
    }

    public final boolean n() {
        return this.f1477i;
    }

    public final boolean o() {
        return this.f1471c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f1469a + ", ignoreUnknownKeys=" + this.f1470b + ", isLenient=" + this.f1471c + ", allowStructuredMapKeys=" + this.f1472d + ", prettyPrint=" + this.f1473e + ", explicitNulls=" + this.f1474f + ", prettyPrintIndent='" + this.f1475g + "', coerceInputValues=" + this.f1476h + ", useArrayPolymorphism=" + this.f1477i + ", classDiscriminator='" + this.f1478j + "', allowSpecialFloatingPointValues=" + this.f1479k + ", useAlternativeNames=" + this.f1480l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f1481m + ", allowTrailingComma=" + this.f1482n + ')';
    }

    public /* synthetic */ f(boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, String str, boolean z14, boolean z15, String str2, boolean z16, boolean z17, s sVar, boolean z18, boolean z19, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, (i8 & 4) != 0 ? false : z10, (i8 & 8) != 0 ? false : z11, (i8 & 16) != 0 ? false : z12, (i8 & 32) != 0 ? true : z13, (i8 & 64) != 0 ? "    " : str, (i8 & 128) != 0 ? false : z14, (i8 & 256) != 0 ? false : z15, (i8 & 512) != 0 ? "type" : str2, (i8 & 1024) != 0 ? false : z16, (i8 & 2048) == 0 ? z17 : true, (i8 & 4096) != 0 ? null : sVar, (i8 & 8192) != 0 ? false : z18, (i8 & 16384) == 0 ? z19 : false);
    }
}
