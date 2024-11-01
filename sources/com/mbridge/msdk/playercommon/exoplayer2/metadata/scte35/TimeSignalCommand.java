package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;

/* loaded from: classes4.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator<TimeSignalCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.TimeSignalCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TimeSignalCommand[] newArray(int i8) {
            return new TimeSignalCommand[i8];
        }
    };
    public final long playbackPositionUs;
    public final long ptsTime;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TimeSignalCommand parseFromSection(ParsableByteArray parsableByteArray, long j8, TimestampAdjuster timestampAdjuster) {
        long parseSpliceTime = parseSpliceTime(parsableByteArray, j8);
        return new TimeSignalCommand(parseSpliceTime, timestampAdjuster.adjustTsTimestamp(parseSpliceTime));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long parseSpliceTime(ParsableByteArray parsableByteArray, long j8) {
        long readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((128 & readUnsignedByte) != 0) {
            return 8589934591L & ((((readUnsignedByte & 1) << 32) | parsableByteArray.readUnsignedInt()) + j8);
        }
        return C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }

    private TimeSignalCommand(long j8, long j9) {
        this.ptsTime = j8;
        this.playbackPositionUs = j9;
    }
}
