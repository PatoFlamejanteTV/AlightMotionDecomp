package p2;

import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;

/* renamed from: p2.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3567i implements InterfaceC3560b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3562d f36140a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3562d f36141b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3562d f36142c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3563e f36143d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3813L f36144e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p2.i$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36145a;

        /* renamed from: b, reason: collision with root package name */
        Object f36146b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f36147c;

        /* renamed from: e, reason: collision with root package name */
        int f36149e;

        a(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36147c = obj;
            this.f36149e |= Integer.MIN_VALUE;
            return C3567i.this.b(null, this);
        }
    }

    /* renamed from: p2.i$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36150a = new b();

        b() {
            super(3);
        }

        public final Boolean a(boolean z8, boolean z9, boolean z10) {
            boolean z11;
            if (!z8 && !z9 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
        }
    }

    public C3567i(InterfaceC3562d inMemorySource, InterfaceC3562d remoteSource, InterfaceC3562d staticSource, InterfaceC3563e store) {
        AbstractC3292y.i(inMemorySource, "inMemorySource");
        AbstractC3292y.i(remoteSource, "remoteSource");
        AbstractC3292y.i(staticSource, "staticSource");
        AbstractC3292y.i(store, "store");
        this.f36140a = inMemorySource;
        this.f36141b = remoteSource;
        this.f36142c = staticSource;
        this.f36143d = store;
        this.f36144e = A4.g.e(inMemorySource.a(), remoteSource.a(), staticSource.a(), b.f36150a);
    }

    @Override // p2.InterfaceC3560b
    public InterfaceC3813L a() {
        return this.f36144e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:            if (r10 == null) goto L44;     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p2.InterfaceC3560b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p2.AbstractC3564f.b r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C3567i.b(p2.f$b, U5.d):java.lang.Object");
    }
}
