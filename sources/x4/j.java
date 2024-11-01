package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2043h;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11516a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11517b;

    /* renamed from: c, reason: collision with root package name */
    private final b5.r f11518c;

    /* renamed from: d, reason: collision with root package name */
    private final M f11519d;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11520a;

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
            int i8 = this.f11520a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                j jVar = j.this;
                this.f11520a = 1;
                if (jVar.f(this) == e8) {
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
        int f11522a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f11524a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f11525b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(j jVar, U5.d dVar) {
                super(2, dVar);
                this.f11525b = jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f11525b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f11524a == 0) {
                    t.b(obj);
                    this.f11525b.f11518c.b(-1);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
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
            int i8 = this.f11522a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                Context context = j.this.f11516a;
                AbstractC3292y.f(context);
                long i9 = new C2043h().i(new C3775H(context).m(j.this.f11517b));
                if (i9 > 0) {
                    return new i(j.this.f11516a, i9, j.this.f11518c, j.this.f11519d);
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(j.this, null);
                this.f11522a = 1;
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

    public j(Context context, String packagename, b5.r listener, M scope) {
        AbstractC3292y.i(packagename, "packagename");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(scope, "scope");
        this.f11516a = context;
        this.f11517b = packagename;
        this.f11518c = listener;
        this.f11519d = scope;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
