package C6;

import A6.j;
import A6.k;
import Q5.InterfaceC1416k;
import R5.AbstractC1435t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: C6.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1032w extends C1014e0 {

    /* renamed from: m, reason: collision with root package name */
    private final A6.j f1118m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC1416k f1119n;

    /* renamed from: C6.w$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1120a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1121b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C1032w f1122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, String str, C1032w c1032w) {
            super(0);
            this.f1120a = i8;
            this.f1121b = str;
            this.f1122c = c1032w;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A6.f[] invoke() {
            int i8 = this.f1120a;
            A6.f[] fVarArr = new A6.f[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                fVarArr[i9] = A6.i.c(this.f1121b + '.' + this.f1122c.f(i9), k.d.f291a, new A6.f[0], null, 8, null);
            }
            return fVarArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1032w(String name, int i8) {
        super(name, null, i8, 2, null);
        AbstractC3292y.i(name, "name");
        this.f1118m = j.b.f287a;
        this.f1119n = Q5.l.b(new a(i8, name, this));
    }

    private final A6.f[] s() {
        return (A6.f[]) this.f1119n.getValue();
    }

    @Override // C6.C1014e0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof A6.f)) {
            return false;
        }
        A6.f fVar = (A6.f) obj;
        if (fVar.getKind() == j.b.f287a && AbstractC3292y.d(a(), fVar.a()) && AbstractC3292y.d(AbstractC1010c0.a(this), AbstractC1010c0.a(fVar))) {
            return true;
        }
        return false;
    }

    @Override // C6.C1014e0, A6.f
    public A6.j getKind() {
        return this.f1118m;
    }

    @Override // C6.C1014e0, A6.f
    public A6.f h(int i8) {
        return s()[i8];
    }

    @Override // C6.C1014e0
    public int hashCode() {
        int i8;
        int hashCode = a().hashCode();
        int i9 = 1;
        for (String str : A6.h.b(this)) {
            int i10 = i9 * 31;
            if (str != null) {
                i8 = str.hashCode();
            } else {
                i8 = 0;
            }
            i9 = i10 + i8;
        }
        return (hashCode * 31) + i9;
    }

    @Override // C6.C1014e0
    public String toString() {
        return AbstractC1435t.w0(A6.h.b(this), ", ", a() + '(', ")", 0, null, null, 56, null);
    }
}
