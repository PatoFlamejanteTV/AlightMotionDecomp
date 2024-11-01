package androidx.compose.material3.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PopupLayout$canCalculatePosition$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((this.this$0.getParentBounds() == null || this.this$0.m1935getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
