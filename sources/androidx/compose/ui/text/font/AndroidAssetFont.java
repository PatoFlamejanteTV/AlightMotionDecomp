package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final AssetManager assetManager;
    private final String cacheKey;
    private final String path;

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(assetManager, str, fontWeight, i8, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromAssets(this.assetManager, this.path, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromAsset(this.assetManager, this.path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        if (AbstractC3292y.d(this.path, androidAssetFont.path) && AbstractC3292y.d(getVariationSettings(), androidAssetFont.getVariationSettings())) {
            return true;
        }
        return false;
    }

    public final AssetManager getAssetManager() {
        return this.assetManager;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (this.path.hashCode() * 31) + getVariationSettings().hashCode();
    }

    public String toString() {
        return "Font(assetManager, path=" + this.path + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4781toStringimpl(mo4735getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, AbstractC3284p abstractC3284p) {
        this(assetManager, str, (i9 & 4) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i9 & 8) != 0 ? FontStyle.Companion.m4786getNormal_LCdwA() : i8, settings, null);
    }

    private AndroidAssetFont(AssetManager assetManager, String str, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(fontWeight, i8, settings, null);
        this.assetManager = assetManager;
        this.path = str;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
        this.cacheKey = "asset:" + str;
    }
}
