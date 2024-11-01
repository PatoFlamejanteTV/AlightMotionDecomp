package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface DecayAnimationSpec<T> {
    <V extends AnimationVector> VectorizedDecayAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
