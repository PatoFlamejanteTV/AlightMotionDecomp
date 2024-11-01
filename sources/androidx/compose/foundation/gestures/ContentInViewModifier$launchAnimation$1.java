package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.s;
import Q5.t;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.ui.geometry.Rect;
import c6.InterfaceC2072n;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.B0;
import n6.D0;
import n6.InterfaceC3488x0;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", l = {193}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ContentInViewModifier$launchAnimation$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", l = {198}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ InterfaceC3488x0 $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewModifier this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03021 extends AbstractC3293z implements Function1 {
            final /* synthetic */ ScrollScope $$this$scroll;
            final /* synthetic */ InterfaceC3488x0 $animationJob;
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03021(ContentInViewModifier contentInViewModifier, ScrollScope scrollScope, InterfaceC3488x0 interfaceC3488x0) {
                super(1);
                this.this$0 = contentInViewModifier;
                this.$$this$scroll = scrollScope;
                this.$animationJob = interfaceC3488x0;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).floatValue());
                return I.f8786a;
            }

            public final void invoke(float f8) {
                boolean z8;
                z8 = this.this$0.reverseDirection;
                float f9 = z8 ? 1.0f : -1.0f;
                float scrollBy = f9 * this.$$this$scroll.scrollBy(f9 * f8);
                if (scrollBy < f8) {
                    D0.f(this.$animationJob, "Scroll animation cancelled because scroll was not consumed (" + scrollBy + " < " + f8 + ')', null, 2, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
            final /* synthetic */ ContentInViewModifier this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(ContentInViewModifier contentInViewModifier) {
                super(0);
                this.this$0 = contentInViewModifier;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m354invoke();
                return I.f8786a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m354invoke() {
                boolean z8;
                UpdatableAnimationState updatableAnimationState;
                float calculateScrollDelta;
                Rect focusedChildBounds;
                BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = this.this$0.bringIntoViewRequests;
                ContentInViewModifier contentInViewModifier = this.this$0;
                while (true) {
                    if (!bringIntoViewRequestPriorityQueue.requests.isNotEmpty()) {
                        break;
                    }
                    Rect rect = (Rect) ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                    if (!(rect == null ? true : ContentInViewModifier.m351isMaxVisibleO0kMr_c$default(contentInViewModifier, rect, 0L, 1, null))) {
                        break;
                    } else {
                        ((ContentInViewModifier.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(s.b(I.f8786a));
                    }
                }
                z8 = this.this$0.trackingFocusedChild;
                if (z8) {
                    focusedChildBounds = this.this$0.getFocusedChildBounds();
                    if (focusedChildBounds != null && ContentInViewModifier.m351isMaxVisibleO0kMr_c$default(this.this$0, focusedChildBounds, 0L, 1, null)) {
                        this.this$0.trackingFocusedChild = false;
                    }
                }
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentInViewModifier contentInViewModifier, InterfaceC3488x0 interfaceC3488x0, U5.d dVar) {
            super(2, dVar);
            this.this$0 = contentInViewModifier;
            this.$animationJob = interfaceC3488x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$animationJob, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(ScrollScope scrollScope, U5.d dVar) {
            return ((AnonymousClass1) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            UpdatableAnimationState updatableAnimationState;
            float calculateScrollDelta;
            UpdatableAnimationState updatableAnimationState2;
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
                updatableAnimationState = this.this$0.animationState;
                calculateScrollDelta = this.this$0.calculateScrollDelta();
                updatableAnimationState.setValue(calculateScrollDelta);
                updatableAnimationState2 = this.this$0.animationState;
                C03021 c03021 = new C03021(this.this$0, scrollScope, this.$animationJob);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
                this.label = 1;
                if (updatableAnimationState2.animateToZero(c03021, anonymousClass2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$launchAnimation$1(ContentInViewModifier contentInViewModifier, U5.d dVar) {
        super(2, dVar);
        this.this$0 = contentInViewModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ContentInViewModifier$launchAnimation$1 contentInViewModifier$launchAnimation$1 = new ContentInViewModifier$launchAnimation$1(this.this$0, dVar);
        contentInViewModifier$launchAnimation$1.L$0 = obj;
        return contentInViewModifier$launchAnimation$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ScrollableState scrollableState;
        Object e8 = V5.b.e();
        int i8 = this.label;
        try {
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InterfaceC3488x0 l8 = B0.l(((M) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollableState = this.this$0.scrollState;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, l8, null);
                    this.label = 1;
                    if (c.e(scrollableState, null, anonymousClass1, this, 1, null) == e8) {
                        return e8;
                    }
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return I.f8786a;
            } catch (CancellationException e9) {
                throw e9;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((ContentInViewModifier$launchAnimation$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
