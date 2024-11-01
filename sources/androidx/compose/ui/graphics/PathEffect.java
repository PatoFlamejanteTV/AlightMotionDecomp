package androidx.compose.ui.graphics;

/* loaded from: classes.dex */
public interface PathEffect {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ PathEffect dashPathEffect$default(Companion companion, float[] fArr, float f8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                f8 = 0.0f;
            }
            return companion.dashPathEffect(fArr, f8);
        }

        public final PathEffect chainPathEffect(PathEffect pathEffect, PathEffect pathEffect2) {
            return AndroidPathEffect_androidKt.actualChainPathEffect(pathEffect, pathEffect2);
        }

        public final PathEffect cornerPathEffect(float f8) {
            return AndroidPathEffect_androidKt.actualCornerPathEffect(f8);
        }

        public final PathEffect dashPathEffect(float[] fArr, float f8) {
            return AndroidPathEffect_androidKt.actualDashPathEffect(fArr, f8);
        }

        /* renamed from: stampedPathEffect-7aD1DOk, reason: not valid java name */
        public final PathEffect m3200stampedPathEffect7aD1DOk(Path path, float f8, float f9, int i8) {
            return AndroidPathEffect_androidKt.m2850actualStampedPathEffect7aD1DOk(path, f8, f9, i8);
        }
    }
}
