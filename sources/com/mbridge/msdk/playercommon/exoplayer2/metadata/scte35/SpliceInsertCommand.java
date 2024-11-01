package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i8) {
            return new SpliceInsertCommand[i8];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* loaded from: classes4.dex */
    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public final void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i8, long j8, long j9) {
            this.componentTag = i8;
            this.componentSplicePts = j8;
            this.componentSplicePlaybackPositionUs = j9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j8, TimestampAdjuster timestampAdjuster) {
        boolean z8;
        List list;
        boolean z9;
        boolean z10;
        long j9;
        boolean z11;
        long j10;
        int i8;
        int i9;
        int i10;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        long j11;
        boolean z17;
        long j12;
        boolean z18;
        long j13;
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z8) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            if ((readUnsignedByte & 128) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((readUnsignedByte & 64) != 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((readUnsignedByte & 32) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((readUnsignedByte & 16) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z14 && !z16) {
                j11 = TimeSignalCommand.parseSpliceTime(parsableByteArray, j8);
            } else {
                j11 = C.TIME_UNSET;
            }
            if (!z14) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(readUnsignedByte2);
                for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if (!z16) {
                        j13 = TimeSignalCommand.parseSpliceTime(parsableByteArray, j8);
                    } else {
                        j13 = C.TIME_UNSET;
                    }
                    arrayList.add(new ComponentSplice(readUnsignedByte3, j13, timestampAdjuster.adjustTsTimestamp(j13)));
                }
                emptyList = arrayList;
            }
            if (z15) {
                long readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                if ((128 & readUnsignedByte4) != 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                j12 = ((((readUnsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z17 = z18;
            } else {
                z17 = false;
                j12 = C.TIME_UNSET;
            }
            i8 = parsableByteArray.readUnsignedShort();
            z12 = z14;
            i9 = parsableByteArray.readUnsignedByte();
            i10 = parsableByteArray.readUnsignedByte();
            list = emptyList;
            long j14 = j11;
            z11 = z17;
            j10 = j12;
            z10 = z16;
            z9 = z13;
            j9 = j14;
        } else {
            list = emptyList;
            z9 = false;
            z10 = false;
            j9 = C.TIME_UNSET;
            z11 = false;
            j10 = C.TIME_UNSET;
            i8 = 0;
            i9 = 0;
            i10 = 0;
            z12 = false;
        }
        return new SpliceInsertCommand(readUnsignedInt, z8, z9, z12, z10, j9, timestampAdjuster.adjustTsTimestamp(j9), list, z11, j10, i8, i9, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.componentSpliceList.get(i9).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j8, boolean z8, boolean z9, boolean z10, boolean z11, long j9, long j10, List<ComponentSplice> list, boolean z12, long j11, int i8, int i9, int i10) {
        this.spliceEventId = j8;
        this.spliceEventCancelIndicator = z8;
        this.outOfNetworkIndicator = z9;
        this.programSpliceFlag = z10;
        this.spliceImmediateFlag = z11;
        this.programSplicePts = j9;
        this.programSplicePlaybackPositionUs = j10;
        this.componentSpliceList = DesugarCollections.unmodifiableList(list);
        this.autoReturn = z12;
        this.breakDurationUs = j11;
        this.uniqueProgramId = i8;
        this.availNum = i9;
        this.availsExpected = i10;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = DesugarCollections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
