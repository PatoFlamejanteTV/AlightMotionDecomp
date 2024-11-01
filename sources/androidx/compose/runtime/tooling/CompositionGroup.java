package androidx.compose.runtime.tooling;

/* loaded from: classes.dex */
public interface CompositionGroup extends CompositionData {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static CompositionGroup find(CompositionGroup compositionGroup, Object obj) {
            CompositionGroup a9;
            a9 = a.a(compositionGroup, obj);
            return a9;
        }

        @Deprecated
        public static int getGroupSize(CompositionGroup compositionGroup) {
            int a9;
            a9 = b.a(compositionGroup);
            return a9;
        }

        @Deprecated
        public static Object getIdentity(CompositionGroup compositionGroup) {
            Object b9;
            b9 = b.b(compositionGroup);
            return b9;
        }

        @Deprecated
        public static int getSlotsSize(CompositionGroup compositionGroup) {
            int c8;
            c8 = b.c(compositionGroup);
            return c8;
        }
    }

    Iterable<Object> getData();

    int getGroupSize();

    Object getIdentity();

    Object getKey();

    Object getNode();

    int getSlotsSize();

    String getSourceInfo();
}
