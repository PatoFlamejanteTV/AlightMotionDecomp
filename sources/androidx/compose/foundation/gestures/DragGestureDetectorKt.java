package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.S;

/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final PointerDirectionConfig HorizontalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$HorizontalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: crossAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo380crossAxisDeltak4lQ0M(long j8) {
            return Offset.m2713getYimpl(j8);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: mainAxisDelta-k-4lQ0M, reason: not valid java name */
        public float mo381mainAxisDeltak4lQ0M(long j8) {
            return Offset.m2712getXimpl(j8);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: offsetFromChanges-dBAh8RU, reason: not valid java name */
        public long mo382offsetFromChangesdBAh8RU(float f8, float f9) {
            return OffsetKt.Offset(f8, f9);
        }
    };
    private static final PointerDirectionConfig VerticalPointerDirectionConfig = new PointerDirectionConfig() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$VerticalPointerDirectionConfig$1
        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: crossAxisDelta-k-4lQ0M */
        public float mo380crossAxisDeltak4lQ0M(long j8) {
            return Offset.m2712getXimpl(j8);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: mainAxisDelta-k-4lQ0M */
        public float mo381mainAxisDeltak4lQ0M(long j8) {
            return Offset.m2713getYimpl(j8);
        }

        @Override // androidx.compose.foundation.gestures.PointerDirectionConfig
        /* renamed from: offsetFromChanges-dBAh8RU */
        public long mo382offsetFromChangesdBAh8RU(float f8, float f9) {
            return OffsetKt.Offset(f9, f8);
        }
    };
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m5155constructorimpl = Dp.m5155constructorimpl((float) 0.125d);
        mouseSlop = m5155constructorimpl;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(18);
        defaultTouchSlop = m5155constructorimpl2;
        mouseToTouchSlopRatio = m5155constructorimpl / m5155constructorimpl2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:            if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m360awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, U5.d r20) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m360awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, U5.d):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m361awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j8, Function1 function1, U5.d dVar) {
        PointerInputChange pointerInputChange;
        S s8 = new S();
        s8.f34572a = j8;
        while (true) {
            int i8 = 0;
            AbstractC3290w.c(0);
            PointerInputChange pointerInputChange2 = null;
            Object t8 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, dVar, 1, null);
            AbstractC3290w.c(1);
            PointerEvent pointerEvent = (PointerEvent) t8;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    pointerInputChange = changes.get(i9);
                    if (Boolean.valueOf(PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), s8.f34572a)).booleanValue()) {
                        break;
                    }
                    i9++;
                } else {
                    pointerInputChange = null;
                    break;
                }
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i8 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i8);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange2 = pointerInputChange4;
                        break;
                    }
                    i8++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange2;
                if (pointerInputChange5 == null) {
                    return pointerInputChange3;
                }
                s8.f34572a = pointerInputChange5.m3991getIdJ3iCeTQ();
            } else if (((Boolean) function1.invoke(pointerInputChange3)).booleanValue()) {
                return pointerInputChange3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:            if ((r9 ^ 1) != 0) goto L50;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m362awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, U5.d r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m362awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0143 -> B:14:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01a3 -> B:11:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01ed -> B:14:0x014f). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m363awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, c6.InterfaceC2072n r25, U5.d r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m363awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014b -> B:15:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ac -> B:11:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01f7 -> B:14:0x01be). Please report as a decompilation issue!!! */
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m364awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, c6.InterfaceC2072n r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m364awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m365awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, U5.d r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.internal.T r9 = (kotlin.jvm.internal.T) r9
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            Q5.t.b(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L33
            goto La7
        L33:
            goto L9e
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            Q5.t.b(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m377isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4b
            return r4
        L4b:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            int r2 = r12.size()
            r5 = 0
        L58:
            if (r5 >= r2) goto L6f
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m3991getIdJ3iCeTQ()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m3975equalsimpl0(r7, r10)
            if (r7 == 0) goto L6c
            goto L70
        L6c:
            int r5 = r5 + 1
            goto L58
        L6f:
            r6 = r4
        L70:
            r10 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r10 = (androidx.compose.ui.input.pointer.PointerInputChange) r10
            if (r10 != 0) goto L76
            return r4
        L76:
            kotlin.jvm.internal.T r11 = new kotlin.jvm.internal.T
            r11.<init>()
            kotlin.jvm.internal.T r12 = new kotlin.jvm.internal.T
            r12.<init>()
            r12.f34573a = r10
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r2 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r2.<init>(r12, r11, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.L$0 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.L$1 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            java.lang.Object r9 = r9.withTimeout(r5, r2, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L9c
            if (r9 != r1) goto La7
            return r1
        L9c:
            r9 = r11
        L9e:
            java.lang.Object r9 = r9.f34573a
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto La6
            r4 = r10
            goto La7
        La6:
            r4 = r9
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m365awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0148 -> B:13:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x01a8 -> B:11:0x01ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01ea -> B:14:0x00b6). Please report as a decompilation issue!!! */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m366awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, int r23, androidx.compose.foundation.gestures.PointerDirectionConfig r24, boolean r25, c6.InterfaceC2072n r26, U5.d r27) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m366awaitPointerSlopOrCancellationwtdNQyU(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, c6.n, U5.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$$forInline, reason: not valid java name */
    private static final Object m367awaitPointerSlopOrCancellationwtdNQyU$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j8, int i8, PointerDirectionConfig pointerDirectionConfig, boolean z8, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        float f8;
        PointerInputChange pointerInputChange;
        float m2710getDistanceimpl;
        long m2716minusMKHz9U;
        PointerInputChange pointerInputChange2;
        if (m377isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j8)) {
            return null;
        }
        float m378pointerSlopE8SPZFQ = m378pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i8);
        S s8 = new S();
        s8.f34572a = j8;
        float f9 = 0.0f;
        float f10 = 0.0f;
        while (true) {
            AbstractC3290w.c(0);
            Object t8 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, dVar, 1, null);
            AbstractC3290w.c(1);
            PointerEvent pointerEvent = (PointerEvent) t8;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    pointerInputChange = changes.get(i9);
                    f8 = f9;
                    if (Boolean.valueOf(PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), s8.f34572a)).booleanValue()) {
                        break;
                    }
                    i9++;
                    f9 = f8;
                } else {
                    f8 = f9;
                    pointerInputChange = null;
                    break;
                }
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size2) {
                        pointerInputChange2 = changes2.get(i10);
                        if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                            break;
                        }
                        i10++;
                    } else {
                        pointerInputChange2 = null;
                        break;
                    }
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                s8.f34572a = pointerInputChange4.m3991getIdJ3iCeTQ();
            } else {
                long m3993getPositionF1C5BW0 = pointerInputChange3.m3993getPositionF1C5BW0();
                long m3994getPreviousPositionF1C5BW0 = pointerInputChange3.m3994getPreviousPositionF1C5BW0();
                float mo381mainAxisDeltak4lQ0M = f8 + (pointerDirectionConfig.mo381mainAxisDeltak4lQ0M(m3993getPositionF1C5BW0) - pointerDirectionConfig.mo381mainAxisDeltak4lQ0M(m3994getPreviousPositionF1C5BW0));
                f10 += pointerDirectionConfig.mo380crossAxisDeltak4lQ0M(m3993getPositionF1C5BW0) - pointerDirectionConfig.mo380crossAxisDeltak4lQ0M(m3994getPreviousPositionF1C5BW0);
                if (z8) {
                    m2710getDistanceimpl = Math.abs(mo381mainAxisDeltak4lQ0M);
                } else {
                    m2710getDistanceimpl = Offset.m2710getDistanceimpl(pointerDirectionConfig.mo382offsetFromChangesdBAh8RU(mo381mainAxisDeltak4lQ0M, f10));
                }
                if (m2710getDistanceimpl < m378pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    AbstractC3290w.c(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
                    AbstractC3290w.c(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f8 = mo381mainAxisDeltak4lQ0M;
                } else {
                    if (z8) {
                        m2716minusMKHz9U = pointerDirectionConfig.mo382offsetFromChangesdBAh8RU(mo381mainAxisDeltak4lQ0M - (Math.signum(mo381mainAxisDeltak4lQ0M) * m378pointerSlopE8SPZFQ), f10);
                    } else {
                        long mo382offsetFromChangesdBAh8RU = pointerDirectionConfig.mo382offsetFromChangesdBAh8RU(mo381mainAxisDeltak4lQ0M, f10);
                        m2716minusMKHz9U = Offset.m2716minusMKHz9U(mo382offsetFromChangesdBAh8RU, Offset.m2719timestuRUvjQ(Offset.m2707divtuRUvjQ(mo382offsetFromChangesdBAh8RU, m2710getDistanceimpl), m378pointerSlopE8SPZFQ));
                    }
                    interfaceC2072n.invoke(pointerInputChange3, Offset.m2701boximpl(m2716minusMKHz9U));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f10 = 0.0f;
                    f8 = 0.0f;
                    f9 = f8;
                }
            }
            f9 = f8;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:            if (r3 == false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:            r9 = r2.mo382offsetFromChangesdBAh8RU(r10 - (java.lang.Math.signum(r10) * r23), r11);        r5 = r23;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:            r24.invoke(r4, androidx.compose.ui.geometry.Offset.m2701boximpl(r9));     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:            if (r4.isConsumed() == false) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:            return r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:            r9 = r2.mo382offsetFromChangesdBAh8RU(r10, r11);        r11 = androidx.compose.ui.geometry.Offset.m2707divtuRUvjQ(r9, r5);        r5 = r23;        r9 = androidx.compose.ui.geometry.Offset.m2716minusMKHz9U(r9, androidx.compose.ui.geometry.Offset.m2719timestuRUvjQ(r11, r5));     */
    /* renamed from: awaitPointerSlopOrCancellation-wtdNQyU$default, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object m368awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, long r19, int r21, androidx.compose.foundation.gestures.PointerDirectionConfig r22, boolean r23, c6.InterfaceC2072n r24, U5.d r25, int r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m368awaitPointerSlopOrCancellationwtdNQyU$default(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.PointerDirectionConfig, boolean, c6.n, U5.d, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014e -> B:15:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b2 -> B:11:0x01bb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01fc -> B:14:0x01c5). Please report as a decompilation issue!!! */
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m369awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r20, long r21, c6.InterfaceC2072n r23, U5.d r24) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m369awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d6, code lost:            if ((r9 ^ 1) != 0) goto L50;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m370awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, U5.d r20) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m370awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0143 -> B:14:0x014f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01a3 -> B:11:0x01af). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01ed -> B:14:0x014f). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m371awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, c6.InterfaceC2072n r25, U5.d r26) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m371awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, c6.n, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x014b -> B:15:0x00b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ac -> B:11:0x01b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x01f7 -> B:14:0x01be). Please report as a decompilation issue!!! */
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m372awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, c6.InterfaceC2072n r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m372awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, c6.n, U5.d):java.lang.Object");
    }

    public static final Object detectDragGestures(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$5(function1, interfaceC2072n, function02, function0, null), dVar);
        if (awaitEachGesture == V5.b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i8 & 2) != 0) {
            function0 = DragGestureDetectorKt$detectDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i8 & 4) != 0) {
            function02 = DragGestureDetectorKt$detectDragGestures$4.INSTANCE;
        }
        return detectDragGestures(pointerInputScope, function12, function03, function02, interfaceC2072n, dVar);
    }

    public static final Object detectDragGesturesAfterLongPress(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(function1, function0, function02, interfaceC2072n, null), dVar);
        if (awaitEachGesture == V5.b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i8 & 2) != 0) {
            function0 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i8 & 4) != 0) {
            function02 = DragGestureDetectorKt$detectDragGesturesAfterLongPress$4.INSTANCE;
        }
        return detectDragGesturesAfterLongPress(pointerInputScope, function12, function03, function02, interfaceC2072n, dVar);
    }

    public static final Object detectHorizontalDragGestures(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(function1, interfaceC2072n, function0, function02, null), dVar);
        if (awaitEachGesture == V5.b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = DragGestureDetectorKt$detectHorizontalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i8 & 2) != 0) {
            function0 = DragGestureDetectorKt$detectHorizontalDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i8 & 4) != 0) {
            function02 = DragGestureDetectorKt$detectHorizontalDragGestures$4.INSTANCE;
        }
        return detectHorizontalDragGestures(pointerInputScope, function12, function03, function02, interfaceC2072n, dVar);
    }

    public static final Object detectVerticalDragGestures(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(function1, interfaceC2072n, function0, function02, null), dVar);
        if (awaitEachGesture == V5.b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function0 function0, Function0 function02, InterfaceC2072n interfaceC2072n, U5.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            function1 = DragGestureDetectorKt$detectVerticalDragGestures$2.INSTANCE;
        }
        Function1 function12 = function1;
        if ((i8 & 2) != 0) {
            function0 = DragGestureDetectorKt$detectVerticalDragGestures$3.INSTANCE;
        }
        Function0 function03 = function0;
        if ((i8 & 4) != 0) {
            function02 = DragGestureDetectorKt$detectVerticalDragGestures$4.INSTANCE;
        }
        return detectVerticalDragGestures(pointerInputScope, function12, function03, function02, interfaceC2072n, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:            if ((!r13) != false) goto L53;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008d -> B:10:0x0093). Please report as a decompilation issue!!! */
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m373dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, kotlin.jvm.functions.Function1 r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function1 r24, U5.d r25) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m373dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m374dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j8, Function1 function1, Function1 function12, Function1 function13, U5.d dVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j9 = j8;
        if (m377isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j9)) {
            return null;
        }
        while (true) {
            S s8 = new S();
            s8.f34572a = j9;
            while (true) {
                int i8 = 0;
                AbstractC3290w.c(0);
                Object t8 = androidx.compose.ui.input.pointer.b.t(awaitPointerEventScope, null, dVar, 1, null);
                AbstractC3290w.c(1);
                PointerEvent pointerEvent = (PointerEvent) t8;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        pointerInputChange = changes.get(i9);
                        if (Boolean.valueOf(PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), s8.f34572a)).booleanValue()) {
                            break;
                        }
                        i9++;
                    } else {
                        pointerInputChange = null;
                        break;
                    }
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != null) {
                    if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        while (true) {
                            if (i8 < size2) {
                                pointerInputChange3 = changes2.get(i8);
                                if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                                    break;
                                }
                                i8++;
                            } else {
                                pointerInputChange3 = null;
                                break;
                            }
                        }
                        PointerInputChange pointerInputChange4 = pointerInputChange3;
                        if (pointerInputChange4 == null) {
                            break;
                        }
                        s8.f34572a = pointerInputChange4.m3991getIdJ3iCeTQ();
                    } else {
                        if (((Number) function12.invoke(pointerInputChange2)).floatValue() == 0.0f) {
                            i8 = 1;
                        }
                        if (Boolean.valueOf(i8 ^ 1).booleanValue()) {
                            break;
                        }
                    }
                } else {
                    pointerInputChange2 = null;
                    break;
                }
            }
            if (pointerInputChange2 == null || ((Boolean) function13.invoke(pointerInputChange2)).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            function1.invoke(pointerInputChange2);
            j9 = pointerInputChange2.m3991getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m375dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, kotlin.jvm.functions.Function1 r7, U5.d r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            Q5.t.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            Q5.t.b(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m360awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m3991getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m375dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    public static final PointerDirectionConfig getHorizontalPointerDirectionConfig() {
        return HorizontalPointerDirectionConfig;
    }

    public static final PointerDirectionConfig getVerticalPointerDirectionConfig() {
        return VerticalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:            if ((!r0) != false) goto L52;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0079 -> B:10:0x007e). Please report as a decompilation issue!!! */
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m376horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.jvm.functions.Function1 r20, U5.d r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m376horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m377isPointerUpDmW0f2w(PointerEvent pointerEvent, long j8) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z8 = false;
        int i8 = 0;
        while (true) {
            if (i8 < size) {
                pointerInputChange = changes.get(i8);
                if (PointerId.m3975equalsimpl0(pointerInputChange.m3991getIdJ3iCeTQ(), j8)) {
                    break;
                }
                i8++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z8 = true;
        }
        return true ^ z8;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m378pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i8) {
        AbstractC3292y.i(pointerSlop, "$this$pointerSlop");
        if (PointerType.m4054equalsimpl0(i8, PointerType.Companion.m4059getMouseT8wyACA())) {
            return pointerSlop.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return pointerSlop.getTouchSlop();
    }

    public static final PointerDirectionConfig toPointerDirectionConfig(Orientation orientation) {
        AbstractC3292y.i(orientation, "<this>");
        if (orientation == Orientation.Vertical) {
            return VerticalPointerDirectionConfig;
        }
        return HorizontalPointerDirectionConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ea, code lost:            if ((!r0) != false) goto L52;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0079 -> B:10:0x007e). Please report as a decompilation issue!!! */
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m379verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, kotlin.jvm.functions.Function1 r20, U5.d r21) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m379verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }
}
