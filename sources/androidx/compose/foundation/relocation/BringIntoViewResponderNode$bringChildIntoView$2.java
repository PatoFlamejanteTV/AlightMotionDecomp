package androidx.compose.foundation.relocation;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.C3289v;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.M;

@f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class BringIntoViewResponderNode$bringChildIntoView$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Function0 $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ Function0 $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1", f = "BringIntoViewResponder.kt", l = {170}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ Function0 $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C03131 extends C3289v implements Function0 {
            final /* synthetic */ Function0 $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03131(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0) {
                super(0, AbstractC3292y.a.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = function0;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Rect invoke() {
                Rect bringChildIntoView$localRect;
                bringChildIntoView$localRect = BringIntoViewResponderNode.bringChildIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return bringChildIntoView$localRect;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0, d dVar) {
            super(2, dVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, dVar);
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
                BringIntoViewResponder responder = this.this$0.getResponder();
                C03131 c03131 = new C03131(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (responder.bringChildIntoView(c03131, this) == e8) {
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
    @f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2", f = "BringIntoViewResponder.kt", l = {179}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringChildIntoView$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        final /* synthetic */ Function0 $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, Function0 function0, d dVar) {
            super(2, dVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass2(this.this$0, this.$parentRect, dVar);
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
                BringIntoViewParent parent = this.this$0.getParent();
                LayoutCoordinates layoutCoordinates = this.this$0.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    return I.f8786a;
                }
                Function0 function0 = this.$parentRect;
                this.label = 1;
                if (parent.bringChildIntoView(layoutCoordinates, function0, this) == e8) {
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
    public BringIntoViewResponderNode$bringChildIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, Function0 function0, Function0 function02, d dVar) {
        super(2, dVar);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = function0;
        this.$parentRect = function02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        BringIntoViewResponderNode$bringChildIntoView$2 bringIntoViewResponderNode$bringChildIntoView$2 = new BringIntoViewResponderNode$bringChildIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, dVar);
        bringIntoViewResponderNode$bringChildIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringChildIntoView$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3488x0 d8;
        b.e();
        if (this.label == 0) {
            t.b(obj);
            M m8 = (M) this.L$0;
            AbstractC3462k.d(m8, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, null);
            d8 = AbstractC3462k.d(m8, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, null);
            return d8;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((BringIntoViewResponderNode$bringChildIntoView$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
