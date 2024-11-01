package androidx.media;

import android.media.VolumeProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class VolumeProviderCompatApi21 {

    /* loaded from: classes3.dex */
    public interface Delegate {
        void onAdjustVolume(int i8);

        void onSetVolumeTo(int i8);
    }

    private VolumeProviderCompatApi21() {
    }

    public static Object createVolumeProvider(int i8, int i9, int i10, final Delegate delegate) {
        return new VolumeProvider(i8, i9, i10) { // from class: androidx.media.VolumeProviderCompatApi21.1
            @Override // android.media.VolumeProvider
            public void onAdjustVolume(int i11) {
                delegate.onAdjustVolume(i11);
            }

            @Override // android.media.VolumeProvider
            public void onSetVolumeTo(int i11) {
                delegate.onSetVolumeTo(i11);
            }
        };
    }

    public static void setCurrentVolume(Object obj, int i8) {
        ((VolumeProvider) obj).setCurrentVolume(i8);
    }
}
