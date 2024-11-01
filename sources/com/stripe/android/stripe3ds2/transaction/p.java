package com.stripe.android.stripe3ds2.transaction;

import Q5.I;
import Q5.s;
import Q5.t;
import a4.C1672f;
import a4.InterfaceC1670d;
import c6.InterfaceC2072n;
import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.d;
import com.stripe.android.stripe3ds2.transaction.g;
import d4.C2757a;
import d4.d;
import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;
import n6.Y0;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements com.stripe.android.stripe3ds2.transaction.c {

    /* renamed from: l, reason: collision with root package name */
    public static final a f28141l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    private static final long f28142m = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    private final a4.k f28143a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28144b;

    /* renamed from: c, reason: collision with root package name */
    private final PrivateKey f28145c;

    /* renamed from: d, reason: collision with root package name */
    private final ECPublicKey f28146d;

    /* renamed from: e, reason: collision with root package name */
    private final Z3.c f28147e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC1670d f28148f;

    /* renamed from: g, reason: collision with root package name */
    private final U5.g f28149g;

    /* renamed from: h, reason: collision with root package name */
    private final c4.k f28150h;

    /* renamed from: i, reason: collision with root package name */
    private final c.a f28151i;

    /* renamed from: j, reason: collision with root package name */
    private final SecretKey f28152j;

    /* renamed from: k, reason: collision with root package name */
    private final f f28153k;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d.e b(C2757a c2757a) {
            c4.q u8 = c2757a.u();
            String p8 = c2757a.p();
            String f8 = c2757a.f();
            String v8 = c2757a.v();
            d4.f fVar = d4.f.f31444j;
            return new d.e(new d4.d(v8, f8, null, String.valueOf(fVar.b()), d.c.f31424c, fVar.c(), "Challenge request timed-out", "CReq", p8, u8, 4, null));
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c.b {

        /* renamed from: a, reason: collision with root package name */
        private final c.a f28154a;

        public b(c.a config) {
            AbstractC3292y.i(config, "config");
            this.f28154a = config;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.c.b
        public com.stripe.android.stripe3ds2.transaction.c Q(Z3.c errorReporter, U5.g workContext) {
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(workContext, "workContext");
            C1672f c1672f = new C1672f(errorReporter);
            return new p(this.f28154a.f(), this.f28154a.h(), c1672f.a(this.f28154a.b().b()), c1672f.b(this.f28154a.b().a()), this.f28154a.a(), errorReporter, new a4.m(errorReporter), workContext, null, this.f28154a, null, 1280, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28155a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28156b;

        /* renamed from: d, reason: collision with root package name */
        int f28158d;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28156b = obj;
            this.f28158d |= Integer.MIN_VALUE;
            return p.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28159a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28160b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2757a f28162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C2757a c2757a, U5.d dVar) {
            super(2, dVar);
            this.f28162d = c2757a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f28162d, dVar);
            dVar2.f28160b = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            Object e8 = V5.b.e();
            int i8 = this.f28159a;
            try {
            } catch (Throwable th) {
                s.a aVar = s.f8810b;
                b9 = s.b(t.a(th));
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return (com.stripe.android.stripe3ds2.transaction.d) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                p pVar = p.this;
                C2757a c2757a = this.f28162d;
                s.a aVar2 = s.f8810b;
                c4.k kVar = pVar.f28150h;
                String g8 = pVar.g(c2757a.x());
                this.f28159a = 1;
                obj = kVar.a(g8, "application/jose; charset=UTF-8", this);
                if (obj == e8) {
                    return e8;
                }
            }
            b9 = s.b((c4.l) obj);
            p pVar2 = p.this;
            Throwable e9 = s.e(b9);
            if (e9 != null) {
                pVar2.f28147e.l(e9);
            }
            p pVar3 = p.this;
            C2757a c2757a2 = this.f28162d;
            Throwable e10 = s.e(b9);
            if (e10 == null) {
                f fVar = pVar3.f28153k;
                this.f28159a = 2;
                obj = fVar.a(c2757a2, (c4.l) b9, this);
                if (obj == e8) {
                    return e8;
                }
                return (com.stripe.android.stripe3ds2.transaction.d) obj;
            }
            if (e10 instanceof Y0) {
                return p.f28141l.b(c2757a2);
            }
            return new d.c(e10);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public p(a4.k messageTransformer, String sdkReferenceId, PrivateKey sdkPrivateKey, ECPublicKey acsPublicKey, String acsUrl, Z3.c errorReporter, InterfaceC1670d dhKeyGenerator, U5.g workContext, c4.k httpClient, c.a creqExecutorConfig, g responseProcessorFactory) {
        AbstractC3292y.i(messageTransformer, "messageTransformer");
        AbstractC3292y.i(sdkReferenceId, "sdkReferenceId");
        AbstractC3292y.i(sdkPrivateKey, "sdkPrivateKey");
        AbstractC3292y.i(acsPublicKey, "acsPublicKey");
        AbstractC3292y.i(acsUrl, "acsUrl");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(dhKeyGenerator, "dhKeyGenerator");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(httpClient, "httpClient");
        AbstractC3292y.i(creqExecutorConfig, "creqExecutorConfig");
        AbstractC3292y.i(responseProcessorFactory, "responseProcessorFactory");
        this.f28143a = messageTransformer;
        this.f28144b = sdkReferenceId;
        this.f28145c = sdkPrivateKey;
        this.f28146d = acsPublicKey;
        this.f28147e = errorReporter;
        this.f28148f = dhKeyGenerator;
        this.f28149g = workContext;
        this.f28150h = httpClient;
        this.f28151i = creqExecutorConfig;
        SecretKey f8 = f();
        this.f28152j = f8;
        this.f28153k = responseProcessorFactory.a(f8);
    }

    private final SecretKey f() {
        InterfaceC1670d interfaceC1670d = this.f28148f;
        ECPublicKey eCPublicKey = this.f28146d;
        PrivateKey privateKey = this.f28145c;
        AbstractC3292y.g(privateKey, "null cannot be cast to non-null type java.security.interfaces.ECPrivateKey");
        return interfaceC1670d.s(eCPublicKey, (ECPrivateKey) privateKey, this.f28144b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String g(JSONObject jSONObject) {
        return this.f28143a.U(jSONObject, this.f28152j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.stripe.android.stripe3ds2.transaction.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(d4.C2757a r7, U5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.stripe3ds2.transaction.p.c
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.stripe3ds2.transaction.p$c r0 = (com.stripe.android.stripe3ds2.transaction.p.c) r0
            int r1 = r0.f28158d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28158d = r1
            goto L18
        L13:
            com.stripe.android.stripe3ds2.transaction.p$c r0 = new com.stripe.android.stripe3ds2.transaction.p$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28156b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f28158d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f28155a
            d4.a r7 = (d4.C2757a) r7
            Q5.t.b(r8)
            goto L4b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            Q5.t.b(r8)
            long r4 = com.stripe.android.stripe3ds2.transaction.p.f28142m
            com.stripe.android.stripe3ds2.transaction.p$d r8 = new com.stripe.android.stripe3ds2.transaction.p$d
            r2 = 0
            r8.<init>(r7, r2)
            r0.f28155a = r7
            r0.f28158d = r3
            java.lang.Object r8 = n6.a1.d(r4, r8, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.stripe.android.stripe3ds2.transaction.d r8 = (com.stripe.android.stripe3ds2.transaction.d) r8
            if (r8 != 0) goto L55
            com.stripe.android.stripe3ds2.transaction.p$a r8 = com.stripe.android.stripe3ds2.transaction.p.f28141l
            com.stripe.android.stripe3ds2.transaction.d$e r8 = com.stripe.android.stripe3ds2.transaction.p.a.a(r8, r7)
        L55:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.p.a(d4.a, U5.d):java.lang.Object");
    }

    public /* synthetic */ p(a4.k kVar, String str, PrivateKey privateKey, ECPublicKey eCPublicKey, String str2, Z3.c cVar, InterfaceC1670d interfaceC1670d, U5.g gVar, c4.k kVar2, c.a aVar, g gVar2, int i8, AbstractC3284p abstractC3284p) {
        this(kVar, str, privateKey, eCPublicKey, str2, cVar, interfaceC1670d, gVar, (i8 & 256) != 0 ? new r(str2, null, cVar, gVar, 2, null) : kVar2, aVar, (i8 & 1024) != 0 ? new g.a(kVar, cVar, aVar) : gVar2);
    }
}
