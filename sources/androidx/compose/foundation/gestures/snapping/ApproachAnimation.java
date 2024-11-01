package androidx.compose.foundation.gestures.snapping;

import U5.d;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.foundation.gestures.ScrollScope;
import kotlin.jvm.functions.Function1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface ApproachAnimation<T, V extends AnimationVector> {
    Object approachAnimation(ScrollScope scrollScope, T t8, T t9, Function1 function1, d dVar);
}
