package androidx.compose.material3;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.AbstractC3462k;
import n6.M;

@f(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SwipeableKt$swipeable$3$4$1 extends l implements InterfaceC2073o {
    final /* synthetic */ SwipeableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ SwipeableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SwipeableState<T> swipeableState, float f8, d dVar) {
            super(2, dVar);
            this.$state = swipeableState;
            this.$velocity = f8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$state, this.$velocity, dVar);
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
                SwipeableState<T> swipeableState = this.$state;
                float f8 = this.$velocity;
                this.label = 1;
                if (swipeableState.performFling$material3_release(f8, this) == e8) {
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
    public SwipeableKt$swipeable$3$4$1(SwipeableState<T> swipeableState, d dVar) {
        super(3, dVar);
        this.$state = swipeableState;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((M) obj, ((Number) obj2).floatValue(), (d) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        b.e();
        if (this.label == 0) {
            t.b(obj);
            AbstractC3462k.d((M) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invoke(M m8, float f8, d dVar) {
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.$state, dVar);
        swipeableKt$swipeable$3$4$1.L$0 = m8;
        swipeableKt$swipeable$3$4$1.F$0 = f8;
        return swipeableKt$swipeable$3$4$1.invokeSuspend(I.f8786a);
    }
}
