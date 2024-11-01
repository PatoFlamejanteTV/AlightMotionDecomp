package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper24 {
    public static final RenderNodeVerificationHelper24 INSTANCE = new RenderNodeVerificationHelper24();

    private RenderNodeVerificationHelper24() {
    }

    @DoNotInline
    public final void discardDisplayList(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
