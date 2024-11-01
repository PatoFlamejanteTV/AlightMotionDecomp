package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
@RequiresApi(26)
/* loaded from: classes.dex */
public final class AndroidFileDescriptorFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final String cacheKey;
    private final ParcelFileDescriptor fileDescriptor;

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(parcelFileDescriptor, fontWeight, i8, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFileDescriptor(this.fileDescriptor, context, getVariationSettings());
        }
        throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4781toStringimpl(mo4735getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, AbstractC3284p abstractC3284p) {
        this(parcelFileDescriptor, (i9 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i9 & 4) != 0 ? FontStyle.Companion.m4786getNormal_LCdwA() : i8, settings, null);
    }

    private AndroidFileDescriptorFont(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(fontWeight, i8, settings, null);
        this.fileDescriptor = parcelFileDescriptor;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
