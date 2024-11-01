package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
final class ScrollKt$scroll$2$semantics$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ boolean $isScrollable;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ boolean $reverseScrolling;
    final /* synthetic */ ScrollState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ M $coroutineScope;
        final /* synthetic */ boolean $isVertical;
        final /* synthetic */ ScrollState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", l = {288, 290}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03011 extends l implements InterfaceC2072n {
            final /* synthetic */ boolean $isVertical;
            final /* synthetic */ ScrollState $state;
            final /* synthetic */ float $x;
            final /* synthetic */ float $y;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03011(boolean z8, ScrollState scrollState, float f8, float f9, d dVar) {
                super(2, dVar);
                this.$isVertical = z8;
                this.$state = scrollState;
                this.$y = f8;
                this.$x = f9;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03011(this.$isVertical, this.$state, this.$y, this.$x, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    if (this.$isVertical) {
                        ScrollState scrollState = this.$state;
                        AbstractC3292y.g(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                        float f8 = this.$y;
                        this.label = 1;
                        if (ScrollExtensionsKt.animateScrollBy$default(scrollState, f8, null, this, 2, null) == e8) {
                            return e8;
                        }
                    } else {
                        ScrollState scrollState2 = this.$state;
                        AbstractC3292y.g(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                        float f9 = this.$x;
                        this.label = 2;
                        if (ScrollExtensionsKt.animateScrollBy$default(scrollState2, f9, null, this, 2, null) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C03011) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(M m8, boolean z8, ScrollState scrollState) {
            super(2);
            this.$coroutineScope = m8;
            this.$isVertical = z8;
            this.$state = scrollState;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }

        public final Boolean invoke(float f8, float f9) {
            AbstractC3462k.d(this.$coroutineScope, null, null, new C03011(this.$isVertical, this.$state, f9, f8, null), 3, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$scroll$2$semantics$1(boolean z8, boolean z9, boolean z10, ScrollState scrollState, M m8) {
        super(1);
        this.$reverseScrolling = z8;
        this.$isVertical = z9;
        this.$isScrollable = z10;
        this.$state = scrollState;
        this.$coroutineScope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1(this.$state), new ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2(this.$state), this.$reverseScrolling);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
        }
        if (this.$isScrollable) {
            SemanticsPropertiesKt.scrollBy$default(semantics, null, new AnonymousClass1(this.$coroutineScope, this.$isVertical, this.$state), 1, null);
        }
    }
}
