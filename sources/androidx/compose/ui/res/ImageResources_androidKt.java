package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ImageResources_androidKt {
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, Resources resources, @DrawableRes int i8) {
        Drawable drawable = resources.getDrawable(i8, null);
        AbstractC3292y.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return AndroidImageBitmap_androidKt.asImageBitmap(((BitmapDrawable) drawable).getBitmap());
    }

    @Composable
    public static final ImageBitmap imageResource(ImageBitmap.Companion companion, @DrawableRes int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(-304919470);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-304919470, i9, -1, "androidx.compose.ui.res.imageResource (ImageResources.android.kt:52)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) rememberedValue;
        context.getResources().getValue(i8, typedValue, true);
        CharSequence charSequence = typedValue.string;
        AbstractC3292y.f(charSequence);
        String obj = charSequence.toString();
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(obj);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = imageResource(companion, context.getResources(), i8);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ImageBitmap imageBitmap = (ImageBitmap) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageBitmap;
    }
}
