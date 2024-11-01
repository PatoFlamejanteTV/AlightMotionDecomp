package androidx.compose.foundation.text;

import Q5.I;
import Q5.t;
import U5.d;
import U5.g;
import V5.b;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputScope;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import n6.M;

@f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends l implements InterfaceC2072n {
    final /* synthetic */ Function1 $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", l = {44}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends k implements InterfaceC2072n {
        final /* synthetic */ g $currentContext;
        final /* synthetic */ Function1 $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(g gVar, PointerEventPass pointerEventPass, Function1 function1, d dVar) {
            super(2, dVar);
            this.$currentContext = gVar;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, d dVar) {
            return ((AnonymousClass1) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0040 -> B:5:0x0043). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r7.L$1
                kotlin.jvm.internal.T r1 = (kotlin.jvm.internal.T) r1
                java.lang.Object r3 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                Q5.t.b(r8)
                goto L43
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                Q5.t.b(r8)
                java.lang.Object r8 = r7.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
                kotlin.jvm.internal.T r1 = new kotlin.jvm.internal.T
                r1.<init>()
                r3 = r8
            L2c:
                U5.g r8 = r7.$currentContext
                boolean r8 = n6.B0.m(r8)
                if (r8 == 0) goto La3
                androidx.compose.ui.input.pointer.PointerEventPass r8 = r7.$pointerEventPass
                r7.L$0 = r3
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = r3.awaitPointerEvent(r8, r7)
                if (r8 != r0) goto L43
                return r0
            L43:
                androidx.compose.ui.input.pointer.PointerEvent r8 = (androidx.compose.ui.input.pointer.PointerEvent) r8
                int r4 = r8.m3935getType7fucELk()
                androidx.compose.ui.input.pointer.PointerEventType$Companion r5 = androidx.compose.ui.input.pointer.PointerEventType.Companion
                int r6 = r5.m3948getMove7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m3942equalsimpl0(r4, r6)
                if (r6 == 0) goto L57
                r6 = 1
                goto L5f
            L57:
                int r6 = r5.m3946getEnter7fucELk()
                boolean r6 = androidx.compose.ui.input.pointer.PointerEventType.m3942equalsimpl0(r4, r6)
            L5f:
                if (r6 == 0) goto L63
                r4 = 1
                goto L6b
            L63:
                int r5 = r5.m3947getExit7fucELk()
                boolean r4 = androidx.compose.ui.input.pointer.PointerEventType.m3942equalsimpl0(r4, r5)
            L6b:
                if (r4 == 0) goto L2c
                java.util.List r8 = r8.getChanges()
                java.lang.Object r8 = R5.AbstractC1435t.m0(r8)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                long r4 = r8.m3993getPositionF1C5BW0()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2701boximpl(r4)
                long r4 = r8.m2722unboximpl()
                java.lang.Object r6 = r1.f34573a
                boolean r4 = androidx.compose.ui.geometry.Offset.m2708equalsimpl(r4, r6)
                if (r4 != 0) goto L8c
                goto L8d
            L8c:
                r8 = 0
            L8d:
                if (r8 == 0) goto L2c
                kotlin.jvm.functions.Function1 r4 = r7.$onMove
                long r5 = r8.m2722unboximpl()
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2701boximpl(r5)
                r1.f34573a = r8
                androidx.compose.ui.geometry.Offset r8 = androidx.compose.ui.geometry.Offset.m2701boximpl(r5)
                r4.invoke(r8)
                goto L2c
            La3:
                Q5.I r8 = Q5.I.f8786a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1 function1, d dVar) {
        super(2, dVar);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, dVar);
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
            g context = getContext();
            PointerInputScope pointerInputScope = this.$this_detectMoves;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
