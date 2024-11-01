package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1", f = "ClickableText.kt", l = {174}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ClickableTextKt$ClickableText$pointerInputModifier$1 extends l implements InterfaceC2072n {
    final /* synthetic */ M $coroutineScope;
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ Function1 $onClick;
    final /* synthetic */ Function1 $onHover;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1", f = "ClickableText.kt", l = {165}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ Function1 $onHover;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03141 extends AbstractC3293z implements Function1 {
            final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
            final /* synthetic */ Function1 $onHover;
            final /* synthetic */ T $previousIndex;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03141(T t8, Function1 function1, MutableState<TextLayoutResult> mutableState) {
                super(1);
                this.$previousIndex = t8;
                this.$onHover = function1;
                this.$layoutResult = mutableState;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m844invokek4lQ0M(((Offset) obj).m2722unboximpl());
                return I.f8786a;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m844invokek4lQ0M(long j8) {
                Integer ClickableText_03UYbkw$getOffset;
                ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(this.$layoutResult, j8);
                if (!AbstractC3292y.d(this.$previousIndex.f34573a, ClickableText_03UYbkw$getOffset)) {
                    this.$previousIndex.f34573a = ClickableText_03UYbkw$getOffset;
                    this.$onHover.invoke(ClickableText_03UYbkw$getOffset);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, Function1 function1, MutableState<TextLayoutResult> mutableState, d dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$onHover = function1;
            this.$layoutResult = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$$this$pointerInput, this.$onHover, this.$layoutResult, dVar);
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
                T t8 = new T();
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                PointerEventPass pointerEventPass = PointerEventPass.Main;
                C03141 c03141 = new C03141(t8, this.$onHover, this.$layoutResult);
                this.label = 1;
                if (PointerMoveDetectorKt.detectMoves(pointerInputScope, pointerEventPass, c03141, this) == e8) {
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
    /* renamed from: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pointerInputModifier$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
        final /* synthetic */ Function1 $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Function1 function1, MutableState<TextLayoutResult> mutableState) {
            super(1);
            this.$onClick = function1;
            this.$layoutResult = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m845invokek4lQ0M(((Offset) obj).m2722unboximpl());
            return I.f8786a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m845invokek4lQ0M(long j8) {
            Integer ClickableText_03UYbkw$getOffset;
            ClickableText_03UYbkw$getOffset = ClickableTextKt.ClickableText_03UYbkw$getOffset(this.$layoutResult, j8);
            if (ClickableText_03UYbkw$getOffset != null) {
                this.$onClick.invoke(ClickableText_03UYbkw$getOffset);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableTextKt$ClickableText$pointerInputModifier$1(M m8, Function1 function1, MutableState<TextLayoutResult> mutableState, Function1 function12, d dVar) {
        super(2, dVar);
        this.$coroutineScope = m8;
        this.$onHover = function1;
        this.$layoutResult = mutableState;
        this.$onClick = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        ClickableTextKt$ClickableText$pointerInputModifier$1 clickableTextKt$ClickableText$pointerInputModifier$1 = new ClickableTextKt$ClickableText$pointerInputModifier$1(this.$coroutineScope, this.$onHover, this.$layoutResult, this.$onClick, dVar);
        clickableTextKt$ClickableText$pointerInputModifier$1.L$0 = obj;
        return clickableTextKt$ClickableText$pointerInputModifier$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((ClickableTextKt$ClickableText$pointerInputModifier$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            AbstractC3462k.d(this.$coroutineScope, null, null, new AnonymousClass1(pointerInputScope, this.$onHover, this.$layoutResult, null), 3, null);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onClick, this.$layoutResult);
            this.label = 1;
            if (TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, anonymousClass2, this, 7, null) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
