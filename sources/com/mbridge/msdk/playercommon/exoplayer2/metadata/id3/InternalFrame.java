package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator<InternalFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.InternalFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InternalFrame[] newArray(int i8) {
            return new InternalFrame[i8];
        }
    };
    public static final String ID = "----";
    public final String description;
    public final String domain;
    public final String text;

    public InternalFrame(String str, String str2, String str3) {
        super(ID);
        this.domain = str;
        this.description = str2;
        this.text = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (Util.areEqual(this.description, internalFrame.description) && Util.areEqual(this.domain, internalFrame.domain) && Util.areEqual(this.text, internalFrame.text)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i8;
        int i9;
        String str = this.domain;
        int i10 = 0;
        if (str != null) {
            i8 = str.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (527 + i8) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i9 = str2.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i11 + i9) * 31;
        String str3 = this.text;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return i12 + i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": domain=" + this.domain + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.id);
        parcel.writeString(this.domain);
        parcel.writeString(this.text);
    }

    InternalFrame(Parcel parcel) {
        super(ID);
        this.domain = (String) Assertions.checkNotNull(parcel.readString());
        this.description = (String) Assertions.checkNotNull(parcel.readString());
        this.text = (String) Assertions.checkNotNull(parcel.readString());
    }
}
