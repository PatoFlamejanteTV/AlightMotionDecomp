package androidx.navigation;

import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavDeepLink$isParameterizedQuery$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$isParameterizedQuery$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((this.this$0.getUriPattern() == null || Uri.parse(this.this$0.getUriPattern()).getQuery() == null) ? false : true);
    }
}
