package i6;

import R5.O;
import d6.InterfaceC2767a;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes5.dex */
public abstract class j implements Iterable, InterfaceC2767a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f32779d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f32780a;

    /* renamed from: b, reason: collision with root package name */
    private final long f32781b;

    /* renamed from: c, reason: collision with root package name */
    private final long f32782c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public j(long j8, long j9, long j10) {
        if (j10 != 0) {
            if (j10 != Long.MIN_VALUE) {
                this.f32780a = j8;
                this.f32781b = X5.c.d(j8, j9, j10);
                this.f32782c = j10;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long e() {
        return this.f32780a;
    }

    public final long g() {
        return this.f32781b;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public O iterator() {
        return new k(this.f32780a, this.f32781b, this.f32782c);
    }
}
