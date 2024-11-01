package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {232}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2073o $onPress;
    final /* synthetic */ Function1 $onTap;
    final /* synthetic */ PressGestureScopeImpl $pressScope;
    final /* synthetic */ PointerInputScope $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {237, 245}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements InterfaceC2072n {
        final /* synthetic */ M $$this$coroutineScope;
        final /* synthetic */ InterfaceC2073o $onPress;
        final /* synthetic */ Function1 $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {234}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03051 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03051(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C03051(this.$pressScope, dVar);
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
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    this.label = 1;
                    if (pressGestureScopeImpl.reset(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C03051) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {241}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends l implements InterfaceC2072n {
            final /* synthetic */ PointerInputChange $down;
            final /* synthetic */ InterfaceC2073o $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InterfaceC2073o interfaceC2073o, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, U5.d dVar) {
                super(2, dVar);
                this.$onPress = interfaceC2073o;
                this.$pressScope = pressGestureScopeImpl;
                this.$down = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass2(this.$onPress, this.$pressScope, this.$down, dVar);
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
                    InterfaceC2073o interfaceC2073o = this.$onPress;
                    PressGestureScopeImpl pressGestureScopeImpl = this.$pressScope;
                    Offset m2701boximpl = Offset.m2701boximpl(this.$down.m3993getPositionF1C5BW0());
                    this.label = 1;
                    if (interfaceC2073o.invoke(pressGestureScopeImpl, m2701boximpl, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass3(this.$pressScope, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.label == 0) {
                    t.b(obj);
                    this.$pressScope.cancel();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((AnonymousClass3) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass4 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass4(this.$pressScope, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.label == 0) {
                    t.b(obj);
                    this.$pressScope.release();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((AnonymousClass4) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(M m8, InterfaceC2073o interfaceC2073o, Function1 function1, PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
            super(2, dVar);
            this.$$this$coroutineScope = m8;
            this.$onPress = interfaceC2073o;
            this.$onTap = function1;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r6 = r23
                java.lang.Object r7 = V5.b.e()
                int r0 = r6.label
                r8 = 2
                r9 = 1
                r10 = 0
                if (r0 == 0) goto L2a
                if (r0 == r9) goto L1f
                if (r0 != r8) goto L17
                Q5.t.b(r24)
                r0 = r24
                goto L7d
            L17:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1f:
                java.lang.Object r0 = r6.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                Q5.t.b(r24)
                r11 = r0
                r0 = r24
                goto L51
            L2a:
                Q5.t.b(r24)
                java.lang.Object r0 = r6.L$0
                r11 = r0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
                n6.M r0 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1 r3 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1
                androidx.compose.foundation.gestures.PressGestureScopeImpl r1 = r6.$pressScope
                r3.<init>(r1, r10)
                r4 = 3
                r5 = 0
                r1 = 0
                r2 = 0
                n6.AbstractC3458i.d(r0, r1, r2, r3, r4, r5)
                r6.L$0 = r11
                r6.label = r9
                r1 = 0
                r0 = r11
                r3 = r23
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                if (r0 != r7) goto L51
                return r7
            L51:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                r0.consume()
                c6.o r1 = r6.$onPress
                c6.o r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.access$getNoPressGesture$p()
                if (r1 == r2) goto L72
                n6.M r12 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2 r15 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2
                c6.o r1 = r6.$onPress
                androidx.compose.foundation.gestures.PressGestureScopeImpl r2 = r6.$pressScope
                r15.<init>(r1, r2, r0, r10)
                r16 = 3
                r17 = 0
                r13 = 0
                r14 = 0
                n6.AbstractC3458i.d(r12, r13, r14, r15, r16, r17)
            L72:
                r6.L$0 = r10
                r6.label = r8
                java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r11, r10, r6, r9, r10)
                if (r0 != r7) goto L7d
                return r7
            L7d:
                androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
                if (r0 != 0) goto L93
                n6.M r11 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3 r14 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3
                androidx.compose.foundation.gestures.PressGestureScopeImpl r0 = r6.$pressScope
                r14.<init>(r0, r10)
                r15 = 3
                r16 = 0
                r12 = 0
                r13 = 0
                n6.AbstractC3458i.d(r11, r12, r13, r14, r15, r16)
                goto Lbd
            L93:
                r0.consume()
                n6.M r1 = r6.$$this$coroutineScope
                androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4 r2 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4
                androidx.compose.foundation.gestures.PressGestureScopeImpl r3 = r6.$pressScope
                r2.<init>(r3, r10)
                r21 = 3
                r22 = 0
                r18 = 0
                r19 = 0
                r17 = r1
                r20 = r2
                n6.AbstractC3458i.d(r17, r18, r19, r20, r21, r22)
                kotlin.jvm.functions.Function1 r1 = r6.$onTap
                if (r1 == 0) goto Lbd
                long r2 = r0.m3993getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r0 = androidx.compose.ui.geometry.Offset.m2701boximpl(r2)
                r1.invoke(r0)
            Lbd:
                Q5.I r0 = Q5.I.f8786a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(PointerInputScope pointerInputScope, InterfaceC2073o interfaceC2073o, Function1 function1, PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
        super(2, dVar);
        this.$this_detectTapAndPress = pointerInputScope;
        this.$onPress = interfaceC2073o;
        this.$onTap = function1;
        this.$pressScope = pressGestureScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, dVar);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
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
            PointerInputScope pointerInputScope = this.$this_detectTapAndPress;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(m8, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
