package j$.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class B {

    /* renamed from: b, reason: collision with root package name */
    private static final B f33047b = new B();

    /* renamed from: a, reason: collision with root package name */
    private final Object f33048a;

    private B() {
        this.f33048a = null;
    }

    private B(Object obj) {
        this.f33048a = Objects.requireNonNull(obj);
    }

    public static B a() {
        return f33047b;
    }

    public static B d(Object obj) {
        return new B(obj);
    }

    public final Object b() {
        Object obj = this.f33048a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f33048a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B) {
            return Objects.equals(this.f33048a, ((B) obj).f33048a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f33048a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f33048a;
        return obj != null ? String.format("Optional[%s]", obj) : "Optional.empty";
    }
}
