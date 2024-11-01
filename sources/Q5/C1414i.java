package Q5;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: Q5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1414i implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8795e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final C1414i f8796f = C1415j.a();

    /* renamed from: a, reason: collision with root package name */
    private final int f8797a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8798b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8799c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8800d;

    /* renamed from: Q5.i$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C1414i(int i8, int i9, int i10) {
        this.f8797a = i8;
        this.f8798b = i9;
        this.f8799c = i10;
        this.f8800d = b(i8, i9, i10);
    }

    private final int b(int i8, int i9, int i10) {
        if (i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256 && i10 >= 0 && i10 < 256) {
            return (i8 << 16) + (i9 << 8) + i10;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i8 + '.' + i9 + '.' + i10).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1414i other) {
        AbstractC3292y.i(other, "other");
        return this.f8800d - other.f8800d;
    }

    public boolean equals(Object obj) {
        C1414i c1414i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1414i) {
            c1414i = (C1414i) obj;
        } else {
            c1414i = null;
        }
        if (c1414i != null && this.f8800d == c1414i.f8800d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8800d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8797a);
        sb.append('.');
        sb.append(this.f8798b);
        sb.append('.');
        sb.append(this.f8799c);
        return sb.toString();
    }
}
