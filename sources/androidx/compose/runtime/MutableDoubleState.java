package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            double doubleValue;
            doubleValue = i.a(mutableDoubleState).doubleValue();
            return Double.valueOf(doubleValue);
        }

        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d8) {
            i.c(mutableDoubleState, d8);
        }
    }

    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    Double getValue();

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();

    void setDoubleValue(double d8);

    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    void setValue(double d8);

    @Override // androidx.compose.runtime.MutableState
    /* bridge */ /* synthetic */ void setValue(Double d8);
}
