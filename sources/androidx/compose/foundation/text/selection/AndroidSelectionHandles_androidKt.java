package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.c;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import c6.InterfaceC2072n;
import e6.AbstractC2829a;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DefaultSelectionHandle(Modifier modifier, boolean z8, ResolvedTextDirection direction, boolean z9, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC3292y.i(modifier, "modifier");
        AbstractC3292y.i(direction, "direction");
        Composer startRestartGroup = composer.startRestartGroup(47957398);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i9 = i13 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i9 |= i12;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(direction)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i9 |= i11;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z9)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i9 |= i10;
        }
        if ((i9 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(47957398, i8, -1, "androidx.compose.foundation.text.selection.DefaultSelectionHandle (AndroidSelectionHandles.android.kt:95)");
            }
            SpacerKt.Spacer(drawSelectionHandle(SizeKt.m626sizeVpY3zN4(modifier, SelectionHandlesKt.getHandleWidth(), SelectionHandlesKt.getHandleHeight()), z8, direction, z9), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$DefaultSelectionHandle$1(modifier, z8, direction, z9, i8));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HandlePopup-ULxng0E, reason: not valid java name */
    public static final void m982HandlePopupULxng0E(long j8, HandleReferencePoint handleReferencePoint, InterfaceC2072n content, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        int i12;
        AbstractC3292y.i(handleReferencePoint, "handleReferencePoint");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-1409050158);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i9 = i12 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(handleReferencePoint)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i9 |= i11;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changedInstance(content)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i9 |= i10;
        }
        if ((i9 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1409050158, i9, -1, "androidx.compose.foundation.text.selection.HandlePopup (AndroidSelectionHandles.android.kt:223)");
            }
            long IntOffset = IntOffsetKt.IntOffset(AbstractC2829a.d(Offset.m2712getXimpl(j8)), AbstractC2829a.d(Offset.m2713getYimpl(j8)));
            IntOffset m5270boximpl = IntOffset.m5270boximpl(IntOffset);
            startRestartGroup.startReplaceableGroup(511388516);
            boolean changed = startRestartGroup.changed(m5270boximpl) | startRestartGroup.changed(handleReferencePoint);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new HandlePositionProvider(handleReferencePoint, IntOffset, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            AndroidPopup_androidKt.Popup((HandlePositionProvider) rememberedValue, null, new PopupProperties(false, false, false, null, true, false, 15, null), content, startRestartGroup, ((i9 << 3) & 7168) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$HandlePopup$1(j8, handleReferencePoint, content, i8));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SelectionHandle-8fL75-g, reason: not valid java name */
    public static final void m983SelectionHandle8fL75g(long j8, boolean z8, ResolvedTextDirection direction, boolean z9, Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        int i9;
        HandleReferencePoint handleReferencePoint;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        AbstractC3292y.i(direction, "direction");
        AbstractC3292y.i(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-616295642);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(j8)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i9 = i15 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(z8)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i9 |= i14;
        }
        if ((i8 & 896) == 0) {
            if (startRestartGroup.changed(direction)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i9 |= i13;
        }
        if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(z9)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i9 |= i12;
        }
        if ((57344 & i8) == 0) {
            if (startRestartGroup.changed(modifier)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i9 |= i11;
        }
        if ((458752 & i8) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i9 |= i10;
        }
        int i16 = i9;
        if ((374491 & i16) == 74898 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616295642, i16, -1, "androidx.compose.foundation.text.selection.SelectionHandle (AndroidSelectionHandles.android.kt:53)");
            }
            if (isLeft(z8, direction, z9)) {
                handleReferencePoint = HandleReferencePoint.TopRight;
            } else {
                handleReferencePoint = HandleReferencePoint.TopLeft;
            }
            m982HandlePopupULxng0E(j8, handleReferencePoint, ComposableLambdaKt.composableLambda(startRestartGroup, 732099485, true, new AndroidSelectionHandles_androidKt$SelectionHandle$1(interfaceC2072n, modifier, z8, j8, i16, direction, z9)), startRestartGroup, (i16 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidSelectionHandles_androidKt$SelectionHandle$2(j8, z8, direction, z9, modifier, interfaceC2072n, i8));
        }
    }

    public static final ImageBitmap createHandleImage(CacheDrawScope cacheDrawScope, float f8) {
        AbstractC3292y.i(cacheDrawScope, "<this>");
        int ceil = ((int) Math.ceil(f8)) * 2;
        HandleImageCache handleImageCache = HandleImageCache.INSTANCE;
        ImageBitmap imageBitmap = handleImageCache.getImageBitmap();
        Canvas canvas = handleImageCache.getCanvas();
        CanvasDrawScope canvasDrawScope = handleImageCache.getCanvasDrawScope();
        if (imageBitmap == null || canvas == null || ceil > imageBitmap.getWidth() || ceil > imageBitmap.getHeight()) {
            imageBitmap = ImageBitmapKt.m3154ImageBitmapx__hDU$default(ceil, ceil, ImageBitmapConfig.Companion.m3148getAlpha8_sVssgQ(), false, null, 24, null);
            handleImageCache.setImageBitmap(imageBitmap);
            canvas = CanvasKt.Canvas(imageBitmap);
            handleImageCache.setCanvas(canvas);
        }
        ImageBitmap imageBitmap2 = imageBitmap;
        Canvas canvas2 = canvas;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            handleImageCache.setCanvasDrawScope(canvasDrawScope);
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        long Size = androidx.compose.ui.geometry.SizeKt.Size(imageBitmap2.getWidth(), imageBitmap2.getHeight());
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m3393component4NHjbRc = drawParams.m3393component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas2);
        drawParams2.m3396setSizeuvyYCjk(Size);
        canvas2.save();
        c.K(canvasDrawScope2, Color.Companion.m2974getBlack0d7_KjU(), 0L, canvasDrawScope2.mo3391getSizeNHjbRc(), 0.0f, null, null, BlendMode.Companion.m2869getClear0nO6VwU(), 58, null);
        c.K(canvasDrawScope2, ColorKt.Color(4278190080L), Offset.Companion.m2728getZeroF1C5BW0(), androidx.compose.ui.geometry.SizeKt.Size(f8, f8), 0.0f, null, null, 0, 120, null);
        c.x(canvasDrawScope2, ColorKt.Color(4278190080L), f8, OffsetKt.Offset(f8, f8), 0.0f, null, null, 0, 120, null);
        canvas2.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3396setSizeuvyYCjk(m3393component4NHjbRc);
        return imageBitmap2;
    }

    public static final Modifier drawSelectionHandle(Modifier modifier, boolean z8, ResolvedTextDirection direction, boolean z9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(direction, "direction");
        return ComposedModifierKt.composed$default(modifier, null, new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(z8, direction, z9), 1, null);
    }

    public static final boolean isHandleLtrDirection(ResolvedTextDirection direction, boolean z8) {
        AbstractC3292y.i(direction, "direction");
        if ((direction == ResolvedTextDirection.Ltr && !z8) || (direction == ResolvedTextDirection.Rtl && z8)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isLeft(boolean z8, ResolvedTextDirection resolvedTextDirection, boolean z9) {
        if (z8) {
            return isHandleLtrDirection(resolvedTextDirection, z9);
        }
        if (!isHandleLtrDirection(resolvedTextDirection, z9)) {
            return true;
        }
        return false;
    }
}
