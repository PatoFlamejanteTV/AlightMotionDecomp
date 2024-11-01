package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class TwoWayConverterImpl<T, V extends AnimationVector> implements TwoWayConverter<T, V> {
    private final Function1 convertFromVector;
    private final Function1 convertToVector;

    public TwoWayConverterImpl(Function1 convertToVector, Function1 convertFromVector) {
        AbstractC3292y.i(convertToVector, "convertToVector");
        AbstractC3292y.i(convertFromVector, "convertFromVector");
        this.convertToVector = convertToVector;
        this.convertFromVector = convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertFromVector() {
        return this.convertFromVector;
    }

    @Override // androidx.compose.animation.core.TwoWayConverter
    public Function1 getConvertToVector() {
        return this.convertToVector;
    }
}
