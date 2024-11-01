package com.stripe.android.paymentsheet;

import D3.f;
import Q5.C1413h;
import Q5.I;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.w;
import d3.C2752d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: g, reason: collision with root package name */
    public static final b f27336g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f27337h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3813L f27338a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27339b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27340c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f27341d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f27342e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f27343f;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27344a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.j$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0611a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f27346a;

            C0611a(j jVar) {
                this.f27346a = jVar;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(D3.f fVar, U5.d dVar) {
                C2.c cVar;
                f.C0023f c0023f = null;
                if (fVar != null) {
                    cVar = fVar.b(this.f27346a.f27339b, ((Boolean) this.f27346a.f27341d.invoke()).booleanValue());
                } else {
                    cVar = null;
                }
                if (fVar instanceof f.C0023f) {
                    c0023f = (f.C0023f) fVar;
                }
                boolean z8 = false;
                if (c0023f != null && c0023f.l()) {
                    z8 = true;
                }
                this.f27346a.e(cVar, z8);
                return I.f8786a;
            }
        }

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
            int i8 = this.f27344a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L interfaceC3813L = j.this.f27338a;
                C0611a c0611a = new C0611a(j.this);
                this.f27344a = 1;
                if (interfaceC3813L.collect(c0611a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ R3.a f27347a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(R3.a aVar) {
                super(0);
                this.f27347a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C2752d c2752d = (C2752d) this.f27347a.t().getValue();
                return Boolean.valueOf((c2752d != null ? c2752d.W() : null) instanceof com.stripe.android.model.u);
            }
        }

        private b() {
        }

        public final j a(R3.a viewModel) {
            boolean z8;
            AbstractC3292y.i(viewModel, "viewModel");
            M viewModelScope = ViewModelKt.getViewModelScope(viewModel);
            InterfaceC3813L y8 = viewModel.y();
            String v8 = viewModel.f().v();
            if (viewModel.f().w() == w.n.f28014d) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new j(viewModelScope, y8, v8, z8, new a(viewModel));
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public j(M coroutineScope, InterfaceC3813L selection, String merchantDisplayName, boolean z8, Function0 isSetupFlowProvider) {
        AbstractC3292y.i(coroutineScope, "coroutineScope");
        AbstractC3292y.i(selection, "selection");
        AbstractC3292y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3292y.i(isSetupFlowProvider, "isSetupFlowProvider");
        this.f27338a = selection;
        this.f27339b = merchantDisplayName;
        this.f27340c = z8;
        this.f27341d = isSetupFlowProvider;
        q6.w a9 = AbstractC3815N.a(null);
        this.f27342e = a9;
        this.f27343f = a9;
        AbstractC3462k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    public final InterfaceC3813L d() {
        return this.f27343f;
    }

    public final void e(C2.c cVar, boolean z8) {
        D3.d dVar;
        boolean z9;
        q6.w wVar = this.f27342e;
        if (cVar != null) {
            if (!z8 && !this.f27340c) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar = new D3.d(cVar, z9);
        } else {
            dVar = null;
        }
        wVar.setValue(dVar);
    }
}
