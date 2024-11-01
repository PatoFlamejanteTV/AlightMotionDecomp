package androidx.compose.ui.input.nestedscroll;

import U5.d;

/* loaded from: classes.dex */
public interface NestedScrollConnection {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m3884onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j8, long j9, d dVar) {
            Object a9;
            a9 = a.a(nestedScrollConnection, j8, j9, dVar);
            return a9;
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m3885onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j8, long j9, int i8) {
            long b9;
            b9 = a.b(nestedScrollConnection, j8, j9, i8);
            return b9;
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m3886onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j8, d dVar) {
            Object c8;
            c8 = a.c(nestedScrollConnection, j8, dVar);
            return c8;
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m3887onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j8, int i8) {
            long d8;
            d8 = a.d(nestedScrollConnection, j8, i8);
            return d8;
        }
    }

    /* renamed from: onPostFling-RZ2iAVY */
    Object mo432onPostFlingRZ2iAVY(long j8, long j9, d dVar);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo433onPostScrollDzOQY0M(long j8, long j9, int i8);

    /* renamed from: onPreFling-QWom1Mo */
    Object mo434onPreFlingQWom1Mo(long j8, d dVar);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo435onPreScrollOzD1aCk(long j8, int i8);
}
