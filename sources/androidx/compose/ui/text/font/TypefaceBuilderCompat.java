package androidx.compose.ui.text.font;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.ParcelFileDescriptor;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(api = 26)
/* loaded from: classes.dex */
final class TypefaceBuilderCompat {
    public static final TypefaceBuilderCompat INSTANCE = new TypefaceBuilderCompat();

    private TypefaceBuilderCompat() {
    }

    @ExperimentalTextApi
    @RequiresApi(26)
    private final FontVariationAxis[] toVariationSettings(FontVariation.Settings settings, Context context) {
        Density Density;
        if (context != null) {
            Density = AndroidDensity_androidKt.Density(context);
        } else if (!settings.getNeedsDensity$ui_text_release()) {
            Density = DensityKt.Density(1.0f, 1.0f);
        } else {
            throw new IllegalStateException("Required density, but not provided");
        }
        List<FontVariation.Setting> settings2 = settings.getSettings();
        ArrayList arrayList = new ArrayList(settings2.size());
        int size = settings2.size();
        for (int i8 = 0; i8 < size; i8++) {
            FontVariation.Setting setting = settings2.get(i8);
            j.a();
            arrayList.add(i.a(setting.getAxisName(), setting.toVariationValue(Density)));
        }
        return (FontVariationAxis[]) arrayList.toArray(new FontVariationAxis[0]);
    }

    @ExperimentalTextApi
    @DoNotInline
    public final android.graphics.Typeface createFromAssets(AssetManager assetManager, String str, Context context, FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context != null) {
            fontVariationSettings = h.a(assetManager, str).setFontVariationSettings(toVariationSettings(settings, context));
            build = fontVariationSettings.build();
            return build;
        }
        return null;
    }

    @ExperimentalTextApi
    @DoNotInline
    public final android.graphics.Typeface createFromFile(File file, Context context, FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context != null) {
            fontVariationSettings = g.a(file).setFontVariationSettings(toVariationSettings(settings, context));
            build = fontVariationSettings.build();
            return build;
        }
        return null;
    }

    @ExperimentalTextApi
    @DoNotInline
    public final android.graphics.Typeface createFromFileDescriptor(ParcelFileDescriptor parcelFileDescriptor, Context context, FontVariation.Settings settings) {
        Typeface.Builder fontVariationSettings;
        android.graphics.Typeface build;
        if (context == null) {
            return null;
        }
        l.a();
        fontVariationSettings = k.a(parcelFileDescriptor.getFileDescriptor()).setFontVariationSettings(toVariationSettings(settings, context));
        build = fontVariationSettings.build();
        return build;
    }
}
