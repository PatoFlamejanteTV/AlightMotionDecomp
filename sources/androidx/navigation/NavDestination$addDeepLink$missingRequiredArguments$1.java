package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDestination$addDeepLink$missingRequiredArguments$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ NavDeepLink $navDeepLink;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDestination$addDeepLink$missingRequiredArguments$1(NavDeepLink navDeepLink) {
        super(1);
        this.$navDeepLink = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String key) {
        AbstractC3292y.i(key, "key");
        return Boolean.valueOf(!this.$navDeepLink.getArgumentsNames$navigation_common_release().contains(key));
    }
}
