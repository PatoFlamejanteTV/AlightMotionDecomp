package androidx.compose.foundation.lazy.layout;

import Q5.I;
import U5.d;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.gestures.ScrollScope;
import c6.InterfaceC2072n;
import i6.m;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {137, 237}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends l implements InterfaceC2072n {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function1 {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ T $anim;
        final /* synthetic */ float $boundDistancePx;
        final /* synthetic */ boolean $forward;
        final /* synthetic */ int $index;
        final /* synthetic */ O $loop;
        final /* synthetic */ Q $loops;
        final /* synthetic */ P $prevValue;
        final /* synthetic */ int $scrollOffset;
        final /* synthetic */ float $target;
        final /* synthetic */ LazyAnimateScrollScope $this_animateScrollToItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LazyAnimateScrollScope lazyAnimateScrollScope, int i8, float f8, P p8, ScrollScope scrollScope, O o8, boolean z8, float f9, Q q8, int i9, T t8) {
            super(1);
            this.$this_animateScrollToItem = lazyAnimateScrollScope;
            this.$index = i8;
            this.$target = f8;
            this.$prevValue = p8;
            this.$$this$scroll = scrollScope;
            this.$loop = o8;
            this.$forward = z8;
            this.$boundDistancePx = f9;
            this.$loops = q8;
            this.$scrollOffset = i9;
            this.$anim = t8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope<Float, AnimationVector1D>) obj);
            return I.f8786a;
        }

        public final void invoke(AnimationScope<Float, AnimationVector1D> animateTo) {
            float c8;
            AbstractC3292y.i(animateTo, "$this$animateTo");
            Integer targetItemOffset = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
            if (targetItemOffset == null) {
                if (this.$target > 0.0f) {
                    c8 = m.f(animateTo.getValue().floatValue(), this.$target);
                } else {
                    c8 = m.c(animateTo.getValue().floatValue(), this.$target);
                }
                float f8 = c8 - this.$prevValue.f34570a;
                float scrollBy = this.$$this$scroll.scrollBy(f8);
                Integer targetItemOffset2 = this.$this_animateScrollToItem.getTargetItemOffset(this.$index);
                if (targetItemOffset2 == null && !LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                    if (f8 == scrollBy) {
                        this.$prevValue.f34570a += f8;
                        if (this.$forward) {
                            if (animateTo.getValue().floatValue() > this.$boundDistancePx) {
                                animateTo.cancelAnimation();
                            }
                        } else if (animateTo.getValue().floatValue() < (-this.$boundDistancePx)) {
                            animateTo.cancelAnimation();
                        }
                        if (this.$forward) {
                            if (this.$loops.f34571a >= 2 && this.$index - this.$this_animateScrollToItem.getLastVisibleItemIndex() > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                                LazyAnimateScrollScope lazyAnimateScrollScope = this.$this_animateScrollToItem;
                                lazyAnimateScrollScope.snapToItem(this.$$this$scroll, this.$index - lazyAnimateScrollScope.getNumOfItemsForTeleport(), 0);
                            }
                        } else if (this.$loops.f34571a >= 2 && this.$this_animateScrollToItem.getFirstVisibleItemIndex() - this.$index > this.$this_animateScrollToItem.getNumOfItemsForTeleport()) {
                            LazyAnimateScrollScope lazyAnimateScrollScope2 = this.$this_animateScrollToItem;
                            lazyAnimateScrollScope2.snapToItem(this.$$this$scroll, this.$index + lazyAnimateScrollScope2.getNumOfItemsForTeleport(), 0);
                        }
                    } else {
                        animateTo.cancelAnimation();
                        this.$loop.f34569a = false;
                        return;
                    }
                }
                targetItemOffset = targetItemOffset2;
            }
            if (!LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend$isOvershot(this.$forward, this.$this_animateScrollToItem, this.$index, this.$scrollOffset)) {
                if (targetItemOffset != null) {
                    throw new ItemFoundInScroll(targetItemOffset.intValue(), (AnimationState) this.$anim.f34573a);
                }
                return;
            }
            this.$this_animateScrollToItem.snapToItem(this.$$this$scroll, this.$index, this.$scrollOffset);
            this.$loop.f34569a = false;
            animateTo.cancelAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass5 extends AbstractC3293z implements Function1 {
        final /* synthetic */ ScrollScope $$this$scroll;
        final /* synthetic */ P $prevValue;
        final /* synthetic */ float $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(float f8, P p8, ScrollScope scrollScope) {
            super(1);
            this.$target = f8;
            this.$prevValue = p8;
            this.$$this$scroll = scrollScope;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnimationScope<Float, AnimationVector1D>) obj);
            return I.f8786a;
        }

        public final void invoke(AnimationScope<Float, AnimationVector1D> animateTo) {
            AbstractC3292y.i(animateTo, "$this$animateTo");
            float f8 = this.$target;
            float f9 = 0.0f;
            if (f8 > 0.0f) {
                f9 = m.f(animateTo.getValue().floatValue(), this.$target);
            } else if (f8 < 0.0f) {
                f9 = m.c(animateTo.getValue().floatValue(), this.$target);
            }
            float f10 = f9 - this.$prevValue.f34570a;
            if (f10 != this.$$this$scroll.scrollBy(f10) || f9 != animateTo.getValue().floatValue()) {
                animateTo.cancelAnimation();
            }
            this.$prevValue.f34570a += f10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(int i8, LazyAnimateScrollScope lazyAnimateScrollScope, int i9, d dVar) {
        super(2, dVar);
        this.$index = i8;
        this.$this_animateScrollToItem = lazyAnimateScrollScope;
        this.$scrollOffset = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$isOvershot(boolean z8, LazyAnimateScrollScope lazyAnimateScrollScope, int i8, int i9) {
        if (z8) {
            if (lazyAnimateScrollScope.getFirstVisibleItemIndex() <= i8 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i8 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() <= i9)) {
                return false;
            }
        } else if (lazyAnimateScrollScope.getFirstVisibleItemIndex() >= i8 && (lazyAnimateScrollScope.getFirstVisibleItemIndex() != i8 || lazyAnimateScrollScope.getFirstVisibleItemScrollOffset() >= i9)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$this_animateScrollToItem, this.$scrollOffset, dVar);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, d dVar) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8 A[Catch: ItemFoundInScroll -> 0x01b4, TryCatch #0 {ItemFoundInScroll -> 0x01b4, blocks: (B:20:0x00d4, B:22:0x00d8, B:24:0x00e0, B:30:0x010d, B:33:0x0149, B:36:0x0156), top: B:19:0x00d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2 A[Catch: ItemFoundInScroll -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #3 {ItemFoundInScroll -> 0x0101, blocks: (B:17:0x01a4, B:27:0x00f2), top: B:16:0x01a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0227 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x019b -> B:16:0x01a4). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
