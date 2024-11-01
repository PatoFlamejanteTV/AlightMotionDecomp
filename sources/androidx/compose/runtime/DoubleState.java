package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AutoboxingStateValueProperty;

@Stable
/* loaded from: classes.dex */
public interface DoubleState extends State<Double> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
        @Deprecated
        public static Double getValue(DoubleState doubleState) {
            double doubleValue;
            doubleValue = d.a(doubleState).doubleValue();
            return Double.valueOf(doubleValue);
        }
    }

    double getDoubleValue();

    @Override // androidx.compose.runtime.State
    @AutoboxingStateValueProperty(preferredPropertyName = "doubleValue")
    Double getValue();

    @Override // androidx.compose.runtime.State
    /* bridge */ /* synthetic */ Object getValue();
}
