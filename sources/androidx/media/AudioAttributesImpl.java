package androidx.media;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes3.dex */
interface AudioAttributesImpl extends VersionedParcelable {
    Object getAudioAttributes();

    int getContentType();

    int getFlags();

    int getLegacyStreamType();

    int getRawLegacyStreamType();

    int getUsage();

    int getVolumeControlStream();

    @NonNull
    Bundle toBundle();
}
