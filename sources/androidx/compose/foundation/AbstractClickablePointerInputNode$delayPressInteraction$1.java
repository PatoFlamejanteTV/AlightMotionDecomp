package androidx.compose.foundation;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AbstractClickablePointerInputNode$delayPressInteraction$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ AbstractClickablePointerInputNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickablePointerInputNode$delayPressInteraction$1(AbstractClickablePointerInputNode abstractClickablePointerInputNode) {
        super(0);
        this.this$0 = abstractClickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((Boolean) this.this$0.getCurrent(ScrollableKt.getModifierLocalScrollableContainer())).booleanValue() || Clickable_androidKt.isComposeRootInScrollableContainer(this.this$0));
    }
}
