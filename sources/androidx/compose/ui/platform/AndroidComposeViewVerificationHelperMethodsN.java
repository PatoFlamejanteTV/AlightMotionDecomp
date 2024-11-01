package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.input.pointer.AndroidPointerIcon;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.input.pointer.PointerIcon;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(24)
/* loaded from: classes.dex */
final class AndroidComposeViewVerificationHelperMethodsN {
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(View view, PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        android.view.PointerIcon pointerIcon2;
        if (pointerIcon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else {
            systemIcon = pointerIcon instanceof AndroidPointerIconType ? android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType()) : android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        pointerIcon2 = view.getPointerIcon();
        if (!AbstractC3292y.d(pointerIcon2, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
