package q6;

import Q5.s;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3472p;
import n6.InterfaceC3449d0;
import p6.EnumC3588a;
import s6.C3980F;

/* renamed from: q6.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3803B extends r6.b implements v, InterfaceC3821f, r6.p {

    /* renamed from: e, reason: collision with root package name */
    private final int f37331e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37332f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC3588a f37333g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f37334h;

    /* renamed from: i, reason: collision with root package name */
    private long f37335i;

    /* renamed from: j, reason: collision with root package name */
    private long f37336j;

    /* renamed from: k, reason: collision with root package name */
    private int f37337k;

    /* renamed from: l, reason: collision with root package name */
    private int f37338l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q6.B$a */
    /* loaded from: classes5.dex */
    public static final class a implements InterfaceC3449d0 {

        /* renamed from: a, reason: collision with root package name */
        public final C3803B f37339a;

        /* renamed from: b, reason: collision with root package name */
        public long f37340b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f37341c;

        /* renamed from: d, reason: collision with root package name */
        public final U5.d f37342d;

        public a(C3803B c3803b, long j8, Object obj, U5.d dVar) {
            this.f37339a = c3803b;
            this.f37340b = j8;
            this.f37341c = obj;
            this.f37342d = dVar;
        }

        @Override // n6.InterfaceC3449d0
        public void dispose() {
            this.f37339a.y(this);
        }
    }

    /* renamed from: q6.B$b */
    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37343a;

        static {
            int[] iArr = new int[EnumC3588a.values().length];
            try {
                iArr[EnumC3588a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3588a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3588a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37343a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q6.B$c */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f37344a;

        /* renamed from: b, reason: collision with root package name */
        Object f37345b;

        /* renamed from: c, reason: collision with root package name */
        Object f37346c;

        /* renamed from: d, reason: collision with root package name */
        Object f37347d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f37348e;

        /* renamed from: g, reason: collision with root package name */
        int f37350g;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37348e = obj;
            this.f37350g |= Integer.MIN_VALUE;
            return C3803B.A(C3803B.this, null, this);
        }
    }

    public C3803B(int i8, int i9, EnumC3588a enumC3588a) {
        this.f37331e = i8;
        this.f37332f = i9;
        this.f37333g = enumC3588a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(2:18|(9:26|(1:28)|29|(1:31)|15|16|17|18|(0)(1:20))(0))|23)(2:33|34))(5:35|36|17|(2:18|(0)(0))|23))(4:37|38|39|40))(1:51)|41|42|16|17|(2:18|(0)(0))|23))|41|42|16|17|(2:18|(0)(0))|23)|53|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0042, code lost:            r8 = th;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:18:0x0092, B:20:0x009a, B:28:0x00ad, B:29:0x00b0, B:36:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [r6.b] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, q6.B] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [q6.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [r6.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, q6.D] */
    /* JADX WARN: Type inference failed for: r9v9, types: [q6.D] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00be -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object A(q6.C3803B r8, q6.InterfaceC3822g r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q6.C3803B.A(q6.B, q6.g, U5.d):java.lang.Object");
    }

    private final void B(long j8) {
        r6.d[] f8;
        if (r6.b.e(this) != 0 && (f8 = r6.b.f(this)) != null) {
            for (r6.d dVar : f8) {
                if (dVar != null) {
                    C3805D c3805d = (C3805D) dVar;
                    long j9 = c3805d.f37352a;
                    if (j9 >= 0 && j9 < j8) {
                        c3805d.f37352a = j8;
                    }
                }
            }
        }
        this.f37336j = j8;
    }

    private final void E() {
        Object[] objArr = this.f37334h;
        AbstractC3292y.f(objArr);
        AbstractC3804C.g(objArr, K(), null);
        this.f37337k--;
        long K8 = K() + 1;
        if (this.f37335i < K8) {
            this.f37335i = K8;
        }
        if (this.f37336j < K8) {
            B(K8);
        }
    }

    static /* synthetic */ Object F(C3803B c3803b, Object obj, U5.d dVar) {
        if (c3803b.d(obj)) {
            return Q5.I.f8786a;
        }
        Object G8 = c3803b.G(obj, dVar);
        if (G8 == V5.b.e()) {
            return G8;
        }
        return Q5.I.f8786a;
    }

    private final Object G(Object obj, U5.d dVar) {
        U5.d[] dVarArr;
        a aVar;
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        U5.d[] dVarArr2 = r6.c.f38792a;
        synchronized (this) {
            try {
                if (R(obj)) {
                    s.a aVar2 = Q5.s.f8810b;
                    c3472p.resumeWith(Q5.s.b(Q5.I.f8786a));
                    dVarArr = I(dVarArr2);
                    aVar = null;
                } else {
                    a aVar3 = new a(this, P() + K(), obj, c3472p);
                    H(aVar3);
                    this.f37338l++;
                    if (this.f37332f == 0) {
                        dVarArr2 = I(dVarArr2);
                    }
                    dVarArr = dVarArr2;
                    aVar = aVar3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            n6.r.a(c3472p, aVar);
        }
        for (U5.d dVar2 : dVarArr) {
            if (dVar2 != null) {
                s.a aVar4 = Q5.s.f8810b;
                dVar2.resumeWith(Q5.s.b(Q5.I.f8786a));
            }
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(Object obj) {
        int P8 = P();
        Object[] objArr = this.f37334h;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P8 >= objArr.length) {
            objArr = Q(objArr, P8, objArr.length * 2);
        }
        AbstractC3804C.g(objArr, K() + P8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object[], java.lang.Object] */
    public final U5.d[] I(U5.d[] dVarArr) {
        r6.d[] f8;
        C3805D c3805d;
        U5.d dVar;
        int length = dVarArr.length;
        if (r6.b.e(this) != 0 && (f8 = r6.b.f(this)) != null) {
            int length2 = f8.length;
            int i8 = 0;
            dVarArr = dVarArr;
            while (i8 < length2) {
                r6.d dVar2 = f8[i8];
                if (dVar2 != null && (dVar = (c3805d = (C3805D) dVar2).f37353b) != null && T(c3805d) >= 0) {
                    int length3 = dVarArr.length;
                    dVarArr = dVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(dVarArr, Math.max(2, dVarArr.length * 2));
                        AbstractC3292y.h(copyOf, "copyOf(this, newSize)");
                        dVarArr = copyOf;
                    }
                    dVarArr[length] = dVar;
                    c3805d.f37353b = null;
                    length++;
                }
                i8++;
                dVarArr = dVarArr;
            }
        }
        return dVarArr;
    }

    private final long J() {
        return K() + this.f37337k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long K() {
        return Math.min(this.f37336j, this.f37335i);
    }

    private final Object M(long j8) {
        Object f8;
        Object[] objArr = this.f37334h;
        AbstractC3292y.f(objArr);
        f8 = AbstractC3804C.f(objArr, j8);
        if (f8 instanceof a) {
            return ((a) f8).f37341c;
        }
        return f8;
    }

    private final long N() {
        return K() + this.f37337k + this.f37338l;
    }

    private final int O() {
        return (int) ((K() + this.f37337k) - this.f37335i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P() {
        return this.f37337k + this.f37338l;
    }

    private final Object[] Q(Object[] objArr, int i8, int i9) {
        Object f8;
        if (i9 > 0) {
            Object[] objArr2 = new Object[i9];
            this.f37334h = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long K8 = K();
            for (int i10 = 0; i10 < i8; i10++) {
                long j8 = i10 + K8;
                f8 = AbstractC3804C.f(objArr, j8);
                AbstractC3804C.g(objArr2, j8, f8);
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f37337k >= this.f37332f && this.f37336j <= this.f37335i) {
            int i8 = b.f37343a[this.f37333g.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    return true;
                }
            } else {
                return false;
            }
        }
        H(obj);
        int i9 = this.f37337k + 1;
        this.f37337k = i9;
        if (i9 > this.f37332f) {
            E();
        }
        if (O() > this.f37331e) {
            V(this.f37335i + 1, this.f37336j, J(), N());
        }
        return true;
    }

    private final boolean S(Object obj) {
        if (this.f37331e == 0) {
            return true;
        }
        H(obj);
        int i8 = this.f37337k + 1;
        this.f37337k = i8;
        if (i8 > this.f37331e) {
            E();
        }
        this.f37336j = K() + this.f37337k;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long T(C3805D c3805d) {
        long j8 = c3805d.f37352a;
        if (j8 < J()) {
            return j8;
        }
        if (this.f37332f > 0 || j8 > K() || this.f37338l == 0) {
            return -1L;
        }
        return j8;
    }

    private final Object U(C3805D c3805d) {
        Object obj;
        U5.d[] dVarArr = r6.c.f38792a;
        synchronized (this) {
            try {
                long T8 = T(c3805d);
                if (T8 < 0) {
                    obj = AbstractC3804C.f37351a;
                } else {
                    long j8 = c3805d.f37352a;
                    Object M8 = M(T8);
                    c3805d.f37352a = T8 + 1;
                    dVarArr = W(j8);
                    obj = M8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (U5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = Q5.s.f8810b;
                dVar.resumeWith(Q5.s.b(Q5.I.f8786a));
            }
        }
        return obj;
    }

    private final void V(long j8, long j9, long j10, long j11) {
        long min = Math.min(j9, j8);
        for (long K8 = K(); K8 < min; K8++) {
            Object[] objArr = this.f37334h;
            AbstractC3292y.f(objArr);
            AbstractC3804C.g(objArr, K8, null);
        }
        this.f37335i = j8;
        this.f37336j = j9;
        this.f37337k = (int) (j10 - min);
        this.f37338l = (int) (j11 - j10);
    }

    private final Object x(C3805D c3805d, U5.d dVar) {
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        synchronized (this) {
            try {
                if (T(c3805d) < 0) {
                    c3805d.f37353b = c3472p;
                } else {
                    s.a aVar = Q5.s.f8810b;
                    c3472p.resumeWith(Q5.s.b(Q5.I.f8786a));
                }
                Q5.I i8 = Q5.I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == V5.b.e()) {
            return y8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(a aVar) {
        Object f8;
        synchronized (this) {
            if (aVar.f37340b < K()) {
                return;
            }
            Object[] objArr = this.f37334h;
            AbstractC3292y.f(objArr);
            f8 = AbstractC3804C.f(objArr, aVar.f37340b);
            if (f8 == aVar) {
                AbstractC3804C.g(objArr, aVar.f37340b, AbstractC3804C.f37351a);
                z();
                Q5.I i8 = Q5.I.f8786a;
            }
        }
    }

    private final void z() {
        Object f8;
        if (this.f37332f == 0 && this.f37338l <= 1) {
            return;
        }
        Object[] objArr = this.f37334h;
        AbstractC3292y.f(objArr);
        while (this.f37338l > 0) {
            f8 = AbstractC3804C.f(objArr, (K() + P()) - 1);
            if (f8 == AbstractC3804C.f37351a) {
                this.f37338l--;
                AbstractC3804C.g(objArr, K() + P(), null);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r6.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public C3805D i() {
        return new C3805D();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // r6.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public C3805D[] j(int i8) {
        return new C3805D[i8];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object L() {
        Object f8;
        Object[] objArr = this.f37334h;
        AbstractC3292y.f(objArr);
        f8 = AbstractC3804C.f(objArr, (this.f37335i + O()) - 1);
        return f8;
    }

    public final U5.d[] W(long j8) {
        int i8;
        long j9;
        long j10;
        long j11;
        boolean z8;
        Object f8;
        Object f9;
        long j12;
        r6.d[] f10;
        if (j8 > this.f37336j) {
            return r6.c.f38792a;
        }
        long K8 = K();
        long j13 = this.f37337k + K8;
        if (this.f37332f == 0 && this.f37338l > 0) {
            j13++;
        }
        if (r6.b.e(this) != 0 && (f10 = r6.b.f(this)) != null) {
            for (r6.d dVar : f10) {
                if (dVar != null) {
                    long j14 = ((C3805D) dVar).f37352a;
                    if (j14 >= 0 && j14 < j13) {
                        j13 = j14;
                    }
                }
            }
        }
        if (j13 <= this.f37336j) {
            return r6.c.f38792a;
        }
        long J8 = J();
        if (l() > 0) {
            i8 = Math.min(this.f37338l, this.f37332f - ((int) (J8 - j13)));
        } else {
            i8 = this.f37338l;
        }
        U5.d[] dVarArr = r6.c.f38792a;
        long j15 = this.f37338l + J8;
        if (i8 > 0) {
            dVarArr = new U5.d[i8];
            Object[] objArr = this.f37334h;
            AbstractC3292y.f(objArr);
            long j16 = J8;
            int i9 = 0;
            while (true) {
                if (J8 < j15) {
                    f9 = AbstractC3804C.f(objArr, J8);
                    j9 = j13;
                    C3980F c3980f = AbstractC3804C.f37351a;
                    if (f9 != c3980f) {
                        AbstractC3292y.g(f9, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) f9;
                        int i10 = i9 + 1;
                        j10 = j15;
                        dVarArr[i9] = aVar.f37342d;
                        AbstractC3804C.g(objArr, J8, c3980f);
                        AbstractC3804C.g(objArr, j16, aVar.f37341c);
                        j12 = 1;
                        j16++;
                        if (i10 >= i8) {
                            break;
                        }
                        i9 = i10;
                    } else {
                        j10 = j15;
                        j12 = 1;
                    }
                    J8 += j12;
                    j13 = j9;
                    j15 = j10;
                } else {
                    j9 = j13;
                    j10 = j15;
                    break;
                }
            }
            J8 = j16;
        } else {
            j9 = j13;
            j10 = j15;
        }
        int i11 = (int) (J8 - K8);
        if (l() == 0) {
            j11 = J8;
        } else {
            j11 = j9;
        }
        long max = Math.max(this.f37335i, J8 - Math.min(this.f37331e, i11));
        if (this.f37332f == 0 && max < j10) {
            Object[] objArr2 = this.f37334h;
            AbstractC3292y.f(objArr2);
            f8 = AbstractC3804C.f(objArr2, max);
            if (AbstractC3292y.d(f8, AbstractC3804C.f37351a)) {
                J8++;
                max++;
            }
        }
        V(max, j11, J8, j10);
        z();
        if (dVarArr.length == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return I(dVarArr);
        }
        return dVarArr;
    }

    public final long X() {
        long j8 = this.f37335i;
        if (j8 < this.f37336j) {
            this.f37336j = j8;
        }
        return j8;
    }

    @Override // r6.p
    public InterfaceC3821f b(U5.g gVar, int i8, EnumC3588a enumC3588a) {
        return AbstractC3804C.e(this, gVar, i8, enumC3588a);
    }

    @Override // q6.v
    public void c() {
        synchronized (this) {
            V(J(), this.f37336j, J(), N());
            Q5.I i8 = Q5.I.f8786a;
        }
    }

    @Override // q6.InterfaceC3802A, q6.InterfaceC3821f
    public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
        return A(this, interfaceC3822g, dVar);
    }

    @Override // q6.v
    public boolean d(Object obj) {
        int i8;
        boolean z8;
        U5.d[] dVarArr = r6.c.f38792a;
        synchronized (this) {
            if (R(obj)) {
                dVarArr = I(dVarArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (U5.d dVar : dVarArr) {
            if (dVar != null) {
                s.a aVar = Q5.s.f8810b;
                dVar.resumeWith(Q5.s.b(Q5.I.f8786a));
            }
        }
        return z8;
    }

    @Override // q6.v, q6.InterfaceC3822g
    public Object emit(Object obj, U5.d dVar) {
        return F(this, obj, dVar);
    }
}
