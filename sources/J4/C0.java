package j4;

import R5.AbstractC1435t;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.D;
import w4.C4156a;

/* loaded from: classes4.dex */
public final class C0 implements r4.D {

    /* renamed from: g, reason: collision with root package name */
    public static final int f33753g = 8;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f33754a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33755b;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f33757d;

    /* renamed from: e, reason: collision with root package name */
    private final B0 f33758e;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33756c = true;

    /* renamed from: f, reason: collision with root package name */
    private final r4.G f33759f = r4.G.Companion.x();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(C4156a it) {
            AbstractC3292y.i(it, "it");
            return AbstractC1435t.e(Q5.x.a(C0.this.a(), it));
        }
    }

    public C0(boolean z8, String str) {
        this.f33754a = z8;
        this.f33755b = str;
        this.f33758e = new B0(z8);
    }

    @Override // r4.D
    public r4.G a() {
        return this.f33759f;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f33757d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f33756c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.m(f().l(), new a());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (this.f33754a == c02.f33754a && AbstractC3292y.d(this.f33755b, c02.f33755b)) {
            return true;
        }
        return false;
    }

    public B0 f() {
        return this.f33758e;
    }

    public final String g() {
        return this.f33755b;
    }

    public int hashCode() {
        int hashCode;
        int a9 = androidx.compose.foundation.a.a(this.f33754a) * 31;
        String str = this.f33755b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a9 + hashCode;
    }

    public String toString() {
        return "SaveForFutureUseElement(initialValue=" + this.f33754a + ", merchantName=" + this.f33755b + ")";
    }
}
