package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
final class BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ boolean $gesturesEnabled;
    final /* synthetic */ BackdropScaffoldState $scaffoldState;
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1", f = "BackdropScaffold.kt", l = {358}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ BackdropScaffoldState $scaffoldState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BackdropScaffoldState backdropScaffoldState, d dVar) {
            super(2, dVar);
            this.$scaffoldState = backdropScaffoldState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$scaffoldState, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                BackdropScaffoldState backdropScaffoldState = this.$scaffoldState;
                this.label = 1;
                if (backdropScaffoldState.conceal(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1$1$2$1$1(boolean z8, BackdropScaffoldState backdropScaffoldState, M m8) {
        super(0);
        this.$gesturesEnabled = z8;
        this.$scaffoldState = backdropScaffoldState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m1094invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m1094invoke() {
        if (this.$gesturesEnabled && ((Boolean) this.$scaffoldState.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed)).booleanValue()) {
            AbstractC3462k.d(this.$scope, null, null, new AnonymousClass1(this.$scaffoldState, null), 3, null);
        }
    }
}
