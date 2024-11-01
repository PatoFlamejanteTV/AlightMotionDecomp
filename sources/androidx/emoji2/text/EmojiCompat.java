package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.ColorInt;
import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.DefaultEmojiCompatConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@AnyThread
/* loaded from: classes3.dex */
public class EmojiCompat {
    public static final String EDITOR_INFO_METAVERSION_KEY = "android.support.text.emoji.emojiCompat_metadataVersion";
    public static final String EDITOR_INFO_REPLACE_ALL_KEY = "android.support.text.emoji.emojiCompat_replaceAll";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    static final int EMOJI_COUNT_UNLIMITED = Integer.MAX_VALUE;
    public static final int EMOJI_FALLBACK = 2;
    public static final int EMOJI_SUPPORTED = 1;
    public static final int EMOJI_UNSUPPORTED = 0;
    public static final int LOAD_STATE_DEFAULT = 3;
    public static final int LOAD_STATE_FAILED = 2;
    public static final int LOAD_STATE_LOADING = 0;
    public static final int LOAD_STATE_SUCCEEDED = 1;
    public static final int LOAD_STRATEGY_DEFAULT = 0;
    public static final int LOAD_STRATEGY_MANUAL = 1;
    private static final String NOT_INITIALIZED_ERROR_TEXT = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";
    public static final int REPLACE_STRATEGY_ALL = 1;
    public static final int REPLACE_STRATEGY_DEFAULT = 0;
    public static final int REPLACE_STRATEGY_NON_EXISTENT = 2;

    @GuardedBy("CONFIG_LOCK")
    private static volatile boolean sHasDoneDefaultConfigLookup;

    @Nullable
    @GuardedBy("INSTANCE_LOCK")
    private static volatile EmojiCompat sInstance;

    @Nullable
    final int[] mEmojiAsDefaultStyleExceptions;
    private final int mEmojiSpanIndicatorColor;
    private final boolean mEmojiSpanIndicatorEnabled;
    private final GlyphChecker mGlyphChecker;

    @NonNull
    private final CompatInternal mHelper;

    @NonNull
    @GuardedBy("mInitLock")
    private final Set<InitCallback> mInitCallbacks;

    @NonNull
    private final ReadWriteLock mInitLock = new ReentrantReadWriteLock();

    @GuardedBy("mInitLock")
    private volatile int mLoadState = 3;

    @NonNull
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final int mMetadataLoadStrategy;

    @NonNull
    final MetadataRepoLoader mMetadataLoader;
    final boolean mReplaceAll;

    @NonNull
    private final SpanFactory mSpanFactory;
    final boolean mUseEmojiAsDefaultStyle;
    private static final Object INSTANCE_LOCK = new Object();
    private static final Object CONFIG_LOCK = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public @interface CodepointSequenceMatchResult {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class CompatInternal {
        final EmojiCompat mEmojiCompat;

        CompatInternal(EmojiCompat emojiCompat) {
            this.mEmojiCompat = emojiCompat;
        }

        String getAssetSignature() {
            return "";
        }

        int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
            return -1;
        }

        public int getEmojiMatch(CharSequence charSequence, int i8) {
            return 0;
        }

        int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
            return -1;
        }

        boolean hasEmojiGlyph(@NonNull CharSequence charSequence) {
            return false;
        }

        void loadMetadata() {
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        CharSequence process(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10, boolean z8) {
            return charSequence;
        }

        void updateEditorInfoAttrs(@NonNull EditorInfo editorInfo) {
        }

        boolean hasEmojiGlyph(@NonNull CharSequence charSequence, int i8) {
            return false;
        }
    }

    @RequiresApi(19)
    /* loaded from: classes3.dex */
    private static final class CompatInternal19 extends CompatInternal {
        private volatile MetadataRepo mMetadataRepo;
        private volatile EmojiProcessor mProcessor;

