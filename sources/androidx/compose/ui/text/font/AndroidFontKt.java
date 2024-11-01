package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;

/* loaded from: classes.dex */
public final class AndroidFontKt {
    @Stable
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4727FontEj4NQ78(File file, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i8, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4729FontEj4NQ78$default(File file, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i9 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4801Settings6EWAqTQ(fontWeight, i8, new FontVariation.Setting[0]);
        }
        return m4727FontEj4NQ78(file, fontWeight, i8, settings);
    }

    @Stable
    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m4730FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i8, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m4731FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 8) != 0) {
            i8 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i9 & 16) != 0) {
            settings = FontVariation.INSTANCE.m4801Settings6EWAqTQ(fontWeight, i8, new FontVariation.Setting[0]);
        }
        return m4730FontMuC2MFs(str, assetManager, fontWeight, i8, settings);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    @Stable
    @RequiresApi(26)
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m4726FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i8, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m4728FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i9 & 4) != 0) {
            i8 = FontStyle.Companion.m4786getNormal_LCdwA();
        }
        if ((i9 & 8) != 0) {
            settings = FontVariation.INSTANCE.m4801Settings6EWAqTQ(fontWeight, i8, new FontVariation.Setting[0]);
        }
        return m4726FontEj4NQ78(parcelFileDescriptor, fontWeight, i8, settings);
    }
}
