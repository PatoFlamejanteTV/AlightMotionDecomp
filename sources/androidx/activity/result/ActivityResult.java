package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityResult> CREATOR = new Parcelable.Creator<ActivityResult>() { // from class: androidx.activity.result.ActivityResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult createFromParcel(@NonNull Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ActivityResult[] newArray(int i8) {
            return new ActivityResult[i8];
        }
    };

    @Nullable
    private final Intent mData;
    private final int mResultCode;

    public ActivityResult(int i8, @Nullable Intent intent) {
        this.mResultCode = i8;
        this.mData = intent;
    }

    @NonNull
    public static String resultCodeToString(int i8) {
        if (i8 != -1) {
            if (i8 != 0) {
                return String.valueOf(i8);
            }
            return "RESULT_CANCELED";
        }
        return "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public Intent getData() {
        return this.mData;
    }

    public int getResultCode() {
        return this.mResultCode;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + resultCodeToString(this.mResultCode) + ", data=" + this.mData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        int i9;
        parcel.writeInt(this.mResultCode);
        if (this.mData == null) {
            i9 = 0;
        } else {
            i9 = 1;
        }
        parcel.writeInt(i9);
        Intent intent = this.mData;
        if (intent != null) {
            intent.writeToParcel(parcel, i8);
        }
    }

    ActivityResult(Parcel parcel) {
        this.mResultCode = parcel.readInt();
        this.mData = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
