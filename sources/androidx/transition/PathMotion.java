package androidx.transition;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public abstract class PathMotion {
    public PathMotion() {
    }

    @NonNull
    public abstract Path getPath(float f8, float f9, float f10, float f11);

    public PathMotion(@NonNull Context context, @NonNull AttributeSet attributeSet) {
    }
}
