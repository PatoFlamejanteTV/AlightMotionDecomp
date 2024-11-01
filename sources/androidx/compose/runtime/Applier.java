package androidx.compose.runtime;

/* loaded from: classes.dex */
public interface Applier<N> {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
            a.a(applier);
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
            a.b(applier);
        }
    }

    void clear();

    void down(N n8);

    N getCurrent();

    void insertBottomUp(int i8, N n8);

    void insertTopDown(int i8, N n8);

    void move(int i8, int i9, int i10);

    void onBeginChanges();

    void onEndChanges();

    void remove(int i8, int i9);

    void up();
}
