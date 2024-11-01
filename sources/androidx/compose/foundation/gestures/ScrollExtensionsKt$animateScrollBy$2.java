package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollExtensionsKt$animateScrollBy$2 extends l implements InterfaceC2072n {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ P $previousValue;
    final /* synthetic */ float $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ P $previousValue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(P p8, ScrollScope scrollScope) {
            super(2);
            this.$previousValue = p8;
            this.$$this$scroll = scrollScope;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
            return I.f8786a;
        }

        public final void invoke(float f8, float f9) {
            P p8 = this.$previousValue;
            float f10 = p8.f34570a;
            p8.f34570a = f10 + this.$$this$scroll.scrollBy(f8 - f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollExtensionsKt$animateScrollBy$2(float f8, AnimationSpec<Float> animationSpec, P p8, U5.d dVar) {
        super(2, dVar);
        this.$value = f8;
        this.$animationSpec = animationSpec;
        this.$previousValue = p8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.$value, this.$animationSpec, this.$previousValue, dVar);
        scrollExtensionsKt$animateScrollBy$2.L$0 = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, U5.d dVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
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
            ScrollScope scrollScope = (ScrollScope) this.L$0;
            float f8 = this.$value;
            AnimationSpec<Float> animationSpec = this.$animationSpec;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$previousValue, scrollScope);
            this.label = 1;
            if (SuspendAnimationKt.animate$default(0.0f, f8, 0.0f, animationSpec, anonymousClass1, this, 4, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
