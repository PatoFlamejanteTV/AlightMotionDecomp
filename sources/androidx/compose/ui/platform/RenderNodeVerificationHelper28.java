package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes.dex */
final class RenderNodeVerificationHelper28 {
    public static final RenderNodeVerificationHelper28 INSTANCE = new RenderNodeVerificationHelper28();

    private RenderNodeVerificationHelper28() {
    }

    @DoNotInline
    public final int getAmbientShadowColor(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int getSpotShadowColor(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void setAmbientShadowColor(RenderNode renderNode, int i8) {
        renderNode.setAmbientShadowColor(i8);
    }

    @DoNotInline
    public final void setSpotShadowColor(RenderNode renderNode, int i8) {
        renderNode.setSpotShadowColor(i8);
    }
}
