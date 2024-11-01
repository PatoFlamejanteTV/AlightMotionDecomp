package o4;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f36032a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36033b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36034c;

    /* renamed from: d, reason: collision with root package name */
    private final float f36035d;

    /* renamed from: e, reason: collision with root package name */
    private final long f36036e;

    /* renamed from: f, reason: collision with root package name */
    private final long f36037f;

    /* renamed from: g, reason: collision with root package name */
    private final long f36038g;

    /* renamed from: h, reason: collision with root package name */
    private final long f36039h;

    /* renamed from: i, reason: collision with root package name */
    private final long f36040i;

    /* renamed from: j, reason: collision with root package name */
    private final long f36041j;

    /* renamed from: k, reason: collision with root package name */
    private final Integer f36042k;

    /* renamed from: l, reason: collision with root package name */
    private final FontFamily f36043l;

    /* renamed from: m, reason: collision with root package name */
    private final FontFamily f36044m;

    /* renamed from: n, reason: collision with root package name */
    private final FontFamily f36045n;

    /* renamed from: o, reason: collision with root package name */
    private final FontFamily f36046o;

    /* renamed from: p, reason: collision with root package name */
    private final FontFamily f36047p;

    /* renamed from: q, reason: collision with root package name */
    private final FontFamily f36048q;

    /* renamed from: r, reason: collision with root package name */
    private final FontFamily f36049r;

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7);
    }

    public final n a(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        return new n(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, fontFamily, fontFamily2, fontFamily3, fontFamily4, fontFamily5, fontFamily6, fontFamily7, null);
    }

    public final FontFamily c() {
        return this.f36043l;
    }

    public final FontFamily d() {
        return this.f36044m;
    }

    public final FontFamily e() {
        return this.f36049r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f36032a == nVar.f36032a && this.f36033b == nVar.f36033b && this.f36034c == nVar.f36034c && Float.compare(this.f36035d, nVar.f36035d) == 0 && TextUnit.m5339equalsimpl0(this.f36036e, nVar.f36036e) && TextUnit.m5339equalsimpl0(this.f36037f, nVar.f36037f) && TextUnit.m5339equalsimpl0(this.f36038g, nVar.f36038g) && TextUnit.m5339equalsimpl0(this.f36039h, nVar.f36039h) && TextUnit.m5339equalsimpl0(this.f36040i, nVar.f36040i) && TextUnit.m5339equalsimpl0(this.f36041j, nVar.f36041j) && AbstractC3292y.d(this.f36042k, nVar.f36042k) && AbstractC3292y.d(this.f36043l, nVar.f36043l) && AbstractC3292y.d(this.f36044m, nVar.f36044m) && AbstractC3292y.d(this.f36045n, nVar.f36045n) && AbstractC3292y.d(this.f36046o, nVar.f36046o) && AbstractC3292y.d(this.f36047p, nVar.f36047p) && AbstractC3292y.d(this.f36048q, nVar.f36048q) && AbstractC3292y.d(this.f36049r, nVar.f36049r)) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f36042k;
    }

    public final float g() {
        return this.f36035d;
    }

    public final int h() {
        return this.f36034c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int floatToIntBits = ((((((((((((((((((this.f36032a * 31) + this.f36033b) * 31) + this.f36034c) * 31) + Float.floatToIntBits(this.f36035d)) * 31) + TextUnit.m5343hashCodeimpl(this.f36036e)) * 31) + TextUnit.m5343hashCodeimpl(this.f36037f)) * 31) + TextUnit.m5343hashCodeimpl(this.f36038g)) * 31) + TextUnit.m5343hashCodeimpl(this.f36039h)) * 31) + TextUnit.m5343hashCodeimpl(this.f36040i)) * 31) + TextUnit.m5343hashCodeimpl(this.f36041j)) * 31;
        Integer num = this.f36042k;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = (floatToIntBits + hashCode) * 31;
        FontFamily fontFamily = this.f36043l;
        if (fontFamily == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fontFamily.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        FontFamily fontFamily2 = this.f36044m;
        if (fontFamily2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fontFamily2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        FontFamily fontFamily3 = this.f36045n;
        if (fontFamily3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = fontFamily3.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        FontFamily fontFamily4 = this.f36046o;
        if (fontFamily4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = fontFamily4.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        FontFamily fontFamily5 = this.f36047p;
        if (fontFamily5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = fontFamily5.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        FontFamily fontFamily6 = this.f36048q;
        if (fontFamily6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = fontFamily6.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        FontFamily fontFamily7 = this.f36049r;
        if (fontFamily7 != null) {
            i8 = fontFamily7.hashCode();
        }
        return i15 + i8;
    }

    public final int i() {
        return this.f36033b;
    }

    public final int j() {
        return this.f36032a;
    }

    public final FontFamily k() {
        return this.f36045n;
    }

    public final FontFamily l() {
        return this.f36046o;
    }

    public final FontFamily m() {
        return this.f36047p;
    }

    public final long n() {
        return this.f36040i;
    }

    public final long o() {
        return this.f36039h;
    }

    public final long p() {
        return this.f36038g;
    }

    public final FontFamily q() {
        return this.f36048q;
    }

    public final long r() {
        return this.f36041j;
    }

    public final long s() {
        return this.f36037f;
    }

    public final long t() {
        return this.f36036e;
    }

    public String toString() {
        return "StripeTypography(fontWeightNormal=" + this.f36032a + ", fontWeightMedium=" + this.f36033b + ", fontWeightBold=" + this.f36034c + ", fontSizeMultiplier=" + this.f36035d + ", xxSmallFontSize=" + TextUnit.m5349toStringimpl(this.f36036e) + ", xSmallFontSize=" + TextUnit.m5349toStringimpl(this.f36037f) + ", smallFontSize=" + TextUnit.m5349toStringimpl(this.f36038g) + ", mediumFontSize=" + TextUnit.m5349toStringimpl(this.f36039h) + ", largeFontSize=" + TextUnit.m5349toStringimpl(this.f36040i) + ", xLargeFontSize=" + TextUnit.m5349toStringimpl(this.f36041j) + ", fontFamily=" + this.f36042k + ", body1FontFamily=" + this.f36043l + ", body2FontFamily=" + this.f36044m + ", h4FontFamily=" + this.f36045n + ", h5FontFamily=" + this.f36046o + ", h6FontFamily=" + this.f36047p + ", subtitle1FontFamily=" + this.f36048q + ", captionFontFamily=" + this.f36049r + ")";
    }

    private n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7) {
        this.f36032a = i8;
        this.f36033b = i9;
        this.f36034c = i10;
        this.f36035d = f8;
        this.f36036e = j8;
        this.f36037f = j9;
        this.f36038g = j10;
        this.f36039h = j11;
        this.f36040i = j12;
        this.f36041j = j13;
        this.f36042k = num;
        this.f36043l = fontFamily;
        this.f36044m = fontFamily2;
        this.f36045n = fontFamily3;
        this.f36046o = fontFamily4;
        this.f36047p = fontFamily5;
        this.f36048q = fontFamily6;
        this.f36049r = fontFamily7;
    }

    public /* synthetic */ n(int i8, int i9, int i10, float f8, long j8, long j9, long j10, long j11, long j12, long j13, Integer num, FontFamily fontFamily, FontFamily fontFamily2, FontFamily fontFamily3, FontFamily fontFamily4, FontFamily fontFamily5, FontFamily fontFamily6, FontFamily fontFamily7, int i11, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, f8, j8, j9, j10, j11, j12, j13, num, (i11 & 2048) != 0 ? null : fontFamily, (i11 & 4096) != 0 ? null : fontFamily2, (i11 & 8192) != 0 ? null : fontFamily3, (i11 & 16384) != 0 ? null : fontFamily4, (32768 & i11) != 0 ? null : fontFamily5, (65536 & i11) != 0 ? null : fontFamily6, (i11 & 131072) != 0 ? null : fontFamily7, null);
    }
}
