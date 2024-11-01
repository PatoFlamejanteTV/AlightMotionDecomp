package androidx.activity.compose;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2073o {
        final /* synthetic */ O $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(O o8, d dVar) {
            super(3, dVar);
            this.$completed = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$completed.f34569a = true;
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2073o
        public final Object invoke(InterfaceC3822g interfaceC3822g, Throwable th, d dVar) {
            return new AnonymousClass1(this.$completed, dVar).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(InterfaceC2072n interfaceC2072n, OnBackInstance onBackInstance, d dVar) {
        super(2, dVar);
        this.$onBack = interfaceC2072n;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        O o8;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                o8 = (O) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            O o9 = new O();
            InterfaceC2072n interfaceC2072n = this.$onBack;
            InterfaceC3821f F8 = AbstractC3823h.F(AbstractC3823h.o(this.this$0.getChannel()), new AnonymousClass1(o9, null));
            this.L$0 = o9;
            this.label = 1;
            if (interfaceC2072n.invoke(F8, this) == e8) {
                return e8;
            }
            o8 = o9;
        }
        if (o8.f34569a) {
            return I.f8786a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((OnBackInstance$job$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
