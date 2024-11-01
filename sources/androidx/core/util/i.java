package androidx.core.util;

import j$.util.Objects;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static Predicate a(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.g
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return i.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate3) {
                return i.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.d(Predicate.this, predicate2, obj);
            }
        };
    }

    public static Predicate b(final Predicate predicate) {
        return new Predicate() { // from class: androidx.core.util.h
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return i.a(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate2) {
                return i.c(this, predicate2);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.e(Predicate.this, obj);
            }
        };
    }

    public static Predicate c(final Predicate predicate, final Predicate predicate2) {
        Objects.requireNonNull(predicate2);
        return new Predicate() { // from class: androidx.core.util.d
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate3) {
                return i.a(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate3) {
                return i.c(this, predicate3);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj) {
                return i.f(Predicate.this, predicate2, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object obj) {
        if (predicate.test(obj) && predicate2.test(obj)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object obj) {
        if (!predicate.test(obj) && !predicate2.test(obj)) {
            return false;
        }
        return true;
    }

    public static Predicate g(final Object obj) {
        if (obj == null) {
            return new Predicate() { // from class: androidx.core.util.e
                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return i.a(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate negate() {
                    return i.b(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ Predicate or(Predicate predicate) {
                    return i.c(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(Object obj2) {
                    boolean isNull;
                    isNull = Objects.isNull(obj2);
                    return isNull;
                }
            };
        }
        return new Predicate() { // from class: androidx.core.util.f
            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return i.a(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate negate() {
                return i.b(this);
            }

            @Override // androidx.core.util.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return i.c(this, predicate);
            }

            @Override // androidx.core.util.Predicate
            public final boolean test(Object obj2) {
                boolean equals;
                equals = obj.equals(obj2);
                return equals;
            }
        };
    }

    public static Predicate j(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return predicate.negate();
    }
}
