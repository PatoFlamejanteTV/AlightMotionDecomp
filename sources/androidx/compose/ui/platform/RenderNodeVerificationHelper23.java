package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper23 {
    public static final RenderNodeVerificationHelper23 INSTANCE = new RenderNodeVerificationHelper23();

    private RenderNodeVerificationHelper23() {
    }

    @DoNotInline
    public final void destroyDisplayListData(RenderNode renderNode) {
        renderNode.destroyDisplayListData();
    }
}
