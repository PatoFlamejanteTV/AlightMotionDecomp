package androidx.core.graphics;

import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import d6.InterfaceC2767a;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class RegionKt$iterator$1 implements Iterator<Rect>, InterfaceC2767a {
    private boolean hasMore;
    private final RegionIterator iterator;
    private final Rect rect;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RegionKt$iterator$1(Region region) {
        RegionIterator regionIterator = new RegionIterator(region);
        this.iterator = regionIterator;
        Rect rect = new Rect();
        this.rect = rect;
        this.hasMore = regionIterator.next(rect);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasMore;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Rect next() {
        if (this.hasMore) {
            Rect rect = new Rect(this.rect);
            this.hasMore = this.iterator.next(this.rect);
            return rect;
        }
        throw new IndexOutOfBoundsException();
    }
}
