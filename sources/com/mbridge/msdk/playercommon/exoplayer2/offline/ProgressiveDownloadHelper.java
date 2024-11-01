package com.mbridge.msdk.playercommon.exoplayer2.offline;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import java.util.List;

/* loaded from: classes4.dex */
public final class ProgressiveDownloadHelper extends DownloadHelper {
    private final String customCacheKey;
    private final Uri uri;

    public ProgressiveDownloadHelper(Uri uri) {
        this(uri, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final DownloadAction getDownloadAction(byte[] bArr, List<TrackKey> list) {
        return new ProgressiveDownloadAction(this.uri, false, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final int getPeriodCount() {
        return 1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final DownloadAction getRemoveAction(byte[] bArr) {
        return new ProgressiveDownloadAction(this.uri, true, bArr, this.customCacheKey);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    public final TrackGroupArray getTrackGroups(int i8) {
        return TrackGroupArray.EMPTY;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadHelper
    protected final void prepareInternal() {
    }

    public ProgressiveDownloadHelper(Uri uri, String str) {
        this.uri = uri;
        this.customCacheKey = str;
    }
}
