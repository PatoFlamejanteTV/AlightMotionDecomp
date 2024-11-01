package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ LayoutNodeSubcompositionsState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeSubcompositionsState$disposeUnusedSlotsInPostLookahead$1(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        super(1);
        this.this$0 = layoutNodeSubcompositionsState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<Object, SubcomposeLayoutState.PrecomposedSlotHandle> entry) {
        MutableVector mutableVector;
        boolean z8;
        int i8;
        Object key = entry.getKey();
        SubcomposeLayoutState.PrecomposedSlotHandle value = entry.getValue();
        mutableVector = this.this$0.postLookaheadComposedSlotIds;
        int indexOf = mutableVector.indexOf(key);
        if (indexOf >= 0) {
            i8 = this.this$0.currentPostLookaheadIndex;
            if (indexOf < i8) {
                z8 = false;
                return Boolean.valueOf(z8);
            }
        }
        value.dispose();
        z8 = true;
        return Boolean.valueOf(z8);
    }
}
