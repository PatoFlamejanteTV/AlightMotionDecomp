package androidx.navigation;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavDeepLink$mimeTypePattern$2 extends AbstractC3293z implements Function0 {
    final /* synthetic */ NavDeepLink this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavDeepLink$mimeTypePattern$2(NavDeepLink navDeepLink) {
        super(0);
        this.this$0 = navDeepLink;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pattern invoke() {
        String str;
        str = this.this$0.mimeTypeRegex;
        if (str != null) {
            return Pattern.compile(str);
        }
        return null;
    }
}
