package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelection;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;

/* loaded from: classes4.dex */
public final class ChunkedTrackBlacklistUtil {
    public static final long DEFAULT_TRACK_BLACKLIST_MS = 60000;
    private static final String TAG = "ChunkedTrackBlacklist";

    private ChunkedTrackBlacklistUtil() {
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i8, Exception exc) {
        return maybeBlacklistTrack(trackSelection, i8, exc, DEFAULT_TRACK_BLACKLIST_MS);
    }

    public static boolean shouldBlacklist(Exception exc) {
        if (!(exc instanceof HttpDataSource.InvalidResponseCodeException)) {
            return false;
        }
        int i8 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (i8 != 404 && i8 != 410) {
            return false;
        }
        return true;
    }

    public static boolean maybeBlacklistTrack(TrackSelection trackSelection, int i8, Exception exc, long j8) {
        if (!shouldBlacklist(exc)) {
            return false;
        }
        boolean blacklist = trackSelection.blacklist(i8, j8);
        int i9 = ((HttpDataSource.InvalidResponseCodeException) exc).responseCode;
        if (blacklist) {
            Log.w(TAG, "Blacklisted: duration=" + j8 + ", responseCode=" + i9 + ", format=" + trackSelection.getFormat(i8));
        } else {
            Log.w(TAG, "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i9 + ", format=" + trackSelection.getFormat(i8));
        }
        return blacklist;
    }
}
