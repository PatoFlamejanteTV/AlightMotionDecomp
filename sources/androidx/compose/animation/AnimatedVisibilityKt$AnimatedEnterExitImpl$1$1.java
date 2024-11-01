package androidx.compose.animation;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@f(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1", f = "AnimatedVisibility.kt", l = {748}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Transition<EnterExitState> $childTransition;
    final /* synthetic */ MutableState<Boolean> $isAnimationVisible;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ Transition<EnterExitState> $childTransition;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Transition<EnterExitState> transition) {
            super(0);
            this.$childTransition = transition;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            EnterExitState currentState = this.$childTransition.getCurrentState();
            EnterExitState enterExitState = EnterExitState.Visible;
            return Boolean.valueOf(currentState == enterExitState || this.$childTransition.getTargetState() == enterExitState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(Transition<EnterExitState> transition, MutableState<Boolean> mutableState, d dVar) {
        super(2, dVar);
        this.$childTransition = transition;
        this.$isAnimationVisible = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(this.$childTransition, this.$isAnimationVisible, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC3821f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$childTransition));
            final MutableState<Boolean> mutableState = this.$isAnimationVisible;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1.2
                @Override // q6.InterfaceC3822g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit(((Boolean) obj2).booleanValue(), dVar);
                }

                public final Object emit(boolean z8, d dVar) {
                    mutableState.setValue(kotlin.coroutines.jvm.internal.b.a(z8));
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (snapshotFlow.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
