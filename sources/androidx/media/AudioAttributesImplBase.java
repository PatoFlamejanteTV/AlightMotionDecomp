package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes3.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    int mContentType;
    int mFlags;
    int mLegacyStream;
    int mUsage;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
        this.mLegacyStream = -1;
    }

    public static AudioAttributesImpl fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt("androidx.media.audio_attrs.CONTENT_TYPE", 0), bundle.getInt("androidx.media.audio_attrs.FLAGS", 0), bundle.getInt("androidx.media.audio_attrs.USAGE", 0), bundle.getInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", -1));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.mContentType != audioAttributesImplBase.getContentType() || this.mFlags != audioAttributesImplBase.getFlags() || this.mUsage != audioAttributesImplBase.getUsage() || this.mLegacyStream != audioAttributesImplBase.mLegacyStream) {
            return false;
        }
        return true;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object getAudioAttributes() {
        return null;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getContentType() {
        return this.mContentType;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getFlags() {
        int i8 = this.mFlags;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i8 |= 4;
        } else if (legacyStreamType == 7) {
            i8 |= 1;
        }
        return i8 & 273;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getLegacyStreamType() {
        int i8 = this.mLegacyStream;
        if (i8 != -1) {
            return i8;
        }
        return AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getRawLegacyStreamType() {
        return this.mLegacyStream;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getUsage() {
        return this.mUsage;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int getVolumeControlStream() {
        return AudioAttributesCompat.toVolumeStreamType(true, this.mFlags, this.mUsage);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mContentType), Integer.valueOf(this.mFlags), Integer.valueOf(this.mUsage), Integer.valueOf(this.mLegacyStream)});
    }

    @Override // androidx.media.AudioAttributesImpl
    @NonNull
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt("androidx.media.audio_attrs.USAGE", this.mUsage);
        bundle.putInt("androidx.media.audio_attrs.CONTENT_TYPE", this.mContentType);
        bundle.putInt("androidx.media.audio_attrs.FLAGS", this.mFlags);
        int i8 = this.mLegacyStream;
        if (i8 != -1) {
            bundle.putInt("androidx.media.audio_attrs.LEGACY_STREAM_TYPE", i8);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.mLegacyStream != -1) {
            sb.append(" stream=");
            sb.append(this.mLegacyStream);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.usageToString(this.mUsage));
        sb.append(" content=");
        sb.append(this.mContentType);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.mFlags).toUpperCase());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplBase(int i8, int i9, int i10, int i11) {
        this.mContentType = i8;
        this.mFlags = i9;
        this.mUsage = i10;
        this.mLegacyStream = i11;
    }
}
