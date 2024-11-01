package o4;

import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3530d {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f35941a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35942b;

    public /* synthetic */ C3530d(Integer num, long j8, AbstractC3284p abstractC3284p) {
        this(num, j8);
    }

    public final Integer a() {
        return this.f35941a;
    }

    public final long b() {
        return this.f35942b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3530d)) {
            return false;
        }
        C3530d c3530d = (C3530d) obj;
        if (AbstractC3292y.d(this.f35941a, c3530d.f35941a) && TextUnit.m5339equalsimpl0(this.f35942b, c3530d.f35942b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.f35941a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (hashCode * 31) + TextUnit.m5343hashCodeimpl(this.f35942b);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.f35941a + ", fontSize=" + TextUnit.m5349toStringimpl(this.f35942b) + ")";
    }

    private C3530d(Integer num, long j8) {
        this.f35941a = num;
        this.f35942b = j8;
    }
}
