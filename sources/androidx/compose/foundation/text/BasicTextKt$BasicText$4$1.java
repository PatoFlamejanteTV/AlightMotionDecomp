package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BasicTextKt$BasicText$4$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ MutableState<List<Rect>> $measuredPlaceholderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$4$1(MutableState<List<Rect>> mutableState) {
        super(0);
        this.$measuredPlaceholderPositions = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<Rect> invoke() {
        return this.$measuredPlaceholderPositions.getValue();
    }
}
