package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.core.view.PointerIconCompat;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O;
import n6.M;
import n6.N;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1", f = "Slider.kt", l = {983}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SliderKt$rangeSliderPressDragModifier$1 extends l implements InterfaceC2072n {
    final /* synthetic */ MutableInteractionSource $endInteractionSource;
    final /* synthetic */ State<Function1> $gestureEndAction;
    final /* synthetic */ boolean $isRtl;
    final /* synthetic */ float $maxPx;
    final /* synthetic */ State<InterfaceC2072n> $onDrag;
    final /* synthetic */ State<Float> $rawOffsetEnd;
    final /* synthetic */ State<Float> $rawOffsetStart;
    final /* synthetic */ MutableInteractionSource $startInteractionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {984}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ State<Function1> $gestureEndAction;
        final /* synthetic */ boolean $isRtl;
        final /* synthetic */ float $maxPx;
        final /* synthetic */ State<InterfaceC2072n> $onDrag;
        final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
        final /* synthetic */ State<Float> $rawOffsetEnd;
        final /* synthetic */ State<Float> $rawOffsetStart;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {985, 995, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03321 extends k implements InterfaceC2072n {
            final /* synthetic */ M $$this$coroutineScope;
            final /* synthetic */ State<Function1> $gestureEndAction;
            final /* synthetic */ boolean $isRtl;
            final /* synthetic */ float $maxPx;
            final /* synthetic */ State<InterfaceC2072n> $onDrag;
            final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
            final /* synthetic */ State<Float> $rawOffsetEnd;
            final /* synthetic */ State<Float> $rawOffsetStart;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {1031}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends l implements InterfaceC2072n {
                final /* synthetic */ O $draggingStart;
                final /* synthetic */ DragInteraction $finishInteraction;
                final /* synthetic */ RangeSliderLogic $rangeSliderLogic;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(RangeSliderLogic rangeSliderLogic, O o8, DragInteraction dragInteraction, d dVar) {
                    super(2, dVar);
                    this.$rangeSliderLogic = rangeSliderLogic;
                    this.$draggingStart = o8;
                    this.$finishInteraction = dragInteraction;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d create(Object obj, d dVar) {
                    return new AnonymousClass2(this.$rangeSliderLogic, this.$draggingStart, this.$finishInteraction, dVar);
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
                        MutableInteractionSource activeInteraction = this.$rangeSliderLogic.activeInteraction(this.$draggingStart.f34569a);
                        DragInteraction dragInteraction = this.$finishInteraction;
                        this.label = 1;
                        if (activeInteraction.emit(dragInteraction, this) == e8) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03321(boolean z8, float f8, RangeSliderLogic rangeSliderLogic, State<Float> state, M m8, State<? extends Function1> state2, State<Float> state3, State<? extends InterfaceC2072n> state4, d dVar) {
                super(2, dVar);
                this.$isRtl = z8;
                this.$maxPx = f8;
                this.$rangeSliderLogic = rangeSliderLogic;
                this.$rawOffsetStart = state;
                this.$$this$coroutineScope = m8;
                this.$gestureEndAction = state2;
                this.$rawOffsetEnd = state3;
                this.$onDrag = state4;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                C03321 c03321 = new C03321(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$$this$coroutineScope, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, dVar);
                c03321.L$0 = obj;
                return c03321;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
                return ((C03321) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0183 A[Catch: CancellationException -> 0x0189, TryCatch #1 {CancellationException -> 0x0189, blocks: (B:10:0x017b, B:12:0x0183, B:16:0x018b, B:40:0x015b), top: B:39:0x015b }] */
            /* JADX WARN: Removed duplicated region for block: B:16:0x018b A[Catch: CancellationException -> 0x0189, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0189, blocks: (B:10:0x017b, B:12:0x0183, B:16:0x018b, B:40:0x015b), top: B:39:0x015b }] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x017a A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instructions count: 444
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt$rangeSliderPressDragModifier$1.AnonymousClass1.C03321.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, boolean z8, float f8, RangeSliderLogic rangeSliderLogic, State<Float> state, State<? extends Function1> state2, State<Float> state3, State<? extends InterfaceC2072n> state4, d dVar) {
            super(2, dVar);
            this.$$this$pointerInput = pointerInputScope;
            this.$isRtl = z8;
            this.$maxPx = f8;
            this.$rangeSliderLogic = rangeSliderLogic;
            this.$rawOffsetStart = state;
            this.$gestureEndAction = state2;
            this.$rawOffsetEnd = state3;
            this.$onDrag = state4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                M m8 = (M) this.L$0;
                PointerInputScope pointerInputScope = this.$$this$pointerInput;
                C03321 c03321 = new C03321(this.$isRtl, this.$maxPx, this.$rangeSliderLogic, this.$rawOffsetStart, m8, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c03321, this) == e8) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$rangeSliderPressDragModifier$1(MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, State<? extends InterfaceC2072n> state3, boolean z8, float f8, State<? extends Function1> state4, d dVar) {
        super(2, dVar);
        this.$startInteractionSource = mutableInteractionSource;
        this.$endInteractionSource = mutableInteractionSource2;
        this.$rawOffsetStart = state;
        this.$rawOffsetEnd = state2;
        this.$onDrag = state3;
        this.$isRtl = z8;
        this.$maxPx = f8;
        this.$gestureEndAction = state4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        SliderKt$rangeSliderPressDragModifier$1 sliderKt$rangeSliderPressDragModifier$1 = new SliderKt$rangeSliderPressDragModifier$1(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag, this.$isRtl, this.$maxPx, this.$gestureEndAction, dVar);
        sliderKt$rangeSliderPressDragModifier$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, d dVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$isRtl, this.$maxPx, new RangeSliderLogic(this.$startInteractionSource, this.$endInteractionSource, this.$rawOffsetStart, this.$rawOffsetEnd, this.$onDrag), this.$rawOffsetStart, this.$gestureEndAction, this.$rawOffsetEnd, this.$onDrag, null);
            this.label = 1;
            if (N.e(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
