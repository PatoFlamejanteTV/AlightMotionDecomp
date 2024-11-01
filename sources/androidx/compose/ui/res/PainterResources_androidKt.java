package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i8) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i8);
        } catch (Exception e8) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e8);
        }
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i8, int i9, Composer composer, int i10) {
        composer.startReplaceableGroup(21855625);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i10, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i8);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i8);
            if (AbstractC3292y.d(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i9);
                imageVectorCache.set(key, imageVectorEntry);
            } else {
                throw new IllegalArgumentException(errorMessage);
            }
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    @Composable
    public static final Painter painterResource(@DrawableRes int i8, Composer composer, int i9) {
        Painter bitmapPainter;
        composer.startReplaceableGroup(473971343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i9, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new TypedValue();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TypedValue typedValue = (TypedValue) rememberedValue;
        resources.getValue(i8, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && n.I(charSequence, ".xml", false, 2, null)) {
            composer.startReplaceableGroup(-738265327);
            bitmapPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i8, typedValue.changingConfigurations, composer, ((i9 << 6) & 896) | 72), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-738265172);
            Object valueOf = Integer.valueOf(i8);
            Object theme = context.getTheme();
            composer.startReplaceableGroup(1618982084);
            boolean changed = composer.changed(valueOf) | composer.changed(charSequence) | composer.changed(theme);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = loadImageBitmapResource(charSequence, resources, i8);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            bitmapPainter = new BitmapPainter((ImageBitmap) rememberedValue2, 0L, 0L, 6, null);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bitmapPainter;
    }
}
