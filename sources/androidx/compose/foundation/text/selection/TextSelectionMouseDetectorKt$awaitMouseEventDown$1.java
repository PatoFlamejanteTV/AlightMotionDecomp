package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt", f = "TextSelectionMouseDetector.kt", l = {125}, m = "awaitMouseEventDown")
/* loaded from: classes.dex */
public final class TextSelectionMouseDetectorKt$awaitMouseEventDown$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TextSelectionMouseDetectorKt$awaitMouseEventDown$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object awaitMouseEventDown;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitMouseEventDown = TextSelectionMouseDetectorKt.awaitMouseEventDown(null, this);
        return awaitMouseEventDown;
    }
}
