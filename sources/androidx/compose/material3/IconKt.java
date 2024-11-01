package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.IconButtonTokens;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IconKt {
    private static final Modifier DefaultIconSizeModifier = SizeKt.m624size3ABfNKs(Modifier.Companion, IconButtonTokens.INSTANCE.m2168getIconSizeD9Ej5fM());

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x004d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1647Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector r17, java.lang.String r18, androidx.compose.ui.Modifier r19, long r20, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.IconKt.m1647Iconww6aTOc(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        Modifier modifier2;
        if (!Size.m2777equalsimpl0(painter.mo3485getIntrinsicSizeNHjbRc(), Size.Companion.m2789getUnspecifiedNHjbRc()) && !m1648isInfiniteuvyYCjk(painter.mo3485getIntrinsicSizeNHjbRc())) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = DefaultIconSizeModifier;
        }
        return modifier.then(modifier2);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1648isInfiniteuvyYCjk(long j8) {
        if (Float.isInfinite(Size.m2781getWidthimpl(j8)) && Float.isInfinite(Size.m2778getHeightimpl(j8))) {
            return true;
        }
        return false;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1645Iconww6aTOc(ImageBitmap bitmap, String str, Modifier modifier, long j8, Composer composer, int i8, int i9) {
        long j9;
        int i10;
        AbstractC3292y.i(bitmap, "bitmap");
        Composer startRestartGroup = composer.startRestartGroup(-1092052280);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i9 & 8) != 0) {
            j9 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
            i10 = i8 & (-7169);
        } else {
            j9 = j8;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092052280, i10, -1, "androidx.compose.material3.Icon (Icon.kt:85)");
        }
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed = startRestartGroup.changed(bitmap);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(bitmap, 0L, 0L, 6, null);
            startRestartGroup.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        startRestartGroup.endReplaceableGroup();
        m1646Iconww6aTOc((BitmapPainter) rememberedValue, str, modifier2, j9, startRestartGroup, (i10 & 112) | 8 | (i10 & 896) | (i10 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new IconKt$Icon$2(bitmap, str, modifier2, j9, i8, i9));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1646Iconww6aTOc(Painter painter, String str, Modifier modifier, long j8, Composer composer, int i8, int i9) {
        long j9;
        int i10;
        Modifier modifier2;
        AbstractC3292y.i(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(-2142239481);
        Modifier modifier3 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        if ((i9 & 8) != 0) {
            i10 = i8 & (-7169);
            j9 = ((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl();
        } else {
            j9 = j8;
            i10 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2142239481, i10, -1, "androidx.compose.material3.Icon (Icon.kt:116)");
        }
        ColorFilter m2989tintxETnrds$default = Color.m2949equalsimpl0(j9, Color.Companion.m2984getUnspecified0d7_KjU()) ? null : ColorFilter.Companion.m2989tintxETnrds$default(ColorFilter.Companion, j9, 0, 2, null);
        startRestartGroup.startReplaceableGroup(69355216);
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
        endRestartGroup.updateScope(new IconKt$Icon$3(painter, str, modifier3, j10, i8, i9));
    }
}
