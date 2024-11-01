package androidx.compose.foundation.lazy.grid;

/* loaded from: classes.dex */
public interface LazyGridItemInfo {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }

    int getColumn();

    Object getContentType();

    int getIndex();

    Object getKey();

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo707getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo708getSizeYbymL2g();
}
