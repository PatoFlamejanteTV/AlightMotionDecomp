package androidx.activity;

import Q5.I;
import Q5.t;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import p6.q;
import p6.s;

@kotlin.coroutines.jvm.internal.f(c = "androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1", f = "PipHintTracker.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PipHintTrackerKt$trackPipAnimationHintView$flow$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ View $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 $attachStateChangeListener;
        final /* synthetic */ View.OnLayoutChangeListener $layoutChangeListener;
        final /* synthetic */ ViewTreeObserver.OnScrollChangedListener $scrollChangeListener;
        final /* synthetic */ View $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener, View.OnLayoutChangeListener onLayoutChangeListener, PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1) {
            super(0);
            this.$view = view;
            this.$scrollChangeListener = onScrollChangedListener;
            this.$layoutChangeListener = onLayoutChangeListener;
            this.$attachStateChangeListener = pipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m75invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m75invoke() {
            this.$view.getViewTreeObserver().removeOnScrollChangedListener(this.$scrollChangeListener);
            this.$view.removeOnLayoutChangeListener(this.$layoutChangeListener);
            this.$view.removeOnAttachStateChangeListener(this.$attachStateChangeListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipHintTrackerKt$trackPipAnimationHintView$flow$1(View view, U5.d dVar) {
        super(2, dVar);
        this.$view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(s sVar, View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        Rect trackPipAnimationHintView$positionInWindow;
        if (i8 != i12 || i10 != i14 || i9 != i13 || i11 != i15) {
            trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
            sVar.x(trackPipAnimationHintView$positionInWindow);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(s sVar, View view) {
        Rect trackPipAnimationHintView$positionInWindow;
        trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view);
        sVar.x(trackPipAnimationHintView$positionInWindow);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        PipHintTrackerKt$trackPipAnimationHintView$flow$1 pipHintTrackerKt$trackPipAnimationHintView$flow$1 = new PipHintTrackerKt$trackPipAnimationHintView$flow$1(this.$view, dVar);
        pipHintTrackerKt$trackPipAnimationHintView$flow$1.L$0 = obj;
        return pipHintTrackerKt$trackPipAnimationHintView$flow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1, android.view.View$OnAttachStateChangeListener] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Rect trackPipAnimationHintView$positionInWindow;
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
            final s sVar = (s) this.L$0;
            final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: androidx.activity.l
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$0(s.this, view, i9, i10, i11, i12, i13, i14, i15, i16);
                }
            };
            final View view = this.$view;
            final ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.activity.m
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    PipHintTrackerKt$trackPipAnimationHintView$flow$1.invokeSuspend$lambda$1(s.this, view);
                }
            };
            final View view2 = this.$view;
            ?? r32 = new View.OnAttachStateChangeListener() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$flow$1$attachStateChangeListener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view3) {
                    Rect trackPipAnimationHintView$positionInWindow2;
                    s sVar2 = s.this;
                    trackPipAnimationHintView$positionInWindow2 = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(view2);
                    sVar2.x(trackPipAnimationHintView$positionInWindow2);
                    view2.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                    view2.addOnLayoutChangeListener(onLayoutChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view3) {
                    view3.getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
                    view3.removeOnLayoutChangeListener(onLayoutChangeListener);
                }
            };
            if (Api19Impl.INSTANCE.isAttachedToWindow(this.$view)) {
                trackPipAnimationHintView$positionInWindow = PipHintTrackerKt.trackPipAnimationHintView$positionInWindow(this.$view);
                sVar.x(trackPipAnimationHintView$positionInWindow);
                this.$view.getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
                this.$view.addOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.$view.addOnAttachStateChangeListener(r32);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$view, onScrollChangedListener, onLayoutChangeListener, r32);
            this.label = 1;
            if (q.a(sVar, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(s sVar, U5.d dVar) {
        return ((PipHintTrackerKt$trackPipAnimationHintView$flow$1) create(sVar, dVar)).invokeSuspend(I.f8786a);
    }
}
