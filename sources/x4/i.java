package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11503a;

    /* renamed from: b, reason: collision with root package name */
    private final long f11504b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.r f11505c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11506a;

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
            int i8 = this.f11506a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                i iVar = i.this;
                this.f11506a = 1;
                if (iVar.e(this) == e8) {
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
        int f11508a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11510a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f11511b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C2043h f11512c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, C2043h c2043h, U5.d dVar) {
                super(2, dVar);
                this.f11511b = iVar;
                this.f11512c = c2043h;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11511b, this.f11512c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11510a == 0) {
                    t.b(obj);
                    b5.r rVar = this.f11511b.f11505c;
                    if (rVar != null) {
                        rVar.c(this.f11512c);
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

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0254b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11513a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f11514b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f11515c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0254b(i iVar, K k8, U5.d dVar) {
                super(2, dVar);
                this.f11514b = iVar;
                this.f11515c = k8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0254b(this.f11514b, this.f11515c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11513a == 0) {
                    t.b(obj);
                    b5.r rVar = this.f11514b.f11505c;
                    if (rVar != null) {
                        rVar.b(this.f11515c.e());
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0254b) create(m8, dVar)).invokeSuspend(I.f8786a);
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
            int i8;
            JSONObject jSONObject;
            Object e8 = V5.b.e();
            int i9 = this.f11508a;
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                K Q8 = new C3775H(i.this.f11503a).Q(i.this.f11504b);
                if (!Q8.b() && Q8.d() != null) {
                    String d8 = Q8.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject2 = new JSONObject(d8);
                    if (!jSONObject2.isNull("success")) {
                        i8 = jSONObject2.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONObject = null;
                    }
                    if (i8 == 1 && jSONObject != null) {
                        C2043h a9 = C2043h.f15796F0.a(jSONObject);
                        J0 c8 = C3445b0.c();
                        a aVar = new a(i.this, a9, null);
                        this.f11508a = 1;
                        if (AbstractC3458i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                } else if (Q8.b()) {
                    J0 c9 = C3445b0.c();
                    C0254b c0254b = new C0254b(i.this, Q8, null);
                    this.f11508a = 2;
                    if (AbstractC3458i.g(c9, c0254b, this) == e8) {
                        return e8;
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

    public i(Context context, long j8, b5.r rVar, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(scope, "scope");
        this.f11503a = context;
        this.f11504b = j8;
        this.f11505c = rVar;
        if (j8 > 0) {
            AbstractC3462k.d(scope, null, null, new a(null), 3, null);
        }
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
