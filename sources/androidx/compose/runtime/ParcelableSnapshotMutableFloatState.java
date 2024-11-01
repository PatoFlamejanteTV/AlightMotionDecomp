package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableFloatState extends SnapshotMutableFloatStateImpl implements Parcelable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new Parcelable.Creator<ParcelableSnapshotMutableFloatState>() { // from class: androidx.compose.runtime.ParcelableSnapshotMutableFloatState$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableFloatState createFromParcel(Parcel parcel) {
            return new ParcelableSnapshotMutableFloatState(parcel.readFloat());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableSnapshotMutableFloatState[] newArray(int i8) {
            return new ParcelableSnapshotMutableFloatState[i8];
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

    public ParcelableSnapshotMutableFloatState(float f8) {
        super(f8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(getFloatValue());
    }
}
