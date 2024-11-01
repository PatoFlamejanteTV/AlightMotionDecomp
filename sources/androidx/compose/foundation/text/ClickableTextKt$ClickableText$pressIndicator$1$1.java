package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

@f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1", f = "ClickableText.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1 $onClick;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ Function1 $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<TextLayoutResult> mutableState, Function1 function1) {
            super(1);
            this.$layoutResult = mutableState;
            this.$onClick = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m846invokek4lQ0M(((Offset) obj).m2722unboximpl());
            return I.f8786a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m846invokek4lQ0M(long j8) {
            TextLayoutResult value = this.$layoutResult.getValue();
            if (value != null) {
                this.$onClick.invoke(Integer.valueOf(value.m4641getOffsetForPositionk4lQ0M(j8)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, Function1 function1, d dVar) {
        super(2, dVar);
        this.$layoutResult = mutableState;
        this.$onClick = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ClickableTextKt$ClickableText$pressIndicator$1$1 clickableTextKt$ClickableText$pressIndicator$1$1 = new ClickableTextKt$ClickableText$pressIndicator$1$1(this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pressIndicator$1$1.L$0 = obj;
        return clickableTextKt$ClickableText$pressIndicator$1$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((ClickableTextKt$ClickableText$pressIndicator$1$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$layoutResult, this.$onClick);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass1, this, 7, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
