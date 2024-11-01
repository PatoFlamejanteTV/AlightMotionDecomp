package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;

@RequiresApi(31)
/* loaded from: classes.dex */
final class RenderNodeApi29VerificationHelper {
    public static final RenderNodeApi29VerificationHelper INSTANCE = new RenderNodeApi29VerificationHelper();

    private RenderNodeApi29VerificationHelper() {
    }

    @DoNotInline
    public final void setRenderEffect(RenderNode renderNode, RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        renderNode.setRenderEffect(renderEffect2);
    }
}
