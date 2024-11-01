package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class AndroidRenderEffect extends RenderEffect {
    private final android.graphics.RenderEffect androidRenderEffect;

    public AndroidRenderEffect(android.graphics.RenderEffect renderEffect) {
        super(null);
        this.androidRenderEffect = renderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    protected android.graphics.RenderEffect createRenderEffect() {
        return this.androidRenderEffect;
    }

    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
