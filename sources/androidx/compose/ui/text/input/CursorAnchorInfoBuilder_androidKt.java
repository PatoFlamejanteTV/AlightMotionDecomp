package androidx.compose.ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;

/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x005d, code lost:            if (containsInclusive(r22, r8.getRight(), r8.getBottom()) == false) goto L10;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, androidx.compose.ui.text.input.OffsetMapping r20, androidx.compose.ui.text.TextLayoutResult r21, androidx.compose.ui.geometry.Rect r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.originalToTransformed(r2)
            int r5 = r1.originalToTransformed(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            androidx.compose.ui.text.MultiParagraph r7 = r21.getMultiParagraph()
            long r8 = androidx.compose.ui.text.TextRangeKt.TextRange(r4, r5)
            r5 = 0
            r7.m4548fillBoundingBoxes8ffj60Q(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.originalToTransformed(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            androidx.compose.ui.geometry.Rect r8 = new androidx.compose.ui.geometry.Rect
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.overlaps(r8)
            float r9 = r8.getLeft()
            float r10 = r8.getTop()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.getRight()
            float r10 = r8.getBottom()
            boolean r9 = containsInclusive(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            androidx.compose.ui.text.style.ResolvedTextDirection r5 = r9.getBidiRunDirection(r5)
            androidx.compose.ui.text.style.ResolvedTextDirection r10 = androidx.compose.ui.text.style.ResolvedTextDirection.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.getLeft()
            float r13 = r8.getTop()
            float r14 = r8.getRight()
            float r15 = r8.getBottom()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.addCharacterBounds(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, androidx.compose.ui.text.input.OffsetMapping, androidx.compose.ui.text.TextLayoutResult, androidx.compose.ui.geometry.Rect):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo build(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z8, boolean z9, boolean z10, boolean z11) {
        int i8;
        int i9;
        builder.reset();
        builder.setMatrix(matrix);
        int m4667getMinimpl = TextRange.m4667getMinimpl(textFieldValue.m4906getSelectiond9O1mEE());
        builder.setSelectionRange(m4667getMinimpl, TextRange.m4666getMaximpl(textFieldValue.m4906getSelectiond9O1mEE()));
        if (z8) {
            setInsertionMarker(builder, m4667getMinimpl, offsetMapping, textLayoutResult, rect);
        }
        if (z9) {
            TextRange m4905getCompositionMzsxiRA = textFieldValue.m4905getCompositionMzsxiRA();
            if (m4905getCompositionMzsxiRA != null) {
                i8 = TextRange.m4667getMinimpl(m4905getCompositionMzsxiRA.m4673unboximpl());
            } else {
                i8 = -1;
            }
            TextRange m4905getCompositionMzsxiRA2 = textFieldValue.m4905getCompositionMzsxiRA();
            if (m4905getCompositionMzsxiRA2 != null) {
                i9 = TextRange.m4666getMaximpl(m4905getCompositionMzsxiRA2.m4673unboximpl());
            } else {
                i9 = -1;
            }
            if (i8 >= 0 && i8 < i9) {
                builder.setComposingText(i8, textFieldValue.getText().subSequence(i8, i9));
                addCharacterBounds(builder, i8, i9, offsetMapping, textLayoutResult, rect);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z10) {
            CursorAnchorInfoApi33Helper.setEditorBoundsInfo(builder, rect2);
        }
        if (i10 >= 34 && z11) {
            CursorAnchorInfoApi34Helper.addVisibleLineBounds(builder, textLayoutResult, rect);
        }
        return builder.build();
    }

    public static /* synthetic */ CursorAnchorInfo build$default(CursorAnchorInfo.Builder builder, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Matrix matrix, Rect rect, Rect rect2, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if ((i8 & 64) != 0) {
            z12 = true;
        } else {
            z12 = z8;
        }
        if ((i8 & 128) != 0) {
            z13 = true;
        } else {
            z13 = z9;
        }
        if ((i8 & 256) != 0) {
            z14 = true;
        } else {
            z14 = z10;
        }
        if ((i8 & 512) != 0) {
            z15 = true;
        } else {
            z15 = z11;
        }
        return build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, z12, z13, z14, z15);
    }

    private static final boolean containsInclusive(Rect rect, float f8, float f9) {
        float left = rect.getLeft();
        if (f8 <= rect.getRight() && left <= f8) {
            float top = rect.getTop();
            if (f9 <= rect.getBottom() && top <= f9) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i8, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Rect rect) {
        boolean z8;
        int i9;
        if (i8 < 0) {
            return builder;
        }
        int originalToTransformed = offsetMapping.originalToTransformed(i8);
        Rect cursorRect = textLayoutResult.getCursorRect(originalToTransformed);
        float j8 = i6.m.j(cursorRect.getLeft(), 0.0f, IntSize.m5321getWidthimpl(textLayoutResult.m4642getSizeYbymL2g()));
        boolean containsInclusive = containsInclusive(rect, j8, cursorRect.getTop());
        boolean containsInclusive2 = containsInclusive(rect, j8, cursorRect.getBottom());
        int i10 = 0;
        if (textLayoutResult.getBidiRunDirection(originalToTransformed) == ResolvedTextDirection.Rtl) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (containsInclusive || containsInclusive2) {
            i10 = 1;
        }
        if (!containsInclusive || !containsInclusive2) {
            i10 |= 2;
        }
        if (z8) {
            i9 = i10 | 4;
        } else {
            i9 = i10;
        }
        builder.setInsertionMarkerLocation(j8, cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i9);
        return builder;
    }
}
