package androidx.compose.ui.input.pointer;

import Q5.I;
import Q5.s;
import U5.g;
import U5.h;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;
import n6.AbstractC3462k;
import n6.C3472p;
import n6.InterfaceC3470o;
import n6.InterfaceC3488x0;
import n6.O;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {
    public static final int $stable = 0;
    private long boundsSize;
    private PointerEvent currentEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> dispatchingPointerHandlers;
    private boolean interceptOutOfBoundsChildEvents;
    private PointerEvent lastPointerEvent;
    private final MutableVector<PointerEventHandlerCoroutine<?>> pointerHandlers;
    private InterfaceC2072n pointerInputHandler;
    private InterfaceC3488x0 pointerInputJob;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class PointerEventHandlerCoroutine<R> implements AwaitPointerEventScope, Density, U5.d {
        private final /* synthetic */ SuspendingPointerInputModifierNodeImpl $$delegate_0;
        private final U5.d completion;
        private InterfaceC3470o pointerAwaiter;
        private PointerEventPass awaitPass = PointerEventPass.Main;
        private final g context = h.f10149a;

        public PointerEventHandlerCoroutine(U5.d dVar) {
            this.completion = dVar;
            this.$$delegate_0 = SuspendingPointerInputModifierNodeImpl.this;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public Object awaitPointerEvent(PointerEventPass pointerEventPass, U5.d dVar) {
            C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
            c3472p.B();
            this.awaitPass = pointerEventPass;
            this.pointerAwaiter = c3472p;
            Object y8 = c3472p.y();
            if (y8 == V5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return y8;
        }

        public final void cancel(Throwable th) {
            InterfaceC3470o interfaceC3470o = this.pointerAwaiter;
            if (interfaceC3470o != null) {
                interfaceC3470o.t(th);
            }
            this.pointerAwaiter = null;
        }

        @Override // U5.d
        public g getContext() {
            return this.context;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public PointerEvent getCurrentEvent() {
            return SuspendingPointerInputModifierNodeImpl.this.currentEvent;
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.$$delegate_0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo3904getExtendedTouchPaddingNHjbRc() {
            return SuspendingPointerInputModifierNodeImpl.this.mo4018getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float getFontScale() {
            return this.$$delegate_0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* renamed from: getSize-YbymL2g */
        public long mo3905getSizeYbymL2g() {
            return SuspendingPointerInputModifierNodeImpl.this.boundsSize;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        public ViewConfiguration getViewConfiguration() {
            return SuspendingPointerInputModifierNodeImpl.this.getViewConfiguration();
        }

        public final void offerPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
            InterfaceC3470o interfaceC3470o;
            if (pointerEventPass == this.awaitPass && (interfaceC3470o = this.pointerAwaiter) != null) {
                this.pointerAwaiter = null;
                interfaceC3470o.resumeWith(s.b(pointerEvent));
            }
        }

        @Override // U5.d
        public void resumeWith(Object obj) {
            MutableVector mutableVector = SuspendingPointerInputModifierNodeImpl.this.pointerHandlers;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.pointerHandlers.remove(this);
                I i8 = I.f8786a;
            }
            this.completion.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx--R2X_6o */
        public int mo418roundToPxR2X_6o(long j8) {
            return this.$$delegate_0.mo418roundToPxR2X_6o(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: roundToPx-0680j_4 */
        public int mo419roundToPx0680j_4(float f8) {
            return this.$$delegate_0.mo419roundToPx0680j_4(f8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toDp-GaN1DYA */
        public float mo420toDpGaN1DYA(long j8) {
            return this.$$delegate_0.mo420toDpGaN1DYA(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo421toDpu2uoSUM(float f8) {
            return this.$$delegate_0.mo421toDpu2uoSUM(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDpSize-k-rfVVM */
        public long mo423toDpSizekrfVVM(long j8) {
            return this.$$delegate_0.mo423toDpSizekrfVVM(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx--R2X_6o */
        public float mo424toPxR2X_6o(long j8) {
            return this.$$delegate_0.mo424toPxR2X_6o(j8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toPx-0680j_4 */
        public float mo425toPx0680j_4(float f8) {
            return this.$$delegate_0.mo425toPx0680j_4(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        public Rect toRect(DpRect dpRect) {
            return this.$$delegate_0.toRect(dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSize-XkaWNTQ */
        public long mo426toSizeXkaWNTQ(long j8) {
            return this.$$delegate_0.mo426toSizeXkaWNTQ(j8);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        @Stable
        /* renamed from: toSp-0xMU5do */
        public long mo427toSp0xMU5do(float f8) {
            return this.$$delegate_0.mo427toSp0xMU5do(f8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo428toSpkPz2Gy4(float f8) {
            return this.$$delegate_0.mo428toSpkPz2Gy4(f8);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [n6.x0] */
        /* JADX WARN: Type inference failed for: r11v3, types: [n6.x0] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r13v0, types: [c6.n] */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeout(long r11, c6.InterfaceC2072n r13, U5.d r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$1
                r0.<init>(r10, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r11 = r0.L$0
                n6.x0 r11 = (n6.InterfaceC3488x0) r11
                Q5.t.b(r14)     // Catch: java.lang.Throwable -> L2d
                goto L75
            L2d:
                r12 = move-exception
                goto L7b
            L2f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L37:
                Q5.t.b(r14)
                r4 = 0
                int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r14 > 0) goto L56
                n6.o r14 = r10.pointerAwaiter
                if (r14 == 0) goto L56
                Q5.s$a r2 = Q5.s.f8810b
                androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException r2 = new androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException
                r2.<init>(r11)
                java.lang.Object r2 = Q5.t.a(r2)
                java.lang.Object r2 = Q5.s.b(r2)
                r14.resumeWith(r2)
            L56:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl r14 = androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.this
                n6.M r4 = r14.getCoroutineScope()
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1 r7 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1
                r14 = 0
                r7.<init>(r11, r10, r14)
                r8 = 3
                r9 = 0
                r5 = 0
                r6 = 0
                n6.x0 r11 = n6.AbstractC3458i.d(r4, r5, r6, r7, r8, r9)
                r0.L$0 = r11     // Catch: java.lang.Throwable -> L2d
                r0.label = r3     // Catch: java.lang.Throwable -> L2d
                java.lang.Object r14 = r13.invoke(r10, r0)     // Catch: java.lang.Throwable -> L2d
                if (r14 != r1) goto L75
                return r1
            L75:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r12 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r12)
                return r14
            L7b:
                androidx.compose.ui.input.pointer.CancelTimeoutCancellationException r13 = androidx.compose.ui.input.pointer.CancelTimeoutCancellationException.INSTANCE
                r11.cancel(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeout(long, c6.n, U5.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, c6.InterfaceC2072n r7, U5.d r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                if (r0 == 0) goto L13
                r0 = r8
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1 r0 = new androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeoutOrNull$1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Q5.t.b(r8)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                goto L3e
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                Q5.t.b(r8)
                r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                java.lang.Object r8 = r4.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L3d
                if (r8 != r1) goto L3e
                return r1
            L3d:
                r8 = 0
            L3e:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine.withTimeoutOrNull(long, c6.n, U5.d):java.lang.Object");
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toDp-u2uoSUM */
        public float mo422toDpu2uoSUM(int i8) {
            return this.$$delegate_0.mo422toDpu2uoSUM(i8);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* renamed from: toSp-kPz2Gy4 */
        public long mo429toSpkPz2Gy4(int i8) {
            return this.$$delegate_0.mo429toSpkPz2Gy4(i8);
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SuspendingPointerInputModifierNodeImpl(InterfaceC2072n interfaceC2072n) {
        PointerEvent pointerEvent;
        this.pointerInputHandler = interfaceC2072n;
        pointerEvent = SuspendingPointerInputFilterKt.EmptyPointerEvent;
        this.currentEvent = pointerEvent;
        this.pointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.dispatchingPointerHandlers = new MutableVector<>(new PointerEventHandlerCoroutine[16], 0);
        this.boundsSize = IntSize.Companion.m5326getZeroYbymL2g();
    }

    private final void dispatchPointerEvent(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
            mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
        }
        try {
            int i8 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                    int i9 = size - 1;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector.getContent();
                    do {
                        content[i9].offerPointerEvent(pointerEvent, pointerEventPass);
                        i9--;
                    } while (i9 >= 0);
                }
            } else {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content2 = mutableVector3.getContent();
                    int i10 = 0;
                    do {
                        content2[i10].offerPointerEvent(pointerEvent, pointerEventPass);
                        i10++;
                    } while (i10 < size2);
                }
            }
        } finally {
            this.dispatchingPointerHandlers.clear();
        }
    }

    private final void forEachCurrentPointerHandler(PointerEventPass pointerEventPass, Function1 function1) {
        MutableVector<PointerEventHandlerCoroutine<?>> mutableVector;
        int size;
        synchronized (this.pointerHandlers) {
            try {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector2 = this.dispatchingPointerHandlers;
                mutableVector2.addAll(mutableVector2.getSize(), this.pointerHandlers);
                AbstractC3290w.b(1);
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
        AbstractC3290w.a(1);
        try {
            int i8 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3 && (size = (mutableVector = this.dispatchingPointerHandlers).getSize()) > 0) {
                    int i9 = size - 1;
                    PointerEventHandlerCoroutine<?>[] content = mutableVector.getContent();
                    do {
                        function1.invoke(content[i9]);
                        i9--;
                    } while (i9 >= 0);
                }
            } else {
                MutableVector<PointerEventHandlerCoroutine<?>> mutableVector3 = this.dispatchingPointerHandlers;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    PointerEventHandlerCoroutine<?>[] content2 = mutableVector3.getContent();
                    int i10 = 0;
                    do {
                        function1.invoke(content2[i10]);
                        i10++;
                    } while (i10 < size2);
                }
            }
        } finally {
            AbstractC3290w.b(1);
            this.dispatchingPointerHandlers.clear();
            AbstractC3290w.a(1);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public <R> Object awaitPointerEventScope(InterfaceC2072n interfaceC2072n, U5.d dVar) {
        C3472p c3472p = new C3472p(V5.b.c(dVar), 1);
        c3472p.B();
        PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(c3472p);
        synchronized (this.pointerHandlers) {
            this.pointerHandlers.add(pointerEventHandlerCoroutine);
            U5.d a9 = U5.f.a(interfaceC2072n, pointerEventHandlerCoroutine, pointerEventHandlerCoroutine);
            s.a aVar = s.f8810b;
            a9.resumeWith(s.b(I.f8786a));
        }
        c3472p.f(new SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
        Object y8 = c3472p.y();
        if (y8 == V5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return y8;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo4018getExtendedTouchPaddingNHjbRc() {
        long mo426toSizeXkaWNTQ = mo426toSizeXkaWNTQ(getViewConfiguration().mo4233getMinimumTouchTargetSizeMYxV2XQ());
        long mo4019getSizeYbymL2g = mo4019getSizeYbymL2g();
        return SizeKt.Size(Math.max(0.0f, Size.m2781getWidthimpl(mo426toSizeXkaWNTQ) - IntSize.m5321getWidthimpl(mo4019getSizeYbymL2g)) / 2.0f, Math.max(0.0f, Size.m2778getHeightimpl(mo426toSizeXkaWNTQ) - IntSize.m5320getHeightimpl(mo4019getSizeYbymL2g)) / 2.0f);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public InterfaceC2072n getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* renamed from: getSize-YbymL2g */
    public long mo4019getSizeYbymL2g() {
        return this.boundsSize;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return androidx.compose.ui.node.f.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.lastPointerEvent;
        if (pointerEvent == null) {
            return;
        }
        int size = pointerEvent.getChanges().size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!(!r2.get(i8).getPressed())) {
                List<PointerInputChange> changes = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes.size());
                int size2 = changes.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    PointerInputChange pointerInputChange = changes.get(i9);
                    arrayList.add(new PointerInputChange(pointerInputChange.m3991getIdJ3iCeTQ(), pointerInputChange.getUptimeMillis(), pointerInputChange.m3993getPositionF1C5BW0(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.m3993getPositionF1C5BW0(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (AbstractC3284p) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.currentEvent = pointerEvent2;
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Initial);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Main);
                dispatchPointerEvent(pointerEvent2, PointerEventPass.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo242onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j8) {
        InterfaceC3488x0 d8;
        this.boundsSize = j8;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            d8 = AbstractC3462k.d(getCoroutineScope(), null, O.UNDISPATCHED, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1, null);
            this.pointerInputJob = d8;
        }
        dispatchPointerEvent(pointerEvent, pointerEventPass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i8))) {
                    break;
                } else {
                    i8++;
                }
            } else {
                z8 = true;
                break;
            }
        }
        if (!(!z8)) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        InterfaceC3488x0 interfaceC3488x0 = this.pointerInputJob;
        if (interfaceC3488x0 != null) {
            interfaceC3488x0.cancel(new PointerInputResetException());
            this.pointerInputJob = null;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx--R2X_6o */
    public /* synthetic */ int mo418roundToPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: roundToPx-0680j_4 */
    public /* synthetic */ int mo419roundToPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.b(this, f8);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z8) {
        this.interceptOutOfBoundsChildEvents = z8;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(InterfaceC2072n interfaceC2072n) {
        resetPointerInputHandler();
        this.pointerInputHandler = interfaceC2072n;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return androidx.compose.ui.node.f.d(this);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toDp-GaN1DYA */
    public /* synthetic */ float mo420toDpGaN1DYA(long j8) {
        return androidx.compose.ui.unit.b.a(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo421toDpu2uoSUM(float f8) {
        return androidx.compose.ui.unit.a.c(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDpSize-k-rfVVM */
    public /* synthetic */ long mo423toDpSizekrfVVM(long j8) {
        return androidx.compose.ui.unit.a.e(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx--R2X_6o */
    public /* synthetic */ float mo424toPxR2X_6o(long j8) {
        return androidx.compose.ui.unit.a.f(this, j8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toPx-0680j_4 */
    public /* synthetic */ float mo425toPx0680j_4(float f8) {
        return androidx.compose.ui.unit.a.g(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    public /* synthetic */ Rect toRect(DpRect dpRect) {
        return androidx.compose.ui.unit.a.h(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSize-XkaWNTQ */
    public /* synthetic */ long mo426toSizeXkaWNTQ(long j8) {
        return androidx.compose.ui.unit.a.i(this, j8);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* renamed from: toSp-0xMU5do */
    public /* synthetic */ long mo427toSp0xMU5do(float f8) {
        return androidx.compose.ui.unit.b.b(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo428toSpkPz2Gy4(float f8) {
        return androidx.compose.ui.unit.a.j(this, f8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toDp-u2uoSUM */
    public /* synthetic */ float mo422toDpu2uoSUM(int i8) {
        return androidx.compose.ui.unit.a.d(this, i8);
    }

    @Override // androidx.compose.ui.unit.Density
    /* renamed from: toSp-kPz2Gy4 */
    public /* synthetic */ long mo429toSpkPz2Gy4(int i8) {
        return androidx.compose.ui.unit.a.k(this, i8);
    }
}
