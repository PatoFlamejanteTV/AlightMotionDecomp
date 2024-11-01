package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.T;
import n6.AbstractC3462k;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TapGestureDetectorKt$detectTapGestures$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Function1 $onDoubleTap;
    final /* synthetic */ Function1 $onLongPress;
    final /* synthetic */ InterfaceC2073o $onPress;
    final /* synthetic */ Function1 $onTap;
    final /* synthetic */ PointerInputScope $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {100, 114, TsExtractor.TS_STREAM_TYPE_AC3, 141, 156, 178}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements InterfaceC2072n {
        final /* synthetic */ M $$this$coroutineScope;
        final /* synthetic */ Function1 $onDoubleTap;
        final /* synthetic */ Function1 $onLongPress;
        final /* synthetic */ InterfaceC2073o $onPress;
        final /* synthetic */ Function1 $onTap;
        final /* synthetic */ PressGestureScopeImpl $pressScope;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", l = {103}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03061 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03061(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C03061(this.$pressScope, dVar);
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
                return ((C03061) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass10 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass10(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass10(this.$pressScope, dVar);
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
                return ((AnonymousClass10) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", l = {106}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2, reason: invalid class name */
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
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", l = {115}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends k implements InterfaceC2072n {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(U5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
                return ((AnonymousClass3) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
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
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                    if (obj == e8) {
                        return e8;
                    }
                }
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4, reason: invalid class name */
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
                    this.$pressScope.cancel();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((AnonymousClass4) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass5 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass5(this.$pressScope, dVar);
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
                return ((AnonymousClass5) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass6 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass6(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass6(this.$pressScope, dVar);
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
                return ((AnonymousClass6) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", l = {148}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass7 extends l implements InterfaceC2072n {
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass7(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass7(this.$pressScope, dVar);
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
                return ((AnonymousClass7) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass8 extends l implements InterfaceC2072n {
            final /* synthetic */ InterfaceC2073o $onPress;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ PointerInputChange $secondDown;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass8(InterfaceC2073o interfaceC2073o, PressGestureScopeImpl pressGestureScopeImpl, PointerInputChange pointerInputChange, U5.d dVar) {
                super(2, dVar);
                this.$onPress = interfaceC2073o;
                this.$pressScope = pressGestureScopeImpl;
                this.$secondDown = pointerInputChange;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new AnonymousClass8(this.$onPress, this.$pressScope, this.$secondDown, dVar);
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
                    Offset m2701boximpl = Offset.m2701boximpl(this.$secondDown.m3993getPositionF1C5BW0());
                    this.label = 1;
                    if (interfaceC2073o.invoke(pressGestureScopeImpl, m2701boximpl, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((AnonymousClass8) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", l = {157}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass9 extends k implements InterfaceC2072n {
            final /* synthetic */ M $$this$coroutineScope;
            final /* synthetic */ Function1 $onDoubleTap;
            final /* synthetic */ Function1 $onTap;
            final /* synthetic */ PressGestureScopeImpl $pressScope;
            final /* synthetic */ T $upOrCancel;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03071 extends l implements InterfaceC2072n {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03071(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                    super(2, dVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new C03071(this.$pressScope, dVar);
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
                    return ((C03071) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2 extends l implements InterfaceC2072n {
                final /* synthetic */ PressGestureScopeImpl $pressScope;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                    super(2, dVar);
                    this.$pressScope = pressGestureScopeImpl;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    return new AnonymousClass2(this.$pressScope, dVar);
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
                    return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8786a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass9(M m8, Function1 function1, Function1 function12, T t8, PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
                super(2, dVar);
                this.$$this$coroutineScope = m8;
                this.$onDoubleTap = function1;
                this.$onTap = function12;
                this.$upOrCancel = t8;
                this.$pressScope = pressGestureScopeImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                AnonymousClass9 anonymousClass9 = new AnonymousClass9(this.$$this$coroutineScope, this.$onDoubleTap, this.$onTap, this.$upOrCancel, this.$pressScope, dVar);
                anonymousClass9.L$0 = obj;
                return anonymousClass9;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
                return ((AnonymousClass9) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
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
                    AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    this.label = 1;
                    obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                    if (obj == e8) {
                        return e8;
                    }
                }
                PointerInputChange pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    AbstractC3462k.d(this.$$this$coroutineScope, null, null, new AnonymousClass2(this.$pressScope, null), 3, null);
                    Function1 function1 = this.$onTap;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(Offset.m2701boximpl(((PointerInputChange) this.$upOrCancel.f34573a).m3993getPositionF1C5BW0()));
                    return I.f8786a;
                }
                pointerInputChange.consume();
                AbstractC3462k.d(this.$$this$coroutineScope, null, null, new C03071(this.$pressScope, null), 3, null);
                this.$onDoubleTap.invoke(Offset.m2701boximpl(pointerInputChange.m3993getPositionF1C5BW0()));
                return I.f8786a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(M m8, InterfaceC2073o interfaceC2073o, Function1 function1, Function1 function12, Function1 function13, PressGestureScopeImpl pressGestureScopeImpl, U5.d dVar) {
            super(2, dVar);
            this.$$this$coroutineScope = m8;
            this.$onPress = interfaceC2073o;
            this.$onLongPress = function1;
            this.$onDoubleTap = function12;
            this.$onTap = function13;
            this.$pressScope = pressGestureScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, this.$pressScope, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x022d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00ff A[Catch: PointerEventTimeoutCancellationException -> 0x0110, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0110, blocks: (B:57:0x00f9, B:59:0x00ff, B:62:0x0115), top: B:56:0x00f9 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0115 A[Catch: PointerEventTimeoutCancellationException -> 0x0110, TRY_LEAVE, TryCatch #4 {PointerEventTimeoutCancellationException -> 0x0110, blocks: (B:57:0x00f9, B:59:0x00ff, B:62:0x0115), top: B:56:0x00f9 }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0150 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00d3  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(PointerInputScope pointerInputScope, InterfaceC2073o interfaceC2073o, Function1 function1, Function1 function12, Function1 function13, U5.d dVar) {
        super(2, dVar);
        this.$this_detectTapGestures = pointerInputScope;
        this.$onPress = interfaceC2073o;
        this.$onLongPress = function1;
        this.$onDoubleTap = function12;
        this.$onTap = function13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, dVar);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
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
            PressGestureScopeImpl pressGestureScopeImpl = new PressGestureScopeImpl(this.$this_detectTapGestures);
            PointerInputScope pointerInputScope = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(m8, this.$onPress, this.$onLongPress, this.$onDoubleTap, this.$onTap, pressGestureScopeImpl, null);
            this.label = 1;
            if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
