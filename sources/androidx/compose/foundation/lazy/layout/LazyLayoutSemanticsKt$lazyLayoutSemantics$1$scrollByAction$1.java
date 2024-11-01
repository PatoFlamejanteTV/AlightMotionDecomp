package androidx.compose.foundation.lazy.layout;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1", f = "LazyLayoutSemantics.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ float $delta;
        final /* synthetic */ LazyLayoutSemanticState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LazyLayoutSemanticState lazyLayoutSemanticState, float f8, d dVar) {
            super(2, dVar);
            this.$state = lazyLayoutSemanticState;
            this.$delta = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$state, this.$delta, dVar);
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
                LazyLayoutSemanticState lazyLayoutSemanticState = this.$state;
                float f8 = this.$delta;
                this.label = 1;
                if (lazyLayoutSemanticState.animateScrollBy(f8, this) == e8) {
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
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(boolean z8, M m8, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(2);
        this.$isVertical = z8;
        this.$coroutineScope = m8;
        this.$state = lazyLayoutSemanticState;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
    }

    public final Boolean invoke(float f8, float f9) {
        if (this.$isVertical) {
            f8 = f9;
        }
        AbstractC3462k.d(this.$coroutineScope, null, null, new AnonymousClass1(this.$state, f8, null), 3, null);
        return Boolean.TRUE;
    }
}