        CompatInternal19(EmojiCompat emojiCompat) {
            super(emojiCompat);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        String getAssetSignature() {
            String sourceSha = this.mMetadataRepo.getMetadataList().sourceSha();
            if (sourceSha == null) {
                return "";
            }
            return sourceSha;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiEnd(@NonNull CharSequence charSequence, int i8) {
            return this.mProcessor.getEmojiEnd(charSequence, i8);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        public int getEmojiMatch(CharSequence charSequence, int i8) {
            return this.mProcessor.getEmojiMatch(charSequence, i8);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        int getEmojiStart(@NonNull CharSequence charSequence, int i8) {
            return this.mProcessor.getEmojiStart(charSequence, i8);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(@NonNull CharSequence charSequence) {
            return this.mProcessor.getEmojiMatch(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void loadMetadata() {
            try {
                this.mEmojiCompat.mMetadataLoader.load(new MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompat.CompatInternal19.1
                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onFailed(@Nullable Throwable th) {
                        CompatInternal19.this.mEmojiCompat.onMetadataLoadFailed(th);
                    }

                    @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                    public void onLoaded(@NonNull MetadataRepo metadataRepo) {
                        CompatInternal19.this.onMetadataLoadSuccess(metadataRepo);
                    }
                });
            } catch (Throwable th) {
                this.mEmojiCompat.onMetadataLoadFailed(th);
            }
        }

        void onMetadataLoadSuccess(@NonNull MetadataRepo metadataRepo) {
            if (metadataRepo == null) {
                this.mEmojiCompat.onMetadataLoadFailed(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.mMetadataRepo = metadataRepo;
            MetadataRepo metadataRepo2 = this.mMetadataRepo;
            SpanFactory spanFactory = this.mEmojiCompat.mSpanFactory;
            GlyphChecker glyphChecker = this.mEmojiCompat.mGlyphChecker;
            EmojiCompat emojiCompat = this.mEmojiCompat;
            this.mProcessor = new EmojiProcessor(metadataRepo2, spanFactory, glyphChecker, emojiCompat.mUseEmojiAsDefaultStyle, emojiCompat.mEmojiAsDefaultStyleExceptions, EmojiExclusions.getEmojiExclusions());
            this.mEmojiCompat.onMetadataLoadSuccess();
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        CharSequence process(@NonNull CharSequence charSequence, int i8, int i9, int i10, boolean z8) {
            return this.mProcessor.process(charSequence, i8, i9, i10, z8);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        void updateEditorInfoAttrs(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt(EmojiCompat.EDITOR_INFO_METAVERSION_KEY, this.mMetadataRepo.getMetadataVersion());
            editorInfo.extras.putBoolean(EmojiCompat.EDITOR_INFO_REPLACE_ALL_KEY, this.mEmojiCompat.mReplaceAll);
        }

        @Override // androidx.emoji2.text.EmojiCompat.CompatInternal
        boolean hasEmojiGlyph(@NonNull CharSequence charSequence, int i8) {
            return this.mProcessor.getEmojiMatch(charSequence, i8) == 1;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Config {

        @Nullable
        int[] mEmojiAsDefaultStyleExceptions;
        boolean mEmojiSpanIndicatorEnabled;

        @Nullable
        Set<InitCallback> mInitCallbacks;

        @NonNull
        final MetadataRepoLoader mMetadataLoader;
        boolean mReplaceAll;
        SpanFactory mSpanFactory;
        boolean mUseEmojiAsDefaultStyle;
        int mEmojiSpanIndicatorColor = -16711936;
        int mMetadataLoadStrategy = 0;

        @NonNull
        GlyphChecker mGlyphChecker = new DefaultGlyphChecker();

        /* JADX INFO: Access modifiers changed from: protected */
        public Config(@NonNull MetadataRepoLoader metadataRepoLoader) {
            Preconditions.checkNotNull(metadataRepoLoader, "metadataLoader cannot be null.");
            this.mMetadataLoader = metadataRepoLoader;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @NonNull
        public final MetadataRepoLoader getMetadataRepoLoader() {
            return this.mMetadataLoader;
        }

        @NonNull
        public Config registerInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            if (this.mInitCallbacks == null) {
                this.mInitCallbacks = new ArraySet();
            }
            this.mInitCallbacks.add(initCallback);
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorColor(@ColorInt int i8) {
            this.mEmojiSpanIndicatorColor = i8;
            return this;
        }

        @NonNull
        public Config setEmojiSpanIndicatorEnabled(boolean z8) {
            this.mEmojiSpanIndicatorEnabled = z8;
            return this;
        }

        @NonNull
        public Config setGlyphChecker(@NonNull GlyphChecker glyphChecker) {
            Preconditions.checkNotNull(glyphChecker, "GlyphChecker cannot be null");
            this.mGlyphChecker = glyphChecker;
            return this;
        }

        @NonNull
        public Config setMetadataLoadStrategy(int i8) {
            this.mMetadataLoadStrategy = i8;
            return this;
        }

        @NonNull
        public Config setReplaceAll(boolean z8) {
            this.mReplaceAll = z8;
            return this;
        }

        @NonNull
        public Config setSpanFactory(@NonNull SpanFactory spanFactory) {
            this.mSpanFactory = spanFactory;
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z8) {
            return setUseEmojiAsDefaultStyle(z8, null);
        }

        @NonNull
        public Config unregisterInitCallback(@NonNull InitCallback initCallback) {
            Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
            Set<InitCallback> set = this.mInitCallbacks;
            if (set != null) {
                set.remove(initCallback);
            }
            return this;
        }

        @NonNull
        public Config setUseEmojiAsDefaultStyle(boolean z8, @Nullable List<Integer> list) {
            this.mUseEmojiAsDefaultStyle = z8;
            if (z8 && list != null) {
                this.mEmojiAsDefaultStyleExceptions = new int[list.size()];
                Iterator<Integer> it = list.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    this.mEmojiAsDefaultStyleExceptions[i8] = it.next().intValue();
                    i8++;
                }
                Arrays.sort(this.mEmojiAsDefaultStyleExceptions);
            } else {
                this.mEmojiAsDefaultStyleExceptions = null;
            }
            return this;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public static class DefaultSpanFactory implements SpanFactory {
        @Override // androidx.emoji2.text.EmojiCompat.SpanFactory
        @NonNull
        @RequiresApi(19)
        public EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
            return new TypefaceEmojiSpan(typefaceEmojiRasterizer);
        }
    }

    /* loaded from: classes3.dex */
    public interface GlyphChecker {
        boolean hasGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10);
    }

    /* loaded from: classes3.dex */
    public static abstract class InitCallback {
        public void onFailed(@Nullable Throwable th) {
        }

        public void onInitialized() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class ListenerDispatcher implements Runnable {
        private final List<InitCallback> mInitCallbacks;
        private final int mLoadState;
        private final Throwable mThrowable;

        ListenerDispatcher(@NonNull InitCallback initCallback, int i8) {
            this(Arrays.asList((InitCallback) Preconditions.checkNotNull(initCallback, "initCallback cannot be null")), i8, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.mInitCallbacks.size();
            int i8 = 0;
            if (this.mLoadState != 1) {
                while (i8 < size) {
                    this.mInitCallbacks.get(i8).onFailed(this.mThrowable);
                    i8++;
                }
            } else {
                while (i8 < size) {
                    this.mInitCallbacks.get(i8).onInitialized();
                    i8++;
                }
            }
        }

        ListenerDispatcher(@NonNull Collection<InitCallback> collection, int i8) {
            this(collection, i8, null);
        }

        ListenerDispatcher(@NonNull Collection<InitCallback> collection, int i8, @Nullable Throwable th) {
            Preconditions.checkNotNull(collection, "initCallbacks cannot be null");
            this.mInitCallbacks = new ArrayList(collection);
            this.mLoadState = i8;
            this.mThrowable = th;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public @interface LoadStrategy {
    }

    /* loaded from: classes3.dex */
    public interface MetadataRepoLoader {
        void load(@NonNull MetadataRepoLoaderCallback metadataRepoLoaderCallback);
    }

    /* loaded from: classes3.dex */
    public static abstract class MetadataRepoLoaderCallback {
        public abstract void onFailed(@Nullable Throwable th);

        public abstract void onLoaded(@NonNull MetadataRepo metadataRepo);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes3.dex */
    public @interface ReplaceStrategy {
    }

    /* loaded from: classes3.dex */
    public interface SpanFactory {
        @NonNull
        @RequiresApi(19)
        EmojiSpan createSpan(@NonNull TypefaceEmojiRasterizer typefaceEmojiRasterizer);
    }

    private EmojiCompat(@NonNull Config config) {
        this.mReplaceAll = config.mReplaceAll;
        this.mUseEmojiAsDefaultStyle = config.mUseEmojiAsDefaultStyle;
        this.mEmojiAsDefaultStyleExceptions = config.mEmojiAsDefaultStyleExceptions;
        this.mEmojiSpanIndicatorEnabled = config.mEmojiSpanIndicatorEnabled;
        this.mEmojiSpanIndicatorColor = config.mEmojiSpanIndicatorColor;
        this.mMetadataLoader = config.mMetadataLoader;
        this.mMetadataLoadStrategy = config.mMetadataLoadStrategy;
        this.mGlyphChecker = config.mGlyphChecker;
        ArraySet arraySet = new ArraySet();
        this.mInitCallbacks = arraySet;
        SpanFactory spanFactory = config.mSpanFactory;
        this.mSpanFactory = spanFactory == null ? new DefaultSpanFactory() : spanFactory;
        Set<InitCallback> set = config.mInitCallbacks;
        if (set != null && !set.isEmpty()) {
            arraySet.addAll(config.mInitCallbacks);
        }
        this.mHelper = new CompatInternal19(this);
        loadMetadata();
    }

    @NonNull
    public static EmojiCompat get() {
        EmojiCompat emojiCompat;
        boolean z8;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = sInstance;
            if (emojiCompat != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Preconditions.checkState(z8, NOT_INITIALIZED_ERROR_TEXT);
        }
        return emojiCompat;
    }

    public static boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection, @NonNull Editable editable, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, boolean z8) {
        return EmojiProcessor.handleDeleteSurroundingText(inputConnection, editable, i8, i9, z8);
    }

    public static boolean handleOnKeyDown(@NonNull Editable editable, int i8, @NonNull KeyEvent keyEvent) {
        return EmojiProcessor.handleOnKeyDown(editable, i8, keyEvent);
    }

    @Nullable
    public static EmojiCompat init(@NonNull Context context) {
        return init(context, null);
    }

    public static boolean isConfigured() {
        if (sInstance != null) {
            return true;
        }
        return false;
    }

    private boolean isInitialized() {
        if (getLoadState() == 1) {
            return true;
        }
        return false;
    }

    private void loadMetadata() {
        this.mInitLock.writeLock().lock();
        try {
            if (this.mMetadataLoadStrategy == 0) {
                this.mLoadState = 0;
            }
            this.mInitLock.writeLock().unlock();
            if (getLoadState() == 0) {
                this.mHelper.loadMetadata();
            }
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat reset(@NonNull Config config) {
        EmojiCompat emojiCompat;
        synchronized (INSTANCE_LOCK) {
            emojiCompat = new EmojiCompat(config);
            sInstance = emojiCompat;
        }
        return emojiCompat;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static void skipDefaultConfigurationLookup(boolean z8) {
        synchronized (CONFIG_LOCK) {
            sHasDoneDefaultConfigLookup = z8;
        }
    }

    @NonNull
    public String getAssetSignature() {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        return this.mHelper.getAssetSignature();
    }

    public int getEmojiEnd(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiEnd(charSequence, i8);
    }

    public int getEmojiMatch(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.getEmojiMatch(charSequence, i8);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getEmojiSpanIndicatorColor() {
        return this.mEmojiSpanIndicatorColor;
    }

    public int getEmojiStart(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "charSequence cannot be null");
        return this.mHelper.getEmojiStart(charSequence, i8);
    }

    public int getLoadState() {
        this.mInitLock.readLock().lock();
        try {
            return this.mLoadState;
        } finally {
            this.mInitLock.readLock().unlock();
        }
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isEmojiSpanIndicatorEnabled() {
        return this.mEmojiSpanIndicatorEnabled;
    }

    public void load() {
        boolean z8 = true;
        if (this.mMetadataLoadStrategy != 1) {
            z8 = false;
        }
        Preconditions.checkState(z8, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (isInitialized()) {
            return;
        }
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState == 0) {
                return;
            }
            this.mLoadState = 0;
            this.mInitLock.writeLock().unlock();
            this.mHelper.loadMetadata();
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    void onMetadataLoadFailed(@Nullable Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 2;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            this.mMainHandler.post(new ListenerDispatcher(arrayList, this.mLoadState, th));
        } catch (Throwable th2) {
            this.mInitLock.writeLock().unlock();
            throw th2;
        }
    }

    void onMetadataLoadSuccess() {
        ArrayList arrayList = new ArrayList();
        this.mInitLock.writeLock().lock();
        try {
            this.mLoadState = 1;
            arrayList.addAll(this.mInitCallbacks);
            this.mInitCallbacks.clear();
            this.mInitLock.writeLock().unlock();
            this.mMainHandler.post(new ListenerDispatcher(arrayList, this.mLoadState));
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence) {
        return process(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public void registerInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            if (this.mLoadState != 1 && this.mLoadState != 2) {
                this.mInitCallbacks.add(initCallback);
                this.mInitLock.writeLock().unlock();
            }
            this.mMainHandler.post(new ListenerDispatcher(initCallback, this.mLoadState));
            this.mInitLock.writeLock().unlock();
        } catch (Throwable th) {
            this.mInitLock.writeLock().unlock();
            throw th;
        }
    }

    public void unregisterInitCallback(@NonNull InitCallback initCallback) {
        Preconditions.checkNotNull(initCallback, "initCallback cannot be null");
        this.mInitLock.writeLock().lock();
        try {
            this.mInitCallbacks.remove(initCallback);
        } finally {
            this.mInitLock.writeLock().unlock();
        }
    }

    public void updateEditorInfo(@NonNull EditorInfo editorInfo) {
        if (isInitialized() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.mHelper.updateEditorInfoAttrs(editorInfo);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static EmojiCompat init(@NonNull Context context, @Nullable DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory defaultEmojiCompatConfigFactory) {
        EmojiCompat emojiCompat;
        if (sHasDoneDefaultConfigLookup) {
            return sInstance;
        }
        if (defaultEmojiCompatConfigFactory == null) {
            defaultEmojiCompatConfigFactory = new DefaultEmojiCompatConfig.DefaultEmojiCompatConfigFactory(null);
        }
        Config create = defaultEmojiCompatConfigFactory.create(context);
        synchronized (CONFIG_LOCK) {
            try {
                if (!sHasDoneDefaultConfigLookup) {
                    if (create != null) {
                        init(create);
                    }
                    sHasDoneDefaultConfigLookup = true;
                }
                emojiCompat = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return emojiCompat;
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9) {
        return process(charSequence, i8, i9, Integer.MAX_VALUE);
    }

    @Deprecated
    public boolean hasEmojiGlyph(@NonNull CharSequence charSequence, @IntRange(from = 0) int i8) {
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkNotNull(charSequence, "sequence cannot be null");
        return this.mHelper.hasEmojiGlyph(charSequence, i8);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10) {
        return process(charSequence, i8, i9, i10, 0);
    }

    @Nullable
    @CheckResult
    public CharSequence process(@Nullable CharSequence charSequence, @IntRange(from = 0) int i8, @IntRange(from = 0) int i9, @IntRange(from = 0) int i10, int i11) {
        boolean z8;
        Preconditions.checkState(isInitialized(), "Not initialized yet");
        Preconditions.checkArgumentNonnegative(i8, "start cannot be negative");
        Preconditions.checkArgumentNonnegative(i9, "end cannot be negative");
        Preconditions.checkArgumentNonnegative(i10, "maxEmojiCount cannot be negative");
        Preconditions.checkArgument(i8 <= i9, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        Preconditions.checkArgument(i8 <= charSequence.length(), "start should be < than charSequence length");
        Preconditions.checkArgument(i9 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i8 == i9) {
            return charSequence;
        }
        if (i11 != 1) {
            z8 = i11 != 2 ? this.mReplaceAll : false;
        } else {
            z8 = true;
        }
        return this.mHelper.process(charSequence, i8, i9, i10, z8);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static EmojiCompat reset(@Nullable EmojiCompat emojiCompat) {
        EmojiCompat emojiCompat2;
        synchronized (INSTANCE_LOCK) {
            sInstance = emojiCompat;
            emojiCompat2 = sInstance;
        }
        return emojiCompat2;
    }

    @NonNull
    public static EmojiCompat init(@NonNull Config config) {
        EmojiCompat emojiCompat = sInstance;
        if (emojiCompat == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    emojiCompat = sInstance;
                    if (emojiCompat == null) {
                        emojiCompat = new EmojiCompat(config);
                        sInstance = emojiCompat;
                    }
                } finally {
                }
            }
        }
        return emojiCompat;
    }
}
