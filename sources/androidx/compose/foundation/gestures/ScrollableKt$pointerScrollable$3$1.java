package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollableKt$pointerScrollable$3$1 extends l implements InterfaceC2073o {
    final /* synthetic */ MutableState<NestedScrollDispatcher> $nestedScrollDispatcher;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;
    /* synthetic */ long J$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", f = "Scrollable.kt", l = {286}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ State<ScrollingLogic> $scrollLogic;
        final /* synthetic */ long $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(State<ScrollingLogic> state, long j8, U5.d dVar) {
            super(2, dVar);
            this.$scrollLogic = state;
            this.$velocity = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$scrollLogic, this.$velocity, dVar);
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
                ScrollingLogic value = this.$scrollLogic.getValue();
                long j8 = this.$velocity;
                this.label = 1;
                if (value.m438onDragStoppedsFctU(j8, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3$1(MutableState<NestedScrollDispatcher> mutableState, State<ScrollingLogic> state, U5.d dVar) {
        super(3, dVar);
        this.$nestedScrollDispatcher = mutableState;
        this.$scrollLogic = state;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m431invokeLuvzFrg((M) obj, ((Velocity) obj2).m5395unboximpl(), (U5.d) obj3);
    }

    /* renamed from: invoke-LuvzFrg, reason: not valid java name */
    public final Object m431invokeLuvzFrg(M m8, long j8, U5.d dVar) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.$nestedScrollDispatcher, this.$scrollLogic, dVar);
        scrollableKt$pointerScrollable$3$1.J$0 = j8;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            AbstractC3462k.d(this.$nestedScrollDispatcher.getValue().getCoroutineScope(), null, null, new AnonymousClass1(this.$scrollLogic, this.J$0, null), 3, null);
            return I.f8786a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
