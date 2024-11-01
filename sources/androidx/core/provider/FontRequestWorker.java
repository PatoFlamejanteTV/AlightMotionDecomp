package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.util.Consumer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FontRequestWorker {
    static final LruCache<String, Typeface> sTypefaceCache = new LruCache<>(16);
    private static final ExecutorService DEFAULT_EXECUTOR_SERVICE = RequestExecutor.createDefaultExecutor("fonts-androidx", 10, 10000);
    static final Object LOCK = new Object();

    @GuardedBy("LOCK")
    static final SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> PENDING_REPLIES = new SimpleArrayMap<>();

    private FontRequestWorker() {
    }

    private static String createCacheId(@NonNull FontRequest fontRequest, int i8) {
        return fontRequest.getId() + "-" + i8;
    }

    @SuppressLint({"WrongConstant"})
    private static int getFontFamilyResultStatus(@NonNull FontsContractCompat.FontFamilyResult fontFamilyResult) {
        int i8 = 1;
        if (fontFamilyResult.getStatusCode() != 0) {
            if (fontFamilyResult.getStatusCode() != 1) {
                return -3;
            }
            return -2;
        }
        FontsContractCompat.FontInfo[] fonts = fontFamilyResult.getFonts();
        if (fonts != null && fonts.length != 0) {
            i8 = 0;
            for (FontsContractCompat.FontInfo fontInfo : fonts) {
                int resultCode = fontInfo.getResultCode();
                if (resultCode != 0) {
                    if (resultCode < 0) {
                        return -3;
                    }
                    return resultCode;
                }
            }
        }
        return i8;
    }

    @NonNull
    static TypefaceResult getFontSync(@NonNull String str, @NonNull Context context, @NonNull FontRequest fontRequest, int i8) {
        LruCache<String, Typeface> lruCache = sTypefaceCache;
        Typeface typeface = lruCache.get(str);
        if (typeface != null) {
            return new TypefaceResult(typeface);
        }
        try {
            FontsContractCompat.FontFamilyResult fontFamilyResult = FontProvider.getFontFamilyResult(context, fontRequest, null);
            int fontFamilyResultStatus = getFontFamilyResultStatus(fontFamilyResult);
            if (fontFamilyResultStatus != 0) {
                return new TypefaceResult(fontFamilyResultStatus);
            }
            Typeface createFromFontInfo = TypefaceCompat.createFromFontInfo(context, null, fontFamilyResult.getFonts(), i8);
            if (createFromFontInfo != null) {
                lruCache.put(str, createFromFontInfo);
                return new TypefaceResult(createFromFontInfo);
            }
            return new TypefaceResult(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface requestFontAsync(@NonNull final Context context, @NonNull final FontRequest fontRequest, final int i8, @Nullable Executor executor, @NonNull final CallbackWithHandler callbackWithHandler) {
        final String createCacheId = createCacheId(fontRequest, i8);
        Typeface typeface = sTypefaceCache.get(createCacheId);
        if (typeface != null) {
            callbackWithHandler.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        Consumer<TypefaceResult> consumer = new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.2
            @Override // androidx.core.util.Consumer
            public void accept(TypefaceResult typefaceResult) {
                if (typefaceResult == null) {
                    typefaceResult = new TypefaceResult(-3);
                }
                CallbackWithHandler.this.onTypefaceResult(typefaceResult);
            }
        };
        synchronized (LOCK) {
            try {
                SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> simpleArrayMap = PENDING_REPLIES;
                ArrayList<Consumer<TypefaceResult>> arrayList = simpleArrayMap.get(createCacheId);
                if (arrayList != null) {
                    arrayList.add(consumer);
                    return null;
                }
                ArrayList<Consumer<TypefaceResult>> arrayList2 = new ArrayList<>();
                arrayList2.add(consumer);
                simpleArrayMap.put(createCacheId, arrayList2);
                Callable<TypefaceResult> callable = new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.concurrent.Callable
                    public TypefaceResult call() {
                        try {
                            return FontRequestWorker.getFontSync(createCacheId, context, fontRequest, i8);
                        } catch (Throwable unused) {
                            return new TypefaceResult(-3);
                        }
                    }
                };
                if (executor == null) {
                    executor = DEFAULT_EXECUTOR_SERVICE;
                }
                RequestExecutor.execute(executor, callable, new Consumer<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.4
                    @Override // androidx.core.util.Consumer
                    public void accept(TypefaceResult typefaceResult) {
                        synchronized (FontRequestWorker.LOCK) {
                            try {
                                SimpleArrayMap<String, ArrayList<Consumer<TypefaceResult>>> simpleArrayMap2 = FontRequestWorker.PENDING_REPLIES;
                                ArrayList<Consumer<TypefaceResult>> arrayList3 = simpleArrayMap2.get(createCacheId);
                                if (arrayList3 == null) {
                                    return;
                                }
                                simpleArrayMap2.remove(createCacheId);
                                for (int i9 = 0; i9 < arrayList3.size(); i9++) {
                                    arrayList3.get(i9).accept(typefaceResult);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                });
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Typeface requestFontSync(@NonNull final Context context, @NonNull final FontRequest fontRequest, @NonNull CallbackWithHandler callbackWithHandler, final int i8, int i9) {
        final String createCacheId = createCacheId(fontRequest, i8);
        Typeface typeface = sTypefaceCache.get(createCacheId);
        if (typeface != null) {
            callbackWithHandler.onTypefaceResult(new TypefaceResult(typeface));
            return typeface;
        }
        if (i9 == -1) {
            TypefaceResult fontSync = getFontSync(createCacheId, context, fontRequest, i8);
            callbackWithHandler.onTypefaceResult(fontSync);
            return fontSync.mTypeface;
        }
        try {
            TypefaceResult typefaceResult = (TypefaceResult) RequestExecutor.submit(DEFAULT_EXECUTOR_SERVICE, new Callable<TypefaceResult>() { // from class: androidx.core.provider.FontRequestWorker.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public TypefaceResult call() {
                    return FontRequestWorker.getFontSync(createCacheId, context, fontRequest, i8);
                }
            }, i9);
            callbackWithHandler.onTypefaceResult(typefaceResult);
            return typefaceResult.mTypeface;
        } catch (InterruptedException unused) {
            callbackWithHandler.onTypefaceResult(new TypefaceResult(-3));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void resetTypefaceCache() {
        sTypefaceCache.evictAll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class TypefaceResult {
        final int mResult;
        final Typeface mTypeface;

        TypefaceResult(int i8) {
            this.mTypeface = null;
            this.mResult = i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean isSuccess() {
            if (this.mResult == 0) {
                return true;
            }
            return false;
        }

        @SuppressLint({"WrongConstant"})
        TypefaceResult(@NonNull Typeface typeface) {
            this.mTypeface = typeface;
            this.mResult = 0;
        }
    }
}
