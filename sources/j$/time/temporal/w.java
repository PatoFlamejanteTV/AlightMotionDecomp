package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a, reason: collision with root package name */
    private final long f33000a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33001b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33002c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33003d;

    private w(long j8, long j9, long j10, long j11) {
        this.f33000a = j8;
        this.f33001b = j9;
        this.f33002c = j10;
        this.f33003d = j11;
    }

    private String c(long j8, r rVar) {
        if (rVar == null) {
            return "Invalid value (valid values " + this + "): " + j8;
        }
        return "Invalid value for " + rVar + " (valid values " + this + "): " + j8;
    }

    public static w j(long j8, long j9) {
        if (j8 <= j9) {
            return new w(j8, j8, j9, j9);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static w k(long j8, long j9) {
        if (j8 > j9) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 <= j9) {
            return new w(1L, 1L, j8, j9);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j8 = this.f33000a;
        long j9 = this.f33001b;
        if (j8 > j9) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j10 = this.f33002c;
        long j11 = this.f33003d;
        if (j10 > j11) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j9 > j11) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final int a(long j8, r rVar) {
        if (h() && i(j8)) {
            return (int) j8;
        }
        throw new RuntimeException(c(j8, rVar));
    }

    public final void b(long j8, r rVar) {
        if (!i(j8)) {
            throw new RuntimeException(c(j8, rVar));
        }
    }

    public final long d() {
        return this.f33003d;
    }

    public final long e() {
        return this.f33000a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f33000a == wVar.f33000a && this.f33001b == wVar.f33001b && this.f33002c == wVar.f33002c && this.f33003d == wVar.f33003d;
    }

    public final long f() {
        return this.f33002c;
    }

    public final boolean g() {
        return this.f33000a == this.f33001b && this.f33002c == this.f33003d;
    }

    public final boolean h() {
        return this.f33000a >= -2147483648L && this.f33003d <= 2147483647L;
    }

    public final int hashCode() {
        long j8 = this.f33001b;
        long j9 = this.f33000a + (j8 << 16) + (j8 >> 48);
        long j10 = this.f33002c;
        long j11 = j9 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f33003d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) ((j13 >>> 32) ^ j13);
    }

    public final boolean i(long j8) {
        return j8 >= this.f33000a && j8 <= this.f33003d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j8 = this.f33000a;
        sb.append(j8);
        long j9 = this.f33001b;
        if (j8 != j9) {
            sb.append('/');
            sb.append(j9);
        }
        sb.append(" - ");
        long j10 = this.f33002c;
        sb.append(j10);
        long j11 = this.f33003d;
        if (j10 != j11) {
            sb.append('/');
            sb.append(j11);
        }
        return sb.toString();
    }
}
