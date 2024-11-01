package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c5.C2046k;
import c5.K;
import c5.L;
import c5.P;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.J0;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11431a;

    /* renamed from: b, reason: collision with root package name */
    private final b5.q f11432b;

    /* renamed from: c, reason: collision with root package name */
    private final C2046k f11433c;

    /* renamed from: d, reason: collision with root package name */
    private final M f11434d;

    /* renamed from: e, reason: collision with root package name */
    private int f11435e;

    /* renamed from: f, reason: collision with root package name */
    private int f11436f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f11437g;

    /* renamed from: h, reason: collision with root package name */
    private C2043h f11438h;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11439a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11439a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                h hVar = h.this;
                this.f11439a = 1;
                if (hVar.u(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11441a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11443c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11445b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11446c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11445b = hVar;
                this.f11446c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11445b, this.f11446c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11444a == 0) {
                    t.b(obj);
                    this.f11445b.f11432b.c((ArrayList) this.f11446c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11443c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f11443c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11441a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                T t8 = new T();
                t8.f34573a = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(h.this.f11431a);
                a9.a();
                String str = "features_by_category_" + h.this.f11433c.b();
                L r02 = a9.r0(str);
                int i9 = 0;
                if (r02 != null && r02.a()) {
                    t8.f34573a = this.f11443c.G0(r02.c());
                } else {
                    K f02 = this.f11443c.f0(h.this.f11433c.b(), 6, 0);
                    if (f02.f()) {
                        t8.f34573a = this.f11443c.G0(f02);
                        String d8 = f02.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L(str, d8);
                        a9.L(str);
                        a9.M0(l8);
                    }
                }
                a9.i();
                if (!((Collection) t8.f34573a).isEmpty()) {
                    h.this.f11436f++;
                    h.this.f11435e = -1;
                    Iterator it = ((Iterable) t8.f34573a).iterator();
                    while (it.hasNext()) {
                        int i10 = i9 + 1;
                        if (l6.n.s(((C2043h) it.next()).v0(), h.this.f11431a.getPackageName(), true)) {
                            h.this.f11435e = i9;
                        }
                        i9 = i10;
                    }
                    if (h.this.f11435e > -1 && h.this.f11435e < ((ArrayList) t8.f34573a).size()) {
                        ((ArrayList) t8.f34573a).remove(h.this.f11435e);
                    }
                    if (((ArrayList) t8.f34573a).size() > 5) {
                        h.this.f11438h = (C2043h) ((ArrayList) t8.f34573a).remove(5);
                        b5.q qVar = h.this.f11432b;
                        C2043h c2043h = h.this.f11438h;
                        AbstractC3292y.f(c2043h);
                        qVar.h(c2043h);
                    }
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(h.this, t8, null);
                this.f11441a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f11447a;

        /* renamed from: b, reason: collision with root package name */
        int f11448b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11450a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11451b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11452c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11451b = hVar;
                this.f11452c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11451b, this.f11452c, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0062 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0055 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = V5.b.e()
                    int r1 = r6.f11450a
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L2c
                    if (r1 == r5) goto L28
                    if (r1 == r4) goto L24
                    if (r1 == r3) goto L20
                    if (r1 != r2) goto L18
                    Q5.t.b(r7)
                    goto L63
                L18:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L20:
                    Q5.t.b(r7)
                    goto L56
                L24:
                    Q5.t.b(r7)
                    goto L49
                L28:
                    Q5.t.b(r7)
                    goto L3c
                L2c:
                    Q5.t.b(r7)
                    X4.h r7 = r6.f11451b
                    q5.H r1 = r6.f11452c
                    r6.f11450a = r5
                    java.lang.Object r7 = X4.h.b(r7, r1, r6)
                    if (r7 != r0) goto L3c
                    return r0
                L3c:
                    X4.h r7 = r6.f11451b
                    q5.H r1 = r6.f11452c
                    r6.f11450a = r4
                    java.lang.Object r7 = X4.h.i(r7, r1, r6)
                    if (r7 != r0) goto L49
                    return r0
                L49:
                    X4.h r7 = r6.f11451b
                    q5.H r1 = r6.f11452c
                    r6.f11450a = r3
                    java.lang.Object r7 = X4.h.l(r7, r1, r6)
                    if (r7 != r0) goto L56
                    return r0
                L56:
                    X4.h r7 = r6.f11451b
                    q5.H r1 = r6.f11452c
                    r6.f11450a = r2
                    java.lang.Object r7 = X4.h.m(r7, r1, r6)
                    if (r7 != r0) goto L63
                    return r0
                L63:
                    Q5.I r7 = Q5.I.f8786a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: X4.h.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11453a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11454b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, U5.d dVar) {
                super(2, dVar);
                this.f11454b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11454b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11453a == 0) {
                    t.b(obj);
                    this.f11454b.f11432b.g();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.h$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0252c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11455a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11456b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11457c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0252c(h hVar, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11456b = hVar;
                this.f11457c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0252c(this.f11456b, this.f11457c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f11455a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    h hVar = this.f11456b;
                    C3775H c3775h = this.f11457c;
                    ArrayList arrayList = hVar.f11437g;
                    this.f11455a = 1;
                    if (hVar.B(c3775h, arrayList, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0252c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r11.f11448b
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f11447a
                q5.H r0 = (q5.C3775H) r0
                Q5.t.b(r12)
                goto L73
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                java.lang.Object r1 = r11.f11447a
                q5.H r1 = (q5.C3775H) r1
                Q5.t.b(r12)
                r12 = r1
                goto L5c
            L28:
                Q5.t.b(r12)
                X4.h r12 = X4.h.this
                r1 = 0
                X4.h.s(r12, r1)
                q5.H r12 = new q5.H
                X4.h r1 = X4.h.this
                android.content.Context r1 = X4.h.d(r1)
                r12.<init>(r1)
                X4.h r1 = X4.h.this
                n6.M r5 = r1.y()
                X4.h$c$a r8 = new X4.h$c$a
                X4.h r1 = X4.h.this
                r8.<init>(r1, r12, r3)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                n6.x0 r1 = n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
                r11.f11447a = r12
                r11.f11448b = r4
                java.lang.Object r1 = r1.k(r11)
                if (r1 != r0) goto L5c
                return r0
            L5c:
                n6.J0 r1 = n6.C3445b0.c()
                X4.h$c$b r5 = new X4.h$c$b
                X4.h r6 = X4.h.this
                r5.<init>(r6, r3)
                r11.f11447a = r12
                r11.f11448b = r2
                java.lang.Object r1 = n6.AbstractC3458i.g(r1, r5, r11)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r12
            L73:
                X4.h r12 = X4.h.this
                int r12 = X4.h.k(r12)
                if (r12 < r4) goto L8f
                X4.h r12 = X4.h.this
                n6.M r4 = r12.y()
                X4.h$c$c r7 = new X4.h$c$c
                X4.h r12 = X4.h.this
                r7.<init>(r12, r0, r3)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                n6.AbstractC3458i.d(r4, r5, r6, r7, r8, r9)
            L8f:
                Q5.I r12 = Q5.I.f8786a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: X4.h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f11459b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ h f11460c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11461a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ArrayList f11462b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h f11463c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ArrayList arrayList, h hVar, U5.d dVar) {
                super(2, dVar);
                this.f11462b = arrayList;
                this.f11463c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11462b, this.f11463c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11461a == 0) {
                    t.b(obj);
                    if (!this.f11462b.isEmpty()) {
                        this.f11463c.f11432b.d(this.f11462b);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(C3775H c3775h, h hVar, U5.d dVar) {
            super(2, dVar);
            this.f11459b = c3775h;
            this.f11460c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f11459b, this.f11460c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = V5.b.e();
            int i9 = this.f11458a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                K x8 = this.f11459b.x(this.f11460c.f11433c.b());
                if (!x8.b() && x8.d() != null) {
                    String d8 = x8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = x8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                C2046k c2046k = new C2046k(0, null, null, 7, null);
                                AbstractC3292y.f(jSONObject2);
                                c2046k.x(jSONObject2);
                                arrayList.add(c2046k);
                            }
                        }
                    }
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(arrayList, this.f11460c, null);
                this.f11458a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11464a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11466c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11467a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11468b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, U5.d dVar) {
                super(2, dVar);
                this.f11468b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11468b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11467a == 0) {
                    t.b(obj);
                    this.f11468b.f11432b.i(this.f11468b.f11437g);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11466c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f11466c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11464a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(h.this.f11431a);
                a9.a();
                String str = "leaf_categories_" + h.this.f11433c.b();
                L r02 = a9.r0(str);
                if (r02 != null && r02.a()) {
                    h.this.f11437g = C2046k.f15883g.a(r02.b(), h.this.f11433c.b());
                } else {
                    K q8 = this.f11466c.q(h.this.f11433c.b());
                    if (q8.f()) {
                        h hVar = h.this;
                        C2046k.b bVar = C2046k.f15883g;
                        String d8 = q8.d();
                        AbstractC3292y.f(d8);
                        hVar.f11437g = bVar.a(d8, h.this.f11433c.b());
                        String d9 = q8.d();
                        AbstractC3292y.f(d9);
                        L l8 = new L(str, d9);
                        a9.L(str);
                        a9.M0(l8);
                    }
                }
                a9.i();
                if (!h.this.f11437g.isEmpty()) {
                    h.this.f11436f++;
                    J0 c8 = C3445b0.c();
                    a aVar = new a(h.this, null);
                    this.f11464a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11469a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11471c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11474c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11473b = hVar;
                this.f11474c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11473b, this.f11474c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11472a == 0) {
                    t.b(obj);
                    this.f11473b.f11432b.f(this.f11474c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11471c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f11471c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object e8 = V5.b.e();
            int i8 = this.f11469a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(h.this.f11431a);
                a9.a();
                String str = "recent_by_category_" + h.this.f11433c.b();
                L r02 = a9.r0(str);
                if (r02 != null && r02.a()) {
                    arrayList = this.f11471c.G0(r02.c());
                } else {
                    K T8 = this.f11471c.T(h.this.f11433c.b(), 20, 0);
                    if (T8.f()) {
                        ArrayList G02 = this.f11471c.G0(T8);
                        String d8 = T8.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L(str, d8);
                        a9.L(str);
                        a9.M0(l8);
                        arrayList = G02;
                    } else {
                        arrayList = null;
                    }
                }
                a9.i();
                if (arrayList != null && !arrayList.isEmpty()) {
                    String string = h.this.f11431a.getString(R.string.the_latest_title);
                    AbstractC3292y.h(string, "getString(...)");
                    C2046k c2046k = new C2046k(-2, string, null, 4, null);
                    c2046k.W(h.this.f11433c.b());
                    P p8 = new P(c2046k, arrayList, 0, 4, null);
                    p8.f(1);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(h.this, p8, null);
                    this.f11469a = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f11475a;

        /* renamed from: b, reason: collision with root package name */
        Object f11476b;

        /* renamed from: c, reason: collision with root package name */
        int f11477c;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C3775H f11479e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11480a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11481b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11482c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11481b = hVar;
                this.f11482c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11481b, this.f11482c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11480a == 0) {
                    t.b(obj);
                    this.f11481b.f11432b.a(this.f11482c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11483a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11484b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f11485c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f11484b = hVar;
                this.f11485c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11484b, this.f11485c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11483a == 0) {
                    t.b(obj);
                    this.f11484b.f11432b.e((C2043h) this.f11485c.f34573a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11479e = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f11479e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3791p a9;
            ArrayList arrayList;
            C3791p c3791p;
            Object e8 = V5.b.e();
            int i8 = this.f11477c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        c3791p = (C3791p) this.f11475a;
                        t.b(obj);
                        a9 = c3791p;
                        a9.i();
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a9 = (C3791p) this.f11476b;
                arrayList = (ArrayList) this.f11475a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                a9 = C3791p.f37286s.a(h.this.f11431a);
                a9.a();
                String str = "top_downloads_" + h.this.f11433c.b();
                L r02 = a9.r0(str);
                if (r02 != null && r02.a()) {
                    arrayList2 = this.f11479e.G0(r02.c());
                } else {
                    K c02 = this.f11479e.c0(h.this.f11433c.b(), 20, 0);
                    if (c02.f()) {
                        arrayList2 = this.f11479e.G0(c02);
                        String d8 = c02.d();
                        AbstractC3292y.f(d8);
                        L l8 = new L(str, d8);
                        a9.L(str);
                        a9.M0(l8);
                    }
                }
                arrayList = arrayList2;
                if (!arrayList.isEmpty()) {
                    String string = h.this.f11431a.getString(R.string.top_downloads_title);
                    AbstractC3292y.h(string, "getString(...)");
                    P p8 = new P(h.this.f11433c, arrayList, 0, 4, null);
                    p8.b().U(string);
                    if (h.this.f11433c.b() == 523 && !UptodownApp.f29249C.S()) {
                        p8.f(4);
                    } else {
                        p8.f(5);
                    }
                    J0 c8 = C3445b0.c();
                    a aVar = new a(h.this, p8, null);
                    this.f11475a = arrayList;
                    this.f11476b = a9;
                    this.f11477c = 1;
                    if (AbstractC3458i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
                a9.i();
                return I.f8786a;
            }
            if (h.this.f11435e > -1) {
                T t8 = new T();
                Iterator it = arrayList.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2043h c2043h = (C2043h) next;
                    if (!l6.n.s(c2043h.v0(), h.this.f11431a.getPackageName(), true)) {
                        t8.f34573a = c2043h;
                        break;
                    }
                }
                if (t8.f34573a != null) {
                    J0 c9 = C3445b0.c();
                    b bVar = new b(h.this, t8, null);
                    this.f11475a = a9;
                    this.f11476b = null;
                    this.f11477c = 2;
                    if (AbstractC3458i.g(c9, bVar, this) == e8) {
                        return e8;
                    }
                    c3791p = a9;
                    a9 = c3791p;
                }
            }
            a9.i();
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.h$h, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0253h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f11486a;

        /* renamed from: b, reason: collision with root package name */
        Object f11487b;

        /* renamed from: c, reason: collision with root package name */
        Object f11488c;

        /* renamed from: d, reason: collision with root package name */
        int f11489d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f11491f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C3775H f11492g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.h$h$a */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11493a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11494b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ P f11495c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, P p8, U5.d dVar) {
                super(2, dVar);
                this.f11494b = hVar;
                this.f11495c = p8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11494b, this.f11495c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11493a == 0) {
                    t.b(obj);
                    if (this.f11494b.f11433c.b() != 523) {
                        this.f11494b.f11432b.j(this.f11495c);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.h$h$b */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11496a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f11497b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f11498c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C3775H f11499d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: X4.h$h$b$a */
            /* loaded from: classes5.dex */
            public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

                /* renamed from: a, reason: collision with root package name */
                int f11500a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h f11501b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3775H f11502c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(h hVar, C3775H c3775h, U5.d dVar) {
                    super(2, dVar);
                    this.f11501b = hVar;
                    this.f11502c = c3775h;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new a(this.f11501b, this.f11502c, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object e8 = V5.b.e();
                    int i8 = this.f11500a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            t.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        t.b(obj);
                        h hVar = this.f11501b;
                        C3775H c3775h = this.f11502c;
                        this.f11500a = 1;
                        if (hVar.v(c3775h, this) == e8) {
                            return e8;
                        }
                    }
                    return I.f8786a;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(M m8, U5.d dVar) {
                    return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(h hVar, ArrayList arrayList, C3775H c3775h, U5.d dVar) {
                super(2, dVar);
                this.f11497b = hVar;
                this.f11498c = arrayList;
                this.f11499d = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11497b, this.f11498c, this.f11499d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                InterfaceC3488x0 d8;
                V5.b.e();
                if (this.f11496a == 0) {
                    t.b(obj);
                    if (this.f11497b.f11433c.b() == 523) {
                        this.f11497b.f11432b.b(this.f11498c);
                    }
                    d8 = AbstractC3462k.d(this.f11497b.y(), null, null, new a(this.f11497b, this.f11499d, null), 3, null);
                    return d8;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0253h(ArrayList arrayList, C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11491f = arrayList;
            this.f11492g = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0253h(this.f11491f, this.f11492g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            C3791p c3791p;
            Iterator it;
            Object e8 = V5.b.e();
            int i8 = this.f11489d;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f11488c;
                c3791p = (C3791p) this.f11487b;
                arrayList = (ArrayList) this.f11486a;
                t.b(obj);
            } else {
                t.b(obj);
                ArrayList arrayList2 = new ArrayList();
                C3791p a9 = C3791p.f37286s.a(h.this.f11431a);
                a9.a();
                Iterator it2 = this.f11491f.iterator();
                AbstractC3292y.h(it2, "iterator(...)");
                arrayList = arrayList2;
                c3791p = a9;
                it = it2;
            }
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                P A8 = h.this.A((C2046k) next, this.f11492g, c3791p);
                arrayList.add(A8);
                J0 c8 = C3445b0.c();
                a aVar = new a(h.this, A8, null);
                this.f11486a = arrayList;
                this.f11487b = c3791p;
                this.f11488c = it;
                this.f11489d = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            c3791p.i();
            J0 c9 = C3445b0.c();
            b bVar = new b(h.this, arrayList, this.f11492g, null);
            this.f11486a = null;
            this.f11487b = null;
            this.f11488c = null;
            this.f11489d = 2;
            obj = AbstractC3458i.g(c9, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0253h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public h(Context context, b5.q listener, C2046k category, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(category, "category");
        AbstractC3292y.i(scope, "scope");
        this.f11431a = context;
        this.f11432b = listener;
        this.f11433c = category;
        this.f11434d = scope;
        this.f11435e = -1;
        this.f11437g = new ArrayList();
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final P A(C2046k c2046k, C3775H c3775h, C3791p c3791p) {
        String str = "category_top_" + c2046k.b();
        int f8 = c2046k.f();
        int l8 = c2046k.l();
        ArrayList arrayList = new ArrayList();
        L r02 = c3791p.r0(str);
        if (r02 != null && r02.a()) {
            arrayList = c3775h.G0(r02.c());
        } else {
            K d02 = c3775h.d0(c2046k.b(), f8, 0);
            if (d02.f()) {
                arrayList = c3775h.G0(d02);
                String d8 = d02.d();
                AbstractC3292y.f(d8);
                L l9 = new L(str, d8);
                c3791p.L(str);
                c3791p.M0(l9);
            }
        }
        P p8 = new P(c2046k, arrayList, 0, 4, null);
        p8.f(l8);
        return p8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C3775H c3775h, ArrayList arrayList, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new C0253h(arrayList, c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(c3775h, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new e(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object x(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new f(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object z(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final M y() {
        return this.f11434d;
    }
}
