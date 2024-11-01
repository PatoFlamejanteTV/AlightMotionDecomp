package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavController$restoreStateInternal$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ String $backStackId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$restoreStateInternal$1(String str) {
        super(1);
        this.$backStackId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        return Boolean.valueOf(AbstractC3292y.d(str, this.$backStackId));
    }
}
