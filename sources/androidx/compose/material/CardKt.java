package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CardKt {
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-9VG74zQ, reason: not valid java name */
    public static final void m1129Card9VG74zQ(Function0 onClick, Modifier modifier, Shape shape, long j8, long j9, BorderStroke borderStroke, float f8, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z8, String str, Role role, InterfaceC2072n content, Composer composer, int i8, int i9, int i10) {
        Modifier modifier2;
        Shape shape2;
        long j10;
        long j11;
        BorderStroke borderStroke2;
        float f9;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        boolean z9;
        String str2;
        Role role2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(1353606722);
        if ((i10 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i10 & 4) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i10 & 8) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i10 & 16) != 0) {
            j11 = ColorsKt.m1173contentColorForek8zF_U(j10, composer, (i8 >> 9) & 14);
        } else {
            j11 = j9;
        }
        if ((i10 & 32) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i10 & 64) != 0) {
            f9 = Dp.m5155constructorimpl(1);
        } else {
            f9 = f8;
        }
        if ((i10 & 128) != 0) {
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
        if ((i10 & 256) != 0) {
            indication2 = (Indication) composer.consume(IndicationKt.getLocalIndication());
        } else {
            indication2 = indication;
        }
        if ((i10 & 512) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i10 & 1024) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i10 & 2048) != 0) {
            role2 = null;
        } else {
            role2 = role;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1353606722, i8, i9, "androidx.compose.material.Card (Card.kt:179)");
        }
        SurfaceKt.m1329Surface9VG74zQ(onClick, modifier2, shape2, j10, j11, borderStroke2, f9, mutableInteractionSource2, indication2, z9, str2, role2, content, composer, i8 & 2147483646, i9 & 1022, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m1130CardFjzlyU(Modifier modifier, Shape shape, long j8, long j9, BorderStroke borderStroke, float f8, InterfaceC2072n content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        Shape shape2;
        long j10;
        long j11;
        BorderStroke borderStroke2;
        float f9;
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(1956755640);
        if ((i9 & 1) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 2) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i9 & 4) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 8) != 0) {
            j11 = ColorsKt.m1173contentColorForek8zF_U(j10, composer, (i8 >> 6) & 14);
        } else {
            j11 = j9;
        }
        if ((i9 & 16) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i9 & 32) != 0) {
            f9 = Dp.m5155constructorimpl(1);
        } else {
            f9 = f8;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i8, -1, "androidx.compose.material.Card (Card.kt:58)");
        }
        SurfaceKt.m1330SurfaceFjzlyU(modifier2, shape2, j10, j11, borderStroke2, f9, content, composer, i8 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m1131CardLPr_se0(Function0 onClick, Modifier modifier, boolean z8, Shape shape, long j8, long j9, BorderStroke borderStroke, float f8, MutableInteractionSource mutableInteractionSource, InterfaceC2072n content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        Shape shape2;
        long j10;
        long j11;
        BorderStroke borderStroke2;
        float f9;
        MutableInteractionSource mutableInteractionSource2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(778538979);
        if ((i9 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i9 & 8) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        } else {
            shape2 = shape;
        }
        if ((i9 & 16) != 0) {
            j10 = MaterialTheme.INSTANCE.getColors(composer, 6).m1159getSurface0d7_KjU();
        } else {
            j10 = j8;
        }
        if ((i9 & 32) != 0) {
            j11 = ColorsKt.m1173contentColorForek8zF_U(j10, composer, (i8 >> 12) & 14);
        } else {
            j11 = j9;
        }
        if ((i9 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i9 & 128) != 0) {
            f9 = Dp.m5155constructorimpl(1);
        } else {
            f9 = f8;
        }
        if ((i9 & 256) != 0) {
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
            ComposerKt.traceEventStart(778538979, i8, -1, "androidx.compose.material.Card (Card.kt:107)");
        }
        SurfaceKt.m1331SurfaceLPr_se0(onClick, modifier2, z9, shape2, j10, j11, borderStroke2, f9, mutableInteractionSource2, content, composer, i8 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
