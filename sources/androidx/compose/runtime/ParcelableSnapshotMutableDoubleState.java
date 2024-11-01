package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableDoubleState extends SnapshotMutableDoubleStateImpl implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableDoubleState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableDoubleState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableDoubleState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableDoubleState(parcel.readDouble());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableDoubleState[] newArray(int i8) {
            return new ParcelableSnapshotMutableDoubleState[i8];
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

    public ParcelableSnapshotMutableDoubleState(double d8) {
        super(d8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeDouble(getDoubleValue());
    }
}
