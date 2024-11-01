package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class RawResourceDataSource implements DataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private final TransferListener<? super RawResourceDataSource> listener;
    private boolean opened;
    private final Resources resources;
    private Uri uri;

    /* loaded from: classes4.dex */
    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        this(context, null);
    }

    public static Uri buildRawResourceUri(int i8) {
        return Uri.parse("rawresource:///" + i8);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws RawResourceDataSourceException {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e8) {
                        throw new RawResourceDataSourceException(e8);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferEnd(this);
                        }
                    }
                }
            } catch (IOException e9) {
                throw new RawResourceDataSourceException(e9);
            }
        } catch (Throwable th) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super RawResourceDataSource> transferListener2 = this.listener;
                        if (transferListener2 != null) {
                            transferListener2.onTransferEnd(this);
                        }
                    }
                    throw th;
                } catch (IOException e10) {
                    throw new RawResourceDataSourceException(e10);
                }
            } finally {
                this.assetFileDescriptor = null;
                if (this.opened) {
                    this.opened = false;
                    TransferListener<? super RawResourceDataSource> transferListener3 = this.listener;
                    if (transferListener3 != null) {
                        transferListener3.onTransferEnd(this);
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            if (TextUtils.equals(RAW_RESOURCE_SCHEME, uri.getScheme())) {
                try {
                    this.assetFileDescriptor = this.resources.openRawResourceFd(Integer.parseInt(this.uri.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
                    this.inputStream = fileInputStream;
                    fileInputStream.skip(this.assetFileDescriptor.getStartOffset());
                    if (this.inputStream.skip(dataSpec.position) >= dataSpec.position) {
                        long j8 = dataSpec.length;
                        long j9 = -1;
                        if (j8 != -1) {
                            this.bytesRemaining = j8;
                        } else {
                            long length = this.assetFileDescriptor.getLength();
                            if (length != -1) {
                                j9 = length - dataSpec.position;
                            }
                            this.bytesRemaining = j9;
                        }
                        this.opened = true;
                        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferStart(this, dataSpec);
                        }
                        return this.bytesRemaining;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.");
                }
            }
            throw new RawResourceDataSourceException("URI must use scheme rawresource");
        } catch (IOException e8) {
            throw new RawResourceDataSourceException(e8);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i8, int i9) throws RawResourceDataSourceException {
        if (i9 == 0) {
            return 0;
        }
        long j8 = this.bytesRemaining;
        if (j8 == 0) {
            return -1;
        }
        if (j8 != -1) {
            try {
                i9 = (int) Math.min(j8, i9);
            } catch (IOException e8) {
                throw new RawResourceDataSourceException(e8);
            }
        }
        int read = this.inputStream.read(bArr, i8, i9);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j9 = this.bytesRemaining;
        if (j9 != -1) {
            this.bytesRemaining = j9 - read;
        }
        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, read);
        }
        return read;
    }

    public RawResourceDataSource(Context context, TransferListener<? super RawResourceDataSource> transferListener) {
        this.resources = context.getResources();
        this.listener = transferListener;
    }
}
