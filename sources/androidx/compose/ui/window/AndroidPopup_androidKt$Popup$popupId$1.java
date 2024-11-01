package androidx.compose.ui.window;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidPopup_androidKt$Popup$popupId$1 extends AbstractC3293z implements Function0 {
    public static final AndroidPopup_androidKt$Popup$popupId$1 INSTANCE = new AndroidPopup_androidKt$Popup$popupId$1();

    AndroidPopup_androidKt$Popup$popupId$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
