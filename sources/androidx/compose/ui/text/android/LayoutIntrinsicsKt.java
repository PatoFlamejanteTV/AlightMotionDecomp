package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(CharSequence charSequence, TextPaint textPaint) {
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue<Q5.r> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int minIntrinsicWidth$lambda$0;
                minIntrinsicWidth$lambda$0 = LayoutIntrinsicsKt.minIntrinsicWidth$lambda$0((Q5.r) obj, (Q5.r) obj2);
                return minIntrinsicWidth$lambda$0;
            }
        });
        int next = lineInstance.next();
        int i8 = 0;
        while (next != -1) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Q5.r(Integer.valueOf(i8), Integer.valueOf(next)));
            } else {
                Q5.r rVar = (Q5.r) priorityQueue.peek();
                if (rVar != null && ((Number) rVar.d()).intValue() - ((Number) rVar.c()).intValue() < next - i8) {
                    priorityQueue.poll();
                    priorityQueue.add(new Q5.r(Integer.valueOf(i8), Integer.valueOf(next)));
                }
            }
            int i9 = next;
            next = lineInstance.next();
            i8 = i9;
        }
        float f8 = 0.0f;
        for (Q5.r rVar2 : priorityQueue) {
            f8 = Math.max(f8, Layout.getDesiredWidth(charSequence, ((Number) rVar2.a()).intValue(), ((Number) rVar2.b()).intValue(), textPaint));
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minIntrinsicWidth$lambda$0(Q5.r rVar, Q5.r rVar2) {
        return (((Number) rVar.d()).intValue() - ((Number) rVar.c()).intValue()) - (((Number) rVar2.d()).intValue() - ((Number) rVar2.c()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:            if (androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class) == false) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean shouldIncreaseMaxIntrinsic(float r1, java.lang.CharSequence r2, android.text.TextPaint r3) {
        /*
            r0 = 0
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L24
        L6:
            boolean r1 = r2 instanceof android.text.Spanned
            if (r1 == 0) goto L1c
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanPx> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanPx.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
            java.lang.Class<androidx.compose.ui.text.android.style.LetterSpacingSpanEm> r1 = androidx.compose.ui.text.android.style.LetterSpacingSpanEm.class
            boolean r1 = androidx.compose.ui.text.android.SpannedExtensionsKt.hasSpan(r2, r1)
            if (r1 != 0) goto L26
        L1c:
            float r1 = r3.getLetterSpacing()
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 != 0) goto L26
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(float, java.lang.CharSequence, android.text.TextPaint):boolean");
    }
}
