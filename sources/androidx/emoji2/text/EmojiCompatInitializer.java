package androidx.emoji2.text;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.core.os.TraceCompat;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes3.dex */
public class EmojiCompatInitializer implements Initializer<Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(19)
    /* loaded from: classes3.dex */
    public static class BackgroundDefaultConfig extends EmojiCompat.Config {
        protected BackgroundDefaultConfig(Context context) {
            super(new BackgroundDefaultLoader(context));
            setMetadataLoadStrategy(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(19)
    /* loaded from: classes3.dex */
    public static class BackgroundDefaultLoader implements EmojiCompat.MetadataRepoLoader {
        private final Context mContext;

        BackgroundDefaultLoader(Context context) {
            this.mContext = context.getApplicationContext();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @WorkerThread
        /* renamed from: doLoad, reason: merged with bridge method [inline-methods] */
        public void lambda$load$0(@NonNull final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback, @NonNull final ThreadPoolExecutor threadPoolExecutor) {
            try {
                FontRequestEmojiCompatConfig create = DefaultEmojiCompatConfig.create(this.mContext);
                if (create != null) {
                    create.setLoadingExecutor(threadPoolExecutor);
                    create.getMetadataRepoLoader().load(new EmojiCompat.MetadataRepoLoaderCallback() { // from class: androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader.1
                        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                        public void onFailed(@Nullable Throwable th) {
                            try {
                                metadataRepoLoaderCallback.onFailed(th);
                            } finally {
                                threadPoolExecutor.shutdown();
                            }
                        }

                        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback
                        public void onLoaded(@NonNull MetadataRepo metadataRepo) {
                            try {
                                metadataRepoLoaderCallback.onLoaded(metadataRepo);
                            } finally {
                                threadPoolExecutor.shutdown();
                            }
                        }
                    });
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th) {
                metadataRepoLoaderCallback.onFailed(th);
                threadPoolExecutor.shutdown();
            }
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(@NonNull final EmojiCompat.MetadataRepoLoaderCallback metadataRepoLoaderCallback) {
            final ThreadPoolExecutor createBackgroundPriorityExecutor = ConcurrencyHelpers.createBackgroundPriorityExecutor(EmojiCompatInitializer.S_INITIALIZER_THREAD_NAME);
            createBackgroundPriorityExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.d
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.BackgroundDefaultLoader.this.lambda$load$0(metadataRepoLoaderCallback, createBackgroundPriorityExecutor);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class LoadEmojiCompatRunnable implements Runnable {
        LoadEmojiCompatRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.isConfigured()) {
                    EmojiCompat.get().load();
                }
            } finally {
                TraceCompat.endSection();
            }
        }
    }

    @RequiresApi(19)
    void delayUntilFirstResume(@NonNull Context context) {
        final Lifecycle lifecycle = ((LifecycleOwner) AppInitializer.getInstance(context).initializeComponent(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.addObserver(new DefaultLifecycleObserver() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.c.a(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.c.b(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.c.c(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
                EmojiCompatInitializer.this.loadEmojiCompatAfterDelay();
                lifecycle.removeObserver(this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.c.e(this, lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                androidx.lifecycle.c.f(this, lifecycleOwner);
            }
        });
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @RequiresApi(19)
    void loadEmojiCompatAfterDelay() {
        ConcurrencyHelpers.mainHandlerAsync().postDelayed(new LoadEmojiCompatRunnable(), STARTUP_THREAD_CREATION_DELAY_MS);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public Boolean create(@NonNull Context context) {
        EmojiCompat.init(new BackgroundDefaultConfig(context));
        delayUntilFirstResume(context);
        return Boolean.TRUE;
    }
}
