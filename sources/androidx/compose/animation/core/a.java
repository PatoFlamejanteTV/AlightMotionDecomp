package androidx.compose.animation.core;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static boolean a(Animation animation, long j8) {
        if (j8 >= animation.getDurationNanos()) {
            return true;
        }
        return false;
    }
}
