package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;

@f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1", f = "Scrollable.kt", l = {336}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class MouseWheelScrollNode$pointerInputNode$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1", f = "Scrollable.kt", l = {338}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements InterfaceC2072n {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MouseWheelScrollNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseWheelScrollNode mouseWheelScrollNode, U5.d dVar) {
            super(2, dVar);
            this.this$0 = mouseWheelScrollNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[EDGE_INSN: B:15:0x004d->B:16:0x004d BREAK  A[LOOP:0: B:6:0x003a->B:9:0x004a], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002b -> B:5:0x002e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.label
                r2 = 1
                if (r1 == 0) goto L1b
                if (r1 != r2) goto L13
                java.lang.Object r1 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                Q5.t.b(r9)
                goto L2e
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                Q5.t.b(r9)
                java.lang.Object r9 = r8.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
                r1 = r9
            L23:
                r8.L$0 = r1
                r8.label = r2
                java.lang.Object r9 = androidx.compose.foundation.gestures.ScrollableKt.access$awaitScrollEvent(r1, r8)
                if (r9 != r0) goto L2e
                return r0
            L2e:
                androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
                java.util.List r3 = r9.getChanges()
                int r4 = r3.size()
                r5 = 0
                r6 = 0
            L3a:
                if (r6 >= r4) goto L4d
                java.lang.Object r7 = r3.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
                boolean r7 = r7.isConsumed()
                r7 = r7 ^ r2
                if (r7 != 0) goto L4a
                goto L23
            L4a:
                int r6 = r6 + 1
                goto L3a
            L4d:
                androidx.compose.foundation.gestures.MouseWheelScrollNode r3 = r8.this$0
                androidx.compose.foundation.gestures.ScrollConfig r3 = r3.getMouseWheelScrollConfig()
                androidx.compose.foundation.gestures.MouseWheelScrollNode r4 = r8.this$0
                long r6 = r1.mo3905getSizeYbymL2g()
                long r6 = r3.mo346calculateMouseWheelScroll8xgXZGE(r1, r9, r6)
                androidx.compose.runtime.State r3 = r4.getScrollingLogicState()
                java.lang.Object r3 = r3.getValue()
                androidx.compose.foundation.gestures.ScrollingLogic r3 = (androidx.compose.foundation.gestures.ScrollingLogic) r3
                float r4 = r3.m444toFloatk4lQ0M(r6)
                float r4 = r3.reverseIfNeeded(r4)
                androidx.compose.foundation.gestures.ScrollableState r3 = r3.getScrollableState()
                float r3 = r3.dispatchRawDelta(r4)
                r4 = 0
                int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r3 != 0) goto L7d
                goto L23
            L7d:
                java.util.List r9 = r9.getChanges()
                int r3 = r9.size()
            L85:
                if (r5 >= r3) goto L23
                java.lang.Object r4 = r9.get(r5)
                androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                r4.consume()
                int r5 = r5 + 1
                goto L85
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollNode$pointerInputNode$1(MouseWheelScrollNode mouseWheelScrollNode, U5.d dVar) {
        super(2, dVar);
        this.this$0 = mouseWheelScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        MouseWheelScrollNode$pointerInputNode$1 mouseWheelScrollNode$pointerInputNode$1 = new MouseWheelScrollNode$pointerInputNode$1(this.this$0, dVar);
        mouseWheelScrollNode$pointerInputNode$1.L$0 = obj;
        return mouseWheelScrollNode$pointerInputNode$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(PointerInputScope pointerInputScope, U5.d dVar) {
        return ((MouseWheelScrollNode$pointerInputNode$1) create(pointerInputScope, dVar)).invokeSuspend(I.f8786a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }
}
