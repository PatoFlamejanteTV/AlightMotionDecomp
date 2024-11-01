package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.VolumeProviderCompatApi21;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public abstract class VolumeProviderCompat {
    public static final int VOLUME_CONTROL_ABSOLUTE = 2;
    public static final int VOLUME_CONTROL_FIXED = 0;
    public static final int VOLUME_CONTROL_RELATIVE = 1;
    private Callback mCallback;
    private final int mControlType;
    private int mCurrentVolume;
    private final int mMaxVolume;
    private Object mVolumeProviderObj;

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public abstract void onVolumeChanged(VolumeProviderCompat volumeProviderCompat);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface ControlType {
    }

    public VolumeProviderCompat(int i8, int i9, int i10) {
        this.mControlType = i8;
        this.mMaxVolume = i9;
        this.mCurrentVolume = i10;
    }

    public final int getCurrentVolume() {
        return this.mCurrentVolume;
    }

    public final int getMaxVolume() {
        return this.mMaxVolume;
    }

    public final int getVolumeControl() {
        return this.mControlType;
    }

    public Object getVolumeProvider() {
        if (this.mVolumeProviderObj == null) {
            this.mVolumeProviderObj = VolumeProviderCompatApi21.createVolumeProvider(this.mControlType, this.mMaxVolume, this.mCurrentVolume, new VolumeProviderCompatApi21.Delegate() { // from class: androidx.media.VolumeProviderCompat.1
                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onAdjustVolume(int i8) {
                    VolumeProviderCompat.this.onAdjustVolume(i8);
                }

                @Override // androidx.media.VolumeProviderCompatApi21.Delegate
                public void onSetVolumeTo(int i8) {
                    VolumeProviderCompat.this.onSetVolumeTo(i8);
                }
            });
        }
        return this.mVolumeProviderObj;
    }

    public void onAdjustVolume(int i8) {
    }

    public void onSetVolumeTo(int i8) {
    }

    public void setCallback(Callback callback) {
        this.mCallback = callback;
    }

    public final void setCurrentVolume(int i8) {
        this.mCurrentVolume = i8;
        Object volumeProvider = getVolumeProvider();
        if (volumeProvider != null) {
            VolumeProviderCompatApi21.setCurrentVolume(volumeProvider, i8);
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.onVolumeChanged(this);
        }
    }
}
