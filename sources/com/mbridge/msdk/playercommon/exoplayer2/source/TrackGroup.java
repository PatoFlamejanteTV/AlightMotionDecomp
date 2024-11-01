package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new Parcelable.Creator<TrackGroup>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroup[] newArray(int i8) {
            return new TrackGroup[i8];
        }
    };
    private final Format[] formats;
    private int hashCode;
    public final int length;

    public TrackGroup(Format... formatArr) {
        Assertions.checkState(formatArr.length > 0);
        this.formats = formatArr;
        this.length = formatArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.length == trackGroup.length && Arrays.equals(this.formats, trackGroup.formats)) {
            return true;
        }
        return false;
    }

    public final Format getFormat(int i8) {
        return this.formats[i8];
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = 527 + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public final int indexOf(Format format) {
        int i8 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i8 < formatArr.length) {
                if (format == formatArr[i8]) {
                    return i8;
                }
                i8++;
            } else {
                return -1;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.length);
        for (int i9 = 0; i9 < this.length; i9++) {
            parcel.writeParcelable(this.formats[i9], 0);
        }
    }

    TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.length = readInt;
        this.formats = new Format[readInt];
        for (int i8 = 0; i8 < this.length; i8++) {
            this.formats[i8] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
