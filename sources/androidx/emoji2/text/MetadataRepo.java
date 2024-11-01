package androidx.emoji2.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.TraceCompat;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@AnyThread
@RequiresApi(19)
/* loaded from: classes3.dex */
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";

    @NonNull
    private final char[] mEmojiCharArray;

    @NonNull
    private final MetadataList mMetadataList;

    @NonNull
    private final Node mRootNode = new Node(1024);

    @NonNull
    private final Typeface mTypeface;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public static class Node {
        private final SparseArray<Node> mChildren;
        private TypefaceEmojiRasterizer mData;

        private Node() {
            this(1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Node get(int i8) {
            SparseArray<Node> sparseArray = this.mChildren;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final TypefaceEmojiRasterizer getData() {
            return this.mData;
        }

        void put(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer, int i8, int i9) {
            Node node = get(typefaceEmojiRasterizer.getCodepointAt(i8));
            if (node == null) {
                node = new Node();
                this.mChildren.put(typefaceEmojiRasterizer.getCodepointAt(i8), node);
            }
            if (i9 > i8) {
                node.put(typefaceEmojiRasterizer, i8 + 1, i9);
            } else {
                node.mData = typefaceEmojiRasterizer;
            }
        }

        Node(int i8) {
            this.mChildren = new SparseArray<>(i8);
        }
    }

    private MetadataRepo(@NonNull Typeface typeface, @NonNull MetadataList metadataList) {
        this.mTypeface = typeface;
        this.mMetadataList = metadataList;
        this.mEmojiCharArray = new char[metadataList.listLength() * 2];
        constructIndex(metadataList);
    }

    private void constructIndex(MetadataList metadataList) {
        int listLength = metadataList.listLength();
        for (int i8 = 0; i8 < listLength; i8++) {
            TypefaceEmojiRasterizer typefaceEmojiRasterizer = new TypefaceEmojiRasterizer(this, i8);
            Character.toChars(typefaceEmojiRasterizer.getId(), this.mEmojiCharArray, i8 * 2);
            put(typefaceEmojiRasterizer);
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static MetadataRepo create(@NonNull Typeface typeface) {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, new MetadataList());
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
        return this.mEmojiCharArray;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public MetadataList getMetadataList() {
        return this.mMetadataList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int getMetadataVersion() {
        return this.mMetadataList.version();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Node getRootNode() {
        return this.mRootNode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Typeface getTypeface() {
        return this.mTypeface;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    void put(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        boolean z8;
        Preconditions.checkNotNull(typefaceEmojiRasterizer, "emoji metadata cannot be null");
        if (typefaceEmojiRasterizer.getCodepointsLength() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Preconditions.checkArgument(z8, "invalid metadata codepoint length");
        this.mRootNode.put(typefaceEmojiRasterizer, 0, typefaceEmojiRasterizer.getCodepointsLength() - 1);
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull InputStream inputStream) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(inputStream));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(typeface, MetadataListReader.read(byteBuffer));
        } finally {
            TraceCompat.endSection();
        }
    }

    @NonNull
    public static MetadataRepo create(@NonNull AssetManager assetManager, @NonNull String str) throws IOException {
        try {
            TraceCompat.beginSection(S_TRACE_CREATE_REPO);
            return new MetadataRepo(Typeface.createFromAsset(assetManager, str), MetadataListReader.read(assetManager, str));
        } finally {
            TraceCompat.endSection();
        }
    }
}
