package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {59, 61}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformGestureDetectorKt$detectTransformGestures$2 extends k implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2074p $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z8, InterfaceC2074p interfaceC2074p, U5.d dVar) {
        super(2, dVar);
        this.$panZoomLock = z8;
        this.$onGesture = interfaceC2074p;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, dVar);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, U5.d dVar) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create(awaitPointerEventScope, dVar)).invokeSuspend(I.f8786a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:            if (androidx.compose.ui.geometry.Offset.m2709equalsimpl0(r11, androidx.compose.ui.geometry.Offset.Companion.m2728getZeroF1C5BW0()) == false) goto L56;     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009e -> B:6:0x00a1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
