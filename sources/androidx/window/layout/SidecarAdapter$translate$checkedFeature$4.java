package androidx.window.layout;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class SidecarAdapter$translate$checkedFeature$4 extends AbstractC3293z implements Function1 {
    public static final SidecarAdapter$translate$checkedFeature$4 INSTANCE = new SidecarAdapter$translate$checkedFeature$4();

    SidecarAdapter$translate$checkedFeature$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(SidecarDisplayFeature require) {
        AbstractC3292y.i(require, "$this$require");
        return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
    }
}
