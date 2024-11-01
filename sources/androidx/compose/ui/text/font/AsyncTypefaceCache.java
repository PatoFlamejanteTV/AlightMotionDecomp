package androidx.compose.ui.text.font;

import Q5.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.caches.SimpleArrayMap;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final Object PermanentFailure = AsyncTypefaceResult.m4738constructorimpl(null);
    private final LruCache<Key, AsyncTypefaceResult> resultCache = new LruCache<>(16);
    private final SimpleArrayMap<Key, AsyncTypefaceResult> permanentCache = new SimpleArrayMap<>(0, 1, null);
    private final SynchronizedObject cacheLock = Synchronization_jvmKt.createSynchronizedObject();

    /* loaded from: classes.dex */
    public static final class AsyncTypefaceResult {
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m4737boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Object m4738constructorimpl(Object obj) {
            return obj;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m4739equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && AbstractC3292y.d(obj, ((AsyncTypefaceResult) obj2).m4744unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4740equalsimpl0(Object obj, Object obj2) {
            return AbstractC3292y.d(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m4741hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m4742isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m4743toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m4739equalsimpl(this.result, obj);
        }

        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m4741hashCodeimpl(this.result);
        }

        public String toString() {
            return m4743toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m4744unboximpl() {
            return this.result;
        }
    }

    @StabilityInferred(parameters = 0)
    /* loaded from: classes.dex */
    public static final class Key {
        public static final int $stable = 8;
        private final Font font;
        private final Object loaderKey;

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i8, Object obj2) {
            if ((i8 & 1) != 0) {
                font = key.font;
            }
            if ((i8 & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font font, Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return AbstractC3292y.d(this.font, key.font) && AbstractC3292y.d(this.loaderKey, key.loaderKey);
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z8, int i8, Object obj2) {
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z8);
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m4736get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = this.resultCache.get(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = this.permanentCache.get(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z8) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m4737boximpl(this.PermanentFailure));
                } else if (z8) {
                    this.permanentCache.put(key, AsyncTypefaceResult.m4737boximpl(AsyncTypefaceResult.m4738constructorimpl(obj)));
                } else {
                    this.resultCache.put(key, AsyncTypefaceResult.m4737boximpl(AsyncTypefaceResult.m4738constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object runCached(androidx.compose.ui.text.font.Font r6, androidx.compose.ui.text.font.PlatformFontLoader r7, boolean r8, kotlin.jvm.functions.Function1 r9, U5.d r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = (androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1 r0 = new androidx.compose.ui.text.font.AsyncTypefaceCache$runCached$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r8 = r0.Z$0
            java.lang.Object r6 = r0.L$1
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r6 = (androidx.compose.ui.text.font.AsyncTypefaceCache.Key) r6
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.AsyncTypefaceCache r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache) r7
            Q5.t.b(r10)
            goto L7d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Q5.t.b(r10)
            androidx.compose.ui.text.font.AsyncTypefaceCache$Key r10 = new androidx.compose.ui.text.font.AsyncTypefaceCache$Key
            java.lang.Object r7 = r7.getCacheKey()
            r10.<init>(r6, r7)
            androidx.compose.ui.text.platform.SynchronizedObject r6 = r5.cacheLock
            monitor-enter(r6)
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.resultCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> L5d
            if (r7 != 0) goto L5f
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r5.permanentCache     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L5d
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = (androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult) r7     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r7 = move-exception
            goto Lb3
        L5f:
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.m4744unboximpl()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            return r7
        L67:
            Q5.I r7 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r6)
            r0.L$0 = r5
            r0.L$1 = r10
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L79
            return r1
        L79:
            r7 = r5
            r4 = r10
            r10 = r6
            r6 = r4
        L7d:
            androidx.compose.ui.text.platform.SynchronizedObject r9 = r7.cacheLock
            monitor-enter(r9)
            if (r10 != 0) goto L90
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r8 = r7.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = r7.PermanentFailure     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r7 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4737boximpl(r7)     // Catch: java.lang.Throwable -> L8e
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r6 = move-exception
            goto Lb1
        L90:
            if (r8 == 0) goto La0
            androidx.compose.ui.text.caches.SimpleArrayMap<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.permanentCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4738constructorimpl(r10)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4737boximpl(r8)     // Catch: java.lang.Throwable -> L8e
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.font.AsyncTypefaceCache$Key, androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult> r7 = r7.resultCache     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4738constructorimpl(r10)     // Catch: java.lang.Throwable -> L8e
            androidx.compose.ui.text.font.AsyncTypefaceCache$AsyncTypefaceResult r8 = androidx.compose.ui.text.font.AsyncTypefaceCache.AsyncTypefaceResult.m4737boximpl(r8)     // Catch: java.lang.Throwable -> L8e
            r7.put(r6, r8)     // Catch: java.lang.Throwable -> L8e
        Lad:
            Q5.I r6 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r9)
            return r10
        Lb1:
            monitor-exit(r9)
            throw r6
        Lb3:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncTypefaceCache.runCached(androidx.compose.ui.text.font.Font, androidx.compose.ui.text.font.PlatformFontLoader, boolean, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, Function0 function0) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.get(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.get(key);
                }
                if (asyncTypefaceResult != null) {
                    Object m4744unboximpl = asyncTypefaceResult.m4744unboximpl();
                    AbstractC3290w.b(2);
                    AbstractC3290w.a(2);
                    return m4744unboximpl;
                }
                I i8 = I.f8786a;
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                Object invoke = function0.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th) {
                AbstractC3290w.b(1);
                AbstractC3290w.a(1);
                throw th;
            }
        }
    }
}
