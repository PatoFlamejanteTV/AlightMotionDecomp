package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class SidecarAdapter$translate$checkedFeature$3 extends AbstractC3293z implements Function1 {
    public static final SidecarAdapter$translate$checkedFeature$3 INSTANCE = new SidecarAdapter$translate$checkedFeature$3();

    SidecarAdapter$translate$checkedFeature$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SidecarDisplayFeature require) {
        AbstractC3292y.i(require, "$this$require");
        boolean z8 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
