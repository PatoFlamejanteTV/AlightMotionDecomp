package androidx.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* loaded from: classes3.dex */
class RectEvaluator implements TypeEvaluator<Rect> {
    private Rect mRect;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RectEvaluator(Rect rect) {
        this.mRect = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f8, Rect rect, Rect rect2) {
        int i8 = rect.left + ((int) ((rect2.left - r0) * f8));
        int i9 = rect.top + ((int) ((rect2.top - r1) * f8));
        int i10 = rect.right + ((int) ((rect2.right - r2) * f8));
        int i11 = rect.bottom + ((int) ((rect2.bottom - r6) * f8));
        Rect rect3 = this.mRect;
        if (rect3 == null) {
            return new Rect(i8, i9, i10, i11);
        }
        rect3.set(i8, i9, i10, i11);
        return this.mRect;
    }
}
