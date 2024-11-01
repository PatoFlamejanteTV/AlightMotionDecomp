package androidx.compose.foundation.pager;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import n6.N;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1", f = "LazyLayoutPager.kt", l = {265}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LazyLayoutPagerKt$dragDirectionDetector$1 extends l implements InterfaceC2072n {
    final /* synthetic */ PagerState $state;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {266}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ PagerState $state;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {268, 271}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03121 extends k implements InterfaceC2072n {
            final /* synthetic */ PagerState $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03121(PagerState pagerState, d dVar) {
                super(2, dVar);
                this.$state = pagerState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                C03121 c03121 = new C03121(this.$state, dVar);
                c03121.L$0 = obj;
                return c03121;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
                return ((C03121) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005a -> B:6:0x005d). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = V5.b.e()
                    int r1 = r10.label
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r4) goto L27
                    if (r1 != r2) goto L1f
                    java.lang.Object r1 = r10.L$2
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                    java.lang.Object r4 = r10.L$1
                    androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                    java.lang.Object r5 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                    Q5.t.b(r11)
                    goto L5d
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    java.lang.Object r1 = r10.L$0
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    Q5.t.b(r11)
                    goto L44
                L2f:
                    Q5.t.b(r11)
                    java.lang.Object r11 = r10.L$0
                    r1 = r11
                    androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r10.L$0 = r1
                    r10.label = r4
                    java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(r1, r3, r11, r10)
                    if (r11 != r0) goto L44
                    return r0
                L44:
                    androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                    r4 = 0
                    r5 = r1
                    r1 = r4
                    r4 = r11
                L4a:
                    if (r1 != 0) goto L86
                    androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                    r10.L$0 = r5
                    r10.L$1 = r4
                    r10.L$2 = r1
                    r10.label = r2
                    java.lang.Object r11 = r5.awaitPointerEvent(r11, r10)
                    if (r11 != r0) goto L5d
                    return r0
                L5d:
                    androidx.compose.ui.input.pointer.PointerEvent r11 = (androidx.compose.ui.input.pointer.PointerEvent) r11
                    java.util.List r6 = r11.getChanges()
                    int r7 = r6.size()
                    r8 = 0
                L68:
                    if (r8 >= r7) goto L7a
                    java.lang.Object r9 = r6.get(r8)
                    androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
                    boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r9)
                    if (r9 != 0) goto L77
                    goto L4a
                L77:
                    int r8 = r8 + 1
                    goto L68
                L7a:
                    java.util.List r11 = r11.getChanges()
                    java.lang.Object r11 = r11.get(r3)
                    r1 = r11
                    androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                    goto L4a
                L86:
                    androidx.compose.foundation.pager.PagerState r11 = r10.$state
                    long r0 = r1.m3993getPositionF1C5BW0()
                    long r2 = r4.m3993getPositionF1C5BW0()
                    long r0 = androidx.compose.ui.geometry.Offset.m2716minusMKHz9U(r0, r2)
                    r11.m798setUpDownDifferencek4lQ0M$foundation_release(r0)
                    Q5.I r11 = Q5.I.f8786a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1.AnonymousClass1.C03121.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, d dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$state = pagerState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$state, dVar);
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
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C03121 c03121 = new C03121(this.$state, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c03121, this) == e8) {
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
    public LazyLayoutPagerKt$dragDirectionDetector$1(PagerState pagerState, d dVar) {
        super(2, dVar);
        this.$state = pagerState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        LazyLayoutPagerKt$dragDirectionDetector$1 lazyLayoutPagerKt$dragDirectionDetector$1 = new LazyLayoutPagerKt$dragDirectionDetector$1(this.$state, dVar);
        lazyLayoutPagerKt$dragDirectionDetector$1.L$0 = obj;
        return lazyLayoutPagerKt$dragDirectionDetector$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
            this.label = 1;
            if (N.e(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
