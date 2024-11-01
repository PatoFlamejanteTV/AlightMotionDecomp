package androidx.compose.ui.window;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class PopupLayout$Companion$onCommitAffectingPopupPosition$1 extends AbstractC3293z implements Function1 {
    public static final PopupLayout$Companion$onCommitAffectingPopupPosition$1 INSTANCE = new PopupLayout$Companion$onCommitAffectingPopupPosition$1();

    PopupLayout$Companion$onCommitAffectingPopupPosition$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PopupLayout) obj);
        return I.f8786a;
    }

    public final void invoke(PopupLayout popupLayout) {
        if (popupLayout.isAttachedToWindow()) {
            popupLayout.updatePosition();
        }
    }
}
