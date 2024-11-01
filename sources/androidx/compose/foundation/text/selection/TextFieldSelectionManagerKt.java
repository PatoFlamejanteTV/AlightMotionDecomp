package androidx.compose.foundation.text.selection;

import Q5.p;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import androidx.profileinstaller.ProfileVerifier;
import i6.m;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void TextFieldSelectionHandle(boolean z8, ResolvedTextDirection direction, TextFieldSelectionManager manager, Composer composer, int i8) {
        AbstractC3292y.i(direction, "direction");
        AbstractC3292y.i(manager, "manager");
        Composer startRestartGroup = composer.startRestartGroup(-1344558920);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344558920, i8, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:803)");
        }
        Boolean valueOf = Boolean.valueOf(z8);
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(manager);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = manager.handleDragObserver$foundation_release(z8);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        TextDragObserver textDragObserver = (TextDragObserver) rememberedValue;
        int i9 = i8 << 3;
        AndroidSelectionHandles_androidKt.m983SelectionHandle8fL75g(manager.m1061getHandlePositiontuRUvjQ$foundation_release(z8), z8, direction, TextRange.m4668getReversedimpl(manager.getValue$foundation_release().m4906getSelectiond9O1mEE()), SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, textDragObserver, new TextFieldSelectionManagerKt$TextFieldSelectionHandle$1(textDragObserver, null)), null, startRestartGroup, (i9 & 112) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i9 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2(z8, direction, manager, i8));
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1066calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager manager, long j8) {
        int i8;
        int m4669getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        TextDelegate textDelegate;
        AnnotatedString text;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResultProxy layoutResult2;
        LayoutCoordinates innerTextFieldCoordinates;
        boolean z8;
        AbstractC3292y.i(manager, "manager");
        if (manager.getValue$foundation_release().getText().length() == 0) {
            return Offset.Companion.m2727getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = manager.getDraggingHandle();
        if (draggingHandle == null) {
            i8 = -1;
        } else {
            i8 = WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        }
        if (i8 != -1) {
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    m4669getStartimpl = TextRange.m4664getEndimpl(manager.getValue$foundation_release().m4906getSelectiond9O1mEE());
                } else {
                    throw new p();
                }
            } else {
                m4669getStartimpl = TextRange.m4669getStartimpl(manager.getValue$foundation_release().m4906getSelectiond9O1mEE());
            }
            int originalToTransformed = manager.getOffsetMapping$foundation_release().originalToTransformed(m4669getStartimpl);
            TextFieldState state$foundation_release = manager.getState$foundation_release();
            if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null && (value = layoutResult.getValue()) != null) {
                TextFieldState state$foundation_release2 = manager.getState$foundation_release();
                if (state$foundation_release2 != null && (textDelegate = state$foundation_release2.getTextDelegate()) != null && (text = textDelegate.getText()) != null) {
                    int l8 = m.l(originalToTransformed, n.K(text));
                    long m2742getCenterF1C5BW0 = value.getBoundingBox(l8).m2742getCenterF1C5BW0();
                    TextFieldState state$foundation_release3 = manager.getState$foundation_release();
                    if (state$foundation_release3 != null && (layoutCoordinates = state$foundation_release3.getLayoutCoordinates()) != null) {
                        TextFieldState state$foundation_release4 = manager.getState$foundation_release();
                        if (state$foundation_release4 != null && (layoutResult2 = state$foundation_release4.getLayoutResult()) != null && (innerTextFieldCoordinates = layoutResult2.getInnerTextFieldCoordinates()) != null) {
                            Offset m1059getCurrentDragPosition_m7T9E = manager.m1059getCurrentDragPosition_m7T9E();
                            if (m1059getCurrentDragPosition_m7T9E != null) {
                                float m2712getXimpl = Offset.m2712getXimpl(innerTextFieldCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates, m1059getCurrentDragPosition_m7T9E.m2722unboximpl()));
                                int lineForOffset = value.getLineForOffset(l8);
                                int lineStart = value.getLineStart(lineForOffset);
                                int lineEnd = value.getLineEnd(lineForOffset, true);
                                if (TextRange.m4669getStartimpl(manager.getValue$foundation_release().m4906getSelectiond9O1mEE()) > TextRange.m4664getEndimpl(manager.getValue$foundation_release().m4906getSelectiond9O1mEE())) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                float horizontalPosition = TextSelectionDelegateKt.getHorizontalPosition(value, lineStart, true, z8);
                                float horizontalPosition2 = TextSelectionDelegateKt.getHorizontalPosition(value, lineEnd, false, z8);
                                float j9 = m.j(m2712getXimpl, Math.min(horizontalPosition, horizontalPosition2), Math.max(horizontalPosition, horizontalPosition2));
                                if (Math.abs(m2712getXimpl - j9) > IntSize.m5321getWidthimpl(j8) / 2) {
                                    return Offset.Companion.m2727getUnspecifiedF1C5BW0();
                                }
                                return layoutCoordinates.mo4116localPositionOfR5De75A(innerTextFieldCoordinates, OffsetKt.Offset(j9, Offset.m2713getYimpl(m2742getCenterF1C5BW0)));
                            }
                            return Offset.Companion.m2727getUnspecifiedF1C5BW0();
                        }
                        return Offset.Companion.m2727getUnspecifiedF1C5BW0();
                    }
                    return Offset.Companion.m2727getUnspecifiedF1C5BW0();
                }
                return Offset.Companion.m2727getUnspecifiedF1C5BW0();
            }
            return Offset.Companion.m2727getUnspecifiedF1C5BW0();
        }
        return Offset.Companion.m2727getUnspecifiedF1C5BW0();
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z8) {
        LayoutCoordinates layoutCoordinates;
        Rect visibleBounds;
        AbstractC3292y.i(textFieldSelectionManager, "<this>");
        TextFieldState state$foundation_release = textFieldSelectionManager.getState$foundation_release();
        if (state$foundation_release != null && (layoutCoordinates = state$foundation_release.getLayoutCoordinates()) != null && (visibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) != null) {
            return SelectionManagerKt.m1042containsInclusiveUv8p0NA(visibleBounds, textFieldSelectionManager.m1061getHandlePositiontuRUvjQ$foundation_release(z8));
        }
        return false;
    }
}
