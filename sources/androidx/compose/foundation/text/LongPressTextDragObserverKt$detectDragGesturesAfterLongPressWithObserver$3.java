package androidx.compose.foundation.text;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3 extends AbstractC3293z implements Function0 {
    final /* synthetic */ TextDragObserver $observer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDragGesturesAfterLongPressWithObserver$3(TextDragObserver textDragObserver) {
        super(0);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m865invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m865invoke() {
        this.$observer.onStop();
    }
}
