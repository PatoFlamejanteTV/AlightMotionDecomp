package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.T;
import n6.M;
import n6.N;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1", f = "Draggable.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DraggableNode$pointerInputNode$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DraggableNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1", f = "Draggable.kt", l = {326}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DraggableNode this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1", f = "Draggable.kt", l = {305, 307, 309, TypedValues.AttributesType.TYPE_PATH_ROTATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 321}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03031 extends l implements InterfaceC2072n {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            @f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1", f = "Draggable.kt", l = {312}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C03041 extends l implements InterfaceC2072n {
                final /* synthetic */ T $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ DraggableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03041(T t8, DraggableNode draggableNode, U5.d dVar) {
                    super(2, dVar);
                    this.$event = t8;
                    this.this$0 = draggableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final U5.d create(Object obj, U5.d dVar) {
                    C03041 c03041 = new C03041(this.$event, this.this$0, dVar);
                    c03041.L$0 = obj;
                    return c03041;
                }

                @Override // c6.InterfaceC2072n
                public final Object invoke(DragScope dragScope, U5.d dVar) {
                    return ((C03041) create(dragScope, dVar)).invokeSuspend(I.f8786a);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:5:0x0063). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = V5.b.e()
                        int r1 = r6.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r6.L$1
                        kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                        java.lang.Object r3 = r6.L$0
                        androidx.compose.foundation.gestures.DragScope r3 = (androidx.compose.foundation.gestures.DragScope) r3
                        Q5.t.b(r7)
                        goto L63
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        Q5.t.b(r7)
                        java.lang.Object r7 = r6.L$0
                        androidx.compose.foundation.gestures.DragScope r7 = (androidx.compose.foundation.gestures.DragScope) r7
                        r3 = r7
                    L27:
                        kotlin.jvm.internal.T r7 = r6.$event
                        java.lang.Object r7 = r7.f34573a
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                        if (r1 != 0) goto L66
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                        if (r1 != 0) goto L66
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                        if (r1 == 0) goto L3a
                        androidx.compose.foundation.gestures.DragEvent$DragDelta r7 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r7
                        goto L3b
                    L3a:
                        r7 = 0
                    L3b:
                        if (r7 == 0) goto L4e
                        androidx.compose.foundation.gestures.DraggableNode r1 = r6.this$0
                        long r4 = r7.m356getDeltaF1C5BW0()
                        androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.DraggableNode.access$getOrientation$p(r1)
                        float r7 = androidx.compose.foundation.gestures.DraggableKt.m397access$toFloat3MmeM6k(r4, r7)
                        r3.dragBy(r7)
                    L4e:
                        kotlin.jvm.internal.T r1 = r6.$event
                        androidx.compose.foundation.gestures.DraggableNode r7 = r6.this$0
                        p6.d r7 = androidx.compose.foundation.gestures.DraggableNode.access$getChannel$p(r7)
                        r6.L$0 = r3
                        r6.L$1 = r1
                        r6.label = r2
                        java.lang.Object r7 = r7.s(r6)
                        if (r7 != r0) goto L63
                        return r0
                    L63:
                        r1.f34573a = r7
                        goto L27
                    L66:
                        Q5.I r7 = Q5.I.f8786a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.AnonymousClass1.C03031.C03041.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03031(DraggableNode draggableNode, U5.d dVar) {
                super(2, dVar);
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                C03031 c03031 = new C03031(this.this$0, dVar);
                c03031.L$0 = obj;
                return c03031;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|(1:39)|22|23|24|(2:29|(2:31|(1:33)))(2:26|(1:28))|8|(2:43|44)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:            r1 = r8;     */
            /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00c6 A[Catch: CancellationException -> 0x00dd, TryCatch #1 {CancellationException -> 0x00dd, blocks: (B:24:0x00c0, B:26:0x00c6, B:29:0x00e0, B:31:0x00e4), top: B:23:0x00c0 }] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00e0 A[Catch: CancellationException -> 0x00dd, TryCatch #1 {CancellationException -> 0x00dd, blocks: (B:24:0x00c0, B:26:0x00c6, B:29:0x00e0, B:31:0x00e4), top: B:23:0x00c0 }] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0103 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00da -> B:8:0x0061). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00e2 -> B:8:0x0061). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00f1 -> B:8:0x0061). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0101 -> B:7:0x002a). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0104 -> B:8:0x0061). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.AnonymousClass1.C03031.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C03031) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2", f = "Draggable.kt", l = {328, 336}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends k implements InterfaceC2072n {
            final /* synthetic */ M $$this$coroutineScope;
            int I$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ DraggableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(M m8, DraggableNode draggableNode, U5.d dVar) {
                super(2, dVar);
                this.$$this$coroutineScope = m8;
                this.this$0 = draggableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$$this$coroutineScope, this.this$0, dVar);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
                return ((AnonymousClass2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
            }

            /* JADX WARN: Can't wrap try/catch for region: R(7:26|(1:27)|28|29|30|31|(1:33)(9:35|9|10|(0)(0)|16|17|18|19|(2:63|64)(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x011a, code lost:            r0 = e;     */
            /* JADX WARN: Code restructure failed: missing block: B:38:0x011b, code lost:            r4 = r16;        r2 = r19;        r3 = r20;     */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:            r0 = th;     */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0117, code lost:            r3 = r20;     */
            /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0146 A[Catch: all -> 0x0147, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0147, blocks: (B:40:0x0132, B:43:0x0146), top: B:39:0x0132 }] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
            /* JADX WARN: Removed duplicated region for block: B:53:0x016c  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d3 -> B:9:0x00da). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0138 -> B:17:0x010f). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0176 -> B:19:0x0054). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r22) {
                /*
                    Method dump skipped, instructions count: 383
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerInputScope pointerInputScope, DraggableNode draggableNode, U5.d dVar) {
            super(2, dVar);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = draggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r11.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r11.L$0
                n6.M r0 = (n6.M) r0
                Q5.t.b(r12)     // Catch: java.util.concurrent.CancellationException -> L13
                goto L53
            L13:
                r12 = move-exception
                goto L4d
            L15:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1d:
                Q5.t.b(r12)
                java.lang.Object r12 = r11.L$0
                n6.M r12 = (n6.M) r12
                n6.O r5 = n6.O.UNDISPATCHED
                androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1 r6 = new androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$1
                androidx.compose.foundation.gestures.DraggableNode r1 = r11.this$0
                r9 = 0
                r6.<init>(r1, r9)
                r7 = 1
                r8 = 0
                r4 = 0
                r3 = r12
                n6.AbstractC3458i.d(r3, r4, r5, r6, r7, r8)
                androidx.compose.ui.input.pointer.PointerInputScope r1 = r11.$$this$SuspendingPointerInputModifierNode     // Catch: java.util.concurrent.CancellationException -> L49
                androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2 r3 = new androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1$1$2     // Catch: java.util.concurrent.CancellationException -> L49
                androidx.compose.foundation.gestures.DraggableNode r4 = r11.this$0     // Catch: java.util.concurrent.CancellationException -> L49
                r3.<init>(r12, r4, r9)     // Catch: java.util.concurrent.CancellationException -> L49
                r11.L$0 = r12     // Catch: java.util.concurrent.CancellationException -> L49
                r11.label = r2     // Catch: java.util.concurrent.CancellationException -> L49
                java.lang.Object r12 = r1.awaitPointerEventScope(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L49
                if (r12 != r0) goto L53
                return r0
            L49:
                r0 = move-exception
                r10 = r0
                r0 = r12
                r12 = r10
            L4d:
                boolean r0 = n6.N.g(r0)
                if (r0 == 0) goto L56
            L53:
                Q5.I r12 = Q5.I.f8786a
                return r12
            L56:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DraggableNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraggableNode$pointerInputNode$1(DraggableNode draggableNode, U5.d dVar) {
        super(2, dVar);
        this.this$0 = draggableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        DraggableNode$pointerInputNode$1 draggableNode$pointerInputNode$1 = new DraggableNode$pointerInputNode$1(this.this$0, dVar);
        draggableNode$pointerInputNode$1.L$0 = obj;
        return draggableNode$pointerInputNode$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
        return ((DraggableNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z8;
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
            z8 = this.this$0.enabled;
            if (!z8) {
                return I.f8786a;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (N.e(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
