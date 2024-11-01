package androidx.compose.animation.core;

/* loaded from: classes.dex */
public interface FiniteAnimationSpec<T> extends AnimationSpec<T> {
    @Override // androidx.compose.animation.core.AnimationSpec
    <V extends AnimationVector> VectorizedFiniteAnimationSpec<V> vectorize(TwoWayConverter<T, V> twoWayConverter);
}
