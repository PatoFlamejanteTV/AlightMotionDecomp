package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import A4.g;
import J3.f;
import Q5.I;
import Q5.t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import j4.Q;
import j6.InterfaceC3214c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.M;
import q6.AbstractC3804C;
import q6.AbstractC3815N;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import q6.InterfaceC3813L;
import q6.v;
import q6.w;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Q f27555a;

    /* renamed from: b, reason: collision with root package name */
    private final w f27556b;

    /* renamed from: c, reason: collision with root package name */
    private final v f27557c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3802A f27558d;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CvcRecollectionContract.a f27559a;

        public a(CvcRecollectionContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f27559a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC3214c interfaceC3214c, CreationExtras creationExtras) {
            return n.a(this, interfaceC3214c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3292y.i(modelClass, "modelClass");
            AbstractC3292y.i(extras, "extras");
            return new d(new J3.a(this.f27559a.f(), this.f27559a.b(), "", this.f27559a.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27560a;

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
            int i8 = this.f27560a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = d.this.f27557c;
                a.C0632a c0632a = a.C0632a.f27508a;
                this.f27560a = 1;
                if (vVar.emit(c0632a, this) == e8) {
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
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27562a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27564c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, U5.d dVar) {
            super(2, dVar);
            this.f27564c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f27564c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27562a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = d.this.f27557c;
                a.c cVar = new a.c(this.f27564c);
                this.f27562a = 1;
                if (vVar.emit(cVar, this) == e8) {
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

    public d(J3.a args) {
        AbstractC3292y.i(args, "args");
        this.f27555a = new Q(null, g.n(args.a()), null, false, 13, null);
        this.f27556b = AbstractC3815N.a(new f(args.c(), args.d(), new J3.g(args.b(), args.a()), true));
        v b9 = AbstractC3804C.b(0, 0, null, 7, null);
        this.f27557c = b9;
        this.f27558d = AbstractC3823h.a(b9);
    }

    private final void e() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    private final void f(String str) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new c(str, null), 3, null);
    }

    private final void g(String str) {
        Object value;
        f fVar;
        w wVar = this.f27556b;
        do {
            value = wVar.getValue();
            fVar = (f) value;
        } while (!wVar.a(value, f.b(fVar, null, false, fVar.c().f(str), false, 11, null)));
    }

    public final InterfaceC3802A b() {
        return this.f27558d;
    }

    public final InterfaceC3813L c() {
        return this.f27556b;
    }

    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c action) {
        AbstractC3292y.i(action, "action");
        if (action instanceof c.b) {
            f(((f) c().getValue()).c().b());
        } else if (action instanceof c.a) {
            e();
        } else if (action instanceof c.C0638c) {
            g(((c.C0638c) action).a());
        }
    }
}
