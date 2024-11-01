package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.runtime.State;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import n6.M;
import n6.N;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1", f = "Transformable.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableKt$transformable$3$block$1$1 extends l implements InterfaceC2072n {
    final /* synthetic */ p6.d $channel;
    final /* synthetic */ State<Boolean> $updatePanZoomLock;
    final /* synthetic */ State<Function0> $updatedCanPan;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1", f = "Transformable.kt", l = {125}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ PointerInputScope $$this$null;
        final /* synthetic */ p6.d $channel;
        final /* synthetic */ State<Boolean> $updatePanZoomLock;
        final /* synthetic */ State<Function0> $updatedCanPan;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1$1", f = "Transformable.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.TransformableKt$transformable$3$block$1$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03091 extends k implements InterfaceC2072n {
            final /* synthetic */ M $$this$coroutineScope;
            final /* synthetic */ p6.d $channel;
            final /* synthetic */ State<Boolean> $updatePanZoomLock;
            final /* synthetic */ State<Function0> $updatedCanPan;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C03091(State<Boolean> state, p6.d dVar, State<? extends Function0> state2, M m8, U5.d dVar2) {
                super(2, dVar2);
                this.$updatePanZoomLock = state;
                this.$channel = dVar;
                this.$updatedCanPan = state2;
                this.$$this$coroutineScope = m8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                C03091 c03091 = new C03091(this.$updatePanZoomLock, this.$channel, this.$updatedCanPan, this.$$this$coroutineScope, dVar);
                c03091.L$0 = obj;
                return c03091;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
                return ((C03091) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object detectZoom;
                Object e8 = V5.b.e();
                int i8 = this.label;
                try {
                    try {
                        if (i8 != 0) {
                            if (i8 == 1) {
                                t.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            t.b(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            State<Boolean> state = this.$updatePanZoomLock;
                            p6.d dVar = this.$channel;
                            State<Function0> state2 = this.$updatedCanPan;
                            this.label = 1;
                            detectZoom = TransformableKt.detectZoom(awaitPointerEventScope, state, dVar, state2, this);
                            if (detectZoom == e8) {
                                return e8;
                            }
                        }
                    } catch (CancellationException e9) {
                        if (!N.g(this.$$this$coroutineScope)) {
                            throw e9;
                        }
                    }
                    return I.f8786a;
                } finally {
                    this.$channel.x(TransformEvent.TransformStopped.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PointerInputScope pointerInputScope, State<Boolean> state, p6.d dVar, State<? extends Function0> state2, U5.d dVar2) {
            super(2, dVar2);
            this.$$this$null = pointerInputScope;
            this.$updatePanZoomLock = state;
            this.$channel = dVar;
            this.$updatedCanPan = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$null, this.$updatePanZoomLock, this.$channel, this.$updatedCanPan, dVar);
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
                PointerInputScope pointerInputScope = this.$$this$null;
                C03091 c03091 = new C03091(this.$updatePanZoomLock, this.$channel, this.$updatedCanPan, m8, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c03091, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TransformableKt$transformable$3$block$1$1(State<Boolean> state, p6.d dVar, State<? extends Function0> state2, U5.d dVar2) {
        super(2, dVar2);
        this.$updatePanZoomLock = state;
        this.$channel = dVar;
        this.$updatedCanPan = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TransformableKt$transformable$3$block$1$1 transformableKt$transformable$3$block$1$1 = new TransformableKt$transformable$3$block$1$1(this.$updatePanZoomLock, this.$channel, this.$updatedCanPan, dVar);
        transformableKt$transformable$3$block$1$1.L$0 = obj;
        return transformableKt$transformable$3$block$1$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
        return ((TransformableKt$transformable$3$block$1$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$updatePanZoomLock, this.$channel, this.$updatedCanPan, null);
            this.label = 1;
            if (N.e(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
