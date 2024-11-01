package o4;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o4.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3529c {

    /* renamed from: e, reason: collision with root package name */
    public static final int f35936e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final C3527a f35937a;

    /* renamed from: b, reason: collision with root package name */
    private final C3527a f35938b;

    /* renamed from: c, reason: collision with root package name */
    private final C3528b f35939c;

    /* renamed from: d, reason: collision with root package name */
    private final C3530d f35940d;

    public C3529c(C3527a colorsLight, C3527a colorsDark, C3528b shape, C3530d typography) {
        AbstractC3292y.i(colorsLight, "colorsLight");
        AbstractC3292y.i(colorsDark, "colorsDark");
        AbstractC3292y.i(shape, "shape");
        AbstractC3292y.i(typography, "typography");
        this.f35937a = colorsLight;
        this.f35938b = colorsDark;
        this.f35939c = shape;
        this.f35940d = typography;
    }

    public final C3529c a(C3527a colorsLight, C3527a colorsDark, C3528b shape, C3530d typography) {
        AbstractC3292y.i(colorsLight, "colorsLight");
        AbstractC3292y.i(colorsDark, "colorsDark");
        AbstractC3292y.i(shape, "shape");
        AbstractC3292y.i(typography, "typography");
        return new C3529c(colorsLight, colorsDark, shape, typography);
    }

    public final C3527a b() {
        return this.f35938b;
    }

    public final C3527a c() {
        return this.f35937a;
    }

    public final C3528b d() {
        return this.f35939c;
    }

    public final C3530d e() {
        return this.f35940d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3529c)) {
            return false;
        }
        C3529c c3529c = (C3529c) obj;
        if (AbstractC3292y.d(this.f35937a, c3529c.f35937a) && AbstractC3292y.d(this.f35938b, c3529c.f35938b) && AbstractC3292y.d(this.f35939c, c3529c.f35939c) && AbstractC3292y.d(this.f35940d, c3529c.f35940d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f35937a.hashCode() * 31) + this.f35938b.hashCode()) * 31) + this.f35939c.hashCode()) * 31) + this.f35940d.hashCode();
    }

    public String toString() {
        return "PrimaryButtonStyle(colorsLight=" + this.f35937a + ", colorsDark=" + this.f35938b + ", shape=" + this.f35939c + ", typography=" + this.f35940d + ")";
    }
}
