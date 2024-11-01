package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public interface TwoWayConverter<T, V extends AnimationVector> {
    Function1 getConvertFromVector();

    Function1 getConvertToVector();
}
