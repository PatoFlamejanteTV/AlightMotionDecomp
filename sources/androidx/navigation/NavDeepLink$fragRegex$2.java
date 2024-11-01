package androidx.navigation;

import Q5.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$fragRegex$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$fragRegex$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        r fragArgsAndRegex;
        fragArgsAndRegex = this.this$0.getFragArgsAndRegex();
        if (fragArgsAndRegex != null) {
            return (String) fragArgsAndRegex.d();
        }
        return null;
    }
}
