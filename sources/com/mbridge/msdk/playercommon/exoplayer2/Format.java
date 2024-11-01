package com.mbridge.msdk.playercommon.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.mbridge.msdk.playercommon.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator<Format>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.Format.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Format[] newArray(int i8) {
            return new Format[i8];
        }
    };
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    public final String codecs;
    public final ColorInfo colorInfo;
    public final String containerMimeType;
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    public final String id;
    public final List<byte[]> initializationData;
    public final String language;
    public final int maxInputSize;
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    public final byte[] projectionData;
    public final int rotationDegrees;
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    Format(String str, String str2, String str3, String str4, int i8, int i9, int i10, int i11, float f8, int i12, float f9, byte[] bArr, int i13, ColorInfo colorInfo, int i14, int i15, int i16, int i17, int i18, int i19, String str5, int i20, long j8, List<byte[]> list, DrmInitData drmInitData, Metadata metadata) {
        this.id = str;
        this.containerMimeType = str2;
        this.sampleMimeType = str3;
        this.codecs = str4;
        this.bitrate = i8;
        this.maxInputSize = i9;
        this.width = i10;
        this.height = i11;
        this.frameRate = f8;
        int i21 = i12;
        this.rotationDegrees = i21 == -1 ? 0 : i21;
        this.pixelWidthHeightRatio = f9 == -1.0f ? 1.0f : f9;
        this.projectionData = bArr;
        this.stereoMode = i13;
        this.colorInfo = colorInfo;
        this.channelCount = i14;
        this.sampleRate = i15;
        this.pcmEncoding = i16;
        int i22 = i17;
        this.encoderDelay = i22 == -1 ? 0 : i22;
        this.encoderPadding = i18 != -1 ? i18 : 0;
        this.selectionFlags = i19;
        this.language = str5;
        this.accessibilityChannel = i20;
        this.subsampleOffsetUs = j8;
        this.initializationData = list == null ? Collections.emptyList() : list;
        this.drmInitData = drmInitData;
        this.metadata = metadata;
    }

    public static Format createAudioContainerFormat(String str, String str2, String str3, String str4, int i8, int i9, int i10, List<byte[]> list, int i11, String str5) {
        return new Format(str, str2, str3, str4, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i9, i10, -1, -1, -1, i11, str5, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, List<byte[]> list, DrmInitData drmInitData, int i12, String str4) {
        return createAudioSampleFormat(str, str2, str3, i8, i9, i10, i11, -1, list, drmInitData, i12, str4);
    }

    public static Format createContainerFormat(String str, String str2, String str3, String str4, int i8, int i9, String str5) {
        return new Format(str, str2, str3, str4, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i9, str5, -1, Long.MAX_VALUE, null, null, null);
    }

    public static Format createImageSampleFormat(String str, String str2, String str3, int i8, int i9, List<byte[]> list, String str4, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i9, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format createSampleFormat(String str, String str2, long j8) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j8, null, null, null);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i8, int i9, String str5) {
        return createTextContainerFormat(str, str2, str3, str4, i8, i9, str5, -1);
    }

    public static Format createTextSampleFormat(String str, String str2, int i8, String str3) {
        return createTextSampleFormat(str, str2, i8, str3, null);
    }

    public static Format createVideoContainerFormat(String str, String str2, String str3, String str4, int i8, int i9, int i10, float f8, List<byte[]> list, int i11) {
        return new Format(str, str2, str3, str4, i8, -1, i9, i10, f8, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i11, null, -1, Long.MAX_VALUE, list, null, null);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, float f8, List<byte[]> list, DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i8, i9, i10, i11, f8, list, -1, -1.0f, drmInitData);
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(format.id);
        sb.append(", mimeType=");
        sb.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            sb.append(", bitrate=");
            sb.append(format.bitrate);
        }
        if (format.width != -1 && format.height != -1) {
            sb.append(", res=");
            sb.append(format.width);
            sb.append("x");
            sb.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            sb.append(", fps=");
            sb.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            sb.append(", channels=");
            sb.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            sb.append(", sample_rate=");
            sb.append(format.sampleRate);
        }
        if (format.language != null) {
            sb.append(", language=");
            sb.append(format.language);
        }
        return sb.toString();
    }

    public final Format copyWithContainerInfo(String str, String str2, String str3, int i8, int i9, int i10, int i11, String str4) {
        return new Format(str, this.containerMimeType, str2, str3, i8, this.maxInputSize, i9, i10, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i11, str4, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithDrmInitData(DrmInitData drmInitData) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, drmInitData, this.metadata);
    }

    public final Format copyWithGaplessInfo(int i8, int i9) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, i8, i9, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithManifestFormatInfo(Format format) {
        if (this == format) {
            return this;
        }
        String str = format.id;
        String str2 = this.codecs;
        if (str2 == null) {
            str2 = format.codecs;
        }
        String str3 = str2;
        int i8 = this.bitrate;
        if (i8 == -1) {
            i8 = format.bitrate;
        }
        int i9 = i8;
        float f8 = this.frameRate;
        if (f8 == -1.0f) {
            f8 = format.frameRate;
        }
        float f9 = f8;
        int i10 = this.selectionFlags | format.selectionFlags;
        String str4 = this.language;
        if (str4 == null) {
            str4 = format.language;
        }
        return new Format(str, this.containerMimeType, this.sampleMimeType, str3, i9, this.maxInputSize, this.width, this.height, f9, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, i10, str4, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, DrmInitData.createSessionCreationData(format.drmInitData, this.drmInitData), this.metadata);
    }

    public final Format copyWithMaxInputSize(int i8) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, i8, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithMetadata(Metadata metadata) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, metadata);
    }

    public final Format copyWithRotationDegrees(int i8) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, i8, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, this.subsampleOffsetUs, this.initializationData, this.drmInitData, this.metadata);
    }

    public final Format copyWithSubsampleOffsetUs(long j8) {
        return new Format(this.id, this.containerMimeType, this.sampleMimeType, this.codecs, this.bitrate, this.maxInputSize, this.width, this.height, this.frameRate, this.rotationDegrees, this.pixelWidthHeightRatio, this.projectionData, this.stereoMode, this.colorInfo, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, j8, this.initializationData, this.drmInitData, this.metadata);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        if (this.bitrate == format.bitrate && this.maxInputSize == format.maxInputSize && this.width == format.width && this.height == format.height && this.frameRate == format.frameRate && this.rotationDegrees == format.rotationDegrees && this.pixelWidthHeightRatio == format.pixelWidthHeightRatio && this.stereoMode == format.stereoMode && this.channelCount == format.channelCount && this.sampleRate == format.sampleRate && this.pcmEncoding == format.pcmEncoding && this.encoderDelay == format.encoderDelay && this.encoderPadding == format.encoderPadding && this.subsampleOffsetUs == format.subsampleOffsetUs && this.selectionFlags == format.selectionFlags && Util.areEqual(this.id, format.id) && Util.areEqual(this.language, format.language) && this.accessibilityChannel == format.accessibilityChannel && Util.areEqual(this.containerMimeType, format.containerMimeType) && Util.areEqual(this.sampleMimeType, format.sampleMimeType) && Util.areEqual(this.codecs, format.codecs) && Util.areEqual(this.drmInitData, format.drmInitData) && Util.areEqual(this.metadata, format.metadata) && Util.areEqual(this.colorInfo, format.colorInfo) && Arrays.equals(this.projectionData, format.projectionData) && initializationDataEquals(format)) {
            return true;
        }
        return false;
    }

    public final int getPixelCount() {
        int i8;
        int i9 = this.width;
        if (i9 == -1 || (i8 = this.height) == -1) {
            return -1;
        }
        return i9 * i8;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.hashCode == 0) {
            String str = this.id;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (527 + hashCode) * 31;
            String str2 = this.containerMimeType;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i10 = (i9 + hashCode2) * 31;
            String str3 = this.sampleMimeType;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i11 = (i10 + hashCode3) * 31;
            String str4 = this.codecs;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i12 = (((((((((((i11 + hashCode4) * 31) + this.bitrate) * 31) + this.width) * 31) + this.height) * 31) + this.channelCount) * 31) + this.sampleRate) * 31;
            String str5 = this.language;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i13 = (((i12 + hashCode5) * 31) + this.accessibilityChannel) * 31;
            DrmInitData drmInitData = this.drmInitData;
            if (drmInitData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = drmInitData.hashCode();
            }
            int i14 = (i13 + hashCode6) * 31;
            Metadata metadata = this.metadata;
            if (metadata != null) {
                i8 = metadata.hashCode();
            }
            this.hashCode = i14 + i8;
        }
        return this.hashCode;
    }

    public final boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.initializationData.size(); i8++) {
            if (!Arrays.equals(this.initializationData.get(i8), format.initializationData.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "Format(" + this.id + ", " + this.containerMimeType + ", " + this.sampleMimeType + ", " + this.bitrate + ", " + this.language + ", [" + this.width + ", " + this.height + ", " + this.frameRate + "], [" + this.channelCount + ", " + this.sampleRate + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z8;
        parcel.writeString(this.id);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeString(this.codecs);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.maxInputSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        if (this.projectionData != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        Util.writeBoolean(parcel, z8);
        byte[] bArr = this.projectionData;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i8);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.selectionFlags);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
        parcel.writeLong(this.subsampleOffsetUs);
        int size = this.initializationData.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            parcel.writeByteArray(this.initializationData.get(i9));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeParcelable(this.metadata, 0);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, int i12, List<byte[]> list, DrmInitData drmInitData, int i13, String str4) {
        return createAudioSampleFormat(str, str2, str3, i8, i9, i10, i11, i12, -1, -1, list, drmInitData, i13, str4, null);
    }

    public static Format createSampleFormat(String str, String str2, String str3, int i8, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    public static Format createTextContainerFormat(String str, String str2, String str3, String str4, int i8, int i9, String str5, int i10) {
        return new Format(str, str2, str3, str4, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i9, str5, i10, Long.MAX_VALUE, null, null, null);
    }

    public static Format createTextSampleFormat(String str, String str2, int i8, String str3, DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, null, -1, i8, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, float f8, List<byte[]> list, int i12, float f9, DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i8, i9, i10, i11, f8, list, i12, f9, null, -1, null, drmInitData);
    }

    public static Format createAudioSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, int i12, int i13, int i14, List<byte[]> list, DrmInitData drmInitData, int i15, String str4, Metadata metadata) {
        return new Format(str, null, str2, str3, i8, i9, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i10, i11, i12, i13, i14, i15, str4, -1, Long.MAX_VALUE, list, drmInitData, metadata);
    }

    public static Format createVideoSampleFormat(String str, String str2, String str3, int i8, int i9, int i10, int i11, float f8, List<byte[]> list, int i12, float f9, byte[] bArr, int i13, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i8, i9, i10, i11, f8, i12, f9, bArr, i13, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i8, int i9, String str4, int i10, DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, str3, i8, i9, str4, i10, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i8, int i9, String str4, DrmInitData drmInitData, long j8) {
        return createTextSampleFormat(str, str2, str3, i8, i9, str4, -1, drmInitData, j8, Collections.emptyList());
    }

    public static Format createTextSampleFormat(String str, String str2, String str3, int i8, int i9, String str4, int i10, DrmInitData drmInitData, long j8, List<byte[]> list) {
        return new Format(str, null, str2, str3, i8, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i9, str4, i10, j8, list, drmInitData, null);
    }

    Format(Parcel parcel) {
        this.id = parcel.readString();
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.codecs = parcel.readString();
        this.bitrate = parcel.readInt();
        this.maxInputSize = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = Util.readBoolean(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.selectionFlags = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.subsampleOffsetUs = parcel.readLong();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }
}
