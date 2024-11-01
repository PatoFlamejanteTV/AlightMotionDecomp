package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import b5.J;
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
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11548a;

    /* renamed from: b, reason: collision with root package name */
    private String f11549b;

    /* renamed from: c, reason: collision with root package name */
    private String f11550c;

    /* renamed from: d, reason: collision with root package name */
    private final J f11551d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11552a;

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
            int i8 = this.f11552a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                if (m.this.f11549b != null) {
                    m mVar = m.this;
                    this.f11552a = 1;
                    if (mVar.i(this) == e8) {
                        return e8;
                    }
                } else {
                    m mVar2 = m.this;
                    this.f11552a = 2;
                    if (mVar2.j(this) == e8) {
                        return e8;
                    }
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
        int f11554a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11556a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11557b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c5.J f11558c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, c5.J j8, U5.d dVar) {
                super(2, dVar);
                this.f11557b = mVar;
                this.f11558c = j8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11557b, this.f11558c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11556a == 0) {
                    t.b(obj);
                    this.f11557b.f11551d.b(this.f11558c);
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
        /* renamed from: X4.m$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0256b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11559a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11560b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0256b(m mVar, U5.d dVar) {
                super(2, dVar);
                this.f11560b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0256b(this.f11560b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11559a == 0) {
                    t.b(obj);
                    this.f11560b.f11551d.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0256b) create(m8, dVar)).invokeSuspend(I.f8786a);
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
            Object e8 = V5.b.e();
            int i8 = this.f11554a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3775H c3775h = new C3775H(m.this.f11548a);
                String str = m.this.f11549b;
                AbstractC3292y.f(str);
                K v02 = c3775h.v0(str);
                if (!v02.b() && v02.d() != null) {
                    String d8 = v02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        c5.J h8 = m.this.h(v02);
                        if (h8 != null) {
                            J0 c8 = C3445b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f11554a = 1;
                            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C3445b0.c();
                C0256b c0256b = new C0256b(m.this, null);
                this.f11554a = 2;
                if (AbstractC3458i.g(c9, c0256b, this) == e8) {
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
        int f11561a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11563a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11564b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ c5.J f11565c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, c5.J j8, U5.d dVar) {
                super(2, dVar);
                this.f11564b = mVar;
                this.f11565c = j8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11564b, this.f11565c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11563a == 0) {
                    t.b(obj);
                    this.f11564b.f11551d.b(this.f11565c);
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
            int f11566a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f11567b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(m mVar, U5.d dVar) {
                super(2, dVar);
                this.f11567b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f11567b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11566a == 0) {
                    t.b(obj);
                    this.f11567b.f11551d.a();
                    return I.f8786a;
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
            Object e8 = V5.b.e();
            int i8 = this.f11561a;
            if (i8 != 0) {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                C3775H c3775h = new C3775H(m.this.f11548a);
                String str = m.this.f11550c;
                AbstractC3292y.f(str);
                K w02 = c3775h.w0(str);
                if (!w02.b() && w02.d() != null) {
                    String d8 = w02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        c5.J h8 = m.this.h(w02);
                        if (h8 != null) {
                            J0 c8 = C3445b0.c();
                            a aVar = new a(m.this, h8, null);
                            this.f11561a = 1;
                            if (AbstractC3458i.g(c8, aVar, this) == e8) {
                                return e8;
                            }
                        }
                    }
                }
                J0 c9 = C3445b0.c();
                b bVar = new b(m.this, null);
                this.f11561a = 2;
                if (AbstractC3458i.g(c9, bVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public m(Context context, String str, String str2, J listener, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(scope, "scope");
        this.f11548a = context;
        this.f11549b = str;
        this.f11550c = str2;
        this.f11551d = listener;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c5.J h(K k8) {
        int i8;
        JSONObject jSONObject;
        String d8 = k8.d();
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
        if (i8 != 1 || jSONObject == null) {
            return null;
        }
        c5.J j8 = new c5.J();
        j8.a(jSONObject);
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object i(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
