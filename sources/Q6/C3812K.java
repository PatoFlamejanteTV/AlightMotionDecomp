package q6;

import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: q6.K, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3812K implements InterfaceC3808G {

    /* renamed from: b, reason: collision with root package name */
    private final long f37374b;

    /* renamed from: c, reason: collision with root package name */
    private final long f37375c;

    /* renamed from: q6.K$a */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2073o {

        /* renamed from: a, reason: collision with root package name */
        int f37376a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f37377b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ int f37378c;

        a(U5.d dVar) {
            super(3, dVar);
        }

        public final Object i(InterfaceC3822g interfaceC3822g, int i8, U5.d dVar) {
            a aVar = new a(dVar);
            aVar.f37377b = interfaceC3822g;
            aVar.f37378c = i8;
            return aVar.invokeSuspend(Q5.I.f8786a);
        }

        @Override // c6.InterfaceC2073o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((InterfaceC3822g) obj, ((Number) obj2).intValue(), (U5.d) obj3);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r9.f37376a
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f37377b
                q6.g r1 = (q6.InterfaceC3822g) r1
                Q5.t.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f37377b
                q6.g r1 = (q6.InterfaceC3822g) r1
                Q5.t.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f37377b
                q6.g r1 = (q6.InterfaceC3822g) r1
                Q5.t.b(r10)
                goto L64
            L38:
                Q5.t.b(r10)
                goto L9c
            L3c:
                Q5.t.b(r10)
                java.lang.Object r10 = r9.f37377b
                r1 = r10
                q6.g r1 = (q6.InterfaceC3822g) r1
                int r10 = r9.f37378c
                if (r10 <= 0) goto L53
                q6.E r10 = q6.EnumC3806E.START
                r9.f37376a = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                q6.K r10 = q6.C3812K.this
                long r6 = q6.C3812K.c(r10)
                r9.f37377b = r1
                r9.f37376a = r5
                java.lang.Object r10 = n6.X.b(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                q6.K r10 = q6.C3812K.this
                long r5 = q6.C3812K.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                q6.E r10 = q6.EnumC3806E.STOP
                r9.f37377b = r1
                r9.f37376a = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                q6.K r10 = q6.C3812K.this
                long r4 = q6.C3812K.b(r10)
                r9.f37377b = r1
                r9.f37376a = r3
                java.lang.Object r10 = n6.X.b(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                q6.E r10 = q6.EnumC3806E.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f37377b = r3
                r9.f37376a = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                Q5.I r10 = Q5.I.f8786a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q6.C3812K.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: q6.K$b */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f37380a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f37381b;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(dVar);
            bVar.f37381b = obj;
            return bVar;
        }

        @Override // c6.InterfaceC2072n
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(EnumC3806E enumC3806E, U5.d dVar) {
            return ((b) create(enumC3806E, dVar)).invokeSuspend(Q5.I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            V5.b.e();
            if (this.f37380a == 0) {
                Q5.t.b(obj);
                if (((EnumC3806E) this.f37381b) != EnumC3806E.START) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C3812K(long j8, long j9) {
        this.f37374b = j8;
        this.f37375c = j9;
        if (j8 >= 0) {
            if (j9 >= 0) {
                return;
            }
            throw new IllegalArgumentException(("replayExpiration(" + j9 + " ms) cannot be negative").toString());
        }
        throw new IllegalArgumentException(("stopTimeout(" + j8 + " ms) cannot be negative").toString());
    }

    @Override // q6.InterfaceC3808G
    public InterfaceC3821f a(InterfaceC3813L interfaceC3813L) {
        return AbstractC3823h.p(AbstractC3823h.r(AbstractC3823h.M(interfaceC3813L, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3812K) {
            C3812K c3812k = (C3812K) obj;
            if (this.f37374b == c3812k.f37374b && this.f37375c == c3812k.f37375c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (androidx.collection.a.a(this.f37374b) * 31) + androidx.collection.a.a(this.f37375c);
    }

    public String toString() {
        List d8 = AbstractC1435t.d(2);
        if (this.f37374b > 0) {
            d8.add("stopTimeout=" + this.f37374b + "ms");
        }
        if (this.f37375c < Long.MAX_VALUE) {
            d8.add("replayExpiration=" + this.f37375c + "ms");
        }
        return "SharingStarted.WhileSubscribed(" + AbstractC1435t.w0(AbstractC1435t.a(d8), null, null, null, 0, null, null, 63, null) + ')';
    }
}
