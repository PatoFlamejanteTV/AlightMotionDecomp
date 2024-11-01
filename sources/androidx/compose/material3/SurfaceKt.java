package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, SurfaceKt$LocalAbsoluteTonalElevation$1.INSTANCE, 1, null);

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m1780SurfaceT9BRK9s(Modifier modifier, Shape shape, long j8, long j9, float f8, float f9, BorderStroke borderStroke, InterfaceC2072n content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Shape shape2;
        long j10;
        long j11;
        float f10;
        float f11;
        BorderStroke borderStroke2;
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-513881741);
        if ((i9 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i9 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 8) != 0) {
            j11 = ColorSchemeKt.m1544contentColorForek8zF_U(j10, composer, (i8 >> 6) & 14);
        } else {
            j11 = j9;
        }
        if ((i9 & 16) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        } else {
            f10 = f8;
        }
        if ((i9 & 32) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        } else {
            f11 = f9;
        }
        if ((i9 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i8, -1, "androidx.compose.material3.Surface (Surface.kt:98)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m5155constructorimpl = Dp.m5155constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5169unboximpl() + f10);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j11)), providableCompositionLocal.provides(Dp.m5153boximpl(m5155constructorimpl))}, ComposableLambdaKt.composableLambda(composer, -70914509, true, new SurfaceKt$Surface$1(modifier2, shape2, j10, m5155constructorimpl, i8, borderStroke2, f11, content)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1781Surfaced85dljk(boolean z8, Function0 onClick, Modifier modifier, boolean z9, Shape shape, long j8, long j9, float f8, float f9, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, InterfaceC2072n content, Composer composer, int i8, int i9, int i10) {
        MutableInteractionSource mutableInteractionSource2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(540296512);
        Modifier modifier2 = (i10 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z10 = (i10 & 8) != 0 ? true : z9;
        Shape rectangleShape = (i10 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1508getSurface0d7_KjU = (i10 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU() : j8;
        long m1544contentColorForek8zF_U = (i10 & 64) != 0 ? ColorSchemeKt.m1544contentColorForek8zF_U(m1508getSurface0d7_KjU, composer, (i8 >> 15) & 14) : j9;
        float m5155constructorimpl = (i10 & 128) != 0 ? Dp.m5155constructorimpl(0) : f8;
        float m5155constructorimpl2 = (i10 & 256) != 0 ? Dp.m5155constructorimpl(0) : f9;
        BorderStroke borderStroke2 = (i10 & 512) != 0 ? null : borderStroke;
        if ((i10 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i8, i9, "androidx.compose.material3.Surface (Surface.kt:311)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m5155constructorimpl3 = Dp.m5155constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5169unboximpl() + m5155constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(m1544contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5153boximpl(m5155constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, -1164547968, true, new SurfaceKt$Surface$5(modifier2, rectangleShape, m1508getSurface0d7_KjU, m5155constructorimpl3, i8, borderStroke2, m5155constructorimpl2, z8, mutableInteractionSource2, z10, onClick, content, i9)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m1783Surfaceo_FOJdg(Function0 onClick, Modifier modifier, boolean z8, Shape shape, long j8, long j9, float f8, float f9, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, InterfaceC2072n content, Composer composer, int i8, int i9, int i10) {
        Modifier modifier2;
        boolean z9;
        Shape shape2;
        long j10;
        long j11;
        float f10;
        float f11;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-789752804);
        if ((i10 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i10 & 8) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i10 & 16) != 0) {
            j10 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i10 & 32) != 0) {
            j11 = ColorSchemeKt.m1544contentColorForek8zF_U(j10, composer, (i8 >> 12) & 14);
        } else {
            j11 = j9;
        }
        if ((i10 & 64) != 0) {
            f10 = Dp.m5155constructorimpl(0);
        } else {
            f10 = f8;
        }
        if ((i10 & 128) != 0) {
            f11 = Dp.m5155constructorimpl(0);
        } else {
            f11 = f9;
        }
        if ((i10 & 256) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i10 & 512) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i8, i9, "androidx.compose.material3.Surface (Surface.kt:200)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m5155constructorimpl = Dp.m5155constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5169unboximpl() + f10);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j11)), providableCompositionLocal.provides(Dp.m5153boximpl(m5155constructorimpl))}, ComposableLambdaKt.composableLambda(composer, 1279702876, true, new SurfaceKt$Surface$3(modifier2, shape2, j10, m5155constructorimpl, i8, borderStroke2, f11, mutableInteractionSource2, z9, onClick, content, i9)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1786surface8ww4TTg(Modifier modifier, Shape shape, long j8, BorderStroke borderStroke, float f8) {
        Modifier modifier2;
        Modifier m2622shadows4CzXII$default = ShadowKt.m2622shadows4CzXII$default(modifier, f8, shape, false, 0L, 0L, 24, null);
        if (borderStroke != null) {
            modifier2 = BorderKt.border(Modifier.Companion, borderStroke, shape);
        } else {
            modifier2 = Modifier.Companion;
        }
        return ClipKt.clip(BackgroundKt.m258backgroundbw27NRU(m2622shadows4CzXII$default.then(modifier2), j8, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m1787surfaceColorAtElevationCLU3JFs(long j8, float f8, Composer composer, int i8) {
        composer.startReplaceableGroup(-2079918090);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i8, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:481)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        if (Color.m2949equalsimpl0(j8, materialTheme.getColorScheme(composer, 6).m1508getSurface0d7_KjU())) {
            j8 = ColorSchemeKt.m1549surfaceColorAtElevation3ABfNKs(materialTheme.getColorScheme(composer, 6), f8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j8;
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m1782Surfaced85dljk(boolean z8, Function1 onCheckedChange, Modifier modifier, boolean z9, Shape shape, long j8, long j9, float f8, float f9, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, InterfaceC2072n content, Composer composer, int i8, int i9, int i10) {
        MutableInteractionSource mutableInteractionSource2;
        AbstractC3292y.i(onCheckedChange, "onCheckedChange");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-1877401889);
        Modifier modifier2 = (i10 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z10 = (i10 & 8) != 0 ? true : z9;
        Shape rectangleShape = (i10 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        long m1508getSurface0d7_KjU = (i10 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).m1508getSurface0d7_KjU() : j8;
        long m1544contentColorForek8zF_U = (i10 & 64) != 0 ? ColorSchemeKt.m1544contentColorForek8zF_U(m1508getSurface0d7_KjU, composer, (i8 >> 15) & 14) : j9;
        float m5155constructorimpl = (i10 & 128) != 0 ? Dp.m5155constructorimpl(0) : f8;
        float m5155constructorimpl2 = (i10 & 256) != 0 ? Dp.m5155constructorimpl(0) : f9;
        BorderStroke borderStroke2 = (i10 & 512) != 0 ? null : borderStroke;
        if ((i10 & 1024) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i8, i9, "androidx.compose.material3.Surface (Surface.kt:424)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        float m5155constructorimpl3 = Dp.m5155constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m5169unboximpl() + m5155constructorimpl);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(m1544contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m5153boximpl(m5155constructorimpl3))}, ComposableLambdaKt.composableLambda(composer, 712720927, true, new SurfaceKt$Surface$7(modifier2, rectangleShape, m1508getSurface0d7_KjU, m5155constructorimpl3, i8, borderStroke2, m5155constructorimpl2, z8, mutableInteractionSource2, z10, onCheckedChange, content, i9)), composer, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
