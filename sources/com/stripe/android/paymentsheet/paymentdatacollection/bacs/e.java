package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import Q5.I;
import Q5.t;
import R5.AbstractC1435t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import c6.InterfaceC2072n;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
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
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final v f27465a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3802A f27466b;

    /* renamed from: c, reason: collision with root package name */
    private final w f27467c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f27468d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f27469a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27470b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27471c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27472d;

        public a(String email, String nameOnAccount, String sortCode, String accountNumber) {
            AbstractC3292y.i(email, "email");
            AbstractC3292y.i(nameOnAccount, "nameOnAccount");
            AbstractC3292y.i(sortCode, "sortCode");
            AbstractC3292y.i(accountNumber, "accountNumber");
            this.f27469a = email;
            this.f27470b = nameOnAccount;
            this.f27471c = sortCode;
            this.f27472d = accountNumber;
        }

        public final String a() {
            return this.f27472d;
        }

        public final String b() {
            return this.f27469a;
        }

        public final String c() {
            return this.f27470b;
        }

        public final String d() {
            return this.f27471c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f27469a, aVar.f27469a) && AbstractC3292y.d(this.f27470b, aVar.f27470b) && AbstractC3292y.d(this.f27471c, aVar.f27471c) && AbstractC3292y.d(this.f27472d, aVar.f27472d);
        }

        public int hashCode() {
            return (((((this.f27469a.hashCode() * 31) + this.f27470b.hashCode()) * 31) + this.f27471c.hashCode()) * 31) + this.f27472d.hashCode();
        }

        public String toString() {
            return "Args(email=" + this.f27469a + ", nameOnAccount=" + this.f27470b + ", sortCode=" + this.f27471c + ", accountNumber=" + this.f27472d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final BacsMandateConfirmationContract.a f27473a;

        public b(BacsMandateConfirmationContract.a args) {
            AbstractC3292y.i(args, "args");
            this.f27473a = args;
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
            return new e(new a(this.f27473a.f(), this.f27473a.h(), this.f27473a.i(), this.f27473a.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27474a;

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
            int i8 = this.f27474a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27465a;
                c.a aVar = c.a.f27458a;
                this.f27474a = 1;
                if (vVar.emit(aVar, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27476a;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27476a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27465a;
                c.C0625c c0625c = c.C0625c.f27460a;
                this.f27476a = 1;
                if (vVar.emit(c0625c, this) == e8) {
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
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0626e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f27478a;

        C0626e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0626e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f27478a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27465a;
                c.d dVar = c.d.f27461a;
                this.f27478a = 1;
                if (vVar.emit(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((C0626e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public e(a args) {
        AbstractC3292y.i(args, "args");
        v b9 = AbstractC3804C.b(0, 0, null, 7, null);
        this.f27465a = b9;
        this.f27466b = AbstractC3823h.a(b9);
        w a9 = AbstractC3815N.a(new I3.d(args.b(), args.c(), AbstractC1435t.w0(l6.n.O0(args.d(), 2), "-", null, null, 0, null, null, 62, null), args.a(), d(), b(), c()));
        this.f27467c = a9;
        this.f27468d = AbstractC3823h.b(a9);
    }

    private final C2.c b() {
        int i8 = v3.w.f40641y;
        C2.c a9 = C2.d.a(v3.w.f40642z);
        C2.c a10 = C2.d.a(v3.w.f40577A);
        int i9 = v3.w.f40578B;
        return C2.d.g(i8, new Object[]{a9, a10, C2.d.a(i9), C2.d.a(i9)}, null, 4, null);
    }

    private final C2.c c() {
        return C2.d.g(v3.w.f40634r, new Object[]{C2.d.a(v3.w.f40635s), C2.d.a(v3.w.f40633q)}, null, 4, null);
    }

    private final C2.c d() {
        return C2.d.a(v3.w.f40638v);
    }

    private final void h() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    private final void i() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    private final void j() {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), null, null, new C0626e(null), 3, null);
    }

    public final InterfaceC3802A e() {
        return this.f27466b;
    }

    public final InterfaceC3813L f() {
        return this.f27468d;
    }

    public final void g(com.stripe.android.paymentsheet.paymentdatacollection.bacs.d action) {
        AbstractC3292y.i(action, "action");
        if (action instanceof d.b) {
            i();
        } else if (action instanceof d.c) {
            j();
        } else if (action instanceof d.a) {
            h();
        }
    }
}
