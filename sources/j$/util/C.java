package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    private static final C f33049c = new C();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33050a;

    /* renamed from: b, reason: collision with root package name */
    private final double f33051b;

    private C() {
        this.f33050a = false;
        this.f33051b = Double.NaN;
    }

    private C(double d8) {
        this.f33050a = true;
        this.f33051b = d8;
    }

    public static C a() {
        return f33049c;
    }

    public static C d(double d8) {
        return new C(d8);
    }

    public final double b() {
        if (this.f33050a) {
            return this.f33051b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33050a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        boolean z8 = this.f33050a;
        if (z8 && c8.f33050a) {
            if (Double.compare(this.f33051b, c8.f33051b) == 0) {
                return true;
            }
        } else if (z8 == c8.f33050a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (!this.f33050a) {
            return 0;
        }
        long doubleToLongBits = Double.doubleToLongBits(this.f33051b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final String toString() {
        if (!this.f33050a) {
            return "OptionalDouble.empty";
        }
        return "OptionalDouble[" + this.f33051b + "]";
    }
}
