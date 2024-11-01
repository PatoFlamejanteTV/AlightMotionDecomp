package U7;

import Q5.I;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final T7.a f10279a;

    /* renamed from: b, reason: collision with root package name */
    public final T7.b f10280b;

    /* renamed from: c, reason: collision with root package name */
    public final W7.j f10281c;

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        public Object f10282a;

        /* renamed from: b, reason: collision with root package name */
        public int f10283b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10284c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f10286e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, U5.d dVar) {
            super(2, dVar);
            this.f10286e = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            a aVar = new a(this.f10286e, dVar);
            aVar.f10284c = obj;
            return aVar;
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            a aVar = new a(this.f10286e, (U5.d) obj2);
            aVar.f10284c = (LiveDataScope) obj;
            return aVar.invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r13.f10283b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1b
                if (r1 != r2) goto L13
                Q5.t.b(r14)
                goto L84
            L13:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1b:
                java.lang.Object r1 = r13.f10282a
                W7.j r1 = (W7.j) r1
                java.lang.Object r5 = r13.f10284c
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                Q5.t.b(r14)     // Catch: A5.a -> L72
                goto L56
            L27:
                Q5.t.b(r14)
                java.lang.Object r14 = r13.f10284c
                r5 = r14
                androidx.lifecycle.LiveDataScope r5 = (androidx.lifecycle.LiveDataScope) r5
                U7.h r14 = U7.h.this     // Catch: A5.a -> L72
                T7.a r14 = r14.f10279a     // Catch: A5.a -> L72
                boolean r14 = r14.a()     // Catch: A5.a -> L72
                if (r14 == 0) goto L5f
                java.lang.String r14 = r13.f10286e     // Catch: A5.a -> L72
                int r14 = r14.length()     // Catch: A5.a -> L72
                if (r14 <= 0) goto L5f
                U7.h r14 = U7.h.this     // Catch: A5.a -> L72
                W7.j r1 = r14.f10281c     // Catch: A5.a -> L72
                T7.b r14 = r14.f10280b     // Catch: A5.a -> L72
                java.lang.String r6 = r13.f10286e     // Catch: A5.a -> L72
                r13.f10284c = r5     // Catch: A5.a -> L72
                r13.f10282a = r1     // Catch: A5.a -> L72
                r13.f10283b = r4     // Catch: A5.a -> L72
                java.lang.Object r14 = r14.a(r6, r13)     // Catch: A5.a -> L72
                if (r14 != r0) goto L56
                return r0
            L56:
                java.lang.String r14 = (java.lang.String) r14     // Catch: A5.a -> L72
                java.lang.Object r14 = r1.a(r14)     // Catch: A5.a -> L72
                S7.d r14 = (S7.d) r14     // Catch: A5.a -> L72
                goto L77
            L5f:
                A5.b r6 = A5.b.f238a     // Catch: A5.a -> L72
                com.inmobi.cmp.model.ChoiceError r7 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: A5.a -> L72
                r11 = 0
                r12 = 30
                r8 = 0
                r9 = 0
                r10 = 0
                A5.b.a(r6, r7, r8, r9, r10, r11, r12)     // Catch: A5.a -> L72
                S7.d r14 = new S7.d     // Catch: A5.a -> L72
                r14.<init>(r3, r4)     // Catch: A5.a -> L72
                goto L77
            L72:
                S7.d r14 = new S7.d
                r14.<init>(r3, r4)
            L77:
                r13.f10284c = r3
                r13.f10282a = r3
                r13.f10283b = r2
                java.lang.Object r14 = r5.emit(r14, r13)
                if (r14 != r0) goto L84
                return r0
            L84:
                Q5.I r14 = Q5.I.f8786a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: U7.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(T7.a networkUtil, T7.b requestApi, W7.j resolver) {
        AbstractC3292y.i(networkUtil, "networkUtil");
        AbstractC3292y.i(requestApi, "requestApi");
        AbstractC3292y.i(resolver, "resolver");
        this.f10279a = networkUtil;
        this.f10280b = requestApi;
        this.f10281c = resolver;
    }

    @Override // U7.g
    public LiveData a(String url) {
        AbstractC3292y.i(url, "url");
        return CoroutineLiveDataKt.liveData$default((U5.g) null, 0L, new a(url, null), 3, (Object) null);
    }
}
