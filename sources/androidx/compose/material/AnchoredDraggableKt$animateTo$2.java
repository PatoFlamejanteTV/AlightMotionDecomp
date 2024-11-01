package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {586}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateTo$2 extends l implements InterfaceC2073o {
    final /* synthetic */ T $targetValue;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateTo;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$animateTo$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ AnchoredDragScope $$this$anchoredDrag;
        final /* synthetic */ P $prev;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDragScope anchoredDragScope, P p8) {
            super(2);
            this.$$this$anchoredDrag = anchoredDragScope;
            this.$prev = p8;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return I.f8786a;
        }

        public final void invoke(float f8, float f9) {
            this.$$this$anchoredDrag.dragTo(f8, f9);
            this.$prev.f34570a = f8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(T t8, AnchoredDraggableState<T> anchoredDraggableState, float f8, d dVar) {
        super(3, dVar);
        this.$targetValue = t8;
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f8;
    }

    @Override // c6.InterfaceC2073o
    public final Object invoke(AnchoredDragScope anchoredDragScope, Map<T, Float> map, d dVar) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$targetValue, this.$this_animateTo, this.$velocity, dVar);
        anchoredDraggableKt$animateTo$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateTo$2.L$1 = map;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float offset;
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
            AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            Float f8 = (Float) ((Map) this.L$1).get(this.$targetValue);
            if (f8 != null) {
                P p8 = new P();
                if (Float.isNaN(this.$this_animateTo.getOffset())) {
                    offset = 0.0f;
                } else {
                    offset = this.$this_animateTo.getOffset();
                }
                p8.f34570a = offset;
                float floatValue = f8.floatValue();
                float f9 = this.$velocity;
                AnimationSpec<Float> animationSpec = this.$this_animateTo.getAnimationSpec();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(anchoredDragScope, p8);
                this.L$0 = null;
                this.label = 1;
                if (SuspendAnimationKt.animate(offset, floatValue, f9, animationSpec, anonymousClass1, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f8786a;
    }
}
