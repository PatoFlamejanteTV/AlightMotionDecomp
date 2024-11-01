package androidx.compose.material.pullrefresh;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.MutatorMutex;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PullRefreshState$animateIndicatorTo$1 extends l implements InterfaceC2072n {
    final /* synthetic */ float $offset;
    int label;
    final /* synthetic */ PullRefreshState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {187}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements Function1 {
        final /* synthetic */ float $offset;
        int label;
        final /* synthetic */ PullRefreshState this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03381 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ PullRefreshState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03381(PullRefreshState pullRefreshState) {
                super(2);
                this.this$0 = pullRefreshState;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return I.f8786a;
            }

            public final void invoke(float f8, float f9) {
                this.this$0.set_position(f8);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PullRefreshState pullRefreshState, float f8, d dVar) {
            super(1, dVar);
            this.this$0 = pullRefreshState;
            this.$offset = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(d dVar) {
            return new AnonymousClass1(this.this$0, this.$offset, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f8;
            Object e8 = b.e();
            int i8 = this.label;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                f8 = this.this$0.get_position();
                float f9 = this.$offset;
                C03381 c03381 = new C03381(this.this$0);
                this.label = 1;
                if (SuspendAnimationKt.animate$default(f8, f9, 0.0f, null, c03381, this, 12, null) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshState$animateIndicatorTo$1(PullRefreshState pullRefreshState, float f8, d dVar) {
        super(2, dVar);
        this.this$0 = pullRefreshState;
        this.$offset = f8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PullRefreshState$animateIndicatorTo$1(this.this$0, this.$offset, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            mutatorMutex = this.this$0.mutatorMutex;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$offset, null);
            this.label = 1;
            if (MutatorMutex.mutate$default(mutatorMutex, null, anonymousClass1, this, 1, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((PullRefreshState$animateIndicatorTo$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
