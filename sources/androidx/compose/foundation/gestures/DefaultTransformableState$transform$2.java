package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DefaultTransformableState$transform$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $block;
    final /* synthetic */ MutatePriority $transformPriority;
    int label;
    final /* synthetic */ DefaultTransformableState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ InterfaceC2072n $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultTransformableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultTransformableState defaultTransformableState, InterfaceC2072n interfaceC2072n, U5.d dVar) {
            super(2, dVar);
            this.this$0 = defaultTransformableState;
            this.$block = interfaceC2072n;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(TransformScope transformScope, U5.d dVar) {
            return ((AnonymousClass1) create(transformScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            Object e8 = V5.b.e();
            int i8 = this.label;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TransformScope transformScope = (TransformScope) this.L$0;
                    mutableState2 = this.this$0.isTransformingState;
                    mutableState2.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                    InterfaceC2072n interfaceC2072n = this.$block;
                    this.label = 1;
                    if (interfaceC2072n.invoke(transformScope, this) == e8) {
                        return e8;
                    }
                }
                mutableState3 = this.this$0.isTransformingState;
                mutableState3.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return I.f8786a;
            } catch (Throwable th) {
                mutableState = this.this$0.isTransformingState;
                mutableState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransformableState$transform$2(DefaultTransformableState defaultTransformableState, MutatePriority mutatePriority, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        super(2, dVar);
        this.this$0 = defaultTransformableState;
        this.$transformPriority = mutatePriority;
        this.$block = interfaceC2072n;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new DefaultTransformableState$transform$2(this.this$0, this.$transformPriority, this.$block, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        TransformScope transformScope;
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
            mutatorMutex = this.this$0.transformMutex;
            transformScope = this.this$0.transformScope;
            MutatePriority mutatePriority = this.$transformPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((DefaultTransformableState$transform$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
