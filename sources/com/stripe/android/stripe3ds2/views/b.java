package com.stripe.android.stripe3ds2.views;

import Q5.I;
import Q5.t;
import U5.g;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c4.v;
import c6.InterfaceC2072n;
import com.stripe.android.stripe3ds2.transaction.h;
import d4.b;
import e4.InterfaceC2818b;
import f4.C2862n;
import j6.InterfaceC3214c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f28261a;

    /* renamed from: b, reason: collision with root package name */
    private final v f28262b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2818b f28263c;

    /* renamed from: d, reason: collision with root package name */
    private final C2862n f28264d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f28265e;

    /* renamed from: f, reason: collision with root package name */
    private final LiveData f28266f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableLiveData f28267g;

    /* renamed from: h, reason: collision with root package name */
    private final LiveData f28268h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableLiveData f28269i;

    /* renamed from: j, reason: collision with root package name */
    private final LiveData f28270j;

    /* renamed from: k, reason: collision with root package name */
    private final MutableLiveData f28271k;

    /* renamed from: l, reason: collision with root package name */
    private final LiveData f28272l;

    /* renamed from: m, reason: collision with root package name */
    private final c f28273m;

    /* renamed from: n, reason: collision with root package name */
    private final LiveData f28274n;

    /* renamed from: o, reason: collision with root package name */
    private final c f28275o;

    /* renamed from: p, reason: collision with root package name */
    private final LiveData f28276p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28277q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3488x0 f28278r;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28279a;

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
            int i8 = this.f28279a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = b.this.f28262b;
                this.f28279a = 1;
                if (vVar.a(this) == e8) {
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

    /* renamed from: com.stripe.android.stripe3ds2.views.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0679b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.b f28281a;

        /* renamed from: b, reason: collision with root package name */
        private final v f28282b;

        /* renamed from: c, reason: collision with root package name */
        private final Z3.c f28283c;

        /* renamed from: d, reason: collision with root package name */
        private final g f28284d;

        public C0679b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, Z3.c errorReporter, g workContext) {
            AbstractC3292y.i(challengeActionHandler, "challengeActionHandler");
            AbstractC3292y.i(transactionTimer, "transactionTimer");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(workContext, "workContext");
            this.f28281a = challengeActionHandler;
            this.f28282b = transactionTimer;
            this.f28283c = errorReporter;
            this.f28284d = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3292y.i(modelClass, "modelClass");
            return new b(this.f28281a, this.f28282b, this.f28283c, null, this.f28284d, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c extends MutableLiveData {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28285a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28286b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.d f28288d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28289e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.d dVar, int i8, U5.d dVar2) {
            super(2, dVar2);
            this.f28288d = dVar;
            this.f28289e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            d dVar2 = new d(this.f28288d, this.f28289e, dVar);
            dVar2.f28286b = obj;
            return dVar2;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(LiveDataScope liveDataScope, U5.d dVar) {
            return ((d) create(liveDataScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object e8 = V5.b.e();
            int i8 = this.f28285a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f28286b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f28286b;
                C2862n c2862n = b.this.f28264d;
                b.d dVar = this.f28288d;
                if (dVar != null) {
                    str = dVar.b(this.f28289e);
                } else {
                    str = null;
                }
                this.f28286b = liveDataScope;
                this.f28285a = 1;
                obj = c2862n.e(str, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28286b = null;
            this.f28285a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f28290a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28291b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f28293a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f28294b;

            a(U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                a aVar = new a(dVar);
                aVar.f28294b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (U5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f28293a == 0) {
                    t.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f28294b);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(boolean z8, U5.d dVar) {
                return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
            }
        }

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            e eVar = new e(dVar);
            eVar.f28291b = obj;
            return eVar;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(LiveDataScope liveDataScope, U5.d dVar) {
            return ((e) create(liveDataScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object e8 = V5.b.e();
            int i8 = this.f28290a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f28291b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f28291b;
                InterfaceC3821f b9 = b.this.f28262b.b();
                a aVar = new a(null);
                this.f28291b = liveDataScope;
                this.f28290a = 1;
                obj = AbstractC3823h.y(b9, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28291b = null;
            this.f28290a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f28295a;

        /* renamed from: b, reason: collision with root package name */
        int f28296b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f28298d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.stripe3ds2.transaction.a aVar, U5.d dVar) {
            super(2, dVar);
            this.f28298d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f28298d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object e8 = V5.b.e();
            int i8 = this.f28296b;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (c) this.f28295a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = b.this.f28273m;
                com.stripe.android.stripe3ds2.transaction.b bVar = b.this.f28261a;
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f28298d;
                this.f28295a = cVar2;
                this.f28296b = 1;
                Object a9 = bVar.a(aVar, this);
                if (a9 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = a9;
            }
            cVar.postValue(obj);
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public /* synthetic */ b(com.stripe.android.stripe3ds2.transaction.b bVar, v vVar, Z3.c cVar, InterfaceC2818b interfaceC2818b, g gVar, int i8, AbstractC3284p abstractC3284p) {
        this(bVar, vVar, cVar, (i8 & 8) != 0 ? InterfaceC2818b.a.f31705a : interfaceC2818b, gVar);
    }

    public final LiveData e() {
        return this.f28274n;
    }

    public final LiveData f() {
        return this.f28272l;
    }

    public final LiveData g(b.d dVar, int i8) {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new d(dVar, i8, null), 3, (Object) null);
    }

    public final LiveData h() {
        return this.f28276p;
    }

    public final LiveData i() {
        return this.f28266f;
    }

    public final LiveData j() {
        return this.f28270j;
    }

    public final boolean k() {
        return this.f28277q;
    }

    public final LiveData l() {
        return this.f28268h;
    }

    public final LiveData m() {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new e(null), 3, (Object) null);
    }

    public final void n(h challengeResult) {
        AbstractC3292y.i(challengeResult, "challengeResult");
        this.f28269i.postValue(challengeResult);
    }

    public final void o() {
        this.f28263c.clear();
    }

    public final void p(d4.b cres) {
        AbstractC3292y.i(cres, "cres");
        this.f28275o.setValue(cres);
    }

    public final void q() {
        this.f28265e.setValue(I.f8786a);
    }

    public final void r(com.stripe.android.stripe3ds2.transaction.a challengeAction) {
        AbstractC3292y.i(challengeAction, "challengeAction");
        this.f28267g.postValue(challengeAction);
    }

    public final void s(boolean z8) {
        this.f28277q = z8;
    }

    public final void t() {
        InterfaceC3488x0.a.a(this.f28278r, null, 1, null);
    }

    public final void u(com.stripe.android.stripe3ds2.transaction.a action) {
        AbstractC3292y.i(action, "action");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new f(action, null), 3, null);
    }

    public b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, Z3.c errorReporter, InterfaceC2818b imageCache, g workContext) {
        InterfaceC3488x0 d8;
        AbstractC3292y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3292y.i(transactionTimer, "transactionTimer");
        AbstractC3292y.i(errorReporter, "errorReporter");
        AbstractC3292y.i(imageCache, "imageCache");
        AbstractC3292y.i(workContext, "workContext");
        this.f28261a = challengeActionHandler;
        this.f28262b = transactionTimer;
        this.f28263c = imageCache;
        this.f28264d = new C2862n(errorReporter, workContext);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f28265e = mutableLiveData;
        this.f28266f = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f28267g = mutableLiveData2;
        this.f28268h = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f28269i = mutableLiveData3;
        this.f28270j = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f28271k = mutableLiveData4;
        this.f28272l = mutableLiveData4;
        c cVar = new c();
        this.f28273m = cVar;
        this.f28274n = cVar;
        c cVar2 = new c();
        this.f28275o = cVar2;
        this.f28276p = cVar2;
        d8 = AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        this.f28278r = d8;
    }
}
