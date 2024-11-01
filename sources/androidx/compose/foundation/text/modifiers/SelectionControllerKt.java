package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j8, final Function0 function0, final Function0 function02, boolean z8) {
        if (z8) {
            ?? r12 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
                private long dragTotalDistance;
                private long lastPosition;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    Offset.Companion companion = Offset.Companion;
                    this.lastPosition = companion.m2728getZeroF1C5BW0();
                    this.dragTotalDistance = companion.m2728getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j8)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDown-k-4lQ0M */
                public void mo902onDownk4lQ0M(long j9) {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onDrag-k-4lQ0M */
                public void mo903onDragk4lQ0M(long j9) {
                    boolean m974outOfBoundary2x9bVx0;
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j10 = j8;
                        Function0 function03 = function02;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                            return;
                        }
                        long m2717plusMKHz9U = Offset.m2717plusMKHz9U(this.dragTotalDistance, j9);
                        this.dragTotalDistance = m2717plusMKHz9U;
                        long m2717plusMKHz9U2 = Offset.m2717plusMKHz9U(this.lastPosition, m2717plusMKHz9U);
                        m974outOfBoundary2x9bVx0 = SelectionControllerKt.m974outOfBoundary2x9bVx0((TextLayoutResult) function03.invoke(), this.lastPosition, m2717plusMKHz9U2);
                        if (!m974outOfBoundary2x9bVx0 && selectionRegistrar2.mo1049notifySelectionUpdate5iVPX68(layoutCoordinates, m2717plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                            this.lastPosition = m2717plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m2728getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* renamed from: onStart-k-4lQ0M */
                public void mo904onStartk4lQ0M(long j9) {
                    boolean m974outOfBoundary2x9bVx0;
                    LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                    if (layoutCoordinates != null) {
                        Function0 function03 = function02;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        long j10 = j8;
                        if (layoutCoordinates.isAttached()) {
                            m974outOfBoundary2x9bVx0 = SelectionControllerKt.m974outOfBoundary2x9bVx0((TextLayoutResult) function03.invoke(), j9, j9);
                            if (m974outOfBoundary2x9bVx0) {
                                selectionRegistrar2.notifySelectionUpdateSelectAll(j10);
                            } else {
                                selectionRegistrar2.mo1050notifySelectionUpdateStartd4ec7I(layoutCoordinates, j9, SelectionAdjustment.Companion.getWord());
                            }
                            this.lastPosition = j9;
                        } else {
                            return;
                        }
                    }
                    if (!SelectionRegistrarKt.hasSelection(selectionRegistrar, j8)) {
                        return;
                    }
                    this.dragTotalDistance = Offset.Companion.m2728getZeroF1C5BW0();
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j8)) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                public final void setDragTotalDistance(long j9) {
                    this.dragTotalDistance = j9;
                }

                public final void setLastPosition(long j9) {
                    this.lastPosition = j9;
                }
            };
            return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r12, new SelectionControllerKt$makeSelectionModifier$1(r12, null));
        }
        ?? r11 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m2728getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo975onDrag3MmeM6k(long j9, SelectionAdjustment adjustment) {
                AbstractC3292y.i(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j10 = j8;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo1049notifySelectionUpdate5iVPX68(layoutCoordinates, j9, this.lastPosition, false, adjustment)) {
                        this.lastPosition = j9;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo976onExtendk4lQ0M(long j9) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j10 = j8;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo1049notifySelectionUpdate5iVPX68(layoutCoordinates, j9, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
                    this.lastPosition = j9;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo977onExtendDragk4lQ0M(long j9) {
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j10 = j8;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo1049notifySelectionUpdate5iVPX68(layoutCoordinates, j9, this.lastPosition, false, SelectionAdjustment.Companion.getNone())) {
                        this.lastPosition = j9;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo978onStart3MmeM6k(long j9, SelectionAdjustment adjustment) {
                AbstractC3292y.i(adjustment, "adjustment");
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) Function0.this.invoke();
                if (layoutCoordinates == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j10 = j8;
                if (!layoutCoordinates.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo1050notifySelectionUpdateStartd4ec7I(layoutCoordinates, j9, adjustment);
                this.lastPosition = j9;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j10);
            }

            public final void setLastPosition(long j9) {
                this.lastPosition = j9;
            }
        };
        return PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r11, new SelectionControllerKt$makeSelectionModifier$2(r11, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: outOfBoundary-2x9bVx0, reason: not valid java name */
    public static final boolean m974outOfBoundary2x9bVx0(TextLayoutResult textLayoutResult, long j8, long j9) {
        if (textLayoutResult == null) {
            return false;
        }
        int length = textLayoutResult.getLayoutInput().getText().getText().length();
        int m4641getOffsetForPositionk4lQ0M = textLayoutResult.m4641getOffsetForPositionk4lQ0M(j8);
        int m4641getOffsetForPositionk4lQ0M2 = textLayoutResult.m4641getOffsetForPositionk4lQ0M(j9);
        int i8 = length - 1;
        if ((m4641getOffsetForPositionk4lQ0M < i8 || m4641getOffsetForPositionk4lQ0M2 < i8) && (m4641getOffsetForPositionk4lQ0M >= 0 || m4641getOffsetForPositionk4lQ0M2 >= 0)) {
            return false;
        }
        return true;
    }
}
