package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class D {

    /* renamed from: c, reason: collision with root package name */
    private static final D f33052c = new D();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33053a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33054b;

    private D() {
        this.f33053a = false;
        this.f33054b = 0;
    }

    private D(int i8) {
        this.f33053a = true;
        this.f33054b = i8;
    }

    public static D a() {
        return f33052c;
    }

    public static D d(int i8) {
        return new D(i8);
    }

    public final int b() {
        if (this.f33053a) {
            return this.f33054b;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33053a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        boolean z8 = this.f33053a;
        if (z8 && d8.f33053a) {
            if (this.f33054b == d8.f33054b) {
                return true;
            }
        } else if (z8 == d8.f33053a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f33053a) {
            return this.f33054b;
        }
        return 0;
    }

    public final String toString() {
        if (!this.f33053a) {
            return "OptionalInt.empty";
        }
        return "OptionalInt[" + this.f33054b + "]";
    }
}
