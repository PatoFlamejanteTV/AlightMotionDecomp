package androidx.transition;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.transformation.FabTransformationScrimBehavior;

/* loaded from: classes3.dex */
public interface TransitionSeekController {
    void addOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer);

    void addOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer);

    void animateToEnd();

    void animateToStart(@NonNull Runnable runnable);

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    float getCurrentFraction();

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    long getCurrentPlayTimeMillis();

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY)
    long getDurationMillis();

    boolean isReady();

    void removeOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer);

    void removeOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer);

    void setCurrentFraction(@FloatRange(from = 0.0d, to = 1.0d) float f8);

    void setCurrentPlayTimeMillis(@IntRange(from = 0) long j8);
}
