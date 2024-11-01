package androidx.compose.foundation;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ImageKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final /* synthetic */ void Image(ImageBitmap bitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, Composer composer, int i8, int i9) {
        AbstractC3292y.i(bitmap, "bitmap");
        composer.startReplaceableGroup(-2123228673);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i9 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i9 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f9 = (i9 & 32) != 0 ? 1.0f : f8;
        ColorFilter colorFilter2 = (i9 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i8, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        m316Image5hnEew(bitmap, str, modifier2, center, fit, f9, colorFilter2, FilterQuality.Companion.m3047getLowfv9h1I(), composer, (i8 & 112) | 8 | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m316Image5hnEew(ImageBitmap bitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, int i8, Composer composer, int i9, int i10) {
        Modifier modifier2;
        Alignment alignment2;
        ContentScale contentScale2;
        float f9;
        ColorFilter colorFilter2;
        int i11;
        AbstractC3292y.i(bitmap, "bitmap");
        composer.startReplaceableGroup(-1396260732);
        if ((i10 & 4) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 8) != 0) {
            alignment2 = Alignment.Companion.getCenter();
        } else {
            alignment2 = alignment;
        }
        if ((i10 & 16) != 0) {
            contentScale2 = ContentScale.Companion.getFit();
        } else {
            contentScale2 = contentScale;
        }
        if ((i10 & 32) != 0) {
            f9 = 1.0f;
        } else {
            f9 = f8;
        }
        if ((i10 & 64) != 0) {
            colorFilter2 = null;
        } else {
            colorFilter2 = colorFilter;
        }
        if ((i10 & 128) != 0) {
            i11 = DrawScope.Companion.m3422getDefaultFilterQualityfv9h1I();
        } else {
            i11 = i8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i9, -1, "androidx.compose.foundation.Image (Image.kt:143)");
        }
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(bitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BitmapPainterKt.m3488BitmapPainterQZhYCtY$default(bitmap, 0L, 0L, i11, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Image((BitmapPainter) rememberedValue, str, modifier2, alignment2, contentScale2, f9, colorFilter2, composer, (i9 & 112) | 8 | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (3670016 & i9), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(ImageVector imageVector, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, Composer composer, int i8, int i9) {
        AbstractC3292y.i(imageVector, "imageVector");
        composer.startReplaceableGroup(1595907091);
        Modifier modifier2 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i9 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i9 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f9 = (i9 & 32) != 0 ? 1.0f : f8;
        ColorFilter colorFilter2 = (i9 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i8, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i8 & 14), str, modifier2, center, fit, f9, colorFilter2, composer, VectorPainter.$stable | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (458752 & i8) | (i8 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(Painter painter, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f8, ColorFilter colorFilter, Composer composer, int i8, int i9) {
        Modifier modifier2;
        AbstractC3292y.i(painter, "painter");
        Composer startRestartGroup = composer.startRestartGroup(1142754848);
        Modifier modifier3 = (i9 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i9 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i9 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f9 = (i9 & 32) != 0 ? 1.0f : f8;
        ColorFilter colorFilter2 = (i9 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1142754848, i8, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        }
        startRestartGroup.startReplaceableGroup(-816794123);
        if (str != null) {
            Modifier.Companion companion = Modifier.Companion;
            startRestartGroup.startReplaceableGroup(1157296644);
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ImageKt$Image$semantics$1$1(str);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            modifier2 = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, 1, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        startRestartGroup.endReplaceableGroup();
        Modifier paint$default = PainterModifierKt.paint$default(ClipKt.clipToBounds(modifier3.then(modifier2)), painter, false, center, fit, f9, colorFilter2, 2, null);
        ImageKt$Image$2 imageKt$Image$2 = new MeasurePolicy() { // from class: androidx.compose.foundation.ImageKt$Image$2
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return g.a(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return g.b(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> list, long j8) {
                AbstractC3292y.i(Layout, "$this$Layout");
                AbstractC3292y.i(list, "<anonymous parameter 0>");
                return MeasureScope.CC.q(Layout, Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), null, ImageKt$Image$2$measure$1.INSTANCE, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return g.c(this, intrinsicMeasureScope, list, i10);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i10) {
                return g.d(this, intrinsicMeasureScope, list, i10);
            }
        };
        startRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        Function0 constructor = companion2.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(paint$default);
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, imageKt$Image$2, companion2.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new ImageKt$Image$3(painter, str, modifier3, center, fit, f9, colorFilter2, i8, i9));
    }
}
