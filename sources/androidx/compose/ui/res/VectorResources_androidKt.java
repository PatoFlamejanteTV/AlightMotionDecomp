package androidx.compose.ui.res;

import Q5.I;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.compat.AndroidVectorParser;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class VectorResources_androidKt {
    public static final ImageVectorCache.ImageVectorEntry loadVectorResourceInner(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i8) throws XmlPullParserException {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        ImageVector.Builder createVectorImageBuilder = XmlVectorParser_androidKt.createVectorImageBuilder(androidVectorParser, resources, theme, asAttributeSet);
        int i9 = 0;
        while (!XmlVectorParser_androidKt.isAtEnd(xmlResourceParser)) {
            i9 = XmlVectorParser_androidKt.parseCurrentVectorNode(androidVectorParser, resources, asAttributeSet, theme, createVectorImageBuilder, i9);
            xmlResourceParser.next();
        }
        return new ImageVectorCache.ImageVectorEntry(createVectorImageBuilder.build(), i8);
    }

    public static /* synthetic */ ImageVectorCache.ImageVectorEntry loadVectorResourceInner$default(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i8, int i9, Object obj) throws XmlPullParserException {
        if ((i9 & 1) != 0) {
            theme = null;
        }
        return loadVectorResourceInner(theme, resources, xmlResourceParser, i8);
    }

    @Composable
    public static final ImageVector vectorResource(ImageVector.Companion companion, @DrawableRes int i8, Composer composer, int i9) {
        composer.startReplaceableGroup(44534090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(44534090, i9, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = Resources_androidKt.resources(composer, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i8), resources, theme, resources.getConfiguration()};
        composer.startReplaceableGroup(-568225417);
        boolean z8 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            z8 |= composer.changed(objArr[i10]);
        }
        Object rememberedValue = composer.rememberedValue();
        if (z8 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = vectorResource(companion, theme, resources, i8);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ImageVector imageVector = (ImageVector) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    public static /* synthetic */ ImageVector vectorResource$default(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i8, int i9, Object obj) throws XmlPullParserException {
        if ((i9 & 1) != 0) {
            theme = null;
        }
        return vectorResource(companion, theme, resources, i8);
    }

    public static final ImageVector vectorResource(ImageVector.Companion companion, Resources.Theme theme, Resources resources, int i8) throws XmlPullParserException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i8, typedValue, true);
        XmlResourceParser xml = resources.getXml(i8);
        XmlVectorParser_androidKt.seekToStartTag(xml);
        I i9 = I.f8786a;
        return loadVectorResourceInner(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
