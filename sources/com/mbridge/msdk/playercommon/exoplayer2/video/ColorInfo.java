package com.mbridge.msdk.playercommon.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new Parcelable.Creator<ColorInfo>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColorInfo[] newArray(int i8) {
            return new ColorInfo[0];
        }
    };
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    private int hashCode;
    public final byte[] hdrStaticInfo;

    public ColorInfo(int i8, int i9, int i10, byte[] bArr) {
        this.colorSpace = i8;
        this.colorRange = i9;
        this.colorTransfer = i10;
        this.hdrStaticInfo = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.colorSpace == colorInfo.colorSpace && this.colorRange == colorInfo.colorRange && this.colorTransfer == colorInfo.colorTransfer && Arrays.equals(this.hdrStaticInfo, colorInfo.hdrStaticInfo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((((((527 + this.colorSpace) * 31) + this.colorRange) * 31) + this.colorTransfer) * 31) + Arrays.hashCode(this.hdrStaticInfo);
        }
        return this.hashCode;
    }

    public final String toString() {
        boolean z8;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.colorSpace);
        sb.append(", ");
        sb.append(this.colorRange);
        sb.append(", ");
        sb.append(this.colorTransfer);
        sb.append(", ");
        if (this.hdrStaticInfo != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        sb.append(z8);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8;
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorRange);
        parcel.writeInt(this.colorTransfer);
        if (this.hdrStaticInfo != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Util.writeBoolean(parcel, z8);
        byte[] bArr = this.hdrStaticInfo;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    ColorInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorRange = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.hdrStaticInfo = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
    }
}
