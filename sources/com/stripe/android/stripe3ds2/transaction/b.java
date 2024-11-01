package com.stripe.android.stripe3ds2.transaction;

import Q5.I;
import Q5.t;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.view.PointerIconCompat;
import c6.InterfaceC2072n;
import com.stripe.android.stripe3ds2.transaction.a;
import com.stripe.android.stripe3ds2.transaction.c;
import d4.C2757a;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;

/* loaded from: classes4.dex */
public interface b {
    Object a(com.stripe.android.stripe3ds2.transaction.a aVar, U5.d dVar);

    /* loaded from: classes4.dex */
    public static final class a implements b {

        /* renamed from: e, reason: collision with root package name */
        public static final C0672a f28049e = new C0672a(null);

        /* renamed from: f, reason: collision with root package name */
        private static final long f28050f = TimeUnit.SECONDS.toMillis(1);

        /* renamed from: a, reason: collision with root package name */
        private final C2757a f28051a;

        /* renamed from: b, reason: collision with root package name */
        private final Z3.c f28052b;

        /* renamed from: c, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.c f28053c;

        /* renamed from: d, reason: collision with root package name */
        private final U5.g f28054d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0672a {
            private C0672a() {
            }

            public /* synthetic */ C0672a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.stripe3ds2.transaction.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0673b extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f28055a;

            /* renamed from: b, reason: collision with root package name */
            Object f28056b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f28057c;

            /* renamed from: e, reason: collision with root package name */
            int f28059e;

            C0673b(U5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f28057c = obj;
                this.f28059e |= Integer.MIN_VALUE;
                return a.this.d(null, this);
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f28060a;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f28062c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(com.stripe.android.stripe3ds2.transaction.a aVar, U5.d dVar) {
                super(2, dVar);
                this.f28062c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f28062c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C2757a b9;
                Object e8 = V5.b.e();
                int i8 = this.f28060a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
                C2757a c2757a = new C2757a(a.this.f28051a.p(), a.this.f28051a.v(), a.this.f28051a.f(), a.this.f28051a.u(), null, null, null, a.this.f28051a.i(), null, null, 880, null);
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f28062c;
                if (aVar instanceof a.c) {
                    b9 = C2757a.b(c2757a, null, null, null, null, ((a.c) aVar).a(), null, null, null, null, null, PointerIconCompat.TYPE_CROSSHAIR, null);
                } else if (aVar instanceof a.b) {
                    b9 = C2757a.b(c2757a, null, null, null, null, null, null, ((a.b) aVar).a(), null, null, null, 959, null);
                } else if (aVar instanceof a.d) {
                    b9 = C2757a.b(c2757a, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), null, 767, null);
                } else if (aVar instanceof a.e) {
                    b9 = C2757a.b(c2757a, null, null, null, null, null, null, null, null, null, kotlin.coroutines.jvm.internal.b.a(true), FrameMetricsAggregator.EVERY_DURATION, null);
                } else if (aVar instanceof a.C0666a) {
                    b9 = C2757a.b(c2757a, null, null, null, null, null, C2757a.EnumC0719a.f31360b, null, null, null, null, 991, null);
                } else {
                    throw new Q5.p();
                }
                a aVar2 = a.this;
                this.f28060a = 1;
                Object d8 = aVar2.d(b9, this);
                if (d8 == e8) {
                    return e8;
                }
                return d8;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        public a(C2757a creqData, Z3.c errorReporter, com.stripe.android.stripe3ds2.transaction.c challengeRequestExecutor, U5.g workContext) {
            AbstractC3292y.i(creqData, "creqData");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(challengeRequestExecutor, "challengeRequestExecutor");
            AbstractC3292y.i(workContext, "workContext");
            this.f28051a = creqData;
            this.f28052b = errorReporter;
            this.f28053c = challengeRequestExecutor;
            this.f28054d = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(8:10|11|12|13|14|(1:16)|17|(1:22)(2:19|20))(2:26|27))(1:28))(2:37|(1:39)(1:40))|29|30|(1:32)(6:33|13|14|(0)|17|(0)(0))))|41|6|(0)(0)|29|30|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:            r9 = th;     */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:            r0 = r2;     */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d(d4.C2757a r8, U5.d r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.stripe.android.stripe3ds2.transaction.b.a.C0673b
                if (r0 == 0) goto L13
                r0 = r9
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = (com.stripe.android.stripe3ds2.transaction.b.a.C0673b) r0
                int r1 = r0.f28059e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f28059e = r1
                goto L18
            L13:
                com.stripe.android.stripe3ds2.transaction.b$a$b r0 = new com.stripe.android.stripe3ds2.transaction.b$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f28057c
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.f28059e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L4a
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r8 = r0.f28056b
                d4.a r8 = (d4.C2757a) r8
                java.lang.Object r0 = r0.f28055a
                com.stripe.android.stripe3ds2.transaction.b$a r0 = (com.stripe.android.stripe3ds2.transaction.b.a) r0
                Q5.t.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6f
            L34:
                r9 = move-exception
                goto L78
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                java.lang.Object r8 = r0.f28056b
                d4.a r8 = (d4.C2757a) r8
                java.lang.Object r2 = r0.f28055a
                com.stripe.android.stripe3ds2.transaction.b$a r2 = (com.stripe.android.stripe3ds2.transaction.b.a) r2
                Q5.t.b(r9)
                goto L5d
            L4a:
                Q5.t.b(r9)
                long r5 = com.stripe.android.stripe3ds2.transaction.b.a.f28050f
                r0.f28055a = r7
                r0.f28056b = r8
                r0.f28059e = r4
                java.lang.Object r9 = n6.X.b(r5, r0)
                if (r9 != r1) goto L5c
                return r1
            L5c:
                r2 = r7
            L5d:
                Q5.s$a r9 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L76
                com.stripe.android.stripe3ds2.transaction.c r9 = r2.f28053c     // Catch: java.lang.Throwable -> L76
                r0.f28055a = r2     // Catch: java.lang.Throwable -> L76
                r0.f28056b = r8     // Catch: java.lang.Throwable -> L76
                r0.f28059e = r3     // Catch: java.lang.Throwable -> L76
                java.lang.Object r9 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> L76
                if (r9 != r1) goto L6e
                return r1
            L6e:
                r0 = r2
            L6f:
                com.stripe.android.stripe3ds2.transaction.d r9 = (com.stripe.android.stripe3ds2.transaction.d) r9     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = Q5.s.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L82
            L76:
                r9 = move-exception
                r0 = r2
            L78:
                Q5.s$a r1 = Q5.s.f8810b
                java.lang.Object r9 = Q5.t.a(r9)
                java.lang.Object r9 = Q5.s.b(r9)
            L82:
                java.lang.Throwable r1 = Q5.s.e(r9)
                if (r1 == 0) goto Lb0
                Z3.c r0 = r0.f28052b
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                d4.a r8 = r8.w()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "\n                            Failed to execute challenge request.\n\n                            CReq = "
                r3.append(r4)
                r3.append(r8)
                java.lang.String r8 = "\n                        "
                r3.append(r8)
                java.lang.String r8 = r3.toString()
                java.lang.String r8 = l6.n.e(r8)
                r2.<init>(r8, r1)
                r0.l(r2)
            Lb0:
                java.lang.Throwable r8 = Q5.s.e(r9)
                if (r8 != 0) goto Lb7
                goto Lbc
            Lb7:
                com.stripe.android.stripe3ds2.transaction.d$c r9 = new com.stripe.android.stripe3ds2.transaction.d$c
                r9.<init>(r8)
            Lbc:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.b.a.d(d4.a, U5.d):java.lang.Object");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.b
        public Object a(com.stripe.android.stripe3ds2.transaction.a aVar, U5.d dVar) {
            return AbstractC3458i.g(this.f28054d, new c(aVar, null), dVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(C2757a creqData, Z3.c errorReporter, c.b creqExecutorFactory, U5.g workContext) {
            this(creqData, errorReporter, creqExecutorFactory.Q(errorReporter, workContext), workContext);
            AbstractC3292y.i(creqData, "creqData");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(creqExecutorFactory, "creqExecutorFactory");
            AbstractC3292y.i(workContext, "workContext");
        }
    }
}
