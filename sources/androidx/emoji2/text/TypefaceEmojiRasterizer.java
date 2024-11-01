package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.emoji2.text.flatbuffer.MetadataItem;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@AnyThread
@RequiresApi(19)
/* loaded from: classes3.dex */
public class TypefaceEmojiRasterizer {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_ABSENT = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_EXISTS = 2;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int HAS_GLYPH_UNKNOWN = 0;
    private static final ThreadLocal<MetadataItem> sMetadataItem = new ThreadLocal<>();
    private volatile int mCache = 0;
    private final int mIndex;

    @NonNull
    private final MetadataRepo mMetadataRepo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface HasGlyph {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public TypefaceEmojiRasterizer(@NonNull MetadataRepo metadataRepo, @IntRange(from = 0) int i8) {
        this.mMetadataRepo = metadataRepo;
        this.mIndex = i8;
    }

    private MetadataItem getMetadataItem() {
        ThreadLocal<MetadataItem> threadLocal = sMetadataItem;
        MetadataItem metadataItem = threadLocal.get();
        if (metadataItem == null) {
            metadataItem = new MetadataItem();
            threadLocal.set(metadataItem);
        }
        this.mMetadataRepo.getMetadataList().list(metadataItem, this.mIndex);
        return metadataItem;
    }

    public void draw(@NonNull Canvas canvas, float f8, float f9, @NonNull Paint paint) {
        Typeface typeface = this.mMetadataRepo.getTypeface();
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(this.mMetadataRepo.getEmojiCharArray(), this.mIndex * 2, 2, f8, f9, paint);
        paint.setTypeface(typeface2);
    }

    public int getCodepointAt(int i8) {
        return getMetadataItem().codepoints(i8);
    }

    public int getCodepointsLength() {
        return getMetadataItem().codepointsLength();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getCompatAdded() {
        return getMetadataItem().compatAdded();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getHasGlyph() {
        return this.mCache & 3;
    }

    public int getHeight() {
        return getMetadataItem().height();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getId() {
        return getMetadataItem().id();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public short getSdkAdded() {
        return getMetadataItem().sdkAdded();
    }

    @NonNull
    public Typeface getTypeface() {
        return this.mMetadataRepo.getTypeface();
    }

    public int getWidth() {
        return getMetadataItem().width();
    }

    public boolean isDefaultEmoji() {
        return getMetadataItem().emojiStyle();
    }

    public boolean isPreferredSystemRender() {
        if ((this.mCache & 4) > 0) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public void resetHasGlyphCache() {
        if (isPreferredSystemRender()) {
            this.mCache = 4;
        } else {
            this.mCache = 0;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setExclusion(boolean z8) {
        int hasGlyph = getHasGlyph();
        if (z8) {
            this.mCache = hasGlyph | 4;
        } else {
            this.mCache = hasGlyph;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setHasGlyph(boolean z8) {
        int i8;
        int i9 = this.mCache & 4;
        if (z8) {
            i8 = i9 | 2;
        } else {
            i8 = i9 | 1;
        }
        this.mCache = i8;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(getId()));
        sb.append(", codepoints:");
        int codepointsLength = getCodepointsLength();
        for (int i8 = 0; i8 < codepointsLength; i8++) {
            sb.append(Integer.toHexString(getCodepointAt(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
