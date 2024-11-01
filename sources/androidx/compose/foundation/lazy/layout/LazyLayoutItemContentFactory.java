package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import c6.InterfaceC2072n;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactory {
    private final Function0 itemProvider;
    private final Map<Object, CachedItemContent> lambdasCache;
    private final SaveableStateHolder saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class CachedItemContent {
        private InterfaceC2072n _content;
        private final Object contentType;
        private int index;
        private final Object key;
        final /* synthetic */ LazyLayoutItemContentFactory this$0;

        public CachedItemContent(LazyLayoutItemContentFactory lazyLayoutItemContentFactory, int i8, Object key, Object obj) {
            AbstractC3292y.i(key, "key");
            this.this$0 = lazyLayoutItemContentFactory;
            this.key = key;
            this.contentType = obj;
            this.index = i8;
        }

        private final InterfaceC2072n createContentLambda() {
            return ComposableLambdaKt.composableLambdaInstance(1403994769, true, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(this.this$0, this));
        }

        public final InterfaceC2072n getContent() {
            InterfaceC2072n interfaceC2072n = this._content;
            if (interfaceC2072n == null) {
                InterfaceC2072n createContentLambda = createContentLambda();
                this._content = createContentLambda;
                return createContentLambda;
            }
            return interfaceC2072n;
        }

        public final Object getContentType() {
            return this.contentType;
        }

        public final int getIndex() {
            return this.index;
        }

        public final Object getKey() {
            return this.key;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0 itemProvider) {
        AbstractC3292y.i(saveableStateHolder, "saveableStateHolder");
        AbstractC3292y.i(itemProvider, "itemProvider");
        this.saveableStateHolder = saveableStateHolder;
        this.itemProvider = itemProvider;
        this.lambdasCache = new LinkedHashMap();
    }

    public final InterfaceC2072n getContent(int i8, Object key, Object obj) {
        AbstractC3292y.i(key, "key");
        CachedItemContent cachedItemContent = this.lambdasCache.get(key);
        if (cachedItemContent != null && cachedItemContent.getIndex() == i8 && AbstractC3292y.d(cachedItemContent.getContentType(), obj)) {
            return cachedItemContent.getContent();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(this, i8, key, obj);
        this.lambdasCache.put(key, cachedItemContent2);
        return cachedItemContent2.getContent();
    }

    public final Object getContentType(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = this.lambdasCache.get(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.getContentType();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.itemProvider.invoke();
        int index = lazyLayoutItemProvider.getIndex(obj);
        if (index == -1) {
            return null;
        }
        return lazyLayoutItemProvider.getContentType(index);
    }

    public final Function0 getItemProvider() {
        return this.itemProvider;
    }
}
