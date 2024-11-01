package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(28)
/* loaded from: classes.dex */
final class ViewLayerVerificationHelper28 {
    public static final ViewLayerVerificationHelper28 INSTANCE = new ViewLayerVerificationHelper28();

    private ViewLayerVerificationHelper28() {
    }

    @DoNotInline
    public final void setOutlineAmbientShadowColor(View view, int i8) {
        view.setOutlineAmbientShadowColor(i8);
    }

    @DoNotInline
    public final void setOutlineSpotShadowColor(View view, int i8) {
        view.setOutlineSpotShadowColor(i8);
    }
}
