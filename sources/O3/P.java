package O3;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final FontFamily f7249a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7250b;

    public /* synthetic */ P(FontFamily fontFamily, long j8, AbstractC3284p abstractC3284p) {
        this(fontFamily, j8);
    }

    public final FontFamily a() {
        return this.f7249a;
    }

    public final long b() {
        return this.f7250b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p8 = (P) obj;
        if (AbstractC3292y.d(this.f7249a, p8.f7249a) && TextUnit.m5339equalsimpl0(this.f7250b, p8.f7250b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        FontFamily fontFamily = this.f7249a;
        if (fontFamily == null) {
            hashCode = 0;
        } else {
            hashCode = fontFamily.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5343hashCodeimpl(this.f7250b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f7249a + ", fontSize=" + TextUnit.m5349toStringimpl(this.f7250b) + ")";
    }

    private P(FontFamily fontFamily, long j8) {
        this.f7249a = fontFamily;
        this.f7250b = j8;
    }

    public /* synthetic */ P(FontFamily fontFamily, long j8, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : fontFamily, (i8 & 2) != 0 ? TextUnit.Companion.m5353getUnspecifiedXSAIIZE() : j8, null);
    }
}
