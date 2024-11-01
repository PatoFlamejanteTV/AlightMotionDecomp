package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$getMatchingArguments$missingRequiredArguments$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Bundle $bundle;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$getMatchingArguments$missingRequiredArguments$1(Bundle bundle) {
        super(1);
        this.$bundle = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String argName) {
        AbstractC3292y.i(argName, "argName");
        return Boolean.valueOf(!this.$bundle.containsKey(argName));
    }
}
