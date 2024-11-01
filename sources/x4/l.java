package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11531a;

    /* renamed from: b, reason: collision with root package name */
    private final List f11532b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.r f11533c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11534a;

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
            int i8 = this.f11534a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                l lVar = l.this;
                this.f11534a = 1;
                if (lVar.e(this) == e8) {
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
        Object f11536a;

        /* renamed from: b, reason: collision with root package name */
        Object f11537b;

        /* renamed from: c, reason: collision with root package name */
        Object f11538c;

        /* renamed from: d, reason: collision with root package name */
        Object f11539d;

        /* renamed from: e, reason: collision with root package name */
        int f11540e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11542a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f11543b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2043h f11544c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, C2043h c2043h, U5.d dVar) {
                super(2, dVar);
                this.f11543b = lVar;
                this.f11544c = c2043h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11543b, this.f11544c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11542a == 0) {
                    t.b(obj);
                    b5.r rVar = this.f11543b.f11533c;
                    if (rVar != null) {
                        rVar.c(this.f11544c);
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
        /* renamed from: X4.l$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0255b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11545a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f11546b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f11547c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0255b(l lVar, K k8, U5.d dVar) {
                super(2, dVar);
                this.f11546b = lVar;
                this.f11547c = k8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0255b(this.f11546b, this.f11547c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11545a == 0) {
                    t.b(obj);
                    b5.r rVar = this.f11546b.f11533c;
                    if (rVar != null) {
                        rVar.b(this.f11547c.e());
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0255b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q q8;
            C3775H c3775h;
            Iterator it;
            l lVar;
            JSONObject jSONObject;
            Object e8 = V5.b.e();
            int i8 = this.f11540e;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f11539d;
                lVar = (l) this.f11538c;
                c3775h = (C3775H) this.f11537b;
                q8 = (Q) this.f11536a;
                t.b(obj);
            } else {
                t.b(obj);
                Q q9 = new Q();
                C3775H c3775h2 = new C3775H(l.this.f11531a);
                List list = l.this.f11532b;
                l lVar2 = l.this;
                q8 = q9;
                c3775h = c3775h2;
                it = list.iterator();
                lVar = lVar2;
            }
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                if (longValue > 0) {
                    K Q8 = c3775h.Q(longValue);
                    if (!Q8.b() && Q8.d() != null) {
                        String d8 = Q8.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject2 = new JSONObject(d8);
                        if (!jSONObject2.isNull("success")) {
                            q8.f34571a = jSONObject2.getInt("success");
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (q8.f34571a == 1 && jSONObject != null) {
                            C2043h a9 = C2043h.f15796F0.a(jSONObject);
                            if (a9.r0() != null) {
                                J0 c8 = C3445b0.c();
                                a aVar = new a(lVar, a9, null);
                                this.f11536a = q8;
                                this.f11537b = c3775h;
                                this.f11538c = lVar;
                                this.f11539d = it;
                                this.f11540e = 1;
                                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                                    return e8;
                                }
                            } else {
                                continue;
                            }
                        }
                    } else {
                        J0 c9 = C3445b0.c();
                        C0255b c0255b = new C0255b(lVar, Q8, null);
                        this.f11536a = q8;
                        this.f11537b = c3775h;
                        this.f11538c = lVar;
                        this.f11539d = it;
                        this.f11540e = 2;
                        if (AbstractC3458i.g(c9, c0255b, this) == e8) {
                            return e8;
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

    public l(Context context, List appsIDs, b5.r rVar, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appsIDs, "appsIDs");
        AbstractC3292y.i(scope, "scope");
        this.f11531a = context;
        this.f11532b = appsIDs;
        this.f11533c = rVar;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
