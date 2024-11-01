package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface MutableFloatState extends FloatState, MutableState<Float> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static Float getValue(MutableFloatState mutableFloatState) {
            float floatValue;
            floatValue = j.a(mutableFloatState).floatValue();
            return Float.valueOf(floatValue);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static void setValue(MutableFloatState mutableFloatState, float f8) {
            j.c(mutableFloatState, f8);
        }
    }

    @Override // androidx.compose.runtime.FloatState
    float getFloatValue();

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    Float getValue();

    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();

    void setFloatValue(float f8);

    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    void setValue(float f8);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Float f8);
}
