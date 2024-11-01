package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i8) {
            return new SpliceScheduleCommand[i8];
        }
    };
    public final List<Event> events;

    /* loaded from: classes4.dex */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }

        private ComponentSplice(int i8, long j8) {
            this.componentTag = i8;
            this.utcSpliceTime = j8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(readUnsignedByte);
        for (int i8 = 0; i8 < readUnsignedByte; i8++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.events.get(i9).writeToParcel(parcel);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = DesugarCollections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = DesugarCollections.unmodifiableList(arrayList);
    }

    /* loaded from: classes4.dex */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j8, boolean z8, boolean z9, boolean z10, List<ComponentSplice> list, long j9, boolean z11, long j10, int i8, int i9, int i10) {
            this.spliceEventId = j8;
            this.spliceEventCancelIndicator = z8;
            this.outOfNetworkIndicator = z9;
            this.programSpliceFlag = z10;
            this.componentSpliceList = DesugarCollections.unmodifiableList(list);
            this.utcSpliceTime = j9;
            this.autoReturn = z11;
            this.breakDurationUs = j10;
            this.uniqueProgramId = i8;
            this.availNum = i9;
            this.availsExpected = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z8;
            ArrayList arrayList;
            boolean z9;
            long j8;
            boolean z10;
            long j9;
            int i8;
            int i9;
            int i10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            long j10;
            boolean z15;
            long j11;
            boolean z16;
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z8) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if ((readUnsignedByte & 128) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if ((readUnsignedByte & 64) != 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((readUnsignedByte & 32) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z13) {
                    j10 = parsableByteArray.readUnsignedInt();
                } else {
                    j10 = C.TIME_UNSET;
                }
                if (!z13) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(readUnsignedByte2);
                    for (int i11 = 0; i11 < readUnsignedByte2; i11++) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z14) {
                    long readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((128 & readUnsignedByte3) != 0) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    j11 = ((((readUnsignedByte3 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z15 = z16;
                } else {
                    z15 = false;
                    j11 = C.TIME_UNSET;
                }
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                z11 = z13;
                i10 = parsableByteArray.readUnsignedByte();
                j9 = j11;
                arrayList = arrayList2;
                long j12 = j10;
                i8 = readUnsignedShort;
                i9 = readUnsignedByte4;
                j8 = j12;
                boolean z17 = z12;
                z10 = z15;
                z9 = z17;
            } else {
                arrayList = arrayList2;
                z9 = false;
                j8 = C.TIME_UNSET;
                z10 = false;
                j9 = C.TIME_UNSET;
                i8 = 0;
                i9 = 0;
                i10 = 0;
                z11 = false;
            }
            return new Event(readUnsignedInt, z8, z9, z11, arrayList, j8, z10, j9, i8, i9, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i8 = 0; i8 < size; i8++) {
                this.componentSpliceList.get(i8).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 < readInt; i8++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = DesugarCollections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }
}
