package s4;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3962d {

    /* renamed from: d, reason: collision with root package name */
    public static final int f39076d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Shape f39077a;

    /* renamed from: b, reason: collision with root package name */
    private final long f39078b;

    /* renamed from: c, reason: collision with root package name */
    private final long f39079c;

    public /* synthetic */ C3962d(Shape shape, long j8, long j9, AbstractC3284p abstractC3284p) {
        this(shape, j8, j9);
    }

    public final long a() {
        return this.f39079c;
    }

    public final long b() {
        return this.f39078b;
    }

    public final Shape c() {
        return this.f39077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3962d)) {
            return false;
        }
        C3962d c3962d = (C3962d) obj;
        if (AbstractC3292y.d(this.f39077a, c3962d.f39077a) && Color.m2949equalsimpl0(this.f39078b, c3962d.f39078b) && Color.m2949equalsimpl0(this.f39079c, c3962d.f39079c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f39077a.hashCode() * 31) + Color.m2955hashCodeimpl(this.f39078b)) * 31) + Color.m2955hashCodeimpl(this.f39079c);
    }

    public String toString() {
        return "StripeBottomSheetLayoutInfo(sheetShape=" + this.f39077a + ", sheetBackgroundColor=" + Color.m2956toStringimpl(this.f39078b) + ", scrimColor=" + Color.m2956toStringimpl(this.f39079c) + ")";
    }

    private C3962d(Shape sheetShape, long j8, long j9) {
        AbstractC3292y.i(sheetShape, "sheetShape");
        this.f39077a = sheetShape;
        this.f39078b = j8;
        this.f39079c = j9;
    }
}
