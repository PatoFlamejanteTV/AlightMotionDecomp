package androidx.compose.ui.window;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PopupLayout$canCalculatePosition$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ PopupLayout this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.this$0 = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        LayoutCoordinates parentLayoutCoordinates;
        parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
        return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m5414getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
