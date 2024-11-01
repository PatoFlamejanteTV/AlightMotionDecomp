package i6;

import R5.AbstractC1434s;
import d6.InterfaceC2767a;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2973a implements Iterable, InterfaceC2767a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0770a f32757d = new C0770a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f32758a;

    /* renamed from: b, reason: collision with root package name */
    private final char f32759b;

    /* renamed from: c, reason: collision with root package name */
    private final int f32760c;

    /* renamed from: i6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0770a {
        private C0770a() {
        }

        public /* synthetic */ C0770a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AbstractC2973a(char c8, char c9, int i8) {
        if (i8 != 0) {
            if (i8 != Integer.MIN_VALUE) {
                this.f32758a = c8;
                this.f32759b = (char) X5.c.c(c8, c9, i8);
                this.f32760c = i8;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char e() {
        return this.f32758a;
    }

    public final char g() {
        return this.f32759b;
    }

    @Override // java.lang.Iterable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC1434s iterator() {
        return new C2974b(this.f32758a, this.f32759b, this.f32760c);
    }
}
