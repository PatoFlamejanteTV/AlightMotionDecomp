package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface FloatState extends State<Float> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
        @Deprecated
        public static Float getValue(FloatState floatState) {
            float floatValue;
            floatValue = e.a(floatState).floatValue();
            return Float.valueOf(floatValue);
        }
    }

    float getFloatValue();

    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "floatValue")
    Float getValue();

    @Override // androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();
}
