package androidx.compose.foundation.layout;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* loaded from: classes.dex */
final class DoNothingNestedScrollConnection implements NestedScrollConnection {
    public static final DoNothingNestedScrollConnection INSTANCE = new DoNothingNestedScrollConnection();

    private DoNothingNestedScrollConnection() {
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo432onPostFlingRZ2iAVY(long j8, long j9, U5.d dVar) {
        return androidx.compose.ui.input.nestedscroll.a.a(this, j8, j9, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public /* synthetic */ long mo433onPostScrollDzOQY0M(long j8, long j9, int i8) {
        return androidx.compose.ui.input.nestedscroll.a.b(this, j8, j9, i8);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo434onPreFlingQWom1Mo(long j8, U5.d dVar) {
        return androidx.compose.ui.input.nestedscroll.a.c(this, j8, dVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public /* synthetic */ long mo435onPreScrollOzD1aCk(long j8, int i8) {
        return androidx.compose.ui.input.nestedscroll.a.d(this, j8, i8);
    }
}
