package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2046k;
import c5.K;
import c5.P;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.J0;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private Context f11356a;

    /* renamed from: b, reason: collision with root package name */
    private b5.o f11357b;

    /* renamed from: c, reason: collision with root package name */
    private final M f11358c;

    /* renamed from: d, reason: collision with root package name */
    private int f11359d;

    /* renamed from: e, reason: collision with root package name */
    private C2046k f11360e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f11361f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f11362g;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f11363h;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11364a;

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
            int i8 = this.f11364a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                d dVar = d.this;
                this.f11364a = 1;
                if (dVar.r(this) == e8) {
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
        int f11366a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f11367b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11368c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11369a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11370b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, U5.d dVar2) {
                super(2, dVar2);
                this.f11370b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11370b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11369a == 0) {
                    t.b(obj);
                    b5.o oVar = this.f11370b.f11357b;
                    if (oVar != null) {
                        oVar.b(this.f11370b.f11362g);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C3775H c3775h, d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f11367b = c3775h;
            this.f11368c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f11367b, this.f11368c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Object e8 = V5.b.e();
            int i9 = this.f11366a;
            if (i9 != 0) {
                if (i9 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                K q8 = this.f11367b.q(this.f11368c.f11360e.b());
                this.f11368c.f11362g = new ArrayList();
                if (!q8.b() && q8.d() != null) {
                    String d8 = q8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = q8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 != 1) {
                            int i10 = this.f11368c.f11359d;
                            this.f11368c.f11359d = i10 + 1;
                            kotlin.coroutines.jvm.internal.b.c(i10);
                        } else if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                                C2046k c2046k = new C2046k(0, null, null, 7, null);
                                AbstractC3292y.f(jSONObject2);
                                c2046k.w(jSONObject2, this.f11368c.f11360e.b());
                                this.f11368c.f11362g.add(c2046k);
                            }
                            J0 c8 = C3445b0.c();
                            a aVar = new a(this.f11368c, null);
                            this.f11366a = 1;
                            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
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
        int f11371a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11373a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11374b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C3775H f11375c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, C3775H c3775h, U5.d dVar2) {
                super(2, dVar2);
                this.f11374b = dVar;
                this.f11375c = c3775h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11374b, this.f11375c, dVar);
            }

            /* JADX WARN: Removed duplicated region for block: B:17:0x0076 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0069 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = V5.b.e()
                    int r1 = r7.f11373a
                    r2 = 5
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r6) goto L2f
                    if (r1 == r5) goto L2b
                    if (r1 == r4) goto L27
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    Q5.t.b(r8)
                    goto L77
                L1b:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L23:
                    Q5.t.b(r8)
                    goto L6a
                L27:
                    Q5.t.b(r8)
                    goto L5d
                L2b:
                    Q5.t.b(r8)
                    goto L50
                L2f:
                    Q5.t.b(r8)
                    goto L43
                L33:
                    Q5.t.b(r8)
                    X4.d r8 = r7.f11374b
                    q5.H r1 = r7.f11375c
                    r7.f11373a = r6
                    java.lang.Object r8 = X4.d.m(r8, r1, r7)
                    if (r8 != r0) goto L43
                    return r0
                L43:
                    X4.d r8 = r7.f11374b
                    q5.H r1 = r7.f11375c
                    r7.f11373a = r5
                    java.lang.Object r8 = X4.d.a(r8, r1, r7)
                    if (r8 != r0) goto L50
                    return r0
                L50:
                    X4.d r8 = r7.f11374b
                    q5.H r1 = r7.f11375c
                    r7.f11373a = r4
                    java.lang.Object r8 = X4.d.j(r8, r1, r7)
                    if (r8 != r0) goto L5d
                    return r0
                L5d:
                    X4.d r8 = r7.f11374b
                    q5.H r1 = r7.f11375c
                    r7.f11373a = r3
                    java.lang.Object r8 = X4.d.k(r8, r1, r7)
                    if (r8 != r0) goto L6a
                    return r0
                L6a:
                    X4.d r8 = r7.f11374b
                    q5.H r1 = r7.f11375c
                    r7.f11373a = r2
                    java.lang.Object r8 = X4.d.l(r8, r1, r7)
                    if (r8 != r0) goto L77
                    return r0
                L77:
                    Q5.I r8 = Q5.I.f8786a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: X4.d.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
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
            int f11376a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11377b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(d dVar, U5.d dVar2) {
                super(2, dVar2);
                this.f11377b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11377b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11376a == 0) {
                    t.b(obj);
                    b5.o oVar = this.f11377b.f11357b;
                    if (oVar != null) {
                        oVar.c(this.f11377b.f11363h, this.f11377b.f11362g, this.f11377b.f11361f, this.f11377b.f11359d);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3488x0 d8;
            Object e8 = V5.b.e();
            int i8 = this.f11371a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                d8 = AbstractC3462k.d(d.this.t(), null, null, new a(d.this, new C3775H(d.this.f11356a), null), 3, null);
                this.f11371a = 1;
                if (d8.k(this) == e8) {
                    return e8;
                }
            }
            J0 c8 = C3445b0.c();
            b bVar = new b(d.this, null);
            this.f11371a = 2;
            obj = AbstractC3458i.g(c8, bVar, this);
            if (obj == e8) {
                return e8;
            }
            return obj;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X4.d$d, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0248d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11378a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f11379b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11380c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0248d(C3775H c3775h, d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f11379b = c3775h;
            this.f11380c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0248d(this.f11379b, this.f11380c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            V5.b.e();
            if (this.f11378a == 0) {
                t.b(obj);
                K T8 = this.f11379b.T(this.f11380c.f11360e.b(), 10, 0);
                if (!T8.b() && T8.d() != null) {
                    String d8 = T8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList G02 = this.f11379b.G0(T8);
                        try {
                            str = this.f11380c.f11356a.getString(R.string.the_latest_title);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "The latest";
                        }
                        C2046k c2046k = new C2046k(-2, str, null, 4, null);
                        c2046k.W(this.f11380c.f11360e.b());
                        P p8 = new P(c2046k, G02, 0, 4, null);
                        p8.f(1);
                        return kotlin.coroutines.jvm.internal.b.a(this.f11380c.f11361f.add(p8));
                    }
                }
                int i8 = this.f11380c.f11359d;
                this.f11380c.f11359d = i8 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0248d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11381a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11383c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11383c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f11383c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            V5.b.e();
            if (this.f11381a == 0) {
                t.b(obj);
                if (d.this.f11360e.b() == 523) {
                    i8 = 8;
                } else {
                    i8 = 10;
                }
                K c02 = this.f11383c.c0(d.this.f11360e.b(), i8, 0);
                if (!c02.b() && c02.d() != null) {
                    String d8 = c02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        ArrayList G02 = this.f11383c.G0(c02);
                        try {
                            str = d.this.f11356a.getString(R.string.top_downloads_title);
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            str = "Top Downloads";
                        }
                        C2046k c2046k = new C2046k(-1, str, null, 4, null);
                        c2046k.W(d.this.f11360e.b());
                        P p8 = new P(c2046k, G02, 0, 4, null);
                        if (d.this.f11360e.b() == 523 && !UptodownApp.f29249C.S()) {
                            p8.f(4);
                        } else {
                            p8.f(5);
                        }
                        return kotlin.coroutines.jvm.internal.b.a(d.this.f11361f.add(p8));
                    }
                }
                int i9 = d.this.f11359d;
                d.this.f11359d = i9 + 1;
                return kotlin.coroutines.jvm.internal.b.c(i9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        int f11384a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f11386c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C3775H c3775h, U5.d dVar) {
            super(2, dVar);
            this.f11386c = c3775h;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f11386c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f11384a == 0) {
                t.b(obj);
                Iterator it = d.this.f11362g.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2046k c2046k = (C2046k) next;
                    if (c2046k.b() != 648 && c2046k.b() != 567 && c2046k.b() != 563) {
                        i8 = 10;
                    } else {
                        i8 = 12;
                    }
                    K d02 = this.f11386c.d0(c2046k.b(), i8, 0);
                    if (!d02.b() && d02.d() != null) {
                        String d8 = d02.d();
                        AbstractC3292y.f(d8);
                        if (d8.length() > 0) {
                            P p8 = new P(c2046k, this.f11386c.G0(d02), 0, 4, null);
                            if (d.this.f11360e.b() == 523) {
                                int b9 = c2046k.b();
                                if (b9 != 568 && b9 != 593 && b9 != 645) {
                                    switch (b9) {
                                        case 558:
                                        case 559:
                                        case 560:
                                        case 562:
                                            break;
                                        case 561:
                                            break;
                                        default:
                                            switch (b9) {
                                                case 564:
                                                case 565:
                                                case 566:
                                                    break;
                                                default:
                                                    p8.f(6);
                                                    break;
                                            }
                                    }
                                    p8.f(5);
                                }
                                p8.f(1);
                            } else {
                                p8.f(1);
                            }
                            kotlin.coroutines.jvm.internal.b.a(d.this.f11361f.add(p8));
                        }
                    }
                    int i9 = d.this.f11359d;
                    d.this.f11359d = i9 + 1;
                    kotlin.coroutines.jvm.internal.b.c(i9);
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        int f11387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f11388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f11389c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11390a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f11391b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, U5.d dVar2) {
                super(2, dVar2);
                this.f11391b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11391b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11390a == 0) {
                    t.b(obj);
                    b5.o oVar = this.f11391b.f11357b;
                    if (oVar != null) {
                        oVar.a(this.f11391b.f11363h);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C3775H c3775h, d dVar, U5.d dVar2) {
            super(2, dVar2);
            this.f11388b = c3775h;
            this.f11389c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f11388b, this.f11389c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11387a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            K f02 = this.f11388b.f0(this.f11389c.f11360e.b(), 10, 0);
            if (!f02.b() && f02.d() != null) {
                String d8 = f02.d();
                AbstractC3292y.f(d8);
                if (d8.length() > 0) {
                    this.f11389c.f11363h = this.f11388b.G0(f02);
                    J0 c8 = C3445b0.c();
                    a aVar = new a(this.f11389c, null);
                    this.f11387a = 1;
                    Object g8 = AbstractC3458i.g(c8, aVar, this);
                    if (g8 == e8) {
                        return e8;
                    }
                    return g8;
                }
            }
            int i9 = this.f11389c.f11359d;
            this.f11389c.f11359d = i9 + 1;
            return kotlin.coroutines.jvm.internal.b.c(i9);
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public d(Context context, b5.o oVar, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(scope, "scope");
        this.f11356a = context;
        this.f11357b = oVar;
        this.f11358c = scope;
        this.f11360e = new C2046k(523, "Games", null, 4, null);
        this.f11361f = new ArrayList();
        this.f11362g = new ArrayList();
        this.f11363h = new ArrayList();
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(c3775h, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new C0248d(c3775h, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new e(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new f(c3775h, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C3775H c3775h, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(c3775h, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final M t() {
        return this.f11358c;
    }
}
