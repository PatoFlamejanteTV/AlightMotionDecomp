package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;

@RequiresApi(31)
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper31 {
    public static final ViewLayerVerificationHelper31 INSTANCE = new ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    @DoNotInline
    public final void setRenderEffect(View view, RenderEffect renderEffect) {
        android.graphics.RenderEffect renderEffect2;
        if (renderEffect != null) {
            renderEffect2 = renderEffect.asAndroidRenderEffect();
        } else {
            renderEffect2 = null;
        }
        view.setRenderEffect(renderEffect2);
    }
}
