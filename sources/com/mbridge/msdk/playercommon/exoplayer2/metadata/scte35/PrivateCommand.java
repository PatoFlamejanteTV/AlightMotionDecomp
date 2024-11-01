package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;

/* loaded from: classes4.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator<PrivateCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.PrivateCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivateCommand[] newArray(int i8) {
            return new PrivateCommand[i8];
        }
    };
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PrivateCommand parseFromSection(ParsableByteArray parsableByteArray, int i8, long j8) {
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int i9 = i8 - 4;
        byte[] bArr = new byte[i9];
        parsableByteArray.readBytes(bArr, 0, i9);
        return new PrivateCommand(readUnsignedInt, bArr, j8);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeInt(this.commandBytes.length);
        parcel.writeByteArray(this.commandBytes);
    }

    private PrivateCommand(long j8, byte[] bArr, long j9) {
        this.ptsAdjustment = j9;
        this.identifier = j8;
        this.commandBytes = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.commandBytes = bArr;
        parcel.readByteArray(bArr);
    }
}
