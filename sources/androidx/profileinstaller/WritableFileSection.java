package androidx.profileinstaller;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
class WritableFileSection {
    final byte[] mContents;
    final int mExpectedInflateSize;
    final boolean mNeedsCompression;
    final FileSectionType mType;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WritableFileSection(@NonNull FileSectionType fileSectionType, int i8, @NonNull byte[] bArr, boolean z8) {
        this.mType = fileSectionType;
        this.mExpectedInflateSize = i8;
        this.mContents = bArr;
        this.mNeedsCompression = z8;
    }
}
