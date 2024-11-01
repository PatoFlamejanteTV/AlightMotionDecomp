package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public abstract class RenderEffect {
    private android.graphics.RenderEffect internalRenderEffect;

    public /* synthetic */ RenderEffect(AbstractC3284p abstractC3284p) {
        this();
    }

    @RequiresApi(31)
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect == null) {
            android.graphics.RenderEffect createRenderEffect = createRenderEffect();
            this.internalRenderEffect = createRenderEffect;
            return createRenderEffect;
        }
        return renderEffect;
    }

    @RequiresApi(31)
    protected abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    private RenderEffect() {
    }
}
