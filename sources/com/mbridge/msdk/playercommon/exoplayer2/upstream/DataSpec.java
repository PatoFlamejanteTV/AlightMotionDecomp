package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
    public static final int FLAG_ALLOW_GZIP = 1;
    public final long absoluteStreamPosition;
    public final int flags;
    public final String key;
    public final long length;
    public final long position;
    public final byte[] postBody;
    public final Uri uri;

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public final boolean isFlagSet(int i8) {
        if ((this.flags & i8) == i8) {
            return true;
        }
        return false;
    }

    public final DataSpec subrange(long j8) {
        long j9 = this.length;
        return subrange(j8, j9 != -1 ? j9 - j8 : -1L);
    }

    public final String toString() {
        return "DataSpec[" + this.uri + ", " + Arrays.toString(this.postBody) + ", " + this.absoluteStreamPosition + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + "]";
    }

    public final DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.postBody, this.absoluteStreamPosition, this.position, this.length, this.key, this.flags);
    }

    public DataSpec(Uri uri, int i8) {
        this(uri, 0L, -1L, null, i8);
    }

    public final DataSpec subrange(long j8, long j9) {
        return (j8 == 0 && this.length == j9) ? this : new DataSpec(this.uri, this.postBody, this.absoluteStreamPosition + j8, this.position + j8, j9, this.key, this.flags);
    }

    public DataSpec(Uri uri, long j8, long j9, String str) {
        this(uri, j8, j8, j9, str, 0);
    }

    public DataSpec(Uri uri, long j8, long j9, String str, int i8) {
        this(uri, j8, j8, j9, str, i8);
    }

    public DataSpec(Uri uri, long j8, long j9, long j10, String str, int i8) {
        this(uri, null, j8, j9, j10, str, i8);
    }

    public DataSpec(Uri uri, byte[] bArr, long j8, long j9, long j10, String str, int i8) {
        Assertions.checkArgument(j8 >= 0);
        Assertions.checkArgument(j9 >= 0);
        Assertions.checkArgument(j10 > 0 || j10 == -1);
        this.uri = uri;
        this.postBody = bArr;
        this.absoluteStreamPosition = j8;
        this.position = j9;
        this.length = j10;
        this.key = str;
        this.flags = i8;
    }
}
