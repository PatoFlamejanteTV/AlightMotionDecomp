package androidx.compose.foundation.text.selection;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {634}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectionManager$onClearSelectionRequested$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Function0 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Function0 $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0) {
            super(1);
            this.$block = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1039invokek4lQ0M(((Offset) obj).m2722unboximpl());
            return I.f8786a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1039invokek4lQ0M(long j8) {
            this.$block.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, Function0 function0, d dVar) {
        super(2, dVar);
        this.this$0 = selectionManager;
        this.$block = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.this$0, this.$block, dVar);
        selectionManager$onClearSelectionRequested$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((SelectionManager$onClearSelectionRequested$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object detectNonConsumingTap;
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            SelectionManager selectionManager = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block);
            this.label = 1;
            detectNonConsumingTap = selectionManager.detectNonConsumingTap(pointerInputScope, anonymousClass1, this);
            if (detectNonConsumingTap == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
