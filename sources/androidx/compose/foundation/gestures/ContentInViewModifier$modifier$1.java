package androidx.compose.foundation.gestures;

import Q5.I;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ContentInViewModifier$modifier$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ContentInViewModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewModifier$modifier$1(ContentInViewModifier contentInViewModifier) {
        super(1);
        this.this$0 = contentInViewModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LayoutCoordinates) obj);
        return I.f8786a;
    }

    public final void invoke(LayoutCoordinates layoutCoordinates) {
        this.this$0.focusedChild = layoutCoordinates;
    }
}
