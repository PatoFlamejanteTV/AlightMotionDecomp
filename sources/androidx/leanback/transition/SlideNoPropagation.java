package androidx.leanback.transition;

import android.content.Context;
import android.transition.Slide;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SlideNoPropagation extends Slide {
    public SlideNoPropagation() {
    }

    @Override // android.transition.Slide
    public void setSlideEdge(int i8) {
        super.setSlideEdge(i8);
        setPropagation(null);
    }

    public SlideNoPropagation(int i8) {
        super(i8);
    }

    public SlideNoPropagation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
