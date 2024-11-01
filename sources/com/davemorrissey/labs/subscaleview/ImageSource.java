package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: classes3.dex */
public final class ImageSource {
    static final String ASSET_SCHEME = "file:///android_asset/";
    static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;
    private final Uri uri;

    private ImageSource(Bitmap bitmap, boolean z8) {
        this.bitmap = bitmap;
        this.uri = null;
        this.resource = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = z8;
    }

    @NonNull
    public static ImageSource asset(@NonNull String str) {
        if (str != null) {
            return uri(ASSET_SCHEME + str);
        }
        throw new NullPointerException("Asset name must not be null");
    }

    @NonNull
    public static ImageSource bitmap(@NonNull Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @NonNull
    public static ImageSource cachedBitmap(@NonNull Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    @NonNull
    public static ImageSource resource(int i8) {
        return new ImageSource(i8);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    @NonNull
    public static ImageSource uri(@NonNull String str) {
        if (str != null) {
            if (!str.contains("://")) {
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                str = FILE_SCHEME + str;
            }
            return new ImageSource(Uri.parse(str));
        }
        throw new NullPointerException("Uri must not be null");
    }

    @NonNull
    public ImageSource dimensions(int i8, int i9) {
        if (this.bitmap == null) {
            this.sWidth = i8;
            this.sHeight = i9;
        }
        setInvariants();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Integer getResource() {
        return this.resource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getSHeight() {
        return this.sHeight;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Rect getSRegion() {
        return this.sRegion;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getSWidth() {
        return this.sWidth;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean getTile() {
        return this.tile;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isCached() {
        return this.cached;
    }

    @NonNull
    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        setInvariants();
        return this;
    }

    @NonNull
    public ImageSource tiling(boolean z8) {
        this.tile = z8;
        return this;
    }

    @NonNull
    public ImageSource tilingDisabled() {
        return tiling(false);
    }

    @NonNull
    public ImageSource tilingEnabled() {
        return tiling(true);
    }

    @NonNull
    public static ImageSource uri(@NonNull Uri uri) {
        if (uri != null) {
            return new ImageSource(uri);
        }
        throw new NullPointerException("Uri must not be null");
    }

    private ImageSource(@NonNull Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith(FILE_SCHEME) && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, C.UTF8_NAME));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.bitmap = null;
        this.uri = uri;
        this.resource = null;
        this.tile = true;
    }

    private ImageSource(int i8) {
        this.bitmap = null;
        this.uri = null;
        this.resource = Integer.valueOf(i8);
        this.tile = true;
    }
}
