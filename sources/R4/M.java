package r4;

import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes4.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    private final long f38047a;

    /* renamed from: b, reason: collision with root package name */
    private final long f38048b;

    public /* synthetic */ M(long j8, long j9, AbstractC3284p abstractC3284p) {
        this(j8, j9);
    }

    public final long a() {
        return this.f38048b;
    }

    public final long b() {
        return this.f38047a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (Color.m2949equalsimpl0(this.f38047a, m8.f38047a) && Color.m2949equalsimpl0(this.f38048b, m8.f38048b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Color.m2955hashCodeimpl(this.f38047a) * 31) + Color.m2955hashCodeimpl(this.f38048b);
    }

    public String toString() {
        return "OTPElementColors(selectedBorder=" + Color.m2956toStringimpl(this.f38047a) + ", placeholder=" + Color.m2956toStringimpl(this.f38048b) + ")";
    }

    private M(long j8, long j9) {
        this.f38047a = j8;
        this.f38048b = j9;
    }
}
