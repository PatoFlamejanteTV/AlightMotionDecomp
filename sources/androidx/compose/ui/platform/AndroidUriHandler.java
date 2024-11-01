package androidx.compose.ui.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidUriHandler implements UriHandler {
    public static final int $stable = 8;
    private final Context context;

    public AndroidUriHandler(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(String str) {
        this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }
}
