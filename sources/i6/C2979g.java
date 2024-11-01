package i6;

import R5.N;
import d6.InterfaceC2767a;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: i6.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2979g implements Iterable, InterfaceC2767a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f32769d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f32770a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32771b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32772c;

    /* renamed from: i6.g$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final C2979g a(int i8, int i9, int i10) {
            return new C2979g(i8, i9, i10);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C2979g(int i8, int i9, int i10) {
        if (i10 != 0) {
            if (i10 != Integer.MIN_VALUE) {
                this.f32770a = i8;
                this.f32771b = X5.c.c(i8, i9, i10);
                this.f32772c = i10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int e() {
        return this.f32770a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2979g) {
            if (!isEmpty() || !((C2979g) obj).isEmpty()) {
                C2979g c2979g = (C2979g) obj;
                if (this.f32770a != c2979g.f32770a || this.f32771b != c2979g.f32771b || this.f32772c != c2979g.f32772c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f32771b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f32770a * 31) + this.f32771b) * 31) + this.f32772c;
    }

    public boolean isEmpty() {
        if (this.f32772c > 0) {
            if (this.f32770a <= this.f32771b) {
                return false;
            }
        } else if (this.f32770a >= this.f32771b) {
            return false;
        }
        return true;
    }

    public final int j() {
        return this.f32772c;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public N iterator() {
        return new h(this.f32770a, this.f32771b, this.f32772c);
    }

    public String toString() {
        StringBuilder sb;
        int i8;
        if (this.f32772c > 0) {
            sb = new StringBuilder();
            sb.append(this.f32770a);
            sb.append("..");
            sb.append(this.f32771b);
            sb.append(" step ");
            i8 = this.f32772c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f32770a);
            sb.append(" downTo ");
            sb.append(this.f32771b);
            sb.append(" step ");
            i8 = -this.f32772c;
        }
        sb.append(i8);
        return sb.toString();
    }
}
