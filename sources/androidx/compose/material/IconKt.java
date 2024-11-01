package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m624size3ABfNKs(Modifier.Companion, Dp.m5155constructorimpl(24));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1244Iconww6aTOc(ImageVector imageVector, String str, Modifier modifier, long j8, Composer composer, int i8, int i9) {
        AbstractC3292y.i(imageVector, "imageVector");
        composer.startReplaceableGroup(-800853103);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        long m2947copywmQWz5c$default = (i9 & 8) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i8, -1, "androidx.compose.material.Icon (Icon.kt:61)");
        }
        m1243Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i8 & 14), str, modifier2, m2947copywmQWz5c$default, composer, VectorPainter.$stable | (i8 & 112) | (i8 & 896) | (i8 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (!Size.m2777equalsimpl0(painter.mo3485getIntrinsicSizeNHjbRc(), Size.Companion.m2789getUnspecifiedNHjbRc()) && !m1245isInfiniteuvyYCjk(painter.mo3485getIntrinsicSizeNHjbRc())) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = DefaultIconSizeModifier;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1245isInfiniteuvyYCjk(long j8) {
        if (Float.isInfinite(Size.m2781getWidthimpl(j8)) && Float.isInfinite(Size.m2778getHeightimpl(j8))) {
            return true;
        }
        return false;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1242Iconww6aTOc(ImageBitmap bitmap, String str, Modifier modifier, long j8, Composer composer, int i8, int i9) {
        AbstractC3292y.i(bitmap, "bitmap");
        composer.startReplaceableGroup(-554892675);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        long m2947copywmQWz5c$default = (i9 & 8) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i8, -1, "androidx.compose.material.Icon (Icon.kt:95)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(bitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        composer.endReplaceableGroup();
        m1243Iconww6aTOc((BitmapPainter) rememberedValue, str, modifier2, m2947copywmQWz5c$default, composer, (i8 & 112) | 8 | (i8 & 896) | (i8 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1243Iconww6aTOc(Painter painter, String str, Modifier modifier, long j8, Composer composer, int i8, int i9) {
        long j9;
        int i10;
        Modifier modifier2;
        AbstractC3292y.i(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-1142959010);
        Modifier modifier3 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i9 & 8) != 0) {
            i10 = i8 & (-7169);
            j9 = Color.m2947copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) startRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j9 = j8;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1142959010, i10, -1, "androidx.compose.material.Icon (Icon.kt:129)");
        }
        ColorFilter m2989tintxETnrds$default = Color.m2949equalsimpl0(j9, Color.Companion.m2984getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m2989tintxETnrds$default(ColorFilter.Companion, j9, 0, 2, null);
        startRestartGroup.startReplaceableGroup(1547387026);
        if (str != null) {
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new IconKt$Icon$semantics$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier modifier4 = modifier2;
        startRestartGroup.endReplaceableGroup();
        long j10 = j9;
        BoxKt.Box(PainterModifierKt.paint$default(defaultSizeFor(GraphicsLayerModifierKt.toolingGraphicsLayer(modifier3), painter), painter, false, null, ContentScale.Companion.getFit(), 0.0f, m2989tintxETnrds$default, 22, null).then(modifier4), startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new IconKt$Icon$1(painter, str, modifier3, j10, i8, i9));
    }
}
