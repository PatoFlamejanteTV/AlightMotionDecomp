package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 2)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {
    public static final int $stable = 0;
    private static final int PolicyNeverEquals = 0;
    private static final int PolicyReferentialEquality = 2;
    private static final int PolicyStructuralEquality = 1;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableState$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object>[] newArray(int i8) {
            return new ParcelableSnapshotMutableState[i8];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotMutationPolicy neverEqualPolicy;
            if (classLoader == null) {
                classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                neverEqualPolicy = SnapshotStateKt.neverEqualPolicy();
            } else if (readInt == 1) {
                neverEqualPolicy = SnapshotStateKt.structuralEqualityPolicy();
            } else if (readInt == 2) {
                neverEqualPolicy = SnapshotStateKt.referentialEqualityPolicy();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new ParcelableSnapshotMutableState<>(readValue, neverEqualPolicy);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    };

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getCREATOR$annotations() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public ParcelableSnapshotMutableState(T t8, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        super(t8, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int i9;
        parcel.writeValue(getValue());
        SnapshotMutationPolicy<T> policy = getPolicy();
        if (AbstractC3292y.d(policy, SnapshotStateKt.neverEqualPolicy())) {
            i9 = 0;
        } else if (AbstractC3292y.d(policy, SnapshotStateKt.structuralEqualityPolicy())) {
            i9 = 1;
        } else if (AbstractC3292y.d(policy, SnapshotStateKt.referentialEqualityPolicy())) {
            i9 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i9);
    }
}
