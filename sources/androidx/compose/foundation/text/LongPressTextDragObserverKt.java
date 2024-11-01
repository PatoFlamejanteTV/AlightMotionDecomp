package androidx.compose.foundation.text;

import Q5.I;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import n6.N;

/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {
    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d dVar) {
        Object e8 = N.e(new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(pointerInputScope, textDragObserver, null), dVar);
        if (e8 == b.e()) {
            return e8;
        }
        return I.f8786a;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d dVar) {
        Object detectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$5(textDragObserver), dVar);
        if (detectDragGesturesAfterLongPress == b.e()) {
            return detectDragGesturesAfterLongPress;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d dVar) {
        Object detectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new LongPressTextDragObserverKt$detectDragGesturesWithObserver$2(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$3(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$4(textDragObserver), new LongPressTextDragObserverKt$detectDragGesturesWithObserver$5(textDragObserver), dVar);
        if (detectDragGestures == b.e()) {
            return detectDragGestures;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, d dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(textDragObserver, null), dVar);
        if (awaitEachGesture == b.e()) {
            return awaitEachGesture;
        }
        return I.f8786a;
    }
}
