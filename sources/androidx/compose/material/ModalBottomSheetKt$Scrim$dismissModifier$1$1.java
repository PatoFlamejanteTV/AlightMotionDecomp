package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

@f(c = "androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1", f = "ModalBottomSheet.kt", l = {708}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ModalBottomSheetKt$Scrim$dismissModifier$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Function0 $onDismiss;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.ModalBottomSheetKt$Scrim$dismissModifier$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ Function0 $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function0 function0) {
            super(1);
            this.$onDismiss = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m1261invokek4lQ0M(((Offset) obj).m2722unboximpl());
            return I.f8786a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m1261invokek4lQ0M(long j8) {
            this.$onDismiss.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$dismissModifier$1$1(Function0 function0, d dVar) {
        super(2, dVar);
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ModalBottomSheetKt$Scrim$dismissModifier$1$1 modalBottomSheetKt$Scrim$dismissModifier$1$1 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(this.$onDismiss, dVar);
        modalBottomSheetKt$Scrim$dismissModifier$1$1.L$0 = obj;
        return modalBottomSheetKt$Scrim$dismissModifier$1$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((ModalBottomSheetKt$Scrim$dismissModifier$1$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDismiss);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass1, this, 7, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
