package androidx.compose.foundation.lazy.layout;

import Q5.I;
import Q5.t;
import U5.d;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ Function0 $itemProviderLambda;
    final /* synthetic */ LazyLayoutSemanticState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2", f = "LazyLayoutSemantics.kt", l = {116}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        final /* synthetic */ int $index;
        final /* synthetic */ LazyLayoutSemanticState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LazyLayoutSemanticState lazyLayoutSemanticState, int i8, d dVar) {
            super(2, dVar);
            this.$state = lazyLayoutSemanticState;
            this.$index = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass2(this.$state, this.$index, dVar);
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
                int i9 = this.$index;
                this.label = 1;
                if (lazyLayoutSemanticState.scrollToItem(i9, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1(Function0 function0, M m8, LazyLayoutSemanticState lazyLayoutSemanticState) {
        super(1);
        this.$itemProviderLambda = function0;
        this.$coroutineScope = m8;
        this.$state = lazyLayoutSemanticState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Boolean invoke(int i8) {
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.$itemProviderLambda.invoke();
        if (i8 >= 0 && i8 < lazyLayoutItemProvider.getItemCount()) {
            AbstractC3462k.d(this.$coroutineScope, null, null, new AnonymousClass2(this.$state, i8, null), 3, null);
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(("Can't scroll to index " + i8 + ", it is out of bounds [0, " + lazyLayoutItemProvider.getItemCount() + ')').toString());
    }
}
