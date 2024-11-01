package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "emit")
/* loaded from: classes.dex */
public final class SwipeableState$snapTo$2$emit$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState$snapTo$2 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableState$snapTo$2$emit$1(SwipeableState$snapTo$2 swipeableState$snapTo$2, U5.d dVar) {
        super(dVar);
        this.this$0 = swipeableState$snapTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (U5.d) this);
    }
}
